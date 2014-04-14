using System;
using System.Collections.Generic;
using System.Text;
using System.IO;
using System.Threading;
using System.Net;
using System.Net.Security;
using System.Security.Cryptography.X509Certificates;

using SimDM_UploadFile.SimDM_Master;
using SimDM_UploadFile.AccessControl;
using SimDM_UploadFile.node_query;

namespace SimDM_UploadFile
{
    class Program
    {
        static Arguments arguments = null;
        private const String MODEL_SERVICE_PARAMS_TEMPLATE = "/earlybinding/options_2097152/{0}/{1}/QEX/SIMDM_MASTER_WSDL";
        private const String SERVER_URL = "http://api.eu-cloudflow.eu/jotne/EDMWS";

        static EDMAccessControlService access = null;
        static String sessionId = null;
        static SIMDM_MASTER_WSDLService service = null;
        static node_queryService nodeSrv = null;

        /*---------------------------------------------------------------------------------------*/
        static v_node createNode(string name, string description, int parent)
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

            int[] parentId = new int[1];
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
        static void uploadFile()
        /*
         * -command=upload_file -repo=InitialRepository -model=test -login=ah -pass=db -node="Engine block" -file="O:\projects\SimDM\Testdata\Glider TestModels\ConvertedByAP209e2_API\testcbeam-out.stp"
        =========================================================================================*/
        {
            string fileToUpload = arguments["file"];
            //int nodeId = Int32.Parse(arguments["id"]);
            string nodeName = arguments["node"];


            var list = service.pbs_search(
                sessionId,
                nodeName,
                new string[] { "NODE.NAME" },
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
        static void Main(string[] args)
        /*=======================================================================================*/
        {
            // accept any not signed server certificates
            System.Net.ServicePointManager.ServerCertificateValidationCallback = delegate(object s, X509Certificate certificate, X509Chain chain, SslPolicyErrors sslPolicyErrors) { return true; };

            try
            {
                arguments = new Arguments(args);
                string command = arguments["command"];
                string repository = arguments["repo"];
                string model = arguments["model"];
                string user = arguments["login"];
                string password = arguments["pass"];

                access = new EDMAccessControlService();
                access.Url = SERVER_URL + "/AccessControl";
                service = new SIMDM_MASTER_WSDLService();
                service.Url = SERVER_URL + String.Format(MODEL_SERVICE_PARAMS_TEMPLATE, repository, model);

                if (command != null && (command.Equals("upload_file") || command.Equals("show_types") || command.Equals("create_pbs") || command.Equals("node_query") || command.Equals("define_properties")))
                {
                    sessionId = access.login(user, "sdai-group", password);
                    if (command.Equals("upload_file"))
                    {
                        uploadFile();
                    } else if (command.Equals("create_pbs")) {
                        createProductStructure();
                    }
                    else if (command.Equals("node_query"))
                    {
                        executeNodeQuery();
                    }
                    else if (command.Equals("define_properties"))
                    {
                        define_properties();
                    }
                    else if (command.Equals("show_types"))
                    {
                        show_types();
                    }
                    access.logout(sessionId);
                    Console.Out.WriteLine("Operation completed successfully.");
                }
                else
                {
                    Console.Out.WriteLine("Operation completed successfully.");
                }
            }
            catch (Exception ex)
            {
                Console.Out.WriteLine("Following error was detected:");
                Console.Out.WriteLine(ex.Message);
            }
            Console.Out.WriteLine("Press any key to finish.");
            Console.In.Peek();
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
