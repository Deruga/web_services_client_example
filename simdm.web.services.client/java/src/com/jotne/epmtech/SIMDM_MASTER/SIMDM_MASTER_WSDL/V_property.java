/**
 * V_property.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL;

public class V_property  extends com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.EDMbaseEntity  implements java.io.Serializable {
    private com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_item item;

    private java.lang.String[] applicable_to;

    private java.lang.String units;

    private boolean mandatory;

    private boolean scalar;

    private long low_dimension;

    private long high_dimension;

    private java.lang.String default_value;

    public V_property() {
    }

    public V_property(
           com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_item item,
           java.lang.String[] applicable_to,
           java.lang.String units,
           boolean mandatory,
           boolean scalar,
           long low_dimension,
           long high_dimension,
           java.lang.String default_value) {
        this.item = item;
        this.applicable_to = applicable_to;
        this.units = units;
        this.mandatory = mandatory;
        this.scalar = scalar;
        this.low_dimension = low_dimension;
        this.high_dimension = high_dimension;
        this.default_value = default_value;
    }


    /**
     * Gets the item value for this V_property.
     * 
     * @return item
     */
    public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_item getItem() {
        return item;
    }


    /**
     * Sets the item value for this V_property.
     * 
     * @param item
     */
    public void setItem(com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_item item) {
        this.item = item;
    }


    /**
     * Gets the applicable_to value for this V_property.
     * 
     * @return applicable_to
     */
    public java.lang.String[] getApplicable_to() {
        return applicable_to;
    }


    /**
     * Sets the applicable_to value for this V_property.
     * 
     * @param applicable_to
     */
    public void setApplicable_to(java.lang.String[] applicable_to) {
        this.applicable_to = applicable_to;
    }

    public java.lang.String getApplicable_to(int i) {
        return this.applicable_to[i];
    }

    public void setApplicable_to(int i, java.lang.String _value) {
        this.applicable_to[i] = _value;
    }


    /**
     * Gets the units value for this V_property.
     * 
     * @return units
     */
    public java.lang.String getUnits() {
        return units;
    }


    /**
     * Sets the units value for this V_property.
     * 
     * @param units
     */
    public void setUnits(java.lang.String units) {
        this.units = units;
    }


    /**
     * Gets the mandatory value for this V_property.
     * 
     * @return mandatory
     */
    public boolean isMandatory() {
        return mandatory;
    }


    /**
     * Sets the mandatory value for this V_property.
     * 
     * @param mandatory
     */
    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }


    /**
     * Gets the scalar value for this V_property.
     * 
     * @return scalar
     */
    public boolean isScalar() {
        return scalar;
    }


    /**
     * Sets the scalar value for this V_property.
     * 
     * @param scalar
     */
    public void setScalar(boolean scalar) {
        this.scalar = scalar;
    }


    /**
     * Gets the low_dimension value for this V_property.
     * 
     * @return low_dimension
     */
    public long getLow_dimension() {
        return low_dimension;
    }


    /**
     * Sets the low_dimension value for this V_property.
     * 
     * @param low_dimension
     */
    public void setLow_dimension(long low_dimension) {
        this.low_dimension = low_dimension;
    }


    /**
     * Gets the high_dimension value for this V_property.
     * 
     * @return high_dimension
     */
    public long getHigh_dimension() {
        return high_dimension;
    }


    /**
     * Sets the high_dimension value for this V_property.
     * 
     * @param high_dimension
     */
    public void setHigh_dimension(long high_dimension) {
        this.high_dimension = high_dimension;
    }


    /**
     * Gets the default_value value for this V_property.
     * 
     * @return default_value
     */
    public java.lang.String getDefault_value() {
        return default_value;
    }


    /**
     * Sets the default_value value for this V_property.
     * 
     * @param default_value
     */
    public void setDefault_value(java.lang.String default_value) {
        this.default_value = default_value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof V_property)) return false;
        V_property other = (V_property) obj;
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
            ((this.applicable_to==null && other.getApplicable_to()==null) || 
             (this.applicable_to!=null &&
              java.util.Arrays.equals(this.applicable_to, other.getApplicable_to()))) &&
            ((this.units==null && other.getUnits()==null) || 
             (this.units!=null &&
              this.units.equals(other.getUnits()))) &&
            this.mandatory == other.isMandatory() &&
            this.scalar == other.isScalar() &&
            this.low_dimension == other.getLow_dimension() &&
            this.high_dimension == other.getHigh_dimension() &&
            ((this.default_value==null && other.getDefault_value()==null) || 
             (this.default_value!=null &&
              this.default_value.equals(other.getDefault_value())));
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
        if (getApplicable_to() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApplicable_to());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApplicable_to(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnits() != null) {
            _hashCode += getUnits().hashCode();
        }
        _hashCode += (isMandatory() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isScalar() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getLow_dimension()).hashCode();
        _hashCode += new Long(getHigh_dimension()).hashCode();
        if (getDefault_value() != null) {
            _hashCode += getDefault_value().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(V_property.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "v_property"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "v_item"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicable_to");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicable_to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new javax.xml.namespace.QName("", "units"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mandatory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mandatory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scalar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scalar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("low_dimension");
        elemField.setXmlName(new javax.xml.namespace.QName("", "low_dimension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("high_dimension");
        elemField.setXmlName(new javax.xml.namespace.QName("", "high_dimension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("default_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "default_value"));
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
