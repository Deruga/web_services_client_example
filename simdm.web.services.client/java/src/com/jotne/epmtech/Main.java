package com.jotne.epmtech;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.file.Paths;
import java.rmi.RemoteException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;

import com.jotne.epmtech.EDM_DUMMY_SCHEMA.EDMAccessControl.FileTransferInfo;
import com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_attached_file;
import com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_file;
import com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_item;
import com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_node;
import com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_nodus;
import com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_pbs_item;
import com.sampullara.cli.Args;
import com.sampullara.cli.Argument;

import localhost.EDMWS.AccessControl.EDMAccessControl;
import localhost.EDMWS.AccessControl.EDMAccessControlServiceLocator;
import localhost.EDMWS.earlybinding.options_2097152.DataRepository.SimDM_Master.QEX.SIMDM_MASTER_WSDL.SIMDM_MASTER_WSDL;
import localhost.EDMWS.earlybinding.options_2097152.DataRepository.SimDM_Master.QEX.SIMDM_MASTER_WSDL.SIMDM_MASTER_WSDLServiceLocator;

public class Main {

	@Argument(value = "server", description = "URL to server", required = true)
	private String server = "http://localhost:8080";
	
	@Argument(value = "file", description = "file to upload", required = true)
	private String filepath = "d:\\1.jpg"; // TODO: provide any existent file here.

	@Argument(value = "repo", description = "EDM repository name", required = true)
	private String repository;

	@Argument(value = "model", description = "EDM model name", required = true)
	private String model;

	@Argument(value = "login", description = "user login", required = true)
	private String login;

	@Argument(value = "pass", description = "user password", required = true)
	private String password;

	@Argument(value = "node", description = "node (folder) name", required = true)
	private String nodeName;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			new Main().Run(args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void Run(String[] args) throws Exception
	{
		if (args.length == 0)
		{
			Args.usage(this);
			return;
		}
		Args.parse(this, args);

		EDMAccessControlServiceLocator edmAccessControlServiceLocator = new EDMAccessControlServiceLocator();
		SIMDM_MASTER_WSDLServiceLocator simDmMasterServiceLocator = new SIMDM_MASTER_WSDLServiceLocator();
		
		EDMAccessControl edmAccessControl = edmAccessControlServiceLocator.getEDMWS(new URL(server + "/EDMWS/AccessControl?option=LITERAL_ENCODING"));
		String url = String.format("%s/EDMWS/earlybinding/options_2097152/%s/%s/QEX/SIMDM_MASTER_WSDL", server, repository, model);
		SIMDM_MASTER_WSDL simDmService = simDmMasterServiceLocator.getEDMWS(new URL(url));
		String sessionID = edmAccessControl.login(login, "sdai-group", password);
		System.out.println("session opened: " + sessionID);

		V_pbs_item[] list = simDmService.pbs_search(
				sessionID,
				nodeName,
				new String[] { "NODE.NAME" }, false, true, 0, null, false,
				null, null, null, null, 2, 0);
		if (list == null || list.length == 0)
			throw new Exception("No nodes was found.");
		else if (list.length > 1)
			throw new Exception("More than one node was found.");

		V_item item = new V_item();
		item.setName("New node name");
		item.setItem_type("PROJECT"); // 'ANALYSIS', 'LINEAR STATIC ANALYSIS', 'LINEAR MODES AND FREQUENCES ANALYSIS', 'DESIGN', 'PROGRAM', 'PROJECT', 'PRODUCT', 'PART'
		item.setDescription("");
		item.setIntroduced("");
		item.setPreview("");
		
		V_nodus nodus = new V_nodus();
		nodus.setItem(item);
		nodus.setVersion("");

		V_node node = new V_node();
		node.setNodus(nodus);
		node.setId("");
		node.setRealization("");
		
		node = simDmService.node_create(sessionID, node, new int[] {list[0].getItem().getInstance_id()});
		// node.getNodus().getItem().getInstance_id() can be used in attachedFile.setDomain() method
	
		String fileName = Paths.get(filepath).getFileName().toString();
		
		item = new V_item();
		item.setName(GetFileNameWithoutExtension(fileName));
		item.setItem_type("");
		item.setDescription("");
		item.setIntroduced("");
		item.setPreview("");

		V_file fileSpec = new V_file();
		fileSpec.setItem(item);
		fileSpec.setExtension(GetFileExtension(fileName));
		fileSpec.set_interface("Interface specifications"/* any human readable text */);
		fileSpec.setOriginal_name(filepath);
		fileSpec.setOriginal_format("file format name"); // can be derived from file name by using System API
		fileSpec.setOS("Microsoft Windows"/* any text */);
		fileSpec.setProduced_by("EPM Thechnology AS");
		fileSpec.setSize((int)new File(filepath).length());
		fileSpec.setOwner(0); // organization id
		fileSpec.setCheck_sum("");
		fileSpec.setLink("");
		fileSpec.setExpress_schema("");
		fileSpec.setModel_name("");

		fileSpec = simDmService.file_create(sessionID, fileSpec);

        V_attached_file attachedFile = new V_attached_file();
        item = new V_item();
		item.setItem_type("");
		item.setDescription("");
		item.setIntroduced("");
		item.setPreview("");
        item.setName(fileName);
        item.setDescription("description must be here");
        attachedFile.setItem(item);
        attachedFile.setDomain(list[0].getItem().getInstance_id());
        attachedFile.setFile(fileSpec.getItem().getInstance_id());

        attachedFile = simDmService.attached_file_create(sessionID, attachedFile);
        
        FileTransferInfo transferInfo = UploadFile(sessionID, edmAccessControl, filepath, GetFileExtension(fileName));
        
        fileSpec = simDmService.file_body_set(sessionID, fileSpec.getItem().getInstance_id(), fileSpec.getSize(), transferInfo.getFileNameOnServer());

        if ("ANALYSIS".equals(fileSpec.getItem().getItem_type()) || "DESIGN".equals(fileSpec.getItem().getItem_type()))
        {
        	// The file can be converted to CAX file.
        	FileTransferInfo resultFile = edmAccessControl.createTemporaryFile(sessionID, "name", ".cax", false);
            String source = transferInfo.getFileNameOnServer();
            String result = resultFile.getFileNameOnServer();
            simDmService.file_CAX_generate(sessionID, fileSpec.getItem().getInstance_id(), source, result, null/*log file*/, true);
        }
        else if ("STEP".equals(fileSpec.getItem().getItem_type()) && !"[NO SCHEMA]".equals(fileSpec.getModel_name()))
        {
        	// STEP file can be imported to the database as EDM model
            fileSpec = simDmService.file_import_STEP(sessionID, fileSpec.getItem().getInstance_id(), "", transferInfo.getFileNameOnServer(), "");
            if (fileSpec.getCAX() != -1)
            {
            	// The file can be converted to CAX file.
            	FileTransferInfo resultFile = edmAccessControl.createTemporaryFile(sessionID, "name", ".cax", false);
                String source = transferInfo.getFileNameOnServer();
                String result = resultFile.getFileNameOnServer();
                simDmService.file_CAX_generate(sessionID, fileSpec.getItem().getInstance_id(), source, result, null/*log file*/, true);
            }
        }

		String closeResult = edmAccessControl.logout(sessionID);
		System.out.println("session closed: " + closeResult);
	}
	
	private static String GetFileExtension(String fileName)
	{
		String extension = "";

		int i = fileName.lastIndexOf('.');
		if (i >= 0) {
		    extension = fileName.substring(i);
		}
		return extension;
	}

	private static String GetFileNameWithoutExtension(String fileName)
	{
		String name = "";

		int i = fileName.lastIndexOf('.');
		if (i >= 0) {
		    name = fileName.substring(0, i);
		}
		return name;
	}

	private static FileTransferInfo UploadFile(String sessionId, EDMAccessControl access, String fileToUpload, String fileExtension) throws RemoteException, IOException 
	{
		FileTransferInfo transferInfo = access.createTemporaryFile(sessionId, "name", fileExtension, true);

		HttpClient client = new HttpClient();
        try {
        	// URL has not valid symbols. It must be encoded
            String uploadOrDownloadUrl = transferInfo.getUploadOrDownloadUrl();
            String encUploadOrDownloadUrl = null;
            Pattern p = Pattern.compile(".*fileName=([^&]+)&.*");
            Matcher m = p.matcher(uploadOrDownloadUrl);
            if (!m.matches()){
            	//error in regexp
            } else {
            	String fileName = m.group(1);
            	String encFileName = URLEncoder.encode(fileName,"ASCII");
            	encUploadOrDownloadUrl = uploadOrDownloadUrl.replace(fileName, encFileName) + sessionId;
            }

 			PostMethod pm = new PostMethod(encUploadOrDownloadUrl);
 			File f = new File(fileToUpload);
 			pm.setRequestHeader("Content-Type","xxx.xxx");
 			pm.setRequestHeader("Content-Length","" + f.length());
 			pm.setRequestBody(new FileInputStream(f));
 			int status = client.executeMethod(pm); 
 			String response = pm.getResponseBodyAsString();
        } finally {
        }

		return transferInfo;
	}

}
