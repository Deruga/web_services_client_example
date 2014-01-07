package localhost.EDMWS.earlybinding.DataRepository.CascadedCsys_ROTFIX_sol101_out.QEX.node_query;

public class Node_queryProxy implements localhost.EDMWS.earlybinding.DataRepository.CascadedCsys_ROTFIX_sol101_out.QEX.node_query.Node_query {
  private String _endpoint = null;
  private localhost.EDMWS.earlybinding.DataRepository.CascadedCsys_ROTFIX_sol101_out.QEX.node_query.Node_query node_query = null;
  
  public Node_queryProxy() {
    _initNode_queryProxy();
  }
  
  public Node_queryProxy(String endpoint) {
    _endpoint = endpoint;
    _initNode_queryProxy();
  }
  
  private void _initNode_queryProxy() {
    try {
      node_query = (new localhost.EDMWS.earlybinding.DataRepository.CascadedCsys_ROTFIX_sol101_out.QEX.node_query.Node_queryServiceLocator()).getEDMWS();
      if (node_query != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)node_query)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)node_query)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (node_query != null)
      ((javax.xml.rpc.Stub)node_query)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public localhost.EDMWS.earlybinding.DataRepository.CascadedCsys_ROTFIX_sol101_out.QEX.node_query.Node_query getNode_query() {
    if (node_query == null)
      _initNode_queryProxy();
    return node_query;
  }
  
  public com.jotne.epmtech.Ap209_multidisciplinary_analysis_and_design_mim_LF.node_query.Node_info_ve[] get_node_info(java.lang.String EDMsessionId) throws java.rmi.RemoteException{
    if (node_query == null)
      _initNode_queryProxy();
    return node_query.get_node_info(EDMsessionId);
  }
  
  public java.lang.String _login(java.lang.String USER, java.lang.String GROUP, java.lang.String PASSWORD) throws java.rmi.RemoteException{
    if (node_query == null)
      _initNode_queryProxy();
    return node_query._login(USER, GROUP, PASSWORD);
  }
  
  public java.lang.String _logout(java.lang.String EDMSESSIONID) throws java.rmi.RemoteException{
    if (node_query == null)
      _initNode_queryProxy();
    return node_query._logout(EDMSESSIONID);
  }
  
  public com.jotne.epmtech.Ap209_multidisciplinary_analysis_and_design_mim_LF.node_query.FileTransferInfo _createTemporaryFile(java.lang.String EDMSESSIONID, java.lang.String FILENAME, java.lang.String FILETYPE, boolean UPLOAD) throws java.rmi.RemoteException{
    if (node_query == null)
      _initNode_queryProxy();
    return node_query._createTemporaryFile(EDMSESSIONID, FILENAME, FILETYPE, UPLOAD);
  }
  
  public java.lang.String _deleteTemporaryFile(java.lang.String EDMSESSIONID, com.jotne.epmtech.Ap209_multidisciplinary_analysis_and_design_mim_LF.node_query.FileTransferInfo FILEINFO) throws java.rmi.RemoteException{
    if (node_query == null)
      _initNode_queryProxy();
    return node_query._deleteTemporaryFile(EDMSESSIONID, FILEINFO);
  }
  
  public java.lang.String _version(java.lang.String EDMSESSIONID) throws java.rmi.RemoteException{
    if (node_query == null)
      _initNode_queryProxy();
    return node_query._version(EDMSESSIONID);
  }
  
  
}