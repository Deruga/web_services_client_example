/**
 * Extract_result.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL;

public class Extract_result  extends com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.EDMbaseEntity  implements java.io.Serializable {
    private java.lang.String repository;

    private java.lang.String model_name;

    private int log_id;

    public Extract_result() {
    }

    public Extract_result(
           java.lang.String repository,
           java.lang.String model_name,
           int log_id) {
        this.repository = repository;
        this.model_name = model_name;
        this.log_id = log_id;
    }


    /**
     * Gets the repository value for this Extract_result.
     * 
     * @return repository
     */
    public java.lang.String getRepository() {
        return repository;
    }


    /**
     * Sets the repository value for this Extract_result.
     * 
     * @param repository
     */
    public void setRepository(java.lang.String repository) {
        this.repository = repository;
    }


    /**
     * Gets the model_name value for this Extract_result.
     * 
     * @return model_name
     */
    public java.lang.String getModel_name() {
        return model_name;
    }


    /**
     * Sets the model_name value for this Extract_result.
     * 
     * @param model_name
     */
    public void setModel_name(java.lang.String model_name) {
        this.model_name = model_name;
    }


    /**
     * Gets the log_id value for this Extract_result.
     * 
     * @return log_id
     */
    public int getLog_id() {
        return log_id;
    }


    /**
     * Sets the log_id value for this Extract_result.
     * 
     * @param log_id
     */
    public void setLog_id(int log_id) {
        this.log_id = log_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Extract_result)) return false;
        Extract_result other = (Extract_result) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.repository==null && other.getRepository()==null) || 
             (this.repository!=null &&
              this.repository.equals(other.getRepository()))) &&
            ((this.model_name==null && other.getModel_name()==null) || 
             (this.model_name!=null &&
              this.model_name.equals(other.getModel_name()))) &&
            this.log_id == other.getLog_id();
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
        if (getRepository() != null) {
            _hashCode += getRepository().hashCode();
        }
        if (getModel_name() != null) {
            _hashCode += getModel_name().hashCode();
        }
        _hashCode += getLog_id();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Extract_result.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "extract_result"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repository");
        elemField.setXmlName(new javax.xml.namespace.QName("", "repository"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "model_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("log_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "log_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
