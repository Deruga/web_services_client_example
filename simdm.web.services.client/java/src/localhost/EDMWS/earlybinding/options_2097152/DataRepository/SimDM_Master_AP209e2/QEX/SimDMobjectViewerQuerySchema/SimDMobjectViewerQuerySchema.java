/**
 * SimDMobjectViewerQuerySchema.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.EDMWS.earlybinding.options_2097152.DataRepository.SimDM_Master_AP209e2.QEX.SimDMobjectViewerQuerySchema;

public interface SimDMobjectViewerQuerySchema extends java.rmi.Remote {
    public java.lang.String testSearch(java.lang.String EDMsessionId) throws java.rmi.RemoteException;
    public java.lang.String[] getLoadCases(java.lang.String EDMsessionId) throws java.rmi.RemoteException;
    public java.lang.String[] getInputParameterValues(java.lang.String EDMsessionId, long QUERYINDEX) throws java.rmi.RemoteException;
    public com.jotne.epmtech.ap209_multidisciplinary_analysis_and_design_mim_lf.SimDMobjectViewerQuerySchema.QuerySpecification[] getQuerySpecifications(java.lang.String EDMsessionId) throws java.rmi.RemoteException;
    public com.jotne.epmtech.ap209_multidisciplinary_analysis_and_design_mim_lf.SimDMobjectViewerQuerySchema.QueryResult simDMobjectViewer(java.lang.String EDMsessionId, long QUERYINDEX, java.lang.String[] OBJECTKEYS, java.lang.String[] OBJECTKEYS_2, long FIRSTROW, long MAXNOOFROWS, long OPTIONS) throws java.rmi.RemoteException;
    public java.lang.String get_version(java.lang.String EDMsessionId) throws java.rmi.RemoteException;
    public java.lang.String _login(java.lang.String USER, java.lang.String GROUP, java.lang.String PASSWORD) throws java.rmi.RemoteException;
    public java.lang.String _logout(java.lang.String EDMSESSIONID) throws java.rmi.RemoteException;
    public com.jotne.epmtech.ap209_multidisciplinary_analysis_and_design_mim_lf.SimDMobjectViewerQuerySchema.FileTransferInfo _createTemporaryFile(java.lang.String EDMSESSIONID, java.lang.String FILENAME, java.lang.String FILETYPE, boolean UPLOAD) throws java.rmi.RemoteException;
    public java.lang.String _deleteTemporaryFile(java.lang.String EDMSESSIONID, com.jotne.epmtech.ap209_multidisciplinary_analysis_and_design_mim_lf.SimDMobjectViewerQuerySchema.FileTransferInfo FILEINFO) throws java.rmi.RemoteException;
    public java.lang.String _version(java.lang.String EDMSESSIONID) throws java.rmi.RemoteException;
}
