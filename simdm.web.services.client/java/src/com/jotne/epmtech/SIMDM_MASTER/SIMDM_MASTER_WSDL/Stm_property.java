/**
 * Stm_property.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL;

public class Stm_property  extends com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.EDMbaseEntity  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String value_type;

    private java.lang.String p_value;

    private java.lang.String description;

    private java.lang.String assigned_by;

    private java.lang.String assigned;

    public Stm_property() {
    }

    public Stm_property(
           java.lang.String name,
           java.lang.String value_type,
           java.lang.String p_value,
           java.lang.String description,
           java.lang.String assigned_by,
           java.lang.String assigned) {
        this.name = name;
        this.value_type = value_type;
        this.p_value = p_value;
        this.description = description;
        this.assigned_by = assigned_by;
        this.assigned = assigned;
    }


    /**
     * Gets the name value for this Stm_property.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Stm_property.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the value_type value for this Stm_property.
     * 
     * @return value_type
     */
    public java.lang.String getValue_type() {
        return value_type;
    }


    /**
     * Sets the value_type value for this Stm_property.
     * 
     * @param value_type
     */
    public void setValue_type(java.lang.String value_type) {
        this.value_type = value_type;
    }


    /**
     * Gets the p_value value for this Stm_property.
     * 
     * @return p_value
     */
    public java.lang.String getP_value() {
        return p_value;
    }


    /**
     * Sets the p_value value for this Stm_property.
     * 
     * @param p_value
     */
    public void setP_value(java.lang.String p_value) {
        this.p_value = p_value;
    }


    /**
     * Gets the description value for this Stm_property.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Stm_property.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the assigned_by value for this Stm_property.
     * 
     * @return assigned_by
     */
    public java.lang.String getAssigned_by() {
        return assigned_by;
    }


    /**
     * Sets the assigned_by value for this Stm_property.
     * 
     * @param assigned_by
     */
    public void setAssigned_by(java.lang.String assigned_by) {
        this.assigned_by = assigned_by;
    }


    /**
     * Gets the assigned value for this Stm_property.
     * 
     * @return assigned
     */
    public java.lang.String getAssigned() {
        return assigned;
    }


    /**
     * Sets the assigned value for this Stm_property.
     * 
     * @param assigned
     */
    public void setAssigned(java.lang.String assigned) {
        this.assigned = assigned;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Stm_property)) return false;
        Stm_property other = (Stm_property) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.value_type==null && other.getValue_type()==null) || 
             (this.value_type!=null &&
              this.value_type.equals(other.getValue_type()))) &&
            ((this.p_value==null && other.getP_value()==null) || 
             (this.p_value!=null &&
              this.p_value.equals(other.getP_value()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.assigned_by==null && other.getAssigned_by()==null) || 
             (this.assigned_by!=null &&
              this.assigned_by.equals(other.getAssigned_by()))) &&
            ((this.assigned==null && other.getAssigned()==null) || 
             (this.assigned!=null &&
              this.assigned.equals(other.getAssigned())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getValue_type() != null) {
            _hashCode += getValue_type().hashCode();
        }
        if (getP_value() != null) {
            _hashCode += getP_value().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getAssigned_by() != null) {
            _hashCode += getAssigned_by().hashCode();
        }
        if (getAssigned() != null) {
            _hashCode += getAssigned().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Stm_property.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "stm_property"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("p_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "p_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigned_by");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assigned_by"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigned");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assigned"));
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
