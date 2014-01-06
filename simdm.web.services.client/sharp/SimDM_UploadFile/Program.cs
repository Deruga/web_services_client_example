using System;
using System.Collections.Generic;
using System.Text;
using System.IO;
using System.Threading;
using System.Net;

using SimDM_UploadFile.SimDM_Master;
using SimDM_UploadFile.AccessControl;

namespace SimDM_UploadFile
{
    class Program
    {
        private const String MODEL_SERVICE_PARAMS_TEMPLATE = "/earlybinding/options_2097152/{0}/{1}/QEX/SIMDM_MASTER_WSDL";

        private const String SERVER_URL = "http://localhost:8080/EDMWS";

        /// <summary>
        /// 
        /// </summary>
        /// <param name="args">-repo=InitialRepository -model=Ultralight_Glider -login=ah -pass=db -node="Centerbody Outboard" -file="c:\pipevice.CATPart"</param>
        static void Main(string[] args)
        {
            try
            {
                Arguments arguments = new Arguments(args);
                string repository = arguments["repo"];
                string model = arguments["model"];
                string user = arguments["login"];
                string password = arguments["pass"];
                string fileToUpload = arguments["file"];
                //int nodeId = Int32.Parse(arguments["id"]);
                string nodeName = arguments["node"];

                EDMAccessControlService access = new EDMAccessControlService();
                access.Url = SERVER_URL + "/AccessControl";

                String sessionId = access.login(user, "sdai-group", password);

                SIMDM_MASTER_WSDLService service = new SIMDM_MASTER_WSDLService();
                service.Url = SERVER_URL + String.Format(MODEL_SERVICE_PARAMS_TEMPLATE, repository, model);

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
                access.logout(sessionId);

                Console.Out.WriteLine("Operation completed successfully.");
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
