package localhost.EDMWS.earlybinding.options_2097152.DataRepository.SimDM_Master_AP209e2.QEX.SimDMobjectViewerQuerySchema;

public class SimDMobjectViewerQuerySchemaProxy implements localhost.EDMWS.earlybinding.options_2097152.DataRepository.SimDM_Master_AP209e2.QEX.SimDMobjectViewerQuerySchema.SimDMobjectViewerQuerySchema {
  private String _endpoint = null;
  private localhost.EDMWS.earlybinding.options_2097152.DataRepository.SimDM_Master_AP209e2.QEX.SimDMobjectViewerQuerySchema.SimDMobjectViewerQuerySchema simDMobjectViewerQuerySchema = null;
  
  public SimDMobjectViewerQuerySchemaProxy() {
    _initSimDMobjectViewerQuerySchemaProxy();
  }
  
  public SimDMobjectViewerQuerySchemaProxy(String endpoint) {
    _endpoint = endpoint;
    _initSimDMobjectViewerQuerySchemaProxy();
  }
  
  private void _initSimDMobjectViewerQuerySchemaProxy() {
    try {
      simDMobjectViewerQuerySchema = (new localhost.EDMWS.earlybinding.options_2097152.DataRepository.SimDM_Master_AP209e2.QEX.SimDMobjectViewerQuerySchema.SimDMobjectViewerQuerySchemaServiceLocator()).getEDMWS();
      if (simDMobjectViewerQuerySchema != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)simDMobjectViewerQuerySchema)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)simDMobjectViewerQuerySchema)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (simDMobjectViewerQuerySchema != null)
      ((javax.xml.rpc.Stub)simDMobjectViewerQuerySchema)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public localhost.EDMWS.earlybinding.options_2097152.DataRepository.SimDM_Master_AP209e2.QEX.SimDMobjectViewerQuerySchema.SimDMobjectViewerQuerySchema getSimDMobjectViewerQuerySchema() {
    if (simDMobjectViewerQuerySchema == null)
      _initSimDMobjectViewerQuerySchemaProxy();
    return simDMobjectViewerQuerySchema;
  }
  
  public java.lang.String testSearch(java.lang.String EDMsessionId) throws java.rmi.RemoteException{
    if (simDMobjectViewerQuerySchema == null)
      _initSimDMobjectViewerQuerySchemaProxy();
    return simDMobjectViewerQuerySchema.testSearch(EDMsessionId);
  }
  
  public java.lang.String[] getLoadCases(java.lang.String EDMsessionId) throws java.rmi.RemoteException{
    if (simDMobjectViewerQuerySchema == null)
      _initSimDMobjectViewerQuerySchemaProxy();
    return simDMobjectViewerQuerySchema.getLoadCases(EDMsessionId);
  }
  
  public java.lang.String[] getInputParameterValues(java.lang.String EDMsessionId, long QUERYINDEX) throws java.rmi.RemoteException{
    if (simDMobjectViewerQuerySchema == null)
      _initSimDMobjectViewerQuerySchemaProxy();
    return simDMobjectViewerQuerySchema.getInputParameterValues(EDMsessionId, QUERYINDEX);
  }
  
  public com.jotne.epmtech.ap209_multidisciplinary_analysis_and_design_mim_lf.SimDMobjectViewerQuerySchema.QuerySpecification[] getQuerySpecifications(java.lang.String EDMsessionId) throws java.rmi.RemoteException{
    if (simDMobjectViewerQuerySchema == null)
      _initSimDMobjectViewerQuerySchemaProxy();
    return simDMobjectViewerQuerySchema.getQuerySpecifications(EDMsessionId);
  }
  
  public com.jotne.epmtech.ap209_multidisciplinary_analysis_and_design_mim_lf.SimDMobjectViewerQuerySchema.QueryResult simDMobjectViewer(java.lang.String EDMsessionId, long QUERYINDEX, java.lang.String[] OBJECTKEYS, java.lang.String[] OBJECTKEYS_2, long FIRSTROW, long MAXNOOFROWS, long OPTIONS) throws java.rmi.RemoteException{
    if (simDMobjectViewerQuerySchema == null)
      _initSimDMobjectViewerQuerySchemaProxy();
    return simDMobjectViewerQuerySchema.simDMobjectViewer(EDMsessionId, QUERYINDEX, OBJECTKEYS, OBJECTKEYS_2, FIRSTROW, MAXNOOFROWS, OPTIONS);
  }
  
  public java.lang.String get_version(java.lang.String EDMsessionId) throws java.rmi.RemoteException{
    if (simDMobjectViewerQuerySchema == null)
      _initSimDMobjectViewerQuerySchemaProxy();
    return simDMobjectViewerQuerySchema.get_version(EDMsessionId);
  }
  
  public java.lang.String _login(java.lang.String USER, java.lang.String GROUP, java.lang.String PASSWORD) throws java.rmi.RemoteException{
    if (simDMobjectViewerQuerySchema == null)
      _initSimDMobjectViewerQuerySchemaProxy();
    return simDMobjectViewerQuerySchema._login(USER, GROUP, PASSWORD);
  }
  
  public java.lang.String _logout(java.lang.String EDMSESSIONID) throws java.rmi.RemoteException{
    if (simDMobjectViewerQuerySchema == null)
      _initSimDMobjectViewerQuerySchemaProxy();
    return simDMobjectViewerQuerySchema._logout(EDMSESSIONID);
  }
  
  public com.jotne.epmtech.ap209_multidisciplinary_analysis_and_design_mim_lf.SimDMobjectViewerQuerySchema.FileTransferInfo _createTemporaryFile(java.lang.String EDMSESSIONID, java.lang.String FILENAME, java.lang.String FILETYPE, boolean UPLOAD) throws java.rmi.RemoteException{
    if (simDMobjectViewerQuerySchema == null)
      _initSimDMobjectViewerQuerySchemaProxy();
    return simDMobjectViewerQuerySchema._createTemporaryFile(EDMSESSIONID, FILENAME, FILETYPE, UPLOAD);
  }
  
  public java.lang.String _deleteTemporaryFile(java.lang.String EDMSESSIONID, com.jotne.epmtech.ap209_multidisciplinary_analysis_and_design_mim_lf.SimDMobjectViewerQuerySchema.FileTransferInfo FILEINFO) throws java.rmi.RemoteException{
    if (simDMobjectViewerQuerySchema == null)
      _initSimDMobjectViewerQuerySchemaProxy();
    return simDMobjectViewerQuerySchema._deleteTemporaryFile(EDMSESSIONID, FILEINFO);
  }
  
  public java.lang.String _version(java.lang.String EDMSESSIONID) throws java.rmi.RemoteException{
    if (simDMobjectViewerQuerySchema == null)
      _initSimDMobjectViewerQuerySchemaProxy();
    return simDMobjectViewerQuerySchema._version(EDMSESSIONID);
  }
  
  
}