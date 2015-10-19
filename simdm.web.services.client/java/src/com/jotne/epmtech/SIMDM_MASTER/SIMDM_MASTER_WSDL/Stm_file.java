/**
 * Stm_file.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL;

public class Stm_file  extends com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.EDMbaseEntity  implements java.io.Serializable {
    private long instance_id;

    private java.lang.String name;

    private java.lang.String extension;

    private java.lang.String file_type;

    private java.lang.Long size;

    private java.lang.String description;

    private java.lang.String link;

    private com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_property[] properties;

    private com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_remark[] remarks;

    private java.lang.String introduced_by;

    private java.lang.String introduced;

    public Stm_file() {
    }

    public Stm_file(
           long instance_id,
           java.lang.String name,
           java.lang.String extension,
           java.lang.String file_type,
           java.lang.Long size,
           java.lang.String description,
           java.lang.String link,
           com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_property[] properties,
           com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_remark[] remarks,
           java.lang.String introduced_by,
           java.lang.String introduced) {
        this.instance_id = instance_id;
        this.name = name;
        this.extension = extension;
        this.file_type = file_type;
        this.size = size;
        this.description = description;
        this.link = link;
        this.properties = properties;
        this.remarks = remarks;
        this.introduced_by = introduced_by;
        this.introduced = introduced;
    }


    /**
     * Gets the instance_id value for this Stm_file.
     * 
     * @return instance_id
     */
    public long getInstance_id() {
        return instance_id;
    }


    /**
     * Sets the instance_id value for this Stm_file.
     * 
     * @param instance_id
     */
    public void setInstance_id(long instance_id) {
        this.instance_id = instance_id;
    }


    /**
     * Gets the name value for this Stm_file.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Stm_file.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the extension value for this Stm_file.
     * 
     * @return extension
     */
    public java.lang.String getExtension() {
        return extension;
    }


    /**
     * Sets the extension value for this Stm_file.
     * 
     * @param extension
     */
    public void setExtension(java.lang.String extension) {
        this.extension = extension;
    }


    /**
     * Gets the file_type value for this Stm_file.
     * 
     * @return file_type
     */
    public java.lang.String getFile_type() {
        return file_type;
    }


    /**
     * Sets the file_type value for this Stm_file.
     * 
     * @param file_type
     */
    public void setFile_type(java.lang.String file_type) {
        this.file_type = file_type;
    }


    /**
     * Gets the size value for this Stm_file.
     * 
     * @return size
     */
    public java.lang.Long getSize() {
        return size;
    }


    /**
     * Sets the size value for this Stm_file.
     * 
     * @param size
     */
    public void setSize(java.lang.Long size) {
        this.size = size;
    }


    /**
     * Gets the description value for this Stm_file.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Stm_file.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the link value for this Stm_file.
     * 
     * @return link
     */
    public java.lang.String getLink() {
        return link;
    }


    /**
     * Sets the link value for this Stm_file.
     * 
     * @param link
     */
    public void setLink(java.lang.String link) {
        this.link = link;
    }


    /**
     * Gets the properties value for this Stm_file.
     * 
     * @return properties
     */
    public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_property[] getProperties() {
        return properties;
    }


    /**
     * Sets the properties value for this Stm_file.
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
     * Gets the remarks value for this Stm_file.
     * 
     * @return remarks
     */
    public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_remark[] getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this Stm_file.
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


    /**
     * Gets the introduced_by value for this Stm_file.
     * 
     * @return introduced_by
     */
    public java.lang.String getIntroduced_by() {
        return introduced_by;
    }


    /**
     * Sets the introduced_by value for this Stm_file.
     * 
     * @param introduced_by
     */
    public void setIntroduced_by(java.lang.String introduced_by) {
        this.introduced_by = introduced_by;
    }


    /**
     * Gets the introduced value for this Stm_file.
     * 
     * @return introduced
     */
    public java.lang.String getIntroduced() {
        return introduced;
    }


    /**
     * Sets the introduced value for this Stm_file.
     * 
     * @param introduced
     */
    public void setIntroduced(java.lang.String introduced) {
        this.introduced = introduced;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Stm_file)) return false;
        Stm_file other = (Stm_file) obj;
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
            ((this.extension==null && other.getExtension()==null) || 
             (this.extension!=null &&
              this.extension.equals(other.getExtension()))) &&
            ((this.file_type==null && other.getFile_type()==null) || 
             (this.file_type!=null &&
              this.file_type.equals(other.getFile_type()))) &&
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.link==null && other.getLink()==null) || 
             (this.link!=null &&
              this.link.equals(other.getLink()))) &&
            ((this.properties==null && other.getProperties()==null) || 
             (this.properties!=null &&
              java.util.Arrays.equals(this.properties, other.getProperties()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              java.util.Arrays.equals(this.remarks, other.getRemarks()))) &&
            ((this.introduced_by==null && other.getIntroduced_by()==null) || 
             (this.introduced_by!=null &&
              this.introduced_by.equals(other.getIntroduced_by()))) &&
            ((this.introduced==null && other.getIntroduced()==null) || 
             (this.introduced!=null &&
              this.introduced.equals(other.getIntroduced())));
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
        if (getExtension() != null) {
            _hashCode += getExtension().hashCode();
        }
        if (getFile_type() != null) {
            _hashCode += getFile_type().hashCode();
        }
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getLink() != null) {
            _hashCode += getLink().hashCode();
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
        if (getIntroduced_by() != null) {
            _hashCode += getIntroduced_by().hashCode();
        }
        if (getIntroduced() != null) {
            _hashCode += getIntroduced().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Stm_file.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "stm_file"));
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
        elemField.setFieldName("extension");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "file_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("link");
        elemField.setXmlName(new javax.xml.namespace.QName("", "link"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("properties");
        elemField.setXmlName(new javax.xml.namespace.QName("", "properties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "stm_property"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("introduced_by");
        elemField.setXmlName(new javax.xml.namespace.QName("", "introduced_by"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("introduced");
        elemField.setXmlName(new javax.xml.namespace.QName("", "introduced"));
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
