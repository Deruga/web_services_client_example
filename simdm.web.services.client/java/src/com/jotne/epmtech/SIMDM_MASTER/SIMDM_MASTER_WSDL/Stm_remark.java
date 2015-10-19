/**
 * Stm_remark.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL;

public class Stm_remark  extends com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.EDMbaseEntity  implements java.io.Serializable {
    private long instance_id;

    private java.lang.String subj;

    private java.lang.String remark;

    private long related_to;

    private java.lang.String related_type;

    private java.lang.String login;

    private java.lang.String dropped_by;

    private java.lang.String dropped;

    private boolean mine;

    private com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_remark[] feedbacks;

    public Stm_remark() {
    }

    public Stm_remark(
           long instance_id,
           java.lang.String subj,
           java.lang.String remark,
           long related_to,
           java.lang.String related_type,
           java.lang.String login,
           java.lang.String dropped_by,
           java.lang.String dropped,
           boolean mine,
           com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_remark[] feedbacks) {
        this.instance_id = instance_id;
        this.subj = subj;
        this.remark = remark;
        this.related_to = related_to;
        this.related_type = related_type;
        this.login = login;
        this.dropped_by = dropped_by;
        this.dropped = dropped;
        this.mine = mine;
        this.feedbacks = feedbacks;
    }


    /**
     * Gets the instance_id value for this Stm_remark.
     * 
     * @return instance_id
     */
    public long getInstance_id() {
        return instance_id;
    }


    /**
     * Sets the instance_id value for this Stm_remark.
     * 
     * @param instance_id
     */
    public void setInstance_id(long instance_id) {
        this.instance_id = instance_id;
    }


    /**
     * Gets the subj value for this Stm_remark.
     * 
     * @return subj
     */
    public java.lang.String getSubj() {
        return subj;
    }


    /**
     * Sets the subj value for this Stm_remark.
     * 
     * @param subj
     */
    public void setSubj(java.lang.String subj) {
        this.subj = subj;
    }


    /**
     * Gets the remark value for this Stm_remark.
     * 
     * @return remark
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this Stm_remark.
     * 
     * @param remark
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }


    /**
     * Gets the related_to value for this Stm_remark.
     * 
     * @return related_to
     */
    public long getRelated_to() {
        return related_to;
    }


    /**
     * Sets the related_to value for this Stm_remark.
     * 
     * @param related_to
     */
    public void setRelated_to(long related_to) {
        this.related_to = related_to;
    }


    /**
     * Gets the related_type value for this Stm_remark.
     * 
     * @return related_type
     */
    public java.lang.String getRelated_type() {
        return related_type;
    }


    /**
     * Sets the related_type value for this Stm_remark.
     * 
     * @param related_type
     */
    public void setRelated_type(java.lang.String related_type) {
        this.related_type = related_type;
    }


    /**
     * Gets the login value for this Stm_remark.
     * 
     * @return login
     */
    public java.lang.String getLogin() {
        return login;
    }


    /**
     * Sets the login value for this Stm_remark.
     * 
     * @param login
     */
    public void setLogin(java.lang.String login) {
        this.login = login;
    }


    /**
     * Gets the dropped_by value for this Stm_remark.
     * 
     * @return dropped_by
     */
    public java.lang.String getDropped_by() {
        return dropped_by;
    }


    /**
     * Sets the dropped_by value for this Stm_remark.
     * 
     * @param dropped_by
     */
    public void setDropped_by(java.lang.String dropped_by) {
        this.dropped_by = dropped_by;
    }


    /**
     * Gets the dropped value for this Stm_remark.
     * 
     * @return dropped
     */
    public java.lang.String getDropped() {
        return dropped;
    }


    /**
     * Sets the dropped value for this Stm_remark.
     * 
     * @param dropped
     */
    public void setDropped(java.lang.String dropped) {
        this.dropped = dropped;
    }


    /**
     * Gets the mine value for this Stm_remark.
     * 
     * @return mine
     */
    public boolean isMine() {
        return mine;
    }


    /**
     * Sets the mine value for this Stm_remark.
     * 
     * @param mine
     */
    public void setMine(boolean mine) {
        this.mine = mine;
    }


    /**
     * Gets the feedbacks value for this Stm_remark.
     * 
     * @return feedbacks
     */
    public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_remark[] getFeedbacks() {
        return feedbacks;
    }


    /**
     * Sets the feedbacks value for this Stm_remark.
     * 
     * @param feedbacks
     */
    public void setFeedbacks(com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_remark[] feedbacks) {
        this.feedbacks = feedbacks;
    }

    public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_remark getFeedbacks(int i) {
        return this.feedbacks[i];
    }

    public void setFeedbacks(int i, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Stm_remark _value) {
        this.feedbacks[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Stm_remark)) return false;
        Stm_remark other = (Stm_remark) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.instance_id == other.getInstance_id() &&
            ((this.subj==null && other.getSubj()==null) || 
             (this.subj!=null &&
              this.subj.equals(other.getSubj()))) &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark()))) &&
            this.related_to == other.getRelated_to() &&
            ((this.related_type==null && other.getRelated_type()==null) || 
             (this.related_type!=null &&
              this.related_type.equals(other.getRelated_type()))) &&
            ((this.login==null && other.getLogin()==null) || 
             (this.login!=null &&
              this.login.equals(other.getLogin()))) &&
            ((this.dropped_by==null && other.getDropped_by()==null) || 
             (this.dropped_by!=null &&
              this.dropped_by.equals(other.getDropped_by()))) &&
            ((this.dropped==null && other.getDropped()==null) || 
             (this.dropped!=null &&
              this.dropped.equals(other.getDropped()))) &&
            this.mine == other.isMine() &&
            ((this.feedbacks==null && other.getFeedbacks()==null) || 
             (this.feedbacks!=null &&
              java.util.Arrays.equals(this.feedbacks, other.getFeedbacks())));
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
        if (getSubj() != null) {
            _hashCode += getSubj().hashCode();
        }
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        _hashCode += new Long(getRelated_to()).hashCode();
        if (getRelated_type() != null) {
            _hashCode += getRelated_type().hashCode();
        }
        if (getLogin() != null) {
            _hashCode += getLogin().hashCode();
        }
        if (getDropped_by() != null) {
            _hashCode += getDropped_by().hashCode();
        }
        if (getDropped() != null) {
            _hashCode += getDropped().hashCode();
        }
        _hashCode += (isMine() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFeedbacks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeedbacks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeedbacks(), i);
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
        new org.apache.axis.description.TypeDesc(Stm_remark.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "stm_remark"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instance_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instance_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subj");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remark");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("related_to");
        elemField.setXmlName(new javax.xml.namespace.QName("", "related_to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("related_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "related_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login");
        elemField.setXmlName(new javax.xml.namespace.QName("", "login"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dropped_by");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dropped_by"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dropped");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dropped"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mine");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedbacks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feedbacks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "stm_remark"));
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
