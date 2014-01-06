/**
 * V_task.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL;

public class V_task  extends com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.EDMbaseEntity  implements java.io.Serializable {
    private com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_item item;

    private int subject;

    private int assigned;

    private int action;

    private java.lang.String to_start;

    private java.lang.String to_finish;

    private int[] approvals;

    public V_task() {
    }

    public V_task(
           com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_item item,
           int subject,
           int assigned,
           int action,
           java.lang.String to_start,
           java.lang.String to_finish,
           int[] approvals) {
        this.item = item;
        this.subject = subject;
        this.assigned = assigned;
        this.action = action;
        this.to_start = to_start;
        this.to_finish = to_finish;
        this.approvals = approvals;
    }


    /**
     * Gets the item value for this V_task.
     * 
     * @return item
     */
    public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_item getItem() {
        return item;
    }


    /**
     * Sets the item value for this V_task.
     * 
     * @param item
     */
    public void setItem(com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_item item) {
        this.item = item;
    }


    /**
     * Gets the subject value for this V_task.
     * 
     * @return subject
     */
    public int getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this V_task.
     * 
     * @param subject
     */
    public void setSubject(int subject) {
        this.subject = subject;
    }


    /**
     * Gets the assigned value for this V_task.
     * 
     * @return assigned
     */
    public int getAssigned() {
        return assigned;
    }


    /**
     * Sets the assigned value for this V_task.
     * 
     * @param assigned
     */
    public void setAssigned(int assigned) {
        this.assigned = assigned;
    }


    /**
     * Gets the action value for this V_task.
     * 
     * @return action
     */
    public int getAction() {
        return action;
    }


    /**
     * Sets the action value for this V_task.
     * 
     * @param action
     */
    public void setAction(int action) {
        this.action = action;
    }


    /**
     * Gets the to_start value for this V_task.
     * 
     * @return to_start
     */
    public java.lang.String getTo_start() {
        return to_start;
    }


    /**
     * Sets the to_start value for this V_task.
     * 
     * @param to_start
     */
    public void setTo_start(java.lang.String to_start) {
        this.to_start = to_start;
    }


    /**
     * Gets the to_finish value for this V_task.
     * 
     * @return to_finish
     */
    public java.lang.String getTo_finish() {
        return to_finish;
    }


    /**
     * Sets the to_finish value for this V_task.
     * 
     * @param to_finish
     */
    public void setTo_finish(java.lang.String to_finish) {
        this.to_finish = to_finish;
    }


    /**
     * Gets the approvals value for this V_task.
     * 
     * @return approvals
     */
    public int[] getApprovals() {
        return approvals;
    }


    /**
     * Sets the approvals value for this V_task.
     * 
     * @param approvals
     */
    public void setApprovals(int[] approvals) {
        this.approvals = approvals;
    }

    public int getApprovals(int i) {
        return this.approvals[i];
    }

    public void setApprovals(int i, int _value) {
        this.approvals[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof V_task)) return false;
        V_task other = (V_task) obj;
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
            this.subject == other.getSubject() &&
            this.assigned == other.getAssigned() &&
            this.action == other.getAction() &&
            ((this.to_start==null && other.getTo_start()==null) || 
             (this.to_start!=null &&
              this.to_start.equals(other.getTo_start()))) &&
            ((this.to_finish==null && other.getTo_finish()==null) || 
             (this.to_finish!=null &&
              this.to_finish.equals(other.getTo_finish()))) &&
            ((this.approvals==null && other.getApprovals()==null) || 
             (this.approvals!=null &&
              java.util.Arrays.equals(this.approvals, other.getApprovals())));
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
        _hashCode += getSubject();
        _hashCode += getAssigned();
        _hashCode += getAction();
        if (getTo_start() != null) {
            _hashCode += getTo_start().hashCode();
        }
        if (getTo_finish() != null) {
            _hashCode += getTo_finish().hashCode();
        }
        if (getApprovals() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApprovals());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApprovals(), i);
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
        new org.apache.axis.description.TypeDesc(V_task.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "v_task"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "v_item"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigned");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("to_start");
        elemField.setXmlName(new javax.xml.namespace.QName("", "to_start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("to_finish");
        elemField.setXmlName(new javax.xml.namespace.QName("", "to_finish"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvals");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approvals"));
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
