package localhost.EDMWS.AccessControl;

public class EDMAccessControlProxy implements localhost.EDMWS.AccessControl.EDMAccessControl {
  private String _endpoint = null;
  private localhost.EDMWS.AccessControl.EDMAccessControl eDMAccessControl = null;
  
  public EDMAccessControlProxy() {
    _initEDMAccessControlProxy();
  }
  
  public EDMAccessControlProxy(String endpoint) {
    _endpoint = endpoint;
    _initEDMAccessControlProxy();
  }
  
  private void _initEDMAccessControlProxy() {
    try {
      eDMAccessControl = (new localhost.EDMWS.AccessControl.EDMAccessControlServiceLocator()).getEDMWS();
      if (eDMAccessControl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)eDMAccessControl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)eDMAccessControl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (eDMAccessControl != null)
      ((javax.xml.rpc.Stub)eDMAccessControl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public localhost.EDMWS.AccessControl.EDMAccessControl getEDMAccessControl() {
    if (eDMAccessControl == null)
      _initEDMAccessControlProxy();
    return eDMAccessControl;
  }
  
  public java.lang.String version(java.lang.String EDMSESSIONID) throws java.rmi.RemoteException{
    if (eDMAccessControl == null)
      _initEDMAccessControlProxy();
    return eDMAccessControl.version(EDMSESSIONID);
  }
  
  public java.lang.String deleteTemporaryFile(java.lang.String EDMSESSIONID, com.jotne.epmtech.EDM_DUMMY_SCHEMA.EDMAccessControl.FileTransferInfo FILEINFO) throws java.rmi.RemoteException{
    if (eDMAccessControl == null)
      _initEDMAccessControlProxy();
    return eDMAccessControl.deleteTemporaryFile(EDMSESSIONID, FILEINFO);
  }
  
  public com.jotne.epmtech.EDM_DUMMY_SCHEMA.EDMAccessControl.FileTransferInfo createTemporaryFile(java.lang.String EDMSESSIONID, java.lang.String FILENAME, java.lang.String FILETYPE, boolean UPLOAD) throws java.rmi.RemoteException{
    if (eDMAccessControl == null)
      _initEDMAccessControlProxy();
    return eDMAccessControl.createTemporaryFile(EDMSESSIONID, FILENAME, FILETYPE, UPLOAD);
  }
  
  public java.lang.String xpxLogging(java.lang.String EDMSESSIONID, java.lang.String ACTION, java.lang.String OPTION, java.lang.String MAXSIZE) throws java.rmi.RemoteException{
    if (eDMAccessControl == null)
      _initEDMAccessControlProxy();
    return eDMAccessControl.xpxLogging(EDMSESSIONID, ACTION, OPTION, MAXSIZE);
  }
  
  public java.lang.String resetAllOptions(java.lang.String EDMSESSIONID) throws java.rmi.RemoteException{
    if (eDMAccessControl == null)
      _initEDMAccessControlProxy();
    return eDMAccessControl.resetAllOptions(EDMSESSIONID);
  }
  
  public java.lang.String setOption(java.lang.String EDMSESSIONID, java.lang.String OPTION) throws java.rmi.RemoteException{
    if (eDMAccessControl == null)
      _initEDMAccessControlProxy();
    return eDMAccessControl.setOption(EDMSESSIONID, OPTION);
  }
  
  public java.lang.String logout(java.lang.String EDMSESSIONID) throws java.rmi.RemoteException{
    if (eDMAccessControl == null)
      _initEDMAccessControlProxy();
    return eDMAccessControl.logout(EDMSESSIONID);
  }
  
  public java.lang.String login(java.lang.String USER, java.lang.String GROUP, java.lang.String PASSWORD) throws java.rmi.RemoteException{
    if (eDMAccessControl == null)
      _initEDMAccessControlProxy();
    return eDMAccessControl.login(USER, GROUP, PASSWORD);
  }
  
  
}