/**
 * Merge_result.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL;

public class Merge_result  extends com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.EDMbaseEntity  implements java.io.Serializable {
    private com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_node target;

    private int log_id;

    public Merge_result() {
    }

    public Merge_result(
           com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_node target,
           int log_id) {
        this.target = target;
        this.log_id = log_id;
    }


    /**
     * Gets the target value for this Merge_result.
     * 
     * @return target
     */
    public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_node getTarget() {
        return target;
    }


    /**
     * Sets the target value for this Merge_result.
     * 
     * @param target
     */
    public void setTarget(com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_node target) {
        this.target = target;
    }


    /**
     * Gets the log_id value for this Merge_result.
     * 
     * @return log_id
     */
    public int getLog_id() {
        return log_id;
    }


    /**
     * Sets the log_id value for this Merge_result.
     * 
     * @param log_id
     */
    public void setLog_id(int log_id) {
        this.log_id = log_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Merge_result)) return false;
        Merge_result other = (Merge_result) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget()))) &&
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
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        _hashCode += getLog_id();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Merge_result.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "merge_result"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("", "target"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "v_node"));
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
