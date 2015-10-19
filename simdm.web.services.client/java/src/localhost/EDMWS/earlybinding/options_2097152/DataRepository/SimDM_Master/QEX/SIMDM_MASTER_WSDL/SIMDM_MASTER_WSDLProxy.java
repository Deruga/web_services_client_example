package localhost.EDMWS.earlybinding.options_2097152.DataRepository.SimDM_Master.QEX.SIMDM_MASTER_WSDL;

public class SIMDM_MASTER_WSDLProxy implements localhost.EDMWS.earlybinding.options_2097152.DataRepository.SimDM_Master.QEX.SIMDM_MASTER_WSDL.SIMDM_MASTER_WSDL {
  private String _endpoint = null;
  private localhost.EDMWS.earlybinding.options_2097152.DataRepository.SimDM_Master.QEX.SIMDM_MASTER_WSDL.SIMDM_MASTER_WSDL sIMDM_MASTER_WSDL = null;
  
  public SIMDM_MASTER_WSDLProxy() {
    _initSIMDM_MASTER_WSDLProxy();
  }
  
  public SIMDM_MASTER_WSDLProxy(String endpoint) {
    _endpoint = endpoint;
    _initSIMDM_MASTER_WSDLProxy();
  }
  
  private void _initSIMDM_MASTER_WSDLProxy() {
    try {
      sIMDM_MASTER_WSDL = (new localhost.EDMWS.earlybinding.options_2097152.DataRepository.SimDM_Master.QEX.SIMDM_MASTER_WSDL.SIMDM_MASTER_WSDLServiceLocator()).getEDMWS();
      if (sIMDM_MASTER_WSDL != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sIMDM_MASTER_WSDL)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sIMDM_MASTER_WSDL)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sIMDM_MASTER_WSDL != null)
      ((javax.xml.rpc.Stub)sIMDM_MASTER_WSDL)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public localhost.EDMWS.earlybinding.options_2097152.DataRepository.SimDM_Master.QEX.SIMDM_MASTER_WSDL.SIMDM_MASTER_WSDL getSIMDM_MASTER_WSDL() {
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL;
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_blob_size_test[] test_blob_size(java.lang.String EDMsessionId) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.test_blob_size(EDMsessionId);
  }
  
  public boolean test_mapping(java.lang.String EDMsessionId, java.lang.String SOURCE) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.test_mapping(EDMsessionId, SOURCE);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_assigned_item[] test_pbs_assignments_select(java.lang.String EDMsessionId, long ITEM1, long ITEM2, long DOMAIN, java.lang.String DOMAIN_TYPE1, java.lang.String DOMAIN_TYPE2, boolean LATEST_VERSION, java.lang.String BEFORE, java.lang.String AFTER, long CREATOR1, long CREATOR2, long PAGE, long START_FROM) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.test_pbs_assignments_select(EDMsessionId, ITEM1, ITEM2, DOMAIN, DOMAIN_TYPE1, DOMAIN_TYPE2, LATEST_VERSION, BEFORE, AFTER, CREATOR1, CREATOR2, PAGE, START_FROM);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_pbs_item[] test_pbs_search(java.lang.String EDMsessionId, java.lang.String PATTERN, long DOMAIN, java.lang.String DOMAIN_TYPE1, java.lang.String DOMAIN_TYPE2, java.lang.String TYPE1, java.lang.String TYPE2, java.lang.String ROLE1, java.lang.String ROLE2, boolean CASE_SENSITIVE, boolean EXACT_MATCH, boolean LATEST_VERSION, java.lang.String BEFORE, java.lang.String AFTER, long CREATOR1, long CREATOR2, long PAGE, long START_FROM) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.test_pbs_search(EDMsessionId, PATTERN, DOMAIN, DOMAIN_TYPE1, DOMAIN_TYPE2, TYPE1, TYPE2, ROLE1, ROLE2, CASE_SENSITIVE, EXACT_MATCH, LATEST_VERSION, BEFORE, AFTER, CREATOR1, CREATOR2, PAGE, START_FROM);
  }
  
  public java.lang.String test__echo(java.lang.String EDMsessionId, java.lang.String TEXT, long DELAY_IN_SECONDS) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.test__echo(EDMsessionId, TEXT, DELAY_IN_SECONDS);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_node_in_tree stm_test_import_file_system(java.lang.String EDMsessionId, long PARENT, java.lang.String COMMENT, java.lang.String NODE_TYPE, java.lang.String FILE_TYPE, boolean UPLOAD, java.lang.String i1, java.lang.String i2, java.lang.String i3, java.lang.String i4, java.lang.String i5, java.lang.String i6) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.stm_test_import_file_system(EDMsessionId, PARENT, COMMENT, NODE_TYPE, FILE_TYPE, UPLOAD, i1, i2, i3, i4, i5, i6);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_node_in_tree stm_import_file_system(java.lang.String EDMsessionId, long PARENT, java.lang.String COMMENT, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_file_system_item[] ITEMS, java.lang.String NODE_TYPE, java.lang.String FILE_TYPE, boolean UPLOAD) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.stm_import_file_system(EDMsessionId, PARENT, COMMENT, ITEMS, NODE_TYPE, FILE_TYPE, UPLOAD);
  }
  
  public java.lang.String[] stm_list_node_types(java.lang.String EDMsessionId) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.stm_list_node_types(EDMsessionId);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_instance_wrapper[] stm_file_delete(java.lang.String EDMsessionId, long FILE, long NODE, java.lang.String COMMENT) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.stm_file_delete(EDMsessionId, FILE, NODE, COMMENT);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_instance_wrapper[] stm_node_delete(java.lang.String EDMsessionId, long SUBJECT, long PARENT, java.lang.String COMMENT) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.stm_node_delete(EDMsessionId, SUBJECT, PARENT, COMMENT);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_remark[] stm_get_latest_remarks(java.lang.String EDMsessionId, java.lang.String AFTER, long PAGE_SIZE, long PAGE) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.stm_get_latest_remarks(EDMsessionId, AFTER, PAGE_SIZE, PAGE);
  }
  
  public boolean stm_withdraw_resolution(java.lang.String EDMsessionId, long RESOLUTION) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.stm_withdraw_resolution(EDMsessionId, RESOLUTION);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_resolution stm_node_add_resolution(java.lang.String EDMsessionId, long NODE, java.lang.String RESOLUTION, java.lang.String REMARK) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.stm_node_add_resolution(EDMsessionId, NODE, RESOLUTION, REMARK);
  }
  
  public java.lang.String[] stm_list_resolutions_awalable_for_me(java.lang.String EDMsessionId, long NODE_ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.stm_list_resolutions_awalable_for_me(EDMsessionId, NODE_ID);
  }
  
  public java.lang.String[] stm_list_awalable_resolutions(java.lang.String EDMsessionId) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.stm_list_awalable_resolutions(EDMsessionId);
  }
  
  public boolean stm_withdraw_remark(java.lang.String EDMsessionId, long REMARK) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.stm_withdraw_remark(EDMsessionId, REMARK);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_remark stm_add_remark(java.lang.String EDMsessionId, long ITEM, java.lang.String SUBJ, java.lang.String REMARK) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.stm_add_remark(EDMsessionId, ITEM, SUBJ, REMARK);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_file[] stm_node_get_files(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.stm_node_get_files(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_resolution[] stm_node_get_resolutions(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.stm_node_get_resolutions(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_remark[] stm_node_get_remarks(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.stm_node_get_remarks(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_property[] stm_node_get_properties(java.lang.String EDMsessionId, long n) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.stm_node_get_properties(EDMsessionId, n);
  }
  
  public java.lang.String stm_file_extract(java.lang.String EDMsessionId, long FILE, java.lang.String LINK) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.stm_file_extract(EDMsessionId, FILE, LINK);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_file stm_node_assign_file(java.lang.String EDMsessionId, long NODE, java.lang.String NAME, java.lang.String FILE_TYPE, java.lang.String LINK, java.lang.String DESCRIPTION, long SIZE, boolean UPLOAD) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.stm_node_assign_file(EDMsessionId, NODE, NAME, FILE_TYPE, LINK, DESCRIPTION, SIZE, UPLOAD);
  }
  
  public java.lang.String[] stm_list_file_types(java.lang.String EDMsessionId) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.stm_list_file_types(EDMsessionId);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_node_representation stm_node_get_representation(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.stm_node_get_representation(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_node_in_tree stm_node_get_file_system(java.lang.String EDMsessionId, long ID, long DEPTH) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.stm_node_get_file_system(EDMsessionId, ID, DEPTH);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_node_in_tree[] stm_open_node(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.stm_open_node(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_node_in_tree[] stm_node_get_children(java.lang.String EDMsessionId, long ID, java.lang.String TAGS) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.stm_node_get_children(EDMsessionId, ID, TAGS);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_file model_file_create(java.lang.String EDMsessionId, long MODEL_ID, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_file SUBJECT) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.model_file_create(EDMsessionId, MODEL_ID, SUBJECT);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_file model_file_body_set(java.lang.String EDMsessionId, long ID, long SIZE, java.lang.String FILE_UPLOAD) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.model_file_body_set(EDMsessionId, ID, SIZE, FILE_UPLOAD);
  }
  
  public long model_file_body_get(java.lang.String EDMsessionId, long ID, java.lang.String DOWNLOADING_FILE) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.model_file_body_get(EDMsessionId, ID, DOWNLOADING_FILE);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_attached_file model_attached_file_get(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.model_attached_file_get(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_pbs_item[] model_pbs_search(java.lang.String EDMsessionId, long MODEL_ID, java.lang.String PATTERN, java.lang.String[] ROLES, boolean CASE_SENSITIVE, boolean EXACT_MATCH, long DOMAIN, java.lang.String[] DOMAINS, boolean LATEST_VERSION, java.lang.String BEFORE, java.lang.String AFTER, long[] CREATORS, java.lang.String[] TYPES, long PAGE, long START_FROM) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.model_pbs_search(EDMsessionId, MODEL_ID, PATTERN, ROLES, CASE_SENSITIVE, EXACT_MATCH, DOMAIN, DOMAINS, LATEST_VERSION, BEFORE, AFTER, CREATORS, TYPES, PAGE, START_FROM);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Db_object[] node_file_list(java.lang.String EDMsessionId, long NODE_ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.node_file_list(EDMsessionId, NODE_ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Db_object[] inner_model_node_list(java.lang.String EDMsessionId) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.inner_model_node_list(EDMsessionId);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Db_object[] model_node_list(java.lang.String EDMsessionId, long MODEL_ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.model_node_list(EDMsessionId, MODEL_ID);
  }
  
  public java.lang.String inner_property_value_set(java.lang.String EDMsessionId, long NODE_ID, java.lang.String PROPERTY_NAME, java.lang.String PROPERTY_VALUE) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.inner_property_value_set(EDMsessionId, NODE_ID, PROPERTY_NAME, PROPERTY_VALUE);
  }
  
  public java.lang.String model_property_value_set(java.lang.String EDMsessionId, long MODEL_ID, long NODE_ID, java.lang.String PROPERTY_NAME, java.lang.String PROPERTY_VALUE) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.model_property_value_set(EDMsessionId, MODEL_ID, NODE_ID, PROPERTY_NAME, PROPERTY_VALUE);
  }
  
  public java.lang.String inner_model_property_create(java.lang.String EDMsessionId, java.lang.String PROPERTY_TYPE, java.lang.String PROPERTY_NAME, java.lang.String APPLICABLE_TO) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.inner_model_property_create(EDMsessionId, PROPERTY_TYPE, PROPERTY_NAME, APPLICABLE_TO);
  }
  
  public java.lang.String model_property_create(java.lang.String EDMsessionId, long MODEL_ID, java.lang.String PROPERTY_TYPE, java.lang.String PROPERTY_NAME, java.lang.String APPLICABLE_TO) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.model_property_create(EDMsessionId, MODEL_ID, PROPERTY_TYPE, PROPERTY_NAME, APPLICABLE_TO);
  }
  
  public boolean node_patch_id(java.lang.String EDMsessionId) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.node_patch_id(EDMsessionId);
  }
  
  public boolean link_delete(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.link_delete(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_link link_update(java.lang.String EDMsessionId, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_link SUBJECT) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.link_update(EDMsessionId, SUBJECT);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_link[] link_select(java.lang.String EDMsessionId, long NODE, long FILE, long CREATOR, java.lang.String FILE_TYPE, java.lang.String LINK_TYPE) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.link_select(EDMsessionId, NODE, FILE, CREATOR, FILE_TYPE, LINK_TYPE);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_link[] link_list(java.lang.String EDMsessionId, long[] IDS) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.link_list(EDMsessionId, IDS);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_link link_get(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.link_get(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_link link_create(java.lang.String EDMsessionId, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_link SUBJ) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.link_create(EDMsessionId, SUBJ);
  }
  
  public java.lang.String[] link_list_types(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.link_list_types(EDMsessionId, ID);
  }
  
  public boolean task_delete(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.task_delete(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_task task_update(java.lang.String EDMsessionId, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_task SUBJECT) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.task_update(EDMsessionId, SUBJECT);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_task[] task_select(java.lang.String EDMsessionId, long NODE, long PERSON, long METHOD, long APPROVAL, long CREATOR, java.lang.String TO_START_LESS, java.lang.String TO_START_GREATER, java.lang.String TO_FINISH_LESS, java.lang.String TO_FINISH_GREATER, java.lang.String APPROVAL_TYPE, java.lang.String METHOD_TYPE, java.lang.String TASK_TYPE) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.task_select(EDMsessionId, NODE, PERSON, METHOD, APPROVAL, CREATOR, TO_START_LESS, TO_START_GREATER, TO_FINISH_LESS, TO_FINISH_GREATER, APPROVAL_TYPE, METHOD_TYPE, TASK_TYPE);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_task[] task_list(java.lang.String EDMsessionId, long[] IDS) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.task_list(EDMsessionId, IDS);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_task task_get(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.task_get(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_task task_create(java.lang.String EDMsessionId, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_task SUBJ) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.task_create(EDMsessionId, SUBJ);
  }
  
  public java.lang.String[] task_list_types(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.task_list_types(EDMsessionId, ID);
  }
  
  public boolean attached_file_delete(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.attached_file_delete(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_attached_file attached_file_update(java.lang.String EDMsessionId, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_attached_file SUBJECT) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.attached_file_update(EDMsessionId, SUBJECT);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_attached_file[] attached_file_select(java.lang.String EDMsessionId, long NODE, long CREATOR, java.lang.String BEFORE, java.lang.String AFTER, java.lang.String ATTACHED_FILE_TYPE) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.attached_file_select(EDMsessionId, NODE, CREATOR, BEFORE, AFTER, ATTACHED_FILE_TYPE);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_attached_file[] attached_file_list(java.lang.String EDMsessionId, long[] IDS) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.attached_file_list(EDMsessionId, IDS);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_attached_file attached_file_get(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.attached_file_get(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_attached_file attached_file_create(java.lang.String EDMsessionId, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_attached_file SUBJ) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.attached_file_create(EDMsessionId, SUBJ);
  }
  
  public java.lang.String[] attached_file_list_types(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.attached_file_list_types(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_assigned_property assigned_property_delete(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.assigned_property_delete(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_assigned_property assigned_property_update(java.lang.String EDMsessionId, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_assigned_property SUBJECT) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.assigned_property_update(EDMsessionId, SUBJECT);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_assigned_property[] assigned_property_select(java.lang.String EDMsessionId, long NODE, long PROPERTY, long CREATOR, java.lang.String BEFORE, java.lang.String AFTER, java.lang.String PROPERTY_TYPE, java.lang.String ASSIGNMENT_TYPE) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.assigned_property_select(EDMsessionId, NODE, PROPERTY, CREATOR, BEFORE, AFTER, PROPERTY_TYPE, ASSIGNMENT_TYPE);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_assigned_property[] assigned_property_list(java.lang.String EDMsessionId, long[] IDS) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.assigned_property_list(EDMsessionId, IDS);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_assigned_property assigned_property_get(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.assigned_property_get(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_assigned_property assigned_property_create(java.lang.String EDMsessionId, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_assigned_property SUBJ) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.assigned_property_create(EDMsessionId, SUBJ);
  }
  
  public java.lang.String[] assigned_property_list_types(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.assigned_property_list_types(EDMsessionId, ID);
  }
  
  public boolean assigned_person_delete(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.assigned_person_delete(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_assigned_person assigned_person_update(java.lang.String EDMsessionId, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_assigned_person SUBJECT) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.assigned_person_update(EDMsessionId, SUBJECT);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_assigned_person[] assigned_person_select(java.lang.String EDMsessionId, long NODE, long PERSON, long CREATOR, java.lang.String BEFORE, java.lang.String AFTER, java.lang.String PERSON_TYPE, java.lang.String ASSIGNMENT_TYPE) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.assigned_person_select(EDMsessionId, NODE, PERSON, CREATOR, BEFORE, AFTER, PERSON_TYPE, ASSIGNMENT_TYPE);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_assigned_person[] assigned_person_list(java.lang.String EDMsessionId, long[] IDS) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.assigned_person_list(EDMsessionId, IDS);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_assigned_person assigned_person_get(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.assigned_person_get(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_assigned_person assigned_person_create(java.lang.String EDMsessionId, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_assigned_person SUBJ) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.assigned_person_create(EDMsessionId, SUBJ);
  }
  
  public java.lang.String[] assigned_person_list_types(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.assigned_person_list_types(EDMsessionId, ID);
  }
  
  public boolean assigned_organization_delete(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.assigned_organization_delete(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_assigned_organization assigned_organization_update(java.lang.String EDMsessionId, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_assigned_organization SUBJECT) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.assigned_organization_update(EDMsessionId, SUBJECT);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_assigned_organization[] assigned_organization_select(java.lang.String EDMsessionId, long NODE, long ORGANIZATION, long CREATOR, java.lang.String BEFORE, java.lang.String AFTER, java.lang.String ORGANIZATION_TYPE, java.lang.String ASSIGNMENT_TYPE) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.assigned_organization_select(EDMsessionId, NODE, ORGANIZATION, CREATOR, BEFORE, AFTER, ORGANIZATION_TYPE, ASSIGNMENT_TYPE);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_assigned_organization[] assigned_organization_list(java.lang.String EDMsessionId, long[] IDS) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.assigned_organization_list(EDMsessionId, IDS);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_assigned_organization assigned_organization_get(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.assigned_organization_get(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_assigned_organization assigned_organization_create(java.lang.String EDMsessionId, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_assigned_organization SUBJ) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.assigned_organization_create(EDMsessionId, SUBJ);
  }
  
  public java.lang.String[] assigned_organization_list_types(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.assigned_organization_list_types(EDMsessionId, ID);
  }
  
  public boolean assigned_approval_delete(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.assigned_approval_delete(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_assigned_approval assigned_approval_update(java.lang.String EDMsessionId, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_assigned_approval SUBJECT) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.assigned_approval_update(EDMsessionId, SUBJECT);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_assigned_approval[] assigned_approval_select(java.lang.String EDMsessionId, long NODE, long TASK, long APPROVAL, long CREATOR, java.lang.String BEFORE, java.lang.String AFTER, java.lang.String APPROVAL_TYPE, java.lang.String ASSIGNMENT_TYPE) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.assigned_approval_select(EDMsessionId, NODE, TASK, APPROVAL, CREATOR, BEFORE, AFTER, APPROVAL_TYPE, ASSIGNMENT_TYPE);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_assigned_approval[] assigned_approval_list(java.lang.String EDMsessionId, long[] IDS) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.assigned_approval_list(EDMsessionId, IDS);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_assigned_approval assigned_approval_get(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.assigned_approval_get(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_assigned_approval assigned_approval_create(java.lang.String EDMsessionId, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_assigned_approval SUBJ) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.assigned_approval_create(EDMsessionId, SUBJ);
  }
  
  public java.lang.String[] assigned_approval_list_types(java.lang.String EDMsessionId, long ID, java.lang.String MS_TYPE) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.assigned_approval_list_types(EDMsessionId, ID, MS_TYPE);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Merge_result node_merge(java.lang.String EDMsessionId, long TARGET_NODE_ID, java.lang.String SOURCE_MODEL, long SOURCE_ITEM_ID, java.lang.String USER_COMMENT, java.lang.String FORK_DATE) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.node_merge(EDMsessionId, TARGET_NODE_ID, SOURCE_MODEL, SOURCE_ITEM_ID, USER_COMMENT, FORK_DATE);
  }
  
  public long node_delete_version(java.lang.String EDMsessionId, long SUBJECT, java.lang.String SUBSTITUTE, boolean REMOVE_ALL_VERSIONS) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.node_delete_version(EDMsessionId, SUBJECT, SUBSTITUTE, REMOVE_ALL_VERSIONS);
  }
  
  public java.lang.String node_get_my_access(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.node_get_my_access(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_node node_clone_branch(java.lang.String EDMsessionId, long SOURCE, long[] PARENTS, boolean SCELETON_ONLY) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.node_clone_branch(EDMsessionId, SOURCE, PARENTS, SCELETON_ONLY);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_node node_move(java.lang.String EDMsessionId, long ID, long[] OLD_PARENTS, long[] NEW_PARENTS) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.node_move(EDMsessionId, ID, OLD_PARENTS, NEW_PARENTS);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_assigned_property[] node_get_properties(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.node_get_properties(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_assigned_person[] node_get_owning_persons(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.node_get_owning_persons(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_assigned_organization[] node_get_owning_organizations(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.node_get_owning_organizations(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Info_line[] node_info(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.node_info(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_node node_update(java.lang.String EDMsessionId, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_node SUBJ) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.node_update(EDMsessionId, SUBJ);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Extract_result node_extract_ext(java.lang.String EDMsessionId, long ID, boolean WITH_HISTORY, java.lang.String USER_COMMENT, java.lang.String TARGET_MODEL, java.lang.String PDI_FILE) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.node_extract_ext(EDMsessionId, ID, WITH_HISTORY, USER_COMMENT, TARGET_MODEL, PDI_FILE);
  }
  
  public java.lang.String node_extract(java.lang.String EDMsessionId, long ID, boolean WITH_HISTORY, java.lang.String USER_COMMENT, java.lang.String TARGET_MODEL, java.lang.String PDI_FILE) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.node_extract(EDMsessionId, ID, WITH_HISTORY, USER_COMMENT, TARGET_MODEL, PDI_FILE);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_node[] node_branch_extend(java.lang.String EDMsessionId, long NODE_ID, long[] BRANCH, boolean INHERIT_CHILDREN, boolean INHERIT_FILES) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.node_branch_extend(EDMsessionId, NODE_ID, BRANCH, INHERIT_CHILDREN, INHERIT_FILES);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_node node_shift_version(java.lang.String EDMsessionId, long[] REPLACE_IN, long[] ADD_TO, long NODE_ID, java.lang.String VERSION_TAG) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.node_shift_version(EDMsessionId, REPLACE_IN, ADD_TO, NODE_ID, VERSION_TAG);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_node node_create_successor(java.lang.String EDMsessionId, long ID, java.lang.String NEW_VERSION, long[] REMOVE_OLD_FORM, long[] ADD_NEW_TO, boolean INHERIT_CHILDREN, boolean INHERIT_FILES) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.node_create_successor(EDMsessionId, ID, NEW_VERSION, REMOVE_OLD_FORM, ADD_NEW_TO, INHERIT_CHILDREN, INHERIT_FILES);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_node[] node_get_children(java.lang.String EDMsessionId, long ID, java.lang.String VERSION) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.node_get_children(EDMsessionId, ID, VERSION);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_node[] node_list(java.lang.String EDMsessionId, long[] IDS) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.node_list(EDMsessionId, IDS);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.T_nodus node_get_whole_branch(java.lang.String EDMsessionId, long ID, java.lang.String VERSION) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.node_get_whole_branch(EDMsessionId, ID, VERSION);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_node node_get(java.lang.String EDMsessionId, long ID, java.lang.String VERSION) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.node_get(EDMsessionId, ID, VERSION);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_node node_create(java.lang.String EDMsessionId, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_node SUBJECT, long[] IN_DOMAIN_OF_NODES) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.node_create(EDMsessionId, SUBJECT, IN_DOMAIN_OF_NODES);
  }
  
  public java.lang.String[] node_list_types(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.node_list_types(EDMsessionId, ID);
  }
  
  public java.lang.String item_get_timestamp(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.item_get_timestamp(EDMsessionId, ID);
  }
  
  public boolean item_insure_actual(java.lang.String EDMsessionId, long ID, java.lang.String CLIENT_TIMESTAMP) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.item_insure_actual(EDMsessionId, ID, CLIENT_TIMESTAMP);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Attached_file_validation_line[] collection_check_validations(java.lang.String EDMsessionId, long ID, boolean RETURN_ALL, boolean NOT_VALIDATED_ONLY) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.collection_check_validations(EDMsessionId, ID, RETURN_ALL, NOT_VALIDATED_ONLY);
  }
  
  public boolean collection_set_editable(java.lang.String EDMsessionId, long ID, boolean FLAG) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.collection_set_editable(EDMsessionId, ID, FLAG);
  }
  
  public boolean nodus_set_finalization(java.lang.String EDMsessionId, long ID, boolean FLAG) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.nodus_set_finalization(EDMsessionId, ID, FLAG);
  }
  
  public java.lang.String file_import(java.lang.String EDMsessionId, java.lang.String SOURCE_MODEL, java.lang.String DOWNLOADING_FILE) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.file_import(EDMsessionId, SOURCE_MODEL, DOWNLOADING_FILE);
  }
  
  public java.lang.String[] file_get_derived_models(java.lang.String EDMsessionId) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.file_get_derived_models(EDMsessionId);
  }
  
  public long file_get_validation_log(java.lang.String EDMsessionId, long ID, java.lang.String LOG_FILE) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.file_get_validation_log(EDMsessionId, ID, LOG_FILE);
  }
  
  public long file_CAX_set(java.lang.String EDMsessionId, long ID, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_file CAX_FILE) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.file_CAX_set(EDMsessionId, ID, CAX_FILE);
  }
  
  public long file_body_get(java.lang.String EDMsessionId, long ID, java.lang.String DOWNLOADING_FILE) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.file_body_get(EDMsessionId, ID, DOWNLOADING_FILE);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Validation_line[] file_list_validate(java.lang.String EDMsessionId, long[] IDS, long OPTIONS, java.lang.String LOG_FILE, boolean STORE_RESULT) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.file_list_validate(EDMsessionId, IDS, OPTIONS, LOG_FILE, STORE_RESULT);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Validation_line file_validate(java.lang.String EDMsessionId, long ID, long OPTIONS, java.lang.String LOG_FILE, boolean STORE_RESULT) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.file_validate(EDMsessionId, ID, OPTIONS, LOG_FILE, STORE_RESULT);
  }
  
  public long file_CAX_generate(java.lang.String EDMsessionId, long ID, java.lang.String SRC_FILE, java.lang.String RESULT_FILE, java.lang.String LOG_FILE, boolean STORE_RESULT) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.file_CAX_generate(EDMsessionId, ID, SRC_FILE, RESULT_FILE, LOG_FILE, STORE_RESULT);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_file file_import_STEP(java.lang.String EDMsessionId, long ID, java.lang.String MODEL_NAME, java.lang.String FILE_UPLOAD, java.lang.String IMPORT_LOG) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.file_import_STEP(EDMsessionId, ID, MODEL_NAME, FILE_UPLOAD, IMPORT_LOG);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_file file_body_set(java.lang.String EDMsessionId, long ID, long SIZE, java.lang.String FILE_UPLOAD) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.file_body_set(EDMsessionId, ID, SIZE, FILE_UPLOAD);
  }
  
  public boolean file_cancel(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.file_cancel(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_file file_update(java.lang.String EDMsessionId, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_file SUBJECT) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.file_update(EDMsessionId, SUBJECT);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_file[] file_list(java.lang.String EDMsessionId, long[] IDS) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.file_list(EDMsessionId, IDS);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_file file_get(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.file_get(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_file file_create(java.lang.String EDMsessionId, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_file SUBJECT) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.file_create(EDMsessionId, SUBJECT);
  }
  
  public java.lang.String[] file_list_types(java.lang.String EDMsessionId) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.file_list_types(EDMsessionId);
  }
  
  public boolean comment_remove(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.comment_remove(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_comment comment_update(java.lang.String EDMsessionId, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_comment SUBJECT) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.comment_update(EDMsessionId, SUBJECT);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_comment[] comment_select(java.lang.String EDMsessionId, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Specified_master_item SUBJ, long AUTHOR, java.lang.String AFTER, java.lang.String BEFORE) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.comment_select(EDMsessionId, SUBJ, AUTHOR, AFTER, BEFORE);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_comment[] comment_list(java.lang.String EDMsessionId, long[] IDS) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.comment_list(EDMsessionId, IDS);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_comment comment_get(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.comment_get(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_comment comment(java.lang.String EDMsessionId, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_comment SUBJECT) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.comment(EDMsessionId, SUBJECT);
  }
  
  public java.lang.String[] comment_list_types(java.lang.String EDMsessionId) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.comment_list_types(EDMsessionId);
  }
  
  public boolean method_cancel(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.method_cancel(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_method method_update(java.lang.String EDMsessionId, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_method SUBJECT) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.method_update(EDMsessionId, SUBJECT);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_method[] method_select(java.lang.String EDMsessionId, long PBS, long CREATOR, java.lang.String VERSION, java.lang.String KIND) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.method_select(EDMsessionId, PBS, CREATOR, VERSION, KIND);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_method[] method_list(java.lang.String EDMsessionId, long[] IDS) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.method_list(EDMsessionId, IDS);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_method method_get(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.method_get(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_method method_create(java.lang.String EDMsessionId, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_method SUBJECT) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.method_create(EDMsessionId, SUBJECT);
  }
  
  public java.lang.String[] method_list_types(java.lang.String EDMsessionId) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.method_list_types(EDMsessionId);
  }
  
  public boolean property_cancel(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.property_cancel(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_property property_update(java.lang.String EDMsessionId, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_property SUBJECT) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.property_update(EDMsessionId, SUBJECT);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_property[] property_select(java.lang.String EDMsessionId, long PBS, long CREATOR, java.lang.String VERSION, java.lang.String KIND, java.lang.String APPLICABLE_TO) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.property_select(EDMsessionId, PBS, CREATOR, VERSION, KIND, APPLICABLE_TO);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_property[] property_list(java.lang.String EDMsessionId, long[] IDS) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.property_list(EDMsessionId, IDS);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_property property_get(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.property_get(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_property property_create(java.lang.String EDMsessionId, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_property SUBJECT) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.property_create(EDMsessionId, SUBJECT);
  }
  
  public java.lang.String[] property_list_types(java.lang.String EDMsessionId) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.property_list_types(EDMsessionId);
  }
  
  public boolean approval_cancel(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.approval_cancel(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_approval approval_update(java.lang.String EDMsessionId, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_approval SUBJECT) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.approval_update(EDMsessionId, SUBJECT);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_approval[] approval_select(java.lang.String EDMsessionId, long PBS, long CREATOR, java.lang.String VERSION, java.lang.String KIND) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.approval_select(EDMsessionId, PBS, CREATOR, VERSION, KIND);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_approval[] approval_list(java.lang.String EDMsessionId, long[] IDS) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.approval_list(EDMsessionId, IDS);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_approval approval_get(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.approval_get(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_approval approval_create(java.lang.String EDMsessionId, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_approval SUBJECT) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.approval_create(EDMsessionId, SUBJECT);
  }
  
  public java.lang.String[] approval_list_types(java.lang.String EDMsessionId) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.approval_list_types(EDMsessionId);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_organization organization_remove_person(java.lang.String EDMsessionId, long ID, long PERSON) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.organization_remove_person(EDMsessionId, ID, PERSON);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_organization organization_add_person(java.lang.String EDMsessionId, long ID, long PERSON) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.organization_add_person(EDMsessionId, ID, PERSON);
  }
  
  public boolean organization_cancel(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.organization_cancel(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_organization organization_update(java.lang.String EDMsessionId, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_organization SUBJECT) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.organization_update(EDMsessionId, SUBJECT);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_organization[] organization_select(java.lang.String EDMsessionId, long PBS, long PERSON, java.lang.String VERSION, java.lang.String ROLE) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.organization_select(EDMsessionId, PBS, PERSON, VERSION, ROLE);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_organization[] organization_list(java.lang.String EDMsessionId, long[] IDS) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.organization_list(EDMsessionId, IDS);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_organization organization_get(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.organization_get(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_organization organization_create(java.lang.String EDMsessionId, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_organization SUBJECT) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.organization_create(EDMsessionId, SUBJECT);
  }
  
  public java.lang.String[] organization_list_types(java.lang.String EDMsessionId) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.organization_list_types(EDMsessionId);
  }
  
  public boolean person_cancel(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.person_cancel(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_person person_update(java.lang.String EDMsessionId, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_person SUBJECT) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.person_update(EDMsessionId, SUBJECT);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_person[] person_select(java.lang.String EDMsessionId, long PBS, long ORGANIZATION, java.lang.String VERSION, java.lang.String ROLE) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.person_select(EDMsessionId, PBS, ORGANIZATION, VERSION, ROLE);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_person person_get_me(java.lang.String EDMsessionId) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.person_get_me(EDMsessionId);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_person person_get_by_login(java.lang.String EDMsessionId, java.lang.String ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.person_get_by_login(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_person[] person_list(java.lang.String EDMsessionId, long[] IDS) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.person_list(EDMsessionId, IDS);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_person person_get(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.person_get(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_person person_create_by_login(java.lang.String EDMsessionId) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.person_create_by_login(EDMsessionId);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_person person_create(java.lang.String EDMsessionId, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_person SUBJECT) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.person_create(EDMsessionId, SUBJECT);
  }
  
  public java.lang.String[] person_list_types(java.lang.String EDMsessionId) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.person_list_types(EDMsessionId);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Extract_result baseline_extract_ext(java.lang.String EDMsessionId, long ID, java.lang.String LOG_HEADER, boolean WITH_HISTORY, java.lang.String TARGET_MODEL, java.lang.String PDI_FILE) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.baseline_extract_ext(EDMsessionId, ID, LOG_HEADER, WITH_HISTORY, TARGET_MODEL, PDI_FILE);
  }
  
  public java.lang.String baseline_extract(java.lang.String EDMsessionId, long ID, boolean WITH_HISTORY, java.lang.String USER_COMMENT, java.lang.String TARGET_MODEL, java.lang.String PDI_FILE) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.baseline_extract(EDMsessionId, ID, WITH_HISTORY, USER_COMMENT, TARGET_MODEL, PDI_FILE);
  }
  
  public boolean baseline_cancel(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.baseline_cancel(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_baseline baseline_update(java.lang.String EDMsessionId, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_baseline SUBJECT) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.baseline_update(EDMsessionId, SUBJECT);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_baseline[] baseline_list(java.lang.String EDMsessionId) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.baseline_list(EDMsessionId);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_baseline baseline_get(java.lang.String EDMsessionId, long ID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.baseline_get(EDMsessionId, ID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_baseline baseline_create(java.lang.String EDMsessionId, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_baseline SUBJECT) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.baseline_create(EDMsessionId, SUBJECT);
  }
  
  public java.lang.String[] baseline_list_types(java.lang.String EDMsessionId) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.baseline_list_types(EDMsessionId);
  }
  
  public java.lang.String pbs_get_my_access(java.lang.String EDMsessionId) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.pbs_get_my_access(EDMsessionId);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_assigned_item[] pbs_assignments_select(java.lang.String EDMsessionId, long[] PBS_ITEMS, long DOMAIN, java.lang.String[] DOMAINS, boolean LATEST_VERSION, java.lang.String BEFORE, java.lang.String AFTER, long[] CREATORS, long PAGE, long START_FROM) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.pbs_assignments_select(EDMsessionId, PBS_ITEMS, DOMAIN, DOMAINS, LATEST_VERSION, BEFORE, AFTER, CREATORS, PAGE, START_FROM);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_pbs_item[] pbs_search(java.lang.String EDMsessionId, java.lang.String PATTERN, java.lang.String[] ROLES, boolean CASE_SENSITIVE, boolean EXACT_MATCH, long DOMAIN, java.lang.String[] DOMAINS, boolean LATEST_VERSION, java.lang.String BEFORE, java.lang.String AFTER, long[] CREATORS, java.lang.String[] TYPES, long PAGE, long START_FROM) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.pbs_search(EDMsessionId, PATTERN, ROLES, CASE_SENSITIVE, EXACT_MATCH, DOMAIN, DOMAINS, LATEST_VERSION, BEFORE, AFTER, CREATORS, TYPES, PAGE, START_FROM);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_comment pbs_merge(java.lang.String EDMsessionId, java.lang.String SOURCE_MODEL, long SOURCE_ITEM_ID, java.lang.String TARGET_VERSION, java.lang.String USER_COMMENT, java.lang.String FORK_DATE) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.pbs_merge(EDMsessionId, SOURCE_MODEL, SOURCE_ITEM_ID, TARGET_VERSION, USER_COMMENT, FORK_DATE);
  }
  
  public java.lang.String[] pbs_get_edm_users(java.lang.String EDMsessionId) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.pbs_get_edm_users(EDMsessionId);
  }
  
  public java.lang.String[] pbs_check(java.lang.String EDMsessionId) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.pbs_check(EDMsessionId);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Info_line[] pbs_info(java.lang.String EDMsessionId, java.lang.String VERSION, boolean CURRENT_ONLY) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.pbs_info(EDMsessionId, VERSION, CURRENT_ONLY);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_pbs pbs_update(java.lang.String EDMsessionId, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_pbs SUBJECT) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.pbs_update(EDMsessionId, SUBJECT);
  }
  
  public java.lang.String pbs_export(java.lang.String EDMsessionId, java.lang.String SOURCE_MODEL, java.lang.String DOWNLOADING_FILE, java.lang.String CONVERTOR_LOG) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.pbs_export(EDMsessionId, SOURCE_MODEL, DOWNLOADING_FILE, CONVERTOR_LOG);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Extract_result pbs_extract_ext(java.lang.String EDMsessionId, java.lang.String VERSION, boolean WITH_HISTORY, java.lang.String USER_COMMENT, java.lang.String TARGET_MODEL, java.lang.String PDI_FILE) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.pbs_extract_ext(EDMsessionId, VERSION, WITH_HISTORY, USER_COMMENT, TARGET_MODEL, PDI_FILE);
  }
  
  public java.lang.String pbs_extract(java.lang.String EDMsessionId, java.lang.String VERSION, boolean WITH_HISTORY, java.lang.String USER_COMMENT, java.lang.String TARGET_MODEL, java.lang.String PDI_FILE) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.pbs_extract(EDMsessionId, VERSION, WITH_HISTORY, USER_COMMENT, TARGET_MODEL, PDI_FILE);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_pbs pbs_fix_version(java.lang.String EDMsessionId, java.lang.String VERSION, boolean CREATE_CURRENT) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.pbs_fix_version(EDMsessionId, VERSION, CREATE_CURRENT);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.T_nodus pbs_get_whole_tree(java.lang.String EDMsessionId, java.lang.String VERSION) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.pbs_get_whole_tree(EDMsessionId, VERSION);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_pbs pbs_get(java.lang.String EDMsessionId, java.lang.String VERSION) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.pbs_get(EDMsessionId, VERSION);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_pbs pbs_create(java.lang.String EDMsessionId, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_pbs SUBJECT) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.pbs_create(EDMsessionId, SUBJECT);
  }
  
  public java.lang.String[] pbs_list_types(java.lang.String EDMsessionId) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.pbs_list_types(EDMsessionId);
  }
  
  public java.lang.String[] system_login_list(java.lang.String EDMsessionId) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.system_login_list(EDMsessionId);
  }
  
  public boolean system_cancel_login(java.lang.String EDMsessionId, java.lang.String LOGIN) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.system_cancel_login(EDMsessionId, LOGIN);
  }
  
  public boolean system_change_password(java.lang.String EDMsessionId, java.lang.String LOGIN, java.lang.String PASSWORD) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.system_change_password(EDMsessionId, LOGIN, PASSWORD);
  }
  
  public boolean system_login_register(java.lang.String EDMsessionId, java.lang.String LOGIN) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.system_login_register(EDMsessionId, LOGIN);
  }
  
  public java.lang.String[] system_get_models_of_schema(java.lang.String EDMsessionId, java.lang.String SCHEMA_NAME_PATTERN, java.lang.String REPOSITORY_NAME) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.system_get_models_of_schema(EDMsessionId, SCHEMA_NAME_PATTERN, REPOSITORY_NAME);
  }
  
  public java.lang.String[] system_get_repositories_of_schema(java.lang.String EDMsessionId, java.lang.String SCHEMA_NAME_PATTERN) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.system_get_repositories_of_schema(EDMsessionId, SCHEMA_NAME_PATTERN);
  }
  
  public java.lang.String system_text_error(java.lang.String EDMsessionId, long ERROR) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.system_text_error(EDMsessionId, ERROR);
  }
  
  public java.lang.String system_get_version(java.lang.String EDMsessionId) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.system_get_version(EDMsessionId);
  }
  
  public long fix_extension(java.lang.String EDMsessionId) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL.fix_extension(EDMsessionId);
  }
  
  public java.lang.String _login(java.lang.String USER, java.lang.String GROUP, java.lang.String PASSWORD) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL._login(USER, GROUP, PASSWORD);
  }
  
  public java.lang.String _logout(java.lang.String EDMSESSIONID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL._logout(EDMSESSIONID);
  }
  
  public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.FileTransferInfo _createTemporaryFile(java.lang.String EDMSESSIONID, java.lang.String FILENAME, java.lang.String FILETYPE, boolean UPLOAD) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL._createTemporaryFile(EDMSESSIONID, FILENAME, FILETYPE, UPLOAD);
  }
  
  public java.lang.String _deleteTemporaryFile(java.lang.String EDMSESSIONID, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.FileTransferInfo FILEINFO) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL._deleteTemporaryFile(EDMSESSIONID, FILEINFO);
  }
  
  public java.lang.String _version(java.lang.String EDMSESSIONID) throws java.rmi.RemoteException{
    if (sIMDM_MASTER_WSDL == null)
      _initSIMDM_MASTER_WSDLProxy();
    return sIMDM_MASTER_WSDL._version(EDMSESSIONID);
  }
  
  
}