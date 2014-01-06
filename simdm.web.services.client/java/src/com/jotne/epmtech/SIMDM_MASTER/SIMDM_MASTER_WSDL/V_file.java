/**
 * V_file.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL;

public class V_file  extends com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.EDMbaseEntity  implements java.io.Serializable {
    private com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_item item;

    private java.lang.String extension;

    private int owner;

    private java.lang.String produced_by;

    private java.lang.String _interface;

    private java.lang.String OS;

    private java.lang.String original_name;

    private java.lang.String original_format;

    private java.lang.String check_sum;

    private int size;

    private int body;

    private java.lang.String link;

    private java.lang.String express_schema;

    private java.lang.String model_name;

    private int CAX;

    private int validation;

    private int import_log;

    private int instances;

    private int errors;

    private int validation_options;

    private int warnings;

    private int[] derived_files;

    private int[] derived_from;

    public V_file() {
    }

    public V_file(
           com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_item item,
           java.lang.String extension,
           int owner,
           java.lang.String produced_by,
           java.lang.String _interface,
           java.lang.String OS,
           java.lang.String original_name,
           java.lang.String original_format,
           java.lang.String check_sum,
           int size,
           int body,
           java.lang.String link,
           java.lang.String express_schema,
           java.lang.String model_name,
           int CAX,
           int validation,
           int import_log,
           int instances,
           int errors,
           int validation_options,
           int warnings,
           int[] derived_files,
           int[] derived_from) {
        this.item = item;
        this.extension = extension;
        this.owner = owner;
        this.produced_by = produced_by;
        this._interface = _interface;
        this.OS = OS;
        this.original_name = original_name;
        this.original_format = original_format;
        this.check_sum = check_sum;
        this.size = size;
        this.body = body;
        this.link = link;
        this.express_schema = express_schema;
        this.model_name = model_name;
        this.CAX = CAX;
        this.validation = validation;
        this.import_log = import_log;
        this.instances = instances;
        this.errors = errors;
        this.validation_options = validation_options;
        this.warnings = warnings;
        this.derived_files = derived_files;
        this.derived_from = derived_from;
    }


    /**
     * Gets the item value for this V_file.
     * 
     * @return item
     */
    public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_item getItem() {
        return item;
    }


    /**
     * Sets the item value for this V_file.
     * 
     * @param item
     */
    public void setItem(com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_item item) {
        this.item = item;
    }


    /**
     * Gets the extension value for this V_file.
     * 
     * @return extension
     */
    public java.lang.String getExtension() {
        return extension;
    }


    /**
     * Sets the extension value for this V_file.
     * 
     * @param extension
     */
    public void setExtension(java.lang.String extension) {
        this.extension = extension;
    }


    /**
     * Gets the owner value for this V_file.
     * 
     * @return owner
     */
    public int getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this V_file.
     * 
     * @param owner
     */
    public void setOwner(int owner) {
        this.owner = owner;
    }


    /**
     * Gets the produced_by value for this V_file.
     * 
     * @return produced_by
     */
    public java.lang.String getProduced_by() {
        return produced_by;
    }


    /**
     * Sets the produced_by value for this V_file.
     * 
     * @param produced_by
     */
    public void setProduced_by(java.lang.String produced_by) {
        this.produced_by = produced_by;
    }


    /**
     * Gets the _interface value for this V_file.
     * 
     * @return _interface
     */
    public java.lang.String get_interface() {
        return _interface;
    }


    /**
     * Sets the _interface value for this V_file.
     * 
     * @param _interface
     */
    public void set_interface(java.lang.String _interface) {
        this._interface = _interface;
    }


    /**
     * Gets the OS value for this V_file.
     * 
     * @return OS
     */
    public java.lang.String getOS() {
        return OS;
    }


    /**
     * Sets the OS value for this V_file.
     * 
     * @param OS
     */
    public void setOS(java.lang.String OS) {
        this.OS = OS;
    }


    /**
     * Gets the original_name value for this V_file.
     * 
     * @return original_name
     */
    public java.lang.String getOriginal_name() {
        return original_name;
    }


    /**
     * Sets the original_name value for this V_file.
     * 
     * @param original_name
     */
    public void setOriginal_name(java.lang.String original_name) {
        this.original_name = original_name;
    }


    /**
     * Gets the original_format value for this V_file.
     * 
     * @return original_format
     */
    public java.lang.String getOriginal_format() {
        return original_format;
    }


    /**
     * Sets the original_format value for this V_file.
     * 
     * @param original_format
     */
    public void setOriginal_format(java.lang.String original_format) {
        this.original_format = original_format;
    }


    /**
     * Gets the check_sum value for this V_file.
     * 
     * @return check_sum
     */
    public java.lang.String getCheck_sum() {
        return check_sum;
    }


    /**
     * Sets the check_sum value for this V_file.
     * 
     * @param check_sum
     */
    public void setCheck_sum(java.lang.String check_sum) {
        this.check_sum = check_sum;
    }


    /**
     * Gets the size value for this V_file.
     * 
     * @return size
     */
    public int getSize() {
        return size;
    }


    /**
     * Sets the size value for this V_file.
     * 
     * @param size
     */
    public void setSize(int size) {
        this.size = size;
    }


    /**
     * Gets the body value for this V_file.
     * 
     * @return body
     */
    public int getBody() {
        return body;
    }


    /**
     * Sets the body value for this V_file.
     * 
     * @param body
     */
    public void setBody(int body) {
        this.body = body;
    }


    /**
     * Gets the link value for this V_file.
     * 
     * @return link
     */
    public java.lang.String getLink() {
        return link;
    }


    /**
     * Sets the link value for this V_file.
     * 
     * @param link
     */
    public void setLink(java.lang.String link) {
        this.link = link;
    }


    /**
     * Gets the express_schema value for this V_file.
     * 
     * @return express_schema
     */
    public java.lang.String getExpress_schema() {
        return express_schema;
    }


    /**
     * Sets the express_schema value for this V_file.
     * 
     * @param express_schema
     */
    public void setExpress_schema(java.lang.String express_schema) {
        this.express_schema = express_schema;
    }


    /**
     * Gets the model_name value for this V_file.
     * 
     * @return model_name
     */
    public java.lang.String getModel_name() {
        return model_name;
    }


    /**
     * Sets the model_name value for this V_file.
     * 
     * @param model_name
     */
    public void setModel_name(java.lang.String model_name) {
        this.model_name = model_name;
    }


    /**
     * Gets the CAX value for this V_file.
     * 
     * @return CAX
     */
    public int getCAX() {
        return CAX;
    }


    /**
     * Sets the CAX value for this V_file.
     * 
     * @param CAX
     */
    public void setCAX(int CAX) {
        this.CAX = CAX;
    }


    /**
     * Gets the validation value for this V_file.
     * 
     * @return validation
     */
    public int getValidation() {
        return validation;
    }


    /**
     * Sets the validation value for this V_file.
     * 
     * @param validation
     */
    public void setValidation(int validation) {
        this.validation = validation;
    }


    /**
     * Gets the import_log value for this V_file.
     * 
     * @return import_log
     */
    public int getImport_log() {
        return import_log;
    }


    /**
     * Sets the import_log value for this V_file.
     * 
     * @param import_log
     */
    public void setImport_log(int import_log) {
        this.import_log = import_log;
    }


    /**
     * Gets the instances value for this V_file.
     * 
     * @return instances
     */
    public int getInstances() {
        return instances;
    }


    /**
     * Sets the instances value for this V_file.
     * 
     * @param instances
     */
    public void setInstances(int instances) {
        this.instances = instances;
    }


    /**
     * Gets the errors value for this V_file.
     * 
     * @return errors
     */
    public int getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this V_file.
     * 
     * @param errors
     */
    public void setErrors(int errors) {
        this.errors = errors;
    }


    /**
     * Gets the validation_options value for this V_file.
     * 
     * @return validation_options
     */
    public int getValidation_options() {
        return validation_options;
    }


    /**
     * Sets the validation_options value for this V_file.
     * 
     * @param validation_options
     */
    public void setValidation_options(int validation_options) {
        this.validation_options = validation_options;
    }


    /**
     * Gets the warnings value for this V_file.
     * 
     * @return warnings
     */
    public int getWarnings() {
        return warnings;
    }


    /**
     * Sets the warnings value for this V_file.
     * 
     * @param warnings
     */
    public void setWarnings(int warnings) {
        this.warnings = warnings;
    }


    /**
     * Gets the derived_files value for this V_file.
     * 
     * @return derived_files
     */
    public int[] getDerived_files() {
        return derived_files;
    }


    /**
     * Sets the derived_files value for this V_file.
     * 
     * @param derived_files
     */
    public void setDerived_files(int[] derived_files) {
        this.derived_files = derived_files;
    }

    public int getDerived_files(int i) {
        return this.derived_files[i];
    }

    public void setDerived_files(int i, int _value) {
        this.derived_files[i] = _value;
    }


    /**
     * Gets the derived_from value for this V_file.
     * 
     * @return derived_from
     */
    public int[] getDerived_from() {
        return derived_from;
    }


    /**
     * Sets the derived_from value for this V_file.
     * 
     * @param derived_from
     */
    public void setDerived_from(int[] derived_from) {
        this.derived_from = derived_from;
    }

    public int getDerived_from(int i) {
        return this.derived_from[i];
    }

    public void setDerived_from(int i, int _value) {
        this.derived_from[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof V_file)) return false;
        V_file other = (V_file) obj;
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
            ((this.extension==null && other.getExtension()==null) || 
             (this.extension!=null &&
              this.extension.equals(other.getExtension()))) &&
            this.owner == other.getOwner() &&
            ((this.produced_by==null && other.getProduced_by()==null) || 
             (this.produced_by!=null &&
              this.produced_by.equals(other.getProduced_by()))) &&
            ((this._interface==null && other.get_interface()==null) || 
             (this._interface!=null &&
              this._interface.equals(other.get_interface()))) &&
            ((this.OS==null && other.getOS()==null) || 
             (this.OS!=null &&
              this.OS.equals(other.getOS()))) &&
            ((this.original_name==null && other.getOriginal_name()==null) || 
             (this.original_name!=null &&
              this.original_name.equals(other.getOriginal_name()))) &&
            ((this.original_format==null && other.getOriginal_format()==null) || 
             (this.original_format!=null &&
              this.original_format.equals(other.getOriginal_format()))) &&
            ((this.check_sum==null && other.getCheck_sum()==null) || 
             (this.check_sum!=null &&
              this.check_sum.equals(other.getCheck_sum()))) &&
            this.size == other.getSize() &&
            this.body == other.getBody() &&
            ((this.link==null && other.getLink()==null) || 
             (this.link!=null &&
              this.link.equals(other.getLink()))) &&
            ((this.express_schema==null && other.getExpress_schema()==null) || 
             (this.express_schema!=null &&
              this.express_schema.equals(other.getExpress_schema()))) &&
            ((this.model_name==null && other.getModel_name()==null) || 
             (this.model_name!=null &&
              this.model_name.equals(other.getModel_name()))) &&
            this.CAX == other.getCAX() &&
            this.validation == other.getValidation() &&
            this.import_log == other.getImport_log() &&
            this.instances == other.getInstances() &&
            this.errors == other.getErrors() &&
            this.validation_options == other.getValidation_options() &&
            this.warnings == other.getWarnings() &&
            ((this.derived_files==null && other.getDerived_files()==null) || 
             (this.derived_files!=null &&
              java.util.Arrays.equals(this.derived_files, other.getDerived_files()))) &&
            ((this.derived_from==null && other.getDerived_from()==null) || 
             (this.derived_from!=null &&
              java.util.Arrays.equals(this.derived_from, other.getDerived_from())));
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
        if (getExtension() != null) {
            _hashCode += getExtension().hashCode();
        }
        _hashCode += getOwner();
        if (getProduced_by() != null) {
            _hashCode += getProduced_by().hashCode();
        }
        if (get_interface() != null) {
            _hashCode += get_interface().hashCode();
        }
        if (getOS() != null) {
            _hashCode += getOS().hashCode();
        }
        if (getOriginal_name() != null) {
            _hashCode += getOriginal_name().hashCode();
        }
        if (getOriginal_format() != null) {
            _hashCode += getOriginal_format().hashCode();
        }
        if (getCheck_sum() != null) {
            _hashCode += getCheck_sum().hashCode();
        }
        _hashCode += getSize();
        _hashCode += getBody();
        if (getLink() != null) {
            _hashCode += getLink().hashCode();
        }
        if (getExpress_schema() != null) {
            _hashCode += getExpress_schema().hashCode();
        }
        if (getModel_name() != null) {
            _hashCode += getModel_name().hashCode();
        }
        _hashCode += getCAX();
        _hashCode += getValidation();
        _hashCode += getImport_log();
        _hashCode += getInstances();
        _hashCode += getErrors();
        _hashCode += getValidation_options();
        _hashCode += getWarnings();
        if (getDerived_files() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDerived_files());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDerived_files(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDerived_from() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDerived_from());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDerived_from(), i);
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
        new org.apache.axis.description.TypeDesc(V_file.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "v_file"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "v_item"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extension");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("produced_by");
        elemField.setXmlName(new javax.xml.namespace.QName("", "produced_by"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_interface");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interface"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("original_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "original_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("original_format");
        elemField.setXmlName(new javax.xml.namespace.QName("", "original_format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("check_sum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "check_sum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("body");
        elemField.setXmlName(new javax.xml.namespace.QName("", "body"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("link");
        elemField.setXmlName(new javax.xml.namespace.QName("", "link"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("express_schema");
        elemField.setXmlName(new javax.xml.namespace.QName("", "express_schema"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "model_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CAX");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CAX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("import_log");
        elemField.setXmlName(new javax.xml.namespace.QName("", "import_log"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instances");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instances"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validation_options");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validation_options"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warnings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "warnings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("derived_files");
        elemField.setXmlName(new javax.xml.namespace.QName("", "derived_files"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("derived_from");
        elemField.setXmlName(new javax.xml.namespace.QName("", "derived_from"));
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
