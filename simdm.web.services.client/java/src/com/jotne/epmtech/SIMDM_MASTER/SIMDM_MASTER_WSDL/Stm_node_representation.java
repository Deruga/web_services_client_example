/**
 * Stm_node_representation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL;

public class Stm_node_representation  extends com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.EDMbaseEntity  implements java.io.Serializable {
    private long instance_id;

    private java.lang.String name;

    private java.lang.String node_type;

    private java.lang.String version;

    private java.lang.String description;

    private java.lang.String created_by;

    private java.lang.String created;

    private java.lang.String modified_by;

    private java.lang.String modified;

    private com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_file[] files;

    private com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_property[] properties;

    private com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_resolution[] resolutions;

    private com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_remark[] remarks;

    public Stm_node_representation() {
    }

    public Stm_node_representation(
           long instance_id,
           java.lang.String name,
           java.lang.String node_type,
           java.lang.String version,
           java.lang.String description,
           java.lang.String created_by,
           java.lang.String created,
           java.lang.String modified_by,
           java.lang.String modified,
           com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_file[] files,
           com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_property[] properties,
           com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_resolution[] resolutions,
           com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_remark[] remarks) {
        this.instance_id = instance_id;
        this.name = name;
        this.node_type = node_type;
        this.version = version;
        this.description = description;
        this.created_by = created_by;
        this.created = created;
        this.modified_by = modified_by;
        this.modified = modified;
        this.files = files;
        this.properties = properties;
        this.resolutions = resolutions;
        this.remarks = remarks;
    }


    /**
     * Gets the instance_id value for this Stm_node_representation.
     * 
     * @return instance_id
     */
    public long getInstance_id() {
        return instance_id;
    }


    /**
     * Sets the instance_id value for this Stm_node_representation.
     * 
     * @param instance_id
     */
    public void setInstance_id(long instance_id) {
        this.instance_id = instance_id;
    }


    /**
     * Gets the name value for this Stm_node_representation.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Stm_node_representation.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the node_type value for this Stm_node_representation.
     * 
     * @return node_type
     */
    public java.lang.String getNode_type() {
        return node_type;
    }


    /**
     * Sets the node_type value for this Stm_node_representation.
     * 
     * @param node_type
     */
    public void setNode_type(java.lang.String node_type) {
        this.node_type = node_type;
    }


    /**
     * Gets the version value for this Stm_node_representation.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this Stm_node_representation.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the description value for this Stm_node_representation.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Stm_node_representation.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the created_by value for this Stm_node_representation.
     * 
     * @return created_by
     */
    public java.lang.String getCreated_by() {
        return created_by;
    }


    /**
     * Sets the created_by value for this Stm_node_representation.
     * 
     * @param created_by
     */
    public void setCreated_by(java.lang.String created_by) {
        this.created_by = created_by;
    }


    /**
     * Gets the created value for this Stm_node_representation.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this Stm_node_representation.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the modified_by value for this Stm_node_representation.
     * 
     * @return modified_by
     */
    public java.lang.String getModified_by() {
        return modified_by;
    }


    /**
     * Sets the modified_by value for this Stm_node_representation.
     * 
     * @param modified_by
     */
    public void setModified_by(java.lang.String modified_by) {
        this.modified_by = modified_by;
    }


    /**
     * Gets the modified value for this Stm_node_representation.
     * 
     * @return modified
     */
    public java.lang.String getModified() {
        return modified;
    }


    /**
     * Sets the modified value for this Stm_node_representation.
     * 
     * @param modified
     */
    public void setModified(java.lang.String modified) {
        this.modified = modified;
    }


    /**
     * Gets the files value for this Stm_node_representation.
     * 
     * @return files
     */
    public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_file[] getFiles() {
        return files;
    }


    /**
     * Sets the files value for this Stm_node_representation.
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


    /**
     * Gets the properties value for this Stm_node_representation.
     * 
     * @return properties
     */
    public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_property[] getProperties() {
        return properties;
    }


    /**
     * Sets the properties value for this Stm_node_representation.
     * 
     * @param properties
     */
    public void setProperties(com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_property[] properties) {
        this.properties = properties;
    }

    public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_property getProperties(int i) {
        return this.properties[i];
    }

    public void setProperties(int i, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_property _value) {
        this.properties[i] = _value;
    }


    /**
     * Gets the resolutions value for this Stm_node_representation.
     * 
     * @return resolutions
     */
    public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_resolution[] getResolutions() {
        return resolutions;
    }


    /**
     * Sets the resolutions value for this Stm_node_representation.
     * 
     * @param resolutions
     */
    public void setResolutions(com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_resolution[] resolutions) {
        this.resolutions = resolutions;
    }

    public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_resolution getResolutions(int i) {
        return this.resolutions[i];
    }

    public void setResolutions(int i, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_resolution _value) {
        this.resolutions[i] = _value;
    }


    /**
     * Gets the remarks value for this Stm_node_representation.
     * 
     * @return remarks
     */
    public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_remark[] getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this Stm_node_representation.
     * 
     * @param remarks
     */
    public void setRemarks(com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_remark[] remarks) {
        this.remarks = remarks;
    }

    public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_remark getRemarks(int i) {
        return this.remarks[i];
    }

    public void setRemarks(int i, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_remark _value) {
        this.remarks[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Stm_node_representation)) return false;
        Stm_node_representation other = (Stm_node_representation) obj;
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
            ((this.created_by==null && other.getCreated_by()==null) || 
             (this.created_by!=null &&
              this.created_by.equals(other.getCreated_by()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.modified_by==null && other.getModified_by()==null) || 
             (this.modified_by!=null &&
              this.modified_by.equals(other.getModified_by()))) &&
            ((this.modified==null && other.getModified()==null) || 
             (this.modified!=null &&
              this.modified.equals(other.getModified()))) &&
            ((this.files==null && other.getFiles()==null) || 
             (this.files!=null &&
              java.util.Arrays.equals(this.files, other.getFiles()))) &&
            ((this.properties==null && other.getProperties()==null) || 
             (this.properties!=null &&
              java.util.Arrays.equals(this.properties, other.getProperties()))) &&
            ((this.resolutions==null && other.getResolutions()==null) || 
             (this.resolutions!=null &&
              java.util.Arrays.equals(this.resolutions, other.getResolutions()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              java.util.Arrays.equals(this.remarks, other.getRemarks())));
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
        if (getCreated_by() != null) {
            _hashCode += getCreated_by().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getModified_by() != null) {
            _hashCode += getModified_by().hashCode();
        }
        if (getModified() != null) {
            _hashCode += getModified().hashCode();
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
        if (getProperties() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProperties());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProperties(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResolutions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResolutions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResolutions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRemarks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRemarks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRemarks(), i);
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
        new org.apache.axis.description.TypeDesc(Stm_node_representation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "stm_node_representation"));
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
        elemField.setFieldName("created_by");
        elemField.setXmlName(new javax.xml.namespace.QName("", "created_by"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modified_by");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modified_by"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modified");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("files");
        elemField.setXmlName(new javax.xml.namespace.QName("", "files"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "stm_file"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("properties");
        elemField.setXmlName(new javax.xml.namespace.QName("", "properties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "stm_property"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolutions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resolutions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "stm_resolution"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "stm_remark"));
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
