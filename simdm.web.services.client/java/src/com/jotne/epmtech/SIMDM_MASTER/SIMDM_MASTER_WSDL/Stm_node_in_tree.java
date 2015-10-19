/**
 * Stm_node_in_tree.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL;

public class Stm_node_in_tree  extends com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.EDMbaseEntity  implements java.io.Serializable {
    private long instance_id;

    private java.lang.String name;

    private java.lang.String node_type;

    private java.lang.String version;

    private java.lang.String description;

    private boolean readable;

    private boolean editable;

    private boolean manageable;

    private boolean has_children;

    private com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_node_in_tree[] children;

    private com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_file[] files;

    public Stm_node_in_tree() {
    }

    public Stm_node_in_tree(
           long instance_id,
           java.lang.String name,
           java.lang.String node_type,
           java.lang.String version,
           java.lang.String description,
           boolean readable,
           boolean editable,
           boolean manageable,
           boolean has_children,
           com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_node_in_tree[] children,
           com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_file[] files) {
        this.instance_id = instance_id;
        this.name = name;
        this.node_type = node_type;
        this.version = version;
        this.description = description;
        this.readable = readable;
        this.editable = editable;
        this.manageable = manageable;
        this.has_children = has_children;
        this.children = children;
        this.files = files;
    }


    /**
     * Gets the instance_id value for this Stm_node_in_tree.
     * 
     * @return instance_id
     */
    public long getInstance_id() {
        return instance_id;
    }


    /**
     * Sets the instance_id value for this Stm_node_in_tree.
     * 
     * @param instance_id
     */
    public void setInstance_id(long instance_id) {
        this.instance_id = instance_id;
    }


    /**
     * Gets the name value for this Stm_node_in_tree.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Stm_node_in_tree.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the node_type value for this Stm_node_in_tree.
     * 
     * @return node_type
     */
    public java.lang.String getNode_type() {
        return node_type;
    }


    /**
     * Sets the node_type value for this Stm_node_in_tree.
     * 
     * @param node_type
     */
    public void setNode_type(java.lang.String node_type) {
        this.node_type = node_type;
    }


    /**
     * Gets the version value for this Stm_node_in_tree.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this Stm_node_in_tree.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the description value for this Stm_node_in_tree.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Stm_node_in_tree.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the readable value for this Stm_node_in_tree.
     * 
     * @return readable
     */
    public boolean isReadable() {
        return readable;
    }


    /**
     * Sets the readable value for this Stm_node_in_tree.
     * 
     * @param readable
     */
    public void setReadable(boolean readable) {
        this.readable = readable;
    }


    /**
     * Gets the editable value for this Stm_node_in_tree.
     * 
     * @return editable
     */
    public boolean isEditable() {
        return editable;
    }


    /**
     * Sets the editable value for this Stm_node_in_tree.
     * 
     * @param editable
     */
    public void setEditable(boolean editable) {
        this.editable = editable;
    }


    /**
     * Gets the manageable value for this Stm_node_in_tree.
     * 
     * @return manageable
     */
    public boolean isManageable() {
        return manageable;
    }


    /**
     * Sets the manageable value for this Stm_node_in_tree.
     * 
     * @param manageable
     */
    public void setManageable(boolean manageable) {
        this.manageable = manageable;
    }


    /**
     * Gets the has_children value for this Stm_node_in_tree.
     * 
     * @return has_children
     */
    public boolean isHas_children() {
        return has_children;
    }


    /**
     * Sets the has_children value for this Stm_node_in_tree.
     * 
     * @param has_children
     */
    public void setHas_children(boolean has_children) {
        this.has_children = has_children;
    }


    /**
     * Gets the children value for this Stm_node_in_tree.
     * 
     * @return children
     */
    public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_node_in_tree[] getChildren() {
        return children;
    }


    /**
     * Sets the children value for this Stm_node_in_tree.
     * 
     * @param children
     */
    public void setChildren(com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_node_in_tree[] children) {
        this.children = children;
    }

    public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_node_in_tree getChildren(int i) {
        return this.children[i];
    }

    public void setChildren(int i, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_node_in_tree _value) {
        this.children[i] = _value;
    }


    /**
     * Gets the files value for this Stm_node_in_tree.
     * 
     * @return files
     */
    public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_file[] getFiles() {
        return files;
    }


    /**
     * Sets the files value for this Stm_node_in_tree.
     * 
     * @param files
     */
    public void setFiles(com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_file[] files) {
        this.files = files;
    }

    public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_file getFiles(int i) {
        return this.files[i];
    }

    public void setFiles(int i, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_file _value) {
        this.files[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Stm_node_in_tree)) return false;
        Stm_node_in_tree other = (Stm_node_in_tree) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.instance_id == other.getInstance_id() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.node_type==null && other.getNode_type()==null) || 
             (this.node_type!=null &&
              this.node_type.equals(other.getNode_type()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.readable == other.isReadable() &&
            this.editable == other.isEditable() &&
            this.manageable == other.isManageable() &&
            this.has_children == other.isHas_children() &&
            ((this.children==null && other.getChildren()==null) || 
             (this.children!=null &&
              java.util.Arrays.equals(this.children, other.getChildren()))) &&
            ((this.files==null && other.getFiles()==null) || 
             (this.files!=null &&
              java.util.Arrays.equals(this.files, other.getFiles())));
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
        _hashCode += new Long(getInstance_id()).hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNode_type() != null) {
            _hashCode += getNode_type().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += (isReadable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEditable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isManageable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHas_children() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getChildren() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildren());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildren(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFiles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFiles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFiles(), i);
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
        new org.apache.axis.description.TypeDesc(Stm_node_in_tree.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "stm_node_in_tree"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instance_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instance_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("node_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "node_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
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
        elemField.setFieldName("readable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readable"));
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
        elemField.setFieldName("manageable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manageable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("has_children");
        elemField.setXmlName(new javax.xml.namespace.QName("", "has_children"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("children");
        elemField.setXmlName(new javax.xml.namespace.QName("", "children"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "stm_node_in_tree"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("files");
        elemField.setXmlName(new javax.xml.namespace.QName("", "files"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "stm_file"));
        elemField.setNillable(true);
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
