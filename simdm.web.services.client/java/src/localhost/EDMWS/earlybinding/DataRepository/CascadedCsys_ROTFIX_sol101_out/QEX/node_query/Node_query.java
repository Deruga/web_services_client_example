/**
 * Node_query.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.EDMWS.earlybinding.DataRepository.CascadedCsys_ROTFIX_sol101_out.QEX.node_query;

public interface Node_query extends java.rmi.Remote {
    public com.jotne.epmtech.Ap209_multidisciplinary_analysis_and_design_mim_LF.node_query.Node_info_ve[] get_node_info(java.lang.String EDMsessionId) throws java.rmi.RemoteException;
    public java.lang.String _login(java.lang.String USER, java.lang.String GROUP, java.lang.String PASSWORD) throws java.rmi.RemoteException;
    public java.lang.String _logout(java.lang.String EDMSESSIONID) throws java.rmi.RemoteException;
    public com.jotne.epmtech.Ap209_multidisciplinary_analysis_and_design_mim_LF.node_query.FileTransferInfo _createTemporaryFile(java.lang.String EDMSESSIONID, java.lang.String FILENAME, java.lang.String FILETYPE, boolean UPLOAD) throws java.rmi.RemoteException;
    public java.lang.String _deleteTemporaryFile(java.lang.String EDMSESSIONID, com.jotne.epmtech.Ap209_multidisciplinary_analysis_and_design_mim_LF.node_query.FileTransferInfo FILEINFO) throws java.rmi.RemoteException;
    public java.lang.String _version(java.lang.String EDMSESSIONID) throws java.rmi.RemoteException;
}
