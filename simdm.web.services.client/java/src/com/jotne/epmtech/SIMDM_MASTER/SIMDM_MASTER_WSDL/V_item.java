/**
 * V_item.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL;

public class V_item  extends com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.EDMbaseEntity  implements java.io.Serializable {
    private long instance_id;

    private java.lang.String item_type;

    private java.lang.String name;

    private java.lang.String description;

    private java.lang.String introduced;

    private long creator;

    private java.lang.String last_changed;

    private long last_editor;

    private java.lang.String preview;

    private boolean cancelled;

    private long[] comments;

    private long[] events;

    public V_item() {
    }

    public V_item(
           long instance_id,
           java.lang.String item_type,
           java.lang.String name,
           java.lang.String description,
           java.lang.String introduced,
           long creator,
           java.lang.String last_changed,
           long last_editor,
           java.lang.String preview,
           boolean cancelled,
           long[] comments,
           long[] events) {
        this.instance_id = instance_id;
        this.item_type = item_type;
        this.name = name;
        this.description = description;
        this.introduced = introduced;
        this.creator = creator;
        this.last_changed = last_changed;
        this.last_editor = last_editor;
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
    public long getInstance_id() {
        return instance_id;
    }


    /**
     * Sets the instance_id value for this V_item.
     * 
     * @param instance_id
     */
    public void setInstance_id(long instance_id) {
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
    public long getCreator() {
        return creator;
    }


    /**
     * Sets the creator value for this V_item.
     * 
     * @param creator
     */
    public void setCreator(long creator) {
        this.creator = creator;
    }


    /**
     * Gets the last_changed value for this V_item.
     * 
     * @return last_changed
     */
    public java.lang.String getLast_changed() {
        return last_changed;
    }


    /**
     * Sets the last_changed value for this V_item.
     * 
     * @param last_changed
     */
    public void setLast_changed(java.lang.String last_changed) {
        this.last_changed = last_changed;
    }


    /**
     * Gets the last_editor value for this V_item.
     * 
     * @return last_editor
     */
    public long getLast_editor() {
        return last_editor;
    }


    /**
     * Sets the last_editor value for this V_item.
     * 
     * @param last_editor
     */
    public void setLast_editor(long last_editor) {
        this.last_editor = last_editor;
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
    public boolean isCancelled() {
        return cancelled;
    }


    /**
     * Sets the cancelled value for this V_item.
     * 
     * @param cancelled
     */
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }


    /**
     * Gets the comments value for this V_item.
     * 
     * @return comments
     */
    public long[] getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this V_item.
     * 
     * @param comments
     */
    public void setComments(long[] comments) {
        this.comments = comments;
    }

    public long getComments(int i) {
        return this.comments[i];
    }

    public void setComments(int i, long _value) {
        this.comments[i] = _value;
    }


    /**
     * Gets the events value for this V_item.
     * 
     * @return events
     */
    public long[] getEvents() {
        return events;
    }


    /**
     * Sets the events value for this V_item.
     * 
     * @param events
     */
    public void setEvents(long[] events) {
        this.events = events;
    }

    public long getEvents(int i) {
        return this.events[i];
    }

    public void setEvents(int i, long _value) {
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
            this.creator == other.getCreator() &&
            ((this.last_changed==null && other.getLast_changed()==null) || 
             (this.last_changed!=null &&
              this.last_changed.equals(other.getLast_changed()))) &&
            this.last_editor == other.getLast_editor() &&
            ((this.preview==null && other.getPreview()==null) || 
             (this.preview!=null &&
              this.preview.equals(other.getPreview()))) &&
            this.cancelled == other.isCancelled() &&
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
        _hashCode += new Long(getInstance_id()).hashCode();
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
        _hashCode += new Long(getCreator()).hashCode();
        if (getLast_changed() != null) {
            _hashCode += getLast_changed().hashCode();
        }
        _hashCode += new Long(getLast_editor()).hashCode();
        if (getPreview() != null) {
            _hashCode += getPreview().hashCode();
        }
        _hashCode += (isCancelled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("introduced");
        elemField.setXmlName(new javax.xml.namespace.QName("", "introduced"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last_changed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "last_changed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last_editor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "last_editor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preview");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preview"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cancelled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("events");
        elemField.setXmlName(new javax.xml.namespace.QName("", "events"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
