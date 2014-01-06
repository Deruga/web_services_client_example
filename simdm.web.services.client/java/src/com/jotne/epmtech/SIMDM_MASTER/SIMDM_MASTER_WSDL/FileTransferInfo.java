/**
 * FileTransferInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL;

public class FileTransferInfo  extends com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.EDMbaseEntity  implements java.io.Serializable {
    private java.lang.String uploadOrDownloadUrl;

    private java.lang.String progressInfoUrl;

    private java.lang.String fileNameOnServer;

    private java.lang.String operation;

    public FileTransferInfo() {
    }

    public FileTransferInfo(
           java.lang.String uploadOrDownloadUrl,
           java.lang.String progressInfoUrl,
           java.lang.String fileNameOnServer,
           java.lang.String operation) {
        this.uploadOrDownloadUrl = uploadOrDownloadUrl;
        this.progressInfoUrl = progressInfoUrl;
        this.fileNameOnServer = fileNameOnServer;
        this.operation = operation;
    }


    /**
     * Gets the uploadOrDownloadUrl value for this FileTransferInfo.
     * 
     * @return uploadOrDownloadUrl
     */
    public java.lang.String getUploadOrDownloadUrl() {
        return uploadOrDownloadUrl;
    }


    /**
     * Sets the uploadOrDownloadUrl value for this FileTransferInfo.
     * 
     * @param uploadOrDownloadUrl
     */
    public void setUploadOrDownloadUrl(java.lang.String uploadOrDownloadUrl) {
        this.uploadOrDownloadUrl = uploadOrDownloadUrl;
    }


    /**
     * Gets the progressInfoUrl value for this FileTransferInfo.
     * 
     * @return progressInfoUrl
     */
    public java.lang.String getProgressInfoUrl() {
        return progressInfoUrl;
    }


    /**
     * Sets the progressInfoUrl value for this FileTransferInfo.
     * 
     * @param progressInfoUrl
     */
    public void setProgressInfoUrl(java.lang.String progressInfoUrl) {
        this.progressInfoUrl = progressInfoUrl;
    }


    /**
     * Gets the fileNameOnServer value for this FileTransferInfo.
     * 
     * @return fileNameOnServer
     */
    public java.lang.String getFileNameOnServer() {
        return fileNameOnServer;
    }


    /**
     * Sets the fileNameOnServer value for this FileTransferInfo.
     * 
     * @param fileNameOnServer
     */
    public void setFileNameOnServer(java.lang.String fileNameOnServer) {
        this.fileNameOnServer = fileNameOnServer;
    }


    /**
     * Gets the operation value for this FileTransferInfo.
     * 
     * @return operation
     */
    public java.lang.String getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this FileTransferInfo.
     * 
     * @param operation
     */
    public void setOperation(java.lang.String operation) {
        this.operation = operation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FileTransferInfo)) return false;
        FileTransferInfo other = (FileTransferInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.uploadOrDownloadUrl==null && other.getUploadOrDownloadUrl()==null) || 
             (this.uploadOrDownloadUrl!=null &&
              this.uploadOrDownloadUrl.equals(other.getUploadOrDownloadUrl()))) &&
            ((this.progressInfoUrl==null && other.getProgressInfoUrl()==null) || 
             (this.progressInfoUrl!=null &&
              this.progressInfoUrl.equals(other.getProgressInfoUrl()))) &&
            ((this.fileNameOnServer==null && other.getFileNameOnServer()==null) || 
             (this.fileNameOnServer!=null &&
              this.fileNameOnServer.equals(other.getFileNameOnServer()))) &&
            ((this.operation==null && other.getOperation()==null) || 
             (this.operation!=null &&
              this.operation.equals(other.getOperation())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getUploadOrDownloadUrl() != null) {
            _hashCode += getUploadOrDownloadUrl().hashCode();
        }
        if (getProgressInfoUrl() != null) {
            _hashCode += getProgressInfoUrl().hashCode();
        }
        if (getFileNameOnServer() != null) {
            _hashCode += getFileNameOnServer().hashCode();
        }
        if (getOperation() != null) {
            _hashCode += getOperation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FileTransferInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "fileTransferInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadOrDownloadUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uploadOrDownloadUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("progressInfoUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "progressInfoUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileNameOnServer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileNameOnServer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
