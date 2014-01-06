/**
 * V_nodus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL;

public class V_nodus  extends com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.EDMbaseEntity  implements java.io.Serializable {
    private com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_item item;

    private boolean locked;

    private boolean editable;

    private java.lang.String version;

    private java.lang.String[] versions;

    private int ancestor;

    private int[] nodes;

    public V_nodus() {
    }

    public V_nodus(
           com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_item item,
           boolean locked,
           boolean editable,
           java.lang.String version,
           java.lang.String[] versions,
           int ancestor,
           int[] nodes) {
        this.item = item;
        this.locked = locked;
        this.editable = editable;
        this.version = version;
        this.versions = versions;
        this.ancestor = ancestor;
        this.nodes = nodes;
    }


    /**
     * Gets the item value for this V_nodus.
     * 
     * @return item
     */
    public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_item getItem() {
        return item;
    }


    /**
     * Sets the item value for this V_nodus.
     * 
     * @param item
     */
    public void setItem(com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_item item) {
        this.item = item;
    }


    /**
     * Gets the locked value for this V_nodus.
     * 
     * @return locked
     */
    public boolean isLocked() {
        return locked;
    }


    /**
     * Sets the locked value for this V_nodus.
     * 
     * @param locked
     */
    public void setLocked(boolean locked) {
        this.locked = locked;
    }


    /**
     * Gets the editable value for this V_nodus.
     * 
     * @return editable
     */
    public boolean isEditable() {
        return editable;
    }


    /**
     * Sets the editable value for this V_nodus.
     * 
     * @param editable
     */
    public void setEditable(boolean editable) {
        this.editable = editable;
    }


    /**
     * Gets the version value for this V_nodus.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this V_nodus.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the versions value for this V_nodus.
     * 
     * @return versions
     */
    public java.lang.String[] getVersions() {
        return versions;
    }


    /**
     * Sets the versions value for this V_nodus.
     * 
     * @param versions
     */
    public void setVersions(java.lang.String[] versions) {
        this.versions = versions;
    }

    public java.lang.String getVersions(int i) {
        return this.versions[i];
    }

    public void setVersions(int i, java.lang.String _value) {
        this.versions[i] = _value;
    }


    /**
     * Gets the ancestor value for this V_nodus.
     * 
     * @return ancestor
     */
    public int getAncestor() {
        return ancestor;
    }


    /**
     * Sets the ancestor value for this V_nodus.
     * 
     * @param ancestor
     */
    public void setAncestor(int ancestor) {
        this.ancestor = ancestor;
    }


    /**
     * Gets the nodes value for this V_nodus.
     * 
     * @return nodes
     */
    public int[] getNodes() {
        return nodes;
    }


    /**
     * Sets the nodes value for this V_nodus.
     * 
     * @param nodes
     */
    public void setNodes(int[] nodes) {
        this.nodes = nodes;
    }

    public int getNodes(int i) {
        return this.nodes[i];
    }

    public void setNodes(int i, int _value) {
        this.nodes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof V_nodus)) return false;
        V_nodus other = (V_nodus) obj;
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
            this.locked == other.isLocked() &&
            this.editable == other.isEditable() &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.versions==null && other.getVersions()==null) || 
             (this.versions!=null &&
              java.util.Arrays.equals(this.versions, other.getVersions()))) &&
            this.ancestor == other.getAncestor() &&
            ((this.nodes==null && other.getNodes()==null) || 
             (this.nodes!=null &&
              java.util.Arrays.equals(this.nodes, other.getNodes())));
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
        _hashCode += (isLocked() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEditable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getVersions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVersions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVersions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getAncestor();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(V_nodus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "v_nodus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "v_item"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locked");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "editable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "versions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ancestor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ancestor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
