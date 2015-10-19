using System;
using System.Collections.Generic;
using System.Text;
using System.IO;
using System.Threading;
using System.Net;

using SimDM_UploadFile.SimDM_Master;
using SimDM_UploadFile.AccessControl;
using SimDM_UploadFile.node_query;
using SimDM_UploadFile.SimDM_Query;

namespace SimDM_UploadFile
{
    class Program
    {
        static Arguments arguments = null;
        private const String MODEL_SERVICE_PARAMS_TEMPLATE = "/earlybinding/options_2097152/{0}/{1}/QEX/SIMDM_MASTER_WSDL";
        private const String SERVER_URL = "http://localhost:8080/EDMWS";
        //private const String SERVER_URL = "https://api.eu-cloudflow.eu/jotne_64/EDMWS";
        private const String CONFIG_URL = "/earlybinding/options_2097152/SimDM_system/Config/QEX/simdm_config_support";
        private const String MASTER_URL = "/earlybinding/options_2097152/SimDM_system/user_management/QEX/SIMDM_MASTER_WSDL";

        static EDMAccessControlService access = null;
        static String sessionId = null;
        static SIMDM_MASTER_WSDLService service = null;
        static SIMDM_MASTER_WSDLService modelNeutralSrv = null;
        static node_queryService nodeSrv = null;
        static SimDM_UploadFile.SimDM_Query.SimDM_config_supportService configSrv = null;

        /*---------------------------------------------------------------------------------------*/
        static v_node createNode(string name, string description, long parent)
        /*---------------------------------------------------------------------------------------*/
        {
            v_node newNode = new v_node();
            newNode.id = name;
            newNode.nodus = new v_nodus();
            newNode.nodus.version = "1";
            newNode.nodus.editable = true;
            newNode.nodus.locked = false;
            newNode.nodus.item = new v_item();
            newNode.nodus.item.name = name;
            newNode.nodus.item.item_type = "DESIGN";
            newNode.nodus.item.description = description;

            long[] parentId = new long[1];
            parentId[0] = parent;

            return service.node_create(sessionId, newNode, parentId);
        }
        /*=======================================================================================*/
        static void createProductStructure()
        /*
         * -command=create_pbs -repo=InitialRepository -model=test -login=ah -pass=db
        =========================================================================================*/
        {
            v_pbs pbsTop = service.pbs_get(sessionId, null);
            v_node car = createNode("Car", "Electric cabriolet", pbsTop.nodus.item.instance_id);
            v_node carBody = createNode("Car Body", "Body made by aluminium", car.nodus.item.instance_id);
            v_node leftFrontDoor = createNode("Left Front Door", "", carBody.nodus.item.instance_id);
            v_node rightFrontDoor = createNode("Right Front Door", "", carBody.nodus.item.instance_id);
            v_node Wheels = createNode("Wheels", "", car.nodus.item.instance_id);
            v_node Engine = createNode("Engine", "", car.nodus.item.instance_id);
            v_node EngineBlock = createNode("Engine Block", "", Engine.nodus.item.instance_id);
            v_node Pistons = createNode("Pistons", "", Engine.nodus.item.instance_id);
            v_node CrankShaft = createNode("Crank Shaft", "", Engine.nodus.item.instance_id);
            v_node tailGate = createNode("Tail gate", "", carBody.nodus.item.instance_id);
            v_node tailGateWing = createNode("Tail gate wing", "", tailGate.nodus.item.instance_id);
        }


        /*=======================================================================================*/
        static long getNodeId(string nodeName)
        /*=======================================================================================*/
        {
            var list = service.pbs_search(sessionId, nodeName, new string[] { "NODE.NAME" },
                false, true, 0, null, false, null, null, null, null, 2, 0);
            if (list == null || list.Length == 0)
                throw new Exception("Node " + nodeName + " was not found.");
            else if (list.Length > 1)
                throw new Exception("More than one node was found.");

            return list[0].item.instance_id;
        }
        /*=======================================================================================*/
        static void uploadFile()
        /*
         * -command=upload_file -repo=InitialRepository -model=test -login=ah -pass=db -node="Engine Block" -file="O:\projects\SimDM\Testdata\Glider TestModels\ConvertedByAP209e2_API\testcbeam-out.stp"
        =========================================================================================*/
        {
            string fileToUpload = arguments["file"];
            //int nodeId = Int32.Parse(arguments["id"]);
            string nodeName = arguments["node"];


            var list = service.pbs_search(sessionId, nodeName, new string[] { "NODE.NAME" },
                false, true, 0, null, false, null, null, null, null, 2, 0);
            if (list == null || list.Length == 0)
                throw new Exception("No nodes was found.");
            else if (list.Length > 1)
                throw new Exception("More than one node was found.");

            FileInfo fileInfo = new FileInfo(fileToUpload);

            v_file fileSpec = new v_file()
            {
                item = new v_item()
                {
                    name = System.IO.Path.GetFileNameWithoutExtension(fileToUpload),
                },
                extension = fileInfo.Extension,
                @interface = "Interface specifications",
                original_name = fileToUpload,
                original_format = "file format name", // can be derived from file name by using Win API
                OS = "Microsoft Windows",
                produced_by = "EPM Thechnology AS",
                size = (int)fileInfo.Length,
                owner = 0, // organization id
            };
            //fileSpec.item.item_type = "TEXT";
            //fileSpec.item.item_type = "UNDEFINED";
            fileSpec = service.file_create(sessionId, fileSpec);

            v_attached_file attachedFile = new v_attached_file()
            {
                domain = list[0].item.instance_id,
                file = fileSpec.item.instance_id,
                item = new v_item()
                {
                    name = fileInfo.Name,
                    description = "description must be here",
                },
            };
            attachedFile = service.attached_file_create(sessionId, attachedFile);

            var transferInfo = Upload(sessionId, access, fileToUpload, fileInfo.Extension);

            fileSpec = service.file_body_set(sessionId, fileSpec.item.instance_id, fileSpec.size, transferInfo.fileNameOnServer);

            if ("ANALYSIS".Equals(fileSpec.item.item_type) || "DESIGN".Equals(fileSpec.item.item_type))
            {
                var resultFile = access.createTemporaryFile(sessionId, "name", ".cax", false);
                string source = transferInfo.fileNameOnServer;
                string result = resultFile.fileNameOnServer;
                service.file_CAX_generate(sessionId, fileSpec.item.instance_id, source, result, null/*log file*/, true);
            }
            else if ("STEP".Equals(fileSpec.item.item_type) && !"[NO SCHEMA]".Equals(fileSpec.model_name))
            {
                fileSpec = service.file_import_STEP(sessionId, fileSpec.item.instance_id, "", transferInfo.fileNameOnServer, "");
                if (fileSpec.CAX != -1)
                {
                    var resultFile = access.createTemporaryFile(sessionId, "name", ".cax", false);
                    string source = transferInfo.fileNameOnServer;
                    string result = resultFile.fileNameOnServer;
                    service.file_CAX_generate(sessionId, fileSpec.item.instance_id, source, result, null/*log file*/, true);
                }
            }
        }
        /*=======================================================================================*/
        static void model_downloadFile()
        /*
         * -command=model_downloadFile -repo=InitialRepository -model=test -login=ah -pass=db -node="Engine Block" -local_file="O:\projects\SimDM\Testdata\downloadtest.stp" -PLM_file="testcbeam-out.stp"
        =========================================================================================*/
        {
            string downloadToFile = arguments["local_file"];
            string PLM_file = arguments["PLM_file"];
            string nodeName = arguments["node"];
            long model_id = plm_get_model_id(arguments["repo"], arguments["model"]);

            // Get name and id of all nodes in the specified model
            db_object[] theNodes = service.model_node_list(sessionId, model_id);
            for (int i = 0; i < theNodes.Length; i++)
            {
               if (theNodes[i].name.TrimStart(' ').Equals(nodeName)) {
                   db_object[] theFiles = service.node_file_list(sessionId, theNodes[i].db_id);
                   for (int j = 0; j < theFiles.Length; i++)
                   {
                       if (theFiles[j].name.Equals(PLM_file))
                       {
                           AccessControl.fileTransferInfo downloadFile = access.createTemporaryFile(sessionId, "PLM_file", ".txt", false);
                           long EDMfileId = service.model_file_body_get(sessionId, theFiles[j].db_id, downloadFile.fileNameOnServer);
                           downloadFileFromEDM(downloadFile.uploadOrDownloadUrl + sessionId, downloadToFile);
                           string deleteRetur = access.deleteTemporaryFile(sessionId, downloadFile);
                       }
                   }
               }
            }
        }
        /*=======================================================================================*/
        static void model_uploadFile()
        /*
         * -command=model_uploadFile -repo=InitialRepository -model=test -login=ah -pass=db -node="Engine Block" -file="O:\projects\SimDM\Testdata\Glider TestModels\ConvertedByAP209e2_API\testcbeam-out.stp"
        =========================================================================================*/
        {
            string fileToUpload = arguments["file"];
            string nodeName = arguments["node"];
            long model_id = plm_get_model_id(arguments["repo"], arguments["model"]);

            var list = service.model_pbs_search(sessionId, model_id, nodeName, new string[] { "NODE.NAME" },
                false, true, 0, null, false, null, null, null, null, 2, 0);
            if (list == null || list.Length == 0)
                throw new Exception("No nodes was found.");
            else if (list.Length > 1)
                throw new Exception("More than one node was found.");

            FileInfo fileInfo = new FileInfo(fileToUpload);

            v_file fileSpec = new v_file()
            {
                item = new v_item()
                {
                    name = System.IO.Path.GetFileNameWithoutExtension(fileToUpload),
                },
                extension = fileInfo.Extension,
                @interface = "Interface specifications",
                original_name = fileToUpload,
                original_format = "file format name", // can be derived from file name by using Win API
                OS = "Microsoft Windows",
                produced_by = "EPM Thechnology AS",
                size = (int)fileInfo.Length,
                owner = 0, // organization id
            };
            fileSpec = service.model_file_create(sessionId, model_id, fileSpec);

            v_attached_file attachedFile = new v_attached_file()
            {
                domain = list[0].item.instance_id,
                file = fileSpec.item.instance_id,
                item = new v_item()
                {
                    name = fileInfo.Name,
                    description = "description must be here",
                },
            };
            attachedFile = service.attached_file_create(sessionId, attachedFile);

            var transferInfo = Upload(sessionId, access, fileToUpload, fileInfo.Extension);

            fileSpec = service.model_file_body_set(sessionId, fileSpec.item.instance_id, fileSpec.size, transferInfo.fileNameOnServer);
        }
        /*=======================================================================================*/
        static void executeNodeQuery()
        /*
         * -command=node_query -repo=DataRepository -model=CascadedCsys-ROTFIX-sol101-out -login=ah -pass=db
         * =======================================================================================*/
        {
            nodeSrv = new node_queryService();
            node_info_ve[] nodes = nodeSrv.get_node_info(sessionId);
            for (int i = 0; i < nodes.Length; i++)
            {
                Console.Out.WriteLine(nodes[i].NODE_ID + ",  " + nodes[i].NODE_TYPE + ",  " + nodes[i].COORDSYS_ID
                    + ",   " + nodes[i].COORD1 + ",   " + nodes[i].COORD2 + ",   " + nodes[i].COORD3);
            }
        }
        /*=======================================================================================*/
        static void define_property(string propType, string name)
        /*=======================================================================================*/
        {
            v_pbs pbsTop = service.pbs_get(sessionId, null);

            v_property newProperty = new v_property();
            newProperty.item = new v_item();
            newProperty.item.item_type = propType;
            newProperty.item.name = name;
            newProperty.applicable_to = new string[1];
            newProperty.applicable_to[0] = "DESIGN";
            v_property storedTypeForBOM = service.property_create(sessionId, newProperty);
        }
        /*=======================================================================================*/
        static long plm_get_model_id(string repositoryName, string modelName)
        /*=======================================================================================*/
        {
            string[] repnames = configSrv.repository_name_list(sessionId);
            for (
                int i = 0; i < repnames.Length; i++)
            {
                if (repositoryName.Equals(repnames[i])) {
                    string[] modelNames = configSrv.repository_model_name_list(sessionId, repositoryName);
                    for (int j=0; j < modelNames.Length; j++) {
                        if (modelName.Equals(modelNames[j])) {
                            long model_id = configSrv.model_id_get(sessionId, repositoryName, modelName);
                            return model_id;
                        }
                    }
                    throw new Exception("Model " + modelName + " was not found.");
                }
            }
            throw new Exception("Repository " + repositoryName + " was not found.");
        }
        /*=======================================================================================*/
        static void plm_define_property()
        /*
         * -command=plm_define_property -repo=<any> -model=<any> -login=ah -pass=db
         * -command=plm_define_property -repo=InitialRepository -model=Ultralight_Glider -login=ah -pass=db -property_type=STRING_PROPERTY "-property_name=Complementary Part Number" -applicable_to=DESIGN
        *=======================================================================================*/
        {
            string repositoryName = arguments["repo"];
            string modelName = arguments["model"];
            string property_type = arguments["property_type"];
            string property_name = arguments["property_name"];
            string applicable_to = arguments["applicable_to"];
            long model_id = plm_get_model_id(repositoryName, modelName);

            string OK = service.model_property_create(sessionId, model_id, property_type, property_name, applicable_to); 

            Console.Out.WriteLine("Model id =" + model_id);

        }
        /*=======================================================================================*/
        static void plm_set_property_value()
        /*
         * -command=plm_set_property_value -repo=InitialRepository -model=Ultralight_Glider -login=ah -pass=db -property_name="Complementary Part Number" -property_value="12N-20140420 NO" -node="Body Flap"
        *=======================================================================================*/
        {
            string repositoryName = arguments["repo"];
            string modelName = arguments["model"];
            string property_value = arguments["property_value"];
            string property_name = arguments["property_name"];
            string node = arguments["node"];
            long node_id = getNodeId(node);

            long model_id = plm_get_model_id(repositoryName, modelName);

            string propValueReturned = service.model_property_value_set(sessionId, model_id, node_id, property_name, property_value); 

            Console.Out.WriteLine("Model id =" + model_id);

        }
        /*=======================================================================================*/
        static void plm_node_list()
        /*
         * -command=plm_node_list -repo=InitialRepository -model=Ultralight_Glider -login=ah -pass=db
        *=======================================================================================*/
        {
            string repositoryName = arguments["repo"];
            string modelName = arguments["model"];

            long model_id = plm_get_model_id(repositoryName, modelName);

            // Get name and id of all nodes in the specified model
            db_object[] theNodes = service.model_node_list(sessionId, model_id);
            for (int i = 0; i < theNodes.Length; i++)
            {
                Console.Out.WriteLine("<option value=\"" + theNodes[i].db_id + "\">" + theNodes[i].name + "</option>");
            }
            if (theNodes.Length > 1)
            {
                // Get name and id of all files in the specified node
                db_object[] theFiles = service.node_file_list(sessionId, theNodes[1].db_id);
                Console.Out.WriteLine("\n\nHere is the files of " + theNodes[1].name + " listed.");
                for (int i = 0; i < theFiles.Length; i++)
                {
                    Console.Out.WriteLine(theFiles[i].name);// + " - " + theNodes[i].db_id);
                }
            }
            if (theNodes.Length > 79)
            {
                //int previousPaddingSize = 0;
                //long parent = theNodes[0].db_id;
                //for (int i = 0; i < theNodes.Length; i++)
                //{
                //    string nodeName = theNodes[i].name.TrimStart();
                //    int levelPaddingSize = theNodes[i].name.Length - nodeName.Length;
                //    if (levelPaddingSize > previousPaddingSize)
                //    {
                //        parent = prevNode;
                //    } else 
                //}
                v_node node_79 = service.node_get(sessionId, theNodes[79].db_id, null);
                db_object[] subNodes = service.model_node_list(sessionId, theNodes[79].db_id);
                for (int i = 0; i < subNodes.Length; i++)
                {
                    Console.Out.WriteLine(theNodes[i].name + " - " + theNodes[i].db_id);
                }
            }
        }
        /*=======================================================================================*/
        static void create_user()
        /*
         * -command=create_user -login=superuser -pass=db -user=sintef_1
        *=======================================================================================*/
        {
            string user = arguments["user"];

            if (modelNeutralSrv.system_login_register(sessionId, user))
            {
                Console.Out.WriteLine("User " + user + " is created");
            } else {
                Console.Out.WriteLine("User " + user + " already exist");
            }
            v_person newPerson = new v_person();
            newPerson.item = new v_item();
            newPerson.item.name = user;
            /* Possible newPerson.item.item_type
             *          ADMIN     -  for default manager role
                        EDITOR    -  for default writer role
                        READER    -  for default read only role
                        UNDEFINED  -  without default role 
             */
            newPerson.item.item_type = "READER";
            newPerson.login = user;
            v_person returnedPersonInfo = modelNeutralSrv.person_create(sessionId, newPerson);
        }
        /*=======================================================================================*/
        static void change_password()
        /*
         * -command=change_password -login=sintef -pass=sintef_simdm -user=sintef -newPassword=sintef
        *=======================================================================================*/
        {
            string user = arguments["user"];
            string newPassword = arguments["newPassword"];

            if (modelNeutralSrv.system_change_password(sessionId, user, newPassword))
            {
                Console.Out.WriteLine("Password of " + user + " is changed");
            } else {
                Console.Out.WriteLine("Password of " + user + " is NOT changed");
            }
        }
        /*=======================================================================================*/
        static void delete_user()
        /*
         * -command=delete_user -login=superuser -pass=db -user=sintef_1
        *=======================================================================================*/
        {
            string user = arguments["user"];

            if (modelNeutralSrv.system_cancel_login(sessionId, user))
            {
                Console.Out.WriteLine("EDM user " + user + " is deleted");
            }
            else
            {
                Console.Out.WriteLine("An error accured in system_cancel_login whean deleting " + user);
            }
            v_person userToDelete = modelNeutralSrv.person_get_by_login(sessionId, user);
            if (modelNeutralSrv.person_cancel(sessionId, userToDelete.item.instance_id)) {
                Console.Out.WriteLine("SimDM user " + user + " is deleted");
            }
        }
        /*=======================================================================================*/
        static void define_properties()
        /*
         * -command=define_properties -repo=InitialRepository -model=test -login=ah -pass=db
        =========================================================================================*/
        {
            define_property("STRING_PROPERTY", "Type for BOM");
            define_property("STRING_PROPERTY", "Part Number");
            define_property("STRING_PROPERTY", "Manufacturer");
            define_property("STRING_PROPERTY", "Manufacturer Part Number");
            define_property("STRING_PROPERTY", "Complementary Part Number");
            define_property("STRING_PROPERTY", "Standard");
            define_property("STRING_PROPERTY", "Major Revision");
            define_property("STRING_PROPERTY", "Minor Revision");
            define_property("STRING_PROPERTY", "Author");
        }
        static void printTypes(string typeName, string[] typeNames)
        {
            Console.Out.WriteLine(typeName);
            for (int i = 0; i < typeNames.Length; i++)
            {
                Console.Out.WriteLine(typeNames[i]);
            }
            Console.Out.WriteLine("");
        }
        /*=======================================================================================*/
        static void show_types()
        /*
         * -command=show_types -repo=InitialRepository -model=test -login=ah -pass=db
        =========================================================================================*/
        {
            v_repository[] reps = configSrv.repository_list(sessionId);
            string[] repNames = configSrv.repository_name_list(sessionId);
            string[] modelNames = configSrv.repository_model_name_list(sessionId, repNames[0]);

            
            string[] persontypes = service.person_list_types(sessionId);
            printTypes("person", persontypes);
            string[] pbstypes = service.pbs_list_types(sessionId);
            printTypes("pbs", pbstypes);
            string[] baselinetypes = service.baseline_list_types(sessionId);
            printTypes("baseline", baselinetypes);

            string[] filetypes = service.file_list_types(sessionId);
            printTypes("file", filetypes);
            string[] propertytypes = service.property_list_types(sessionId);
            printTypes("property", propertytypes);
             //string[] attached_filetypes = service.attached_file_list_types(sessionId);
            //string[] nodetypes = service.node_list_types((sessionId);
        }
        /*=======================================================================================*/
        static void move_file()
        /*
         * -command=move_file -repo=InitialRepository -model=test -login=ah -pass=db
        =========================================================================================*/
        {
            string fileToMove = arguments["file"];
            string source_node = arguments["source_node"];
            string nodeName = arguments["nodeName"];


            var list = service.pbs_search(
                sessionId,
                nodeName,
                new string[] { "NODE.NAME" },
                false, true, 0, null, false, null, null, null, null, 2, 0);
            if (list == null || list.Length == 0)
                throw new Exception("Node " + nodeName + " was found.");
            else if (list.Length > 1)
                throw new Exception("More than one node was found.");
        }
        /*=======================================================================================*/
        static void node_file_list()
        /*
         * -command=node_file_list -repo=InitialRepository -model=Ultralight_Glider -login=ah -pass=db -nodeName="ULG Course Grid FE Analysis"
        =========================================================================================*/
        {
            string nodeName = arguments["nodeName"];


            var list = service.pbs_search(sessionId, nodeName, new string[] { "NODE.NAME" },
                false, true, 0, null, false, null, null, null, null, 2, 0);
            if (list == null || list.Length == 0)
                throw new Exception("Node " + nodeName + " was not found.");
            else if (list.Length > 1)
                throw new Exception("More than one node was found.");

            v_node myNode = service.node_get(sessionId, list[0].item.instance_id, null);
            if (myNode.attached_files.Length > 0 ) {
                v_attached_file[] myAttachedFiles = service.attached_file_list(sessionId, myNode.attached_files);
                for (int i = 0; i < myNode.attached_files.Length; i++)
                {
                    v_file myFile = service.file_get(sessionId, myAttachedFiles[i].file);
                    Console.Out.WriteLine(myFile.item.name + myFile.extension);
                }
            }
        }
        /*=======================================================================================*/
        static void download_folder()
        /*
         * -command=download_folder -repo=InitialRepository -model=Ultralight_Glider -login=ah -pass=db -nodeName="ULG Coarse Grid FE Analysis" -local_folder=O:\projects\CloudFlow\local_folder
        =========================================================================================*/
        {
            string local_folder = arguments["local_folder"];
            
            string nodeName = arguments["nodeName"];
            long model_id = plm_get_model_id(arguments["repo"], arguments["model"]);

            // Get name and id of all nodes/folders in the specified model
            v_pbs_item[] theNodes = service.model_pbs_search(sessionId, model_id, nodeName, new string[] { "NODE.NAME" }, false, true, 0, null, false, null, null, null, null, 2, 0);
            
            if (theNodes != null && theNodes.Length == 1)
            {
                AccessControl.fileTransferInfo downloadFile = access.createTemporaryFile(sessionId, "PLM_file", ".txt", false);
                // Get info about all files attached to the specified node/folder
                db_object[] theFiles = service.node_file_list(sessionId, theNodes[0].item.instance_id);
                for (int j = 0; j < theFiles.Length; j++)
                {
                    // Copy the file from the database to a temporary file on the server
                    long EDMfileId = service.model_file_body_get(sessionId, theFiles[j].db_id, downloadFile.fileNameOnServer);
                    string local_file_path = Path.Combine(local_folder, theFiles[j].name);
                    downloadFileFromEDM(downloadFile.uploadOrDownloadUrl + sessionId, local_file_path);
                }
                string deleteRetur = access.deleteTemporaryFile(sessionId, downloadFile);
            }
        }
        /*=======================================================================================*/
        static void new_node_version()
        /*
         * -command=new_node_version -repo=InitialRepository -model=Ultralight_Glider -login=ah -pass=db -nodeName="ULG Coarse Grid FE Analysis"
         * 
         * use node_create_successor
         * 
           node_create_successor creates next version of specified node in current state 
           of PBS, replacing in some parents reference to prev. version with new one. 
           New version is created as clone of the existing one, including person and 
           organization assignments, attachments, references, properties and child 
           nodes. Only assigned approvals and tasks are not moved.

           To call the query logged in user shall be associated with a person granted 
           with writing privileges in all provided parent nodes (EDITOR_TYPE, 
           ADMIN_TYPE for the person or group where the person is registered).
           
           id                -  db ID of node version to be ancestor of newly created.
           new_version       -  optional version tag for new node version, if unset or 
                                empty version tag is generated in sequence of existing
           remove_old_form   -  optional list of parent nodes' db ID where from old 
                                version (id) shall be replaced by newly created
           add_new_to        -  optional list of parent nodes' db ID where newly created 
                                version shall be added as child 
           inherit_children  -  TRUE if new version inherits used nodes of the old one
           inherit_files     -  TRUE if newly created version gets copy of file 
                                attachments
                                
           NOTE: (1) remove_old_form and add_new_to are unset the new version becomes a root
                    node of the current pbs state, 
                 (2) if remove_old_form exists and add_new_to is unset new version will be 
                    added to parents listed in remove_old_form (to replace old)
                 
           Returns actual attributes of the newly added node version (see v_node
           description).
        =========================================================================================*/
        {
            string nodeName = arguments["nodeName"];
            long model_id = plm_get_model_id(arguments["repo"], arguments["model"]);

            v_pbs_item[] theNodes = service.model_pbs_search(sessionId, model_id, nodeName, new string[] { "NODE.NAME" }, false, true, 0, null, false, null, null, null, null, 2, 0);
            if (theNodes != null && theNodes.Length == 1)
            {
                v_node new_version = service.node_create_successor(sessionId, theNodes[0].item.instance_id, null, null, null, true, true);
                new_version = null;
            }
        }
        /*=======================================================================================*/
        static void Main(string[] args)
        /*=======================================================================================*/
        {
            try
            {
                sessionId = null;
                arguments = new Arguments(args);
                string command = arguments["command"];
                string repository = arguments["repo"];
                string model = arguments["model"];
                string user = arguments["login"];
                string password = arguments["pass"];
                string keystoneSessionId = arguments["keystoneSessionId"];
                string version = "";

                access = new EDMAccessControlService();
                access.Url = SERVER_URL + "/AccessControl?option=LITERAL_ENCODING";
                service = new SIMDM_MASTER_WSDLService();           // Use this service for operations that are dependant on repository and model in the URL
                modelNeutralSrv = new SIMDM_MASTER_WSDLService();   // Use this service for model neutral operations or operations that have model id as parameter
                configSrv = new SimDM_config_supportService();

                service.Url = SERVER_URL + String.Format(MODEL_SERVICE_PARAMS_TEMPLATE, repository, model);
                configSrv.Url = SERVER_URL + CONFIG_URL;
                modelNeutralSrv.Url = SERVER_URL + MASTER_URL;
                //service.Url = "http://api.eu-cloudflow.eu/jotne/EDMWS/earlybinding/options_2097152/SimDM_system/user_management/QEX/SIMDM_MASTER_WSDL";

                if (command != null && (command.Equals("new_node_version") || command.Equals("download_folder") || command.Equals("change_password") || command.Equals("delete_user") || command.Equals("create_user") || command.Equals("model_downloadFile") || command.Equals("model_uploadFile") || command.Equals("plm_node_list") || command.Equals("plm_set_property_value") || command.Equals("plm_define_property") || command.Equals("node_file_list") || command.Equals("move_file") || command.Equals("upload_file") || command.Equals("show_types") || command.Equals("create_pbs") || command.Equals("node_query") || command.Equals("define_properties")))
                {
                    if (keystoneSessionId == null)
                    {
                        sessionId = access.login(user, "sdai-group", password);
                        AccessControl.fileTransferInfo remoteFile = access.createTemporaryFile(sessionId, "myFile", ".txt", true);
                        version = configSrv.system_get_EDM_server_version(sessionId);
                    } else {
                        sessionId = keystoneSessionId;
                    }
                    if (command.Equals("upload_file"))
                    {
                        uploadFile();
                    }
                    else if (command.Equals("create_pbs"))
                    {
                        createProductStructure();
                    }
                    else if (command.Equals("model_uploadFile"))
                    {
                        model_uploadFile();
                    }
                    else if (command.Equals("model_downloadFile"))
                    {
                        model_downloadFile();
                    }
                    else if (command.Equals("plm_define_property"))
                    {
                        plm_define_property();
                    }
                    else if (command.Equals("node_query"))
                    {
                        executeNodeQuery();
                    }
                    else if (command.Equals("plm_set_property_value"))
                    {
                        plm_set_property_value();
                    }
                    else if (command.Equals("plm_node_list"))
                    {
                        plm_node_list();
                    }
                    else if (command.Equals("node_file_list"))
                    {
                        node_file_list();
                    }
                    else if (command.Equals("define_properties"))
                    {
                        define_properties();
                    }
                    else if (command.Equals("show_types"))
                    {
                        show_types();
                    }
                    else if (command.Equals("move_file"))
                    {
                        move_file();
                    }
                    else if (command.Equals("create_user"))
                    {
                        create_user();
                    }
                    else if (command.Equals("change_password"))
                    {
                        change_password();
                    }
                    else if (command.Equals("delete_user"))
                    {
                        delete_user();
                    }
                    else if (command.Equals("download_folder"))
                    {
                        download_folder();
                    }
                    else if (command.Equals("new_node_version"))
                    {
                        new_node_version();
                    }
                    Console.Out.WriteLine("Operation completed successfully.");

                }
                else
                {
                    Console.Out.WriteLine("Operation completed successfully.");
                }
            } catch (Exception ex) {
                
                Console.Out.WriteLine("Following error was detected:");
                
                Console.Out.WriteLine(ex.Message);
            }
            if (sessionId != null)
                access.logout(sessionId);
            Console.Out.WriteLine("Press any key to finish.");
            Console.In.Peek();
        }

        static void downloadFileFromEDM(string url, string file)
        {
            HttpWebRequest httpWebRequest = (HttpWebRequest)WebRequest.Create(url);
            httpWebRequest.Method = "POST"; httpWebRequest.KeepAlive = true;
            httpWebRequest.Credentials = System.Net.CredentialCache.DefaultCredentials;

            Stream responseStream = httpWebRequest.GetResponse().GetResponseStream();
            FileStream fileStream = new FileStream(file, FileMode.OpenOrCreate, FileAccess.Write);
            long fileLength = httpWebRequest.ContentLength;

            byte[] buffer = new byte[4096];

            int bytesRead = 0;
            // Loop through whole file uploading parts in a stream.
            while ((bytesRead = responseStream.Read(buffer, 0, buffer.Length)) != 0)
            {
                fileStream.Write(buffer, 0, bytesRead);
                fileStream.Flush();
            }
            responseStream.Close(); fileStream.Close();
        }


        static AccessControl.fileTransferInfo Upload(String sessionId, EDMAccessControlService access, String fileToUpload, String fileExtension)
        {
            var transferInfo = access.createTemporaryFile(sessionId, "name", fileExtension, true);
            ManualResetEvent me = new ManualResetEvent(false);

            HttpWebRequest httpWebRequest = (HttpWebRequest)WebRequest.Create(transferInfo.uploadOrDownloadUrl + sessionId);
            httpWebRequest.Method = "POST";
            httpWebRequest.KeepAlive = true;
            httpWebRequest.ContentType = "multipart/form-data";
            httpWebRequest.Credentials = System.Net.CredentialCache.DefaultCredentials;

            FileStream fileStream = new FileStream(fileToUpload, FileMode.Open, FileAccess.Read);

            httpWebRequest.ContentLength = fileStream.Length;
            httpWebRequest.AllowWriteStreamBuffering = false;
            // To prevent timeout error async RequestStream getting is needed
            httpWebRequest.BeginGetRequestStream((getRequestResult) =>
            {
                using (Stream requestStream = httpWebRequest.EndGetRequestStream(getRequestResult))
                {
                    byte[] buffer = new byte[1024];
                    int bytesRead = 0;
                    long totalLength = httpWebRequest.ContentLength;
                    // Loop through whole file uploading parts in a stream.
                    while ((bytesRead = fileStream.Read(buffer, 0, buffer.Length)) != 0)
                    {
                        requestStream.Write(buffer, 0, bytesRead);
                        requestStream.Flush();
                    }
                    fileStream.Close();
                }

                httpWebRequest.BeginGetResponse((getResponseResult) =>
                {
                    var response = httpWebRequest.EndGetResponse(getResponseResult);
                    using (StreamReader reader = new StreamReader(response.GetResponseStream()))
                    {
                        string responseText = reader.ReadToEnd();
                    }
                    response.Close();

                    me.Set();
                }, null);

            }, null);

            me.WaitOne();
            return transferInfo;
        }
    }
}
