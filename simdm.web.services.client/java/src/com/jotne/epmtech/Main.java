package com.jotne.epmtech;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
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
import com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_pbs;
import com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_pbs_item;
import com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_property;
import com.sampullara.cli.Args;
import com.sampullara.cli.Argument;

import localhost.EDMWS.AccessControl.EDMAccessControl;
import localhost.EDMWS.AccessControl.EDMAccessControlServiceLocator;
import localhost.EDMWS.earlybinding.options_2097152.DataRepository.SimDM_Master.QEX.SIMDM_MASTER_WSDL.SIMDM_MASTER_WSDL;
import localhost.EDMWS.earlybinding.options_2097152.DataRepository.SimDM_Master.QEX.SIMDM_MASTER_WSDL.SIMDM_MASTER_WSDLServiceLocator;
import localhost.EDMWS.earlybinding.options_2097152.DataRepository.SimDM_Master_AP209e2.QEX.SimDMobjectViewerQuerySchema.SimDMobjectViewerQuerySchema;
import localhost.EDMWS.earlybinding.options_2097152.DataRepository.SimDM_Master_AP209e2.QEX.SimDMobjectViewerQuerySchema.SimDMobjectViewerQuerySchemaService;
import localhost.EDMWS.earlybinding.options_2097152.DataRepository.SimDM_Master_AP209e2.QEX.SimDMobjectViewerQuerySchema.SimDMobjectViewerQuerySchemaServiceLocator;

public class Main {

	@Argument(value = "server", description = "URL to server", required = false)
	private String server = "https://api.eu-cloudflow.eu/jotne";

	@Argument(value = "file", description = "file to upload", required = false)
	private String filepath = "picture.jpg";

	@Argument(value = "repo", description = "EDM repository name", required = true)
	private String repository;

	@Argument(value = "model", description = "EDM model name", required = true)
	private String model;

	@Argument(value = "login", description = "user login", required = true)
	private String login;

	@Argument(value = "pass", description = "user password", required = true)
	private String password;

	@Argument(value = "node", description = "node (folder) name", required = false)
	private String nodeName;

	@Argument(value = "command", description = "command to execute: upload_file, create_pbs, define_properties, show_types", required = true)
	private String command = "upload_file";
	
	@Argument(value = "keystore_file", description = "path to keystore file", required = false)
	private String keystoreFile = "keystore";

	@Argument(value = "keystore_pass", description = "password for keystore file", required = false)
	private String keystorePassword = "password";

	private EDMAccessControl edmAccessControl;

	private SIMDM_MASTER_WSDL simDmService;

	private SimDMobjectViewerQuerySchema nodeService;

	private String sessionID;

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

	private void Run(String[] args) throws Exception {
		if (args.length == 0) {
			Args.usage(this);
			return;
		}
		Args.parse(this, args);
		
		/*if (server.toUpperCase().startsWith("HTTPS:")) {
			System.setProperty("javax.net.ssl.trustStore", keystoreFile);
			System.setProperty("javax.net.ssl.trustStorePassword", keystorePassword);
			System.setProperty("javax.net.ssl.trustStoreType", "JKS");
		}*/

		EDMAccessControlServiceLocator edmAccessControlServiceLocator = new EDMAccessControlServiceLocator();
		SIMDM_MASTER_WSDLServiceLocator simDmMasterServiceLocator = new SIMDM_MASTER_WSDLServiceLocator();
		SimDMobjectViewerQuerySchemaServiceLocator nodeServiceLocator = new SimDMobjectViewerQuerySchemaServiceLocator();

		edmAccessControl = edmAccessControlServiceLocator.getEDMWS(new URL(server + "/EDMWS/AccessControl?option=LITERAL_ENCODING"));
		String url = String.format("%s/EDMWS/earlybinding/options_2097152/%s/%s/QEX/SIMDM_MASTER_WSDL", server, repository, model);
		simDmService = simDmMasterServiceLocator.getEDMWS(new URL(url));
		url = String.format("%s/EDMWS/earlybinding/options_2097152/%s/%s/QEX/node_query", server, repository, model);
		nodeService = nodeServiceLocator.getEDMWS(new URL(url));
		sessionID = edmAccessControl.login(login, "sdai-group", password);
		System.out.println("session opened: " + sessionID);

		if ("upload_file".equals(command))
			uploadFileCommand();
		else if ("download_file".equals(command))
			downloadFileCommand();
		else if ("create_pbs".equals(command))
			createProductStructureCommand();
		else if ("define_properties".equals(command))
			definePropertiesCommand();
		else if ("show_types".equals(command))
			showTypesCommand();
		else {
			throw new Exception("Unexpected command: " + command);
		}

		String closeResult = edmAccessControl.logout(sessionID);
		System.out.println("session closed: " + closeResult);
	}

	private void showTypesCommand() throws RemoteException {
		String[] persontypes = simDmService.person_list_types(sessionID);
		printTypes("person types:", persontypes);
		String[] pbstypes = simDmService.pbs_list_types(sessionID);
		printTypes("pbs types:", pbstypes);
		String[] baselinetypes = simDmService.baseline_list_types(sessionID);
		printTypes("baseline types:", baselinetypes);
		String[] filetypes = simDmService.file_list_types(sessionID);
		printTypes("file types:", filetypes);
		String[] propertytypes = simDmService.property_list_types(sessionID);
		printTypes("property types:", propertytypes);
	}

	static void printTypes(String typeName, String[] typeNames) {
		System.out.println(typeName);
		for (int i = 0; i < typeNames.length; i++) {
			if (typeNames[i].isEmpty())
				System.out.println("<empty string>");
			else
				System.out.println(typeNames[i]);
		}
		System.out.println();
	}

	private void definePropertiesCommand() throws RemoteException {
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

	private void define_property(String propType, String name) throws RemoteException {
		V_item item = new V_item();
		item.setItem_type(propType);
		item.setName(name);
		item.setDescription("");
		item.setIntroduced("");
		item.setLast_changed("");
		item.setPreview("");

		V_property prop = new V_property();
		prop.setItem(item);
		prop.setApplicable_to(new String[] { "DESIGN" });
		prop.setDefault_value("");
		prop.setUnits("");
		/* V_property storedTypeForBOM = */simDmService.property_create(sessionID, prop);
	}

	private void createProductStructureCommand() throws RemoteException {
		V_pbs pbsTop = simDmService.pbs_get(sessionID, null);
		V_node car = createNode("Car", "Electric cabriolet", pbsTop.getNodus().getItem().getInstance_id());
		V_node carBody = createNode("Car Body", "Body made by aluminium", car.getNodus().getItem().getInstance_id());
		/* V_node leftFrontDoor = */createNode("Left Front Door", "", carBody.getNodus().getItem().getInstance_id());
		/* V_node rightFrontDoor = */createNode("Right Front Door", "", carBody.getNodus().getItem().getInstance_id());
		/* V_node Wheels = */createNode("Wheels", "", car.getNodus().getItem().getInstance_id());
		V_node Engine = createNode("Engine", "", car.getNodus().getItem().getInstance_id());
		/* V_node EngineBlock = */createNode("Engine Block", "", Engine.getNodus().getItem().getInstance_id());
		/* V_node Pistons = */createNode("Pistons", "", Engine.getNodus().getItem().getInstance_id());
		/* V_node CrankShaft = */createNode("Crank Shaft", "", Engine.getNodus().getItem().getInstance_id());
		V_node tailGate = createNode("Tail gate", "", carBody.getNodus().getItem().getInstance_id());
		/* V_node tailGateWing = */createNode("Tail gate wing", "", tailGate.getNodus().getItem().getInstance_id());
	}

	private void uploadFileCommand() throws Exception {
		V_pbs_item[] list = simDmService.pbs_search(sessionID, nodeName,
				new String[] { "NODE.NAME" }, false, true, 0, null, false,
				null, null, null, null, 2, 0);
		if (list == null || list.length == 0)
			throw new Exception("No nodes was found.");
		else if (list.length > 1)
			throw new Exception("More than one node was found.");

		String fileName = Paths.get(filepath).getFileName().toString();

		V_item item = new V_item();
		item.setName(GetFileNameWithoutExtension(fileName));
		item.setItem_type("");
		item.setDescription("");
		item.setIntroduced("");
		item.setLast_changed("");
		item.setPreview("");

		V_file fileSpec = new V_file();
		fileSpec.setItem(item);
		fileSpec.setExtension(GetFileExtension(fileName));
		fileSpec.set_interface("Interface specifications"/* any human readable text */);
		fileSpec.setOriginal_name(filepath);
		fileSpec.setOriginal_format("file format name"); // can be derived from file name by using System API
		fileSpec.setOS("Microsoft Windows"/* any text */);
		fileSpec.setProduced_by("EPM Thechnology AS");
		fileSpec.setSize(0); // size will be set on server
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
		item.setLast_changed("");
		item.setPreview("");
		item.setName(fileName);
		item.setDescription("description must be here");
		attachedFile.setItem(item);
		attachedFile.setDomain(list[0].getItem().getInstance_id());
		attachedFile.setFile(fileSpec.getItem().getInstance_id());
		
		attachedFile = simDmService.attached_file_create(sessionID, attachedFile);

		FileTransferInfo transferInfo = upload(sessionID, edmAccessControl, filepath, GetFileExtension(fileName));

		fileSpec = simDmService.file_body_set(sessionID, fileSpec.getItem().getInstance_id(), fileSpec.getSize(), transferInfo.getFileNameOnServer());

		if ("ANALYSIS".equals(fileSpec.getItem().getItem_type())
				|| "DESIGN".equals(fileSpec.getItem().getItem_type())) {
			// The file can be converted to CAX file.
			FileTransferInfo resultFile = edmAccessControl.createTemporaryFile(sessionID, "name", ".cax", false);
			String source = transferInfo.getFileNameOnServer();
			String result = resultFile.getFileNameOnServer();
			simDmService.file_CAX_generate(sessionID, fileSpec.getItem().getInstance_id(), source, result, null/* log file */, true);
		} else if ("STEP".equals(fileSpec.getItem().getItem_type())
				&& !"[NO SCHEMA]".equals(fileSpec.getModel_name())) {
			// STEP file can be imported to the database as EDM model
			fileSpec = simDmService.file_import_STEP(sessionID, fileSpec.getItem().getInstance_id(), "", transferInfo.getFileNameOnServer(), "");
			if (fileSpec.getCAX() != -1) {
				// The file can be converted to CAX file.
				FileTransferInfo resultFile = edmAccessControl.createTemporaryFile(sessionID, "name", ".cax", false);
				String source = transferInfo.getFileNameOnServer();
				String result = resultFile.getFileNameOnServer();
				simDmService.file_CAX_generate(sessionID, fileSpec.getItem().getInstance_id(), source, result, null/* log file */, true);
			}
		}
	}

	private void downloadFileCommand() throws Exception {
		V_pbs_item[] list = simDmService.pbs_search(sessionID, nodeName,
				new String[] { "PBS_ITEM.NAME" }, false, true, 0, null, false,
				null, null, null, null, 2, 0);
		if (list == null || list.length == 0)
			throw new Exception("No files was found.");
		else if (list.length > 1)
			throw new Exception("More than one file was found.");
		
		V_attached_file attachedFile = simDmService.attached_file_get(sessionID, list[0].getItem().getInstance_id());
		FileTransferInfo transferInfo = edmAccessControl.createTemporaryFile(sessionID, "name", ".ext", false);
		simDmService.file_body_get(sessionID, attachedFile.getFile()/* file ID */, transferInfo.getFileNameOnServer());
		download(sessionID, filepath, transferInfo);
		
		// this can be skipped. temporary file is deleted after logout is performed.
		edmAccessControl.deleteTemporaryFile(sessionID, transferInfo);
	}
	
	private V_node createNode(String name, String description, long parent) throws RemoteException {
		V_item item = new V_item();
		item.setName(name);
		item.setItem_type("DESIGN");
		item.setDescription(description);
		item.setIntroduced("");
		item.setLast_changed("");
		item.setPreview("");

		V_nodus nodus = new V_nodus();
		nodus.setItem(item);
		nodus.setVersion("1");

		V_node node = new V_node();
		node.setNodus(nodus);
		node.setId(name);
		node.setRealization("");

		return simDmService.node_create(sessionID, node, new long[] { parent });
	}

	private static String GetFileExtension(String fileName) {
		String extension = "";

		int i = fileName.lastIndexOf('.');
		if (i >= 0) {
			extension = fileName.substring(i);
		}
		return extension;
	}

	private static String GetFileNameWithoutExtension(String fileName) {
		String name = "";

		int i = fileName.lastIndexOf('.');
		if (i >= 0) {
			name = fileName.substring(0, i);
		}
		return name;
	}

	private static FileTransferInfo upload(String sessionId, EDMAccessControl access, String fileToUpload, String fileExtension) throws RemoteException, IOException {
		FileTransferInfo transferInfo = access.createTemporaryFile(sessionId, "name", fileExtension, true);

		HttpClient client = new HttpClient();
		try {
			// URL has not valid symbols. It must be encoded
			String encUploadOrDownloadUrl = encodeUrl(transferInfo.getUploadOrDownloadUrl()) + sessionId;

			PostMethod pm = new PostMethod(encUploadOrDownloadUrl);
			File f = new File(fileToUpload);
			pm.setRequestHeader("Content-Type", "xxx.xxx");
			pm.setRequestHeader("Content-Length", "" + f.length());
			pm.setRequestEntity(new FileRequestEntity(f));
			/* int status = */client.executeMethod(pm);
			/* String response = */pm.getResponseBodyAsString();
		} finally {
		}
		return transferInfo;
	}

	private static FileTransferInfo download(String sessionId, String localFile, FileTransferInfo transferInfo) throws RemoteException, IOException {
		HttpClient client = new HttpClient();
		try {
			// URL has not valid symbols. It must be encoded
			String encUploadOrDownloadUrl = encodeUrl(transferInfo.getUploadOrDownloadUrl()) + sessionId;
			
			PostMethod pm = new PostMethod(encUploadOrDownloadUrl);
			/* int status = */client.executeMethod(pm);
			InputStream is = pm.getResponseBodyAsStream();
			OutputStream os = new FileOutputStream(new File(localFile));
			byte[] buf = new byte[1024];
			int len;
			while ((len = is.read(buf)) > 0) {
				os.write(buf, 0, len);
			}
			is.close();
			os.close();
		} finally {
		}
		return transferInfo;
	}
	
	private static String encodeUrl(String url) throws UnsupportedEncodingException
	{
		String encUploadOrDownloadUrl = null;
		Pattern p = Pattern.compile(".*fileName=([^&]+)&.*");
		Matcher m = p.matcher(url);
		if (!m.matches()) {
			// error in regexp
		} else {
			String fileName = m.group(1);
			String encFileName = URLEncoder.encode(fileName, "ASCII");
			encUploadOrDownloadUrl = url.replace(fileName, encFileName);
		}
		return encUploadOrDownloadUrl;
	}

}
