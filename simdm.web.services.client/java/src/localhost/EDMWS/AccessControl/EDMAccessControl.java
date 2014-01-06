/**
 * EDMAccessControl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.EDMWS.AccessControl;

public interface EDMAccessControl extends java.rmi.Remote {
    public java.lang.String version(java.lang.String EDMSESSIONID) throws java.rmi.RemoteException;
    public java.lang.String deleteTemporaryFile(java.lang.String EDMSESSIONID, com.jotne.epmtech.EDM_DUMMY_SCHEMA.EDMAccessControl.FileTransferInfo FILEINFO) throws java.rmi.RemoteException;
    public com.jotne.epmtech.EDM_DUMMY_SCHEMA.EDMAccessControl.FileTransferInfo createTemporaryFile(java.lang.String EDMSESSIONID, java.lang.String FILENAME, java.lang.String FILETYPE, boolean UPLOAD) throws java.rmi.RemoteException;
    public java.lang.String xpxLogging(java.lang.String EDMSESSIONID, java.lang.String ACTION, java.lang.String OPTION, java.lang.String MAXSIZE) throws java.rmi.RemoteException;
    public java.lang.String resetAllOptions(java.lang.String EDMSESSIONID) throws java.rmi.RemoteException;
    public java.lang.String setOption(java.lang.String EDMSESSIONID, java.lang.String OPTION) throws java.rmi.RemoteException;
    public java.lang.String logout(java.lang.String EDMSESSIONID) throws java.rmi.RemoteException;
    public java.lang.String login(java.lang.String USER, java.lang.String GROUP, java.lang.String PASSWORD) throws java.rmi.RemoteException;
}
