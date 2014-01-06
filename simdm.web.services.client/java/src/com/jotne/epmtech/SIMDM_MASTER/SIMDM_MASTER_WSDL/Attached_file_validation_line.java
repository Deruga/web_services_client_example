/**
 * Attached_file_validation_line.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL;

public class Attached_file_validation_line  extends com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.EDMbaseEntity  implements java.io.Serializable {
    private int attachment_id;

    private int file_id;

    private java.lang.String file_type;

    private java.lang.String file_name;

    private java.lang.String file_introduced;

    private java.lang.String file_creator;

    private int node_id;

    private java.lang.String node_path_name;

    private com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Logical valid;

    public Attached_file_validation_line() {
    }

    public Attached_file_validation_line(
           int attachment_id,
           int file_id,
           java.lang.String file_type,
           java.lang.String file_name,
           java.lang.String file_introduced,
           java.lang.String file_creator,
           int node_id,
           java.lang.String node_path_name,
           com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Logical valid) {
        this.attachment_id = attachment_id;
        this.file_id = file_id;
        this.file_type = file_type;
        this.file_name = file_name;
        this.file_introduced = file_introduced;
        this.file_creator = file_creator;
        this.node_id = node_id;
        this.node_path_name = node_path_name;
        this.valid = valid;
    }


    /**
     * Gets the attachment_id value for this Attached_file_validation_line.
     * 
     * @return attachment_id
     */
    public int getAttachment_id() {
        return attachment_id;
    }


    /**
     * Sets the attachment_id value for this Attached_file_validation_line.
     * 
     * @param attachment_id
     */
    public void setAttachment_id(int attachment_id) {
        this.attachment_id = attachment_id;
    }


    /**
     * Gets the file_id value for this Attached_file_validation_line.
     * 
     * @return file_id
     */
    public int getFile_id() {
        return file_id;
    }


    /**
     * Sets the file_id value for this Attached_file_validation_line.
     * 
     * @param file_id
     */
    public void setFile_id(int file_id) {
        this.file_id = file_id;
    }


    /**
     * Gets the file_type value for this Attached_file_validation_line.
     * 
     * @return file_type
     */
    public java.lang.String getFile_type() {
        return file_type;
    }


    /**
     * Sets the file_type value for this Attached_file_validation_line.
     * 
     * @param file_type
     */
    public void setFile_type(java.lang.String file_type) {
        this.file_type = file_type;
    }


    /**
     * Gets the file_name value for this Attached_file_validation_line.
     * 
     * @return file_name
     */
    public java.lang.String getFile_name() {
        return file_name;
    }


    /**
     * Sets the file_name value for this Attached_file_validation_line.
     * 
     * @param file_name
     */
    public void setFile_name(java.lang.String file_name) {
        this.file_name = file_name;
    }


    /**
     * Gets the file_introduced value for this Attached_file_validation_line.
     * 
     * @return file_introduced
     */
    public java.lang.String getFile_introduced() {
        return file_introduced;
    }


    /**
     * Sets the file_introduced value for this Attached_file_validation_line.
     * 
     * @param file_introduced
     */
    public void setFile_introduced(java.lang.String file_introduced) {
        this.file_introduced = file_introduced;
    }


    /**
     * Gets the file_creator value for this Attached_file_validation_line.
     * 
     * @return file_creator
     */
    public java.lang.String getFile_creator() {
        return file_creator;
    }


    /**
     * Sets the file_creator value for this Attached_file_validation_line.
     * 
     * @param file_creator
     */
    public void setFile_creator(java.lang.String file_creator) {
        this.file_creator = file_creator;
    }


    /**
     * Gets the node_id value for this Attached_file_validation_line.
     * 
     * @return node_id
     */
    public int getNode_id() {
        return node_id;
    }


    /**
     * Sets the node_id value for this Attached_file_validation_line.
     * 
     * @param node_id
     */
    public void setNode_id(int node_id) {
        this.node_id = node_id;
    }


    /**
     * Gets the node_path_name value for this Attached_file_validation_line.
     * 
     * @return node_path_name
     */
    public java.lang.String getNode_path_name() {
        return node_path_name;
    }


    /**
     * Sets the node_path_name value for this Attached_file_validation_line.
     * 
     * @param node_path_name
     */
    public void setNode_path_name(java.lang.String node_path_name) {
        this.node_path_name = node_path_name;
    }


    /**
     * Gets the valid value for this Attached_file_validation_line.
     * 
     * @return valid
     */
    public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Logical getValid() {
        return valid;
    }


    /**
     * Sets the valid value for this Attached_file_validation_line.
     * 
     * @param valid
     */
    public void setValid(com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Logical valid) {
        this.valid = valid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Attached_file_validation_line)) return false;
        Attached_file_validation_line other = (Attached_file_validation_line) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.attachment_id == other.getAttachment_id() &&
            this.file_id == other.getFile_id() &&
            ((this.file_type==null && other.getFile_type()==null) || 
             (this.file_type!=null &&
              this.file_type.equals(other.getFile_type()))) &&
            ((this.file_name==null && other.getFile_name()==null) || 
             (this.file_name!=null &&
              this.file_name.equals(other.getFile_name()))) &&
            ((this.file_introduced==null && other.getFile_introduced()==null) || 
             (this.file_introduced!=null &&
              this.file_introduced.equals(other.getFile_introduced()))) &&
            ((this.file_creator==null && other.getFile_creator()==null) || 
             (this.file_creator!=null &&
              this.file_creator.equals(other.getFile_creator()))) &&
            this.node_id == other.getNode_id() &&
            ((this.node_path_name==null && other.getNode_path_name()==null) || 
             (this.node_path_name!=null &&
              this.node_path_name.equals(other.getNode_path_name()))) &&
            ((this.valid==null && other.getValid()==null) || 
             (this.valid!=null &&
              this.valid.equals(other.getValid())));
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
        _hashCode += getAttachment_id();
        _hashCode += getFile_id();
        if (getFile_type() != null) {
            _hashCode += getFile_type().hashCode();
        }
        if (getFile_name() != null) {
            _hashCode += getFile_name().hashCode();
        }
        if (getFile_introduced() != null) {
            _hashCode += getFile_introduced().hashCode();
        }
        if (getFile_creator() != null) {
            _hashCode += getFile_creator().hashCode();
        }
        _hashCode += getNode_id();
        if (getNode_path_name() != null) {
            _hashCode += getNode_path_name().hashCode();
        }
        if (getValid() != null) {
            _hashCode += getValid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Attached_file_validation_line.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "attached_file_validation_line"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachment_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attachment_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "file_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "file_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "file_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file_introduced");
        elemField.setXmlName(new javax.xml.namespace.QName("", "file_introduced"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file_creator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "file_creator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("node_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "node_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("node_path_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "node_path_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "logical"));
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
