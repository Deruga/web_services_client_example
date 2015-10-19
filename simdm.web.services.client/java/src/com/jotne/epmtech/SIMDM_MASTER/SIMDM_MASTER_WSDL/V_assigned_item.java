/**
 * V_assigned_item.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL;

public class V_assigned_item  extends com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.EDMbaseEntity  implements java.io.Serializable {
    private com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_item item;

    private long assignment;

    private long domain;

    private java.lang.String ms_type;

    public V_assigned_item() {
    }

    public V_assigned_item(
           com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_item item,
           long assignment,
           long domain,
           java.lang.String ms_type) {
        this.item = item;
        this.assignment = assignment;
        this.domain = domain;
        this.ms_type = ms_type;
    }


    /**
     * Gets the item value for this V_assigned_item.
     * 
     * @return item
     */
    public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_item getItem() {
        return item;
    }


    /**
     * Sets the item value for this V_assigned_item.
     * 
     * @param item
     */
    public void setItem(com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_item item) {
        this.item = item;
    }


    /**
     * Gets the assignment value for this V_assigned_item.
     * 
     * @return assignment
     */
    public long getAssignment() {
        return assignment;
    }


    /**
     * Sets the assignment value for this V_assigned_item.
     * 
     * @param assignment
     */
    public void setAssignment(long assignment) {
        this.assignment = assignment;
    }


    /**
     * Gets the domain value for this V_assigned_item.
     * 
     * @return domain
     */
    public long getDomain() {
        return domain;
    }


    /**
     * Sets the domain value for this V_assigned_item.
     * 
     * @param domain
     */
    public void setDomain(long domain) {
        this.domain = domain;
    }


    /**
     * Gets the ms_type value for this V_assigned_item.
     * 
     * @return ms_type
     */
    public java.lang.String getMs_type() {
        return ms_type;
    }


    /**
     * Sets the ms_type value for this V_assigned_item.
     * 
     * @param ms_type
     */
    public void setMs_type(java.lang.String ms_type) {
        this.ms_type = ms_type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof V_assigned_item)) return false;
        V_assigned_item other = (V_assigned_item) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            this.assignment == other.getAssignment() &&
            this.domain == other.getDomain() &&
            ((this.ms_type==null && other.getMs_type()==null) || 
             (this.ms_type!=null &&
              this.ms_type.equals(other.getMs_type())));
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
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        _hashCode += new Long(getAssignment()).hashCode();
        _hashCode += new Long(getDomain()).hashCode();
        if (getMs_type() != null) {
            _hashCode += getMs_type().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(V_assigned_item.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "v_assigned_item"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "v_item"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assignment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ms_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ms_type"));
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
