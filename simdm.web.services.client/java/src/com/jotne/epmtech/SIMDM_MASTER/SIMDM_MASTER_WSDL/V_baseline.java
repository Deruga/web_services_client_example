/**
 * V_baseline.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL;

public class V_baseline  extends com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.EDMbaseEntity  implements java.io.Serializable {
    private com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_item item;

    private boolean editable;

    private long[] nodes;

    private java.lang.String[] exported_to;

    public V_baseline() {
    }

    public V_baseline(
           com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_item item,
           boolean editable,
           long[] nodes,
           java.lang.String[] exported_to) {
        this.item = item;
        this.editable = editable;
        this.nodes = nodes;
        this.exported_to = exported_to;
    }


    /**
     * Gets the item value for this V_baseline.
     * 
     * @return item
     */
    public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_item getItem() {
        return item;
    }


    /**
     * Sets the item value for this V_baseline.
     * 
     * @param item
     */
    public void setItem(com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_item item) {
        this.item = item;
    }


    /**
     * Gets the editable value for this V_baseline.
     * 
     * @return editable
     */
    public boolean isEditable() {
        return editable;
    }


    /**
     * Sets the editable value for this V_baseline.
     * 
     * @param editable
     */
    public void setEditable(boolean editable) {
        this.editable = editable;
    }


    /**
     * Gets the nodes value for this V_baseline.
     * 
     * @return nodes
     */
    public long[] getNodes() {
        return nodes;
    }


    /**
     * Sets the nodes value for this V_baseline.
     * 
     * @param nodes
     */
    public void setNodes(long[] nodes) {
        this.nodes = nodes;
    }

    public long getNodes(int i) {
        return this.nodes[i];
    }

    public void setNodes(int i, long _value) {
        this.nodes[i] = _value;
    }


    /**
     * Gets the exported_to value for this V_baseline.
     * 
     * @return exported_to
     */
    public java.lang.String[] getExported_to() {
        return exported_to;
    }


    /**
     * Sets the exported_to value for this V_baseline.
     * 
     * @param exported_to
     */
    public void setExported_to(java.lang.String[] exported_to) {
        this.exported_to = exported_to;
    }

    public java.lang.String getExported_to(int i) {
        return this.exported_to[i];
    }

    public void setExported_to(int i, java.lang.String _value) {
        this.exported_to[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof V_baseline)) return false;
        V_baseline other = (V_baseline) obj;
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
            this.editable == other.isEditable() &&
            ((this.nodes==null && other.getNodes()==null) || 
             (this.nodes!=null &&
              java.util.Arrays.equals(this.nodes, other.getNodes()))) &&
            ((this.exported_to==null && other.getExported_to()==null) || 
             (this.exported_to!=null &&
              java.util.Arrays.equals(this.exported_to, other.getExported_to())));
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
        _hashCode += (isEditable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNodes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExported_to() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExported_to());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExported_to(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(V_baseline.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "v_baseline"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "v_item"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "editable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exported_to");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exported_to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
