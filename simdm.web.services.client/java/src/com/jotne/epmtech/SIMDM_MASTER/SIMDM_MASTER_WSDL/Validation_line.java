/**
 * Validation_line.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL;

public class Validation_line  extends com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.EDMbaseEntity  implements java.io.Serializable {
    private long file;

    private java.lang.String file_name;

    private java.lang.String parent_folder;

    private long validation_options;

    private long errors;

    private long warnings;

    public Validation_line() {
    }

    public Validation_line(
           long file,
           java.lang.String file_name,
           java.lang.String parent_folder,
           long validation_options,
           long errors,
           long warnings) {
        this.file = file;
        this.file_name = file_name;
        this.parent_folder = parent_folder;
        this.validation_options = validation_options;
        this.errors = errors;
        this.warnings = warnings;
    }


    /**
     * Gets the file value for this Validation_line.
     * 
     * @return file
     */
    public long getFile() {
        return file;
    }


    /**
     * Sets the file value for this Validation_line.
     * 
     * @param file
     */
    public void setFile(long file) {
        this.file = file;
    }


    /**
     * Gets the file_name value for this Validation_line.
     * 
     * @return file_name
     */
    public java.lang.String getFile_name() {
        return file_name;
    }


    /**
     * Sets the file_name value for this Validation_line.
     * 
     * @param file_name
     */
    public void setFile_name(java.lang.String file_name) {
        this.file_name = file_name;
    }


    /**
     * Gets the parent_folder value for this Validation_line.
     * 
     * @return parent_folder
     */
    public java.lang.String getParent_folder() {
        return parent_folder;
    }


    /**
     * Sets the parent_folder value for this Validation_line.
     * 
     * @param parent_folder
     */
    public void setParent_folder(java.lang.String parent_folder) {
        this.parent_folder = parent_folder;
    }


    /**
     * Gets the validation_options value for this Validation_line.
     * 
     * @return validation_options
     */
    public long getValidation_options() {
        return validation_options;
    }


    /**
     * Sets the validation_options value for this Validation_line.
     * 
     * @param validation_options
     */
    public void setValidation_options(long validation_options) {
        this.validation_options = validation_options;
    }


    /**
     * Gets the errors value for this Validation_line.
     * 
     * @return errors
     */
    public long getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this Validation_line.
     * 
     * @param errors
     */
    public void setErrors(long errors) {
        this.errors = errors;
    }


    /**
     * Gets the warnings value for this Validation_line.
     * 
     * @return warnings
     */
    public long getWarnings() {
        return warnings;
    }


    /**
     * Sets the warnings value for this Validation_line.
     * 
     * @param warnings
     */
    public void setWarnings(long warnings) {
        this.warnings = warnings;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Validation_line)) return false;
        Validation_line other = (Validation_line) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.file == other.getFile() &&
            ((this.file_name==null && other.getFile_name()==null) || 
             (this.file_name!=null &&
              this.file_name.equals(other.getFile_name()))) &&
            ((this.parent_folder==null && other.getParent_folder()==null) || 
             (this.parent_folder!=null &&
              this.parent_folder.equals(other.getParent_folder()))) &&
            this.validation_options == other.getValidation_options() &&
            this.errors == other.getErrors() &&
            this.warnings == other.getWarnings();
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
        _hashCode += new Long(getFile()).hashCode();
        if (getFile_name() != null) {
            _hashCode += getFile_name().hashCode();
        }
        if (getParent_folder() != null) {
            _hashCode += getParent_folder().hashCode();
        }
        _hashCode += new Long(getValidation_options()).hashCode();
        _hashCode += new Long(getErrors()).hashCode();
        _hashCode += new Long(getWarnings()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Validation_line.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "validation_line"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file");
        elemField.setXmlName(new javax.xml.namespace.QName("", "file"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "file_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent_folder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parent_folder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validation_options");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validation_options"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warnings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "warnings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
