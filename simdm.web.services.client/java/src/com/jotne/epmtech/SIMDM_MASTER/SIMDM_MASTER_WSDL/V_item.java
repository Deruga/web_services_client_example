/**
 * V_item.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL;

public class V_item  extends com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.EDMbaseEntity  implements java.io.Serializable {
    private int instance_id;

    private java.lang.String item_type;

    private java.lang.String name;

    private java.lang.String description;

    private java.lang.String introduced;

    private java.lang.Integer creator;

    private java.lang.String preview;

    private java.lang.Boolean cancelled;

    private java.lang.Integer[] comments;

    private java.lang.Integer[] events;

    public V_item() {
    }

    public V_item(
           int instance_id,
           java.lang.String item_type,
           java.lang.String name,
           java.lang.String description,
           java.lang.String introduced,
           java.lang.Integer creator,
           java.lang.String preview,
           java.lang.Boolean cancelled,
           java.lang.Integer[] comments,
           java.lang.Integer[] events) {
        this.instance_id = instance_id;
        this.item_type = item_type;
        this.name = name;
        this.description = description;
        this.introduced = introduced;
        this.creator = creator;
        this.preview = preview;
        this.cancelled = cancelled;
        this.comments = comments;
        this.events = events;
    }


    /**
     * Gets the instance_id value for this V_item.
     * 
     * @return instance_id
     */
    public int getInstance_id() {
        return instance_id;
    }


    /**
     * Sets the instance_id value for this V_item.
     * 
     * @param instance_id
     */
    public void setInstance_id(int instance_id) {
        this.instance_id = instance_id;
    }


    /**
     * Gets the item_type value for this V_item.
     * 
     * @return item_type
     */
    public java.lang.String getItem_type() {
        return item_type;
    }


    /**
     * Sets the item_type value for this V_item.
     * 
     * @param item_type
     */
    public void setItem_type(java.lang.String item_type) {
        this.item_type = item_type;
    }


    /**
     * Gets the name value for this V_item.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this V_item.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this V_item.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this V_item.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the introduced value for this V_item.
     * 
     * @return introduced
     */
    public java.lang.String getIntroduced() {
        return introduced;
    }


    /**
     * Sets the introduced value for this V_item.
     * 
     * @param introduced
     */
    public void setIntroduced(java.lang.String introduced) {
        this.introduced = introduced;
    }


    /**
     * Gets the creator value for this V_item.
     * 
     * @return creator
     */
    public java.lang.Integer getCreator() {
        return creator;
    }


    /**
     * Sets the creator value for this V_item.
     * 
     * @param creator
     */
    public void setCreator(java.lang.Integer creator) {
        this.creator = creator;
    }


    /**
     * Gets the preview value for this V_item.
     * 
     * @return preview
     */
    public java.lang.String getPreview() {
        return preview;
    }


    /**
     * Sets the preview value for this V_item.
     * 
     * @param preview
     */
    public void setPreview(java.lang.String preview) {
        this.preview = preview;
    }


    /**
     * Gets the cancelled value for this V_item.
     * 
     * @return cancelled
     */
    public java.lang.Boolean getCancelled() {
        return cancelled;
    }


    /**
     * Sets the cancelled value for this V_item.
     * 
     * @param cancelled
     */
    public void setCancelled(java.lang.Boolean cancelled) {
        this.cancelled = cancelled;
    }


    /**
     * Gets the comments value for this V_item.
     * 
     * @return comments
     */
    public java.lang.Integer[] getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this V_item.
     * 
     * @param comments
     */
    public void setComments(java.lang.Integer[] comments) {
        this.comments = comments;
    }

    public java.lang.Integer getComments(int i) {
        return this.comments[i];
    }

    public void setComments(int i, java.lang.Integer _value) {
        this.comments[i] = _value;
    }


    /**
     * Gets the events value for this V_item.
     * 
     * @return events
     */
    public java.lang.Integer[] getEvents() {
        return events;
    }


    /**
     * Sets the events value for this V_item.
     * 
     * @param events
     */
    public void setEvents(java.lang.Integer[] events) {
        this.events = events;
    }

    public java.lang.Integer getEvents(int i) {
        return this.events[i];
    }

    public void setEvents(int i, java.lang.Integer _value) {
        this.events[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof V_item)) return false;
        V_item other = (V_item) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.instance_id == other.getInstance_id() &&
            ((this.item_type==null && other.getItem_type()==null) || 
             (this.item_type!=null &&
              this.item_type.equals(other.getItem_type()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.introduced==null && other.getIntroduced()==null) || 
             (this.introduced!=null &&
              this.introduced.equals(other.getIntroduced()))) &&
            ((this.creator==null && other.getCreator()==null) || 
             (this.creator!=null &&
              this.creator.equals(other.getCreator()))) &&
            ((this.preview==null && other.getPreview()==null) || 
             (this.preview!=null &&
              this.preview.equals(other.getPreview()))) &&
            ((this.cancelled==null && other.getCancelled()==null) || 
             (this.cancelled!=null &&
              this.cancelled.equals(other.getCancelled()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              java.util.Arrays.equals(this.comments, other.getComments()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              java.util.Arrays.equals(this.events, other.getEvents())));
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
        _hashCode += getInstance_id();
        if (getItem_type() != null) {
            _hashCode += getItem_type().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getIntroduced() != null) {
            _hashCode += getIntroduced().hashCode();
        }
        if (getCreator() != null) {
            _hashCode += getCreator().hashCode();
        }
        if (getPreview() != null) {
            _hashCode += getPreview().hashCode();
        }
        if (getCancelled() != null) {
            _hashCode += getCancelled().hashCode();
        }
        if (getComments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEvents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEvents(), i);
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
        new org.apache.axis.description.TypeDesc(V_item.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "v_item"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instance_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instance_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
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
        elemField.setFieldName("introduced");
        elemField.setXmlName(new javax.xml.namespace.QName("", "introduced"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preview");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preview"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cancelled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("events");
        elemField.setXmlName(new javax.xml.namespace.QName("", "events"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
