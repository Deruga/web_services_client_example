/**
 * Node_info_ve.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jotne.epmtech.Ap209_multidisciplinary_analysis_and_design_mim_LF.node_query;

public class Node_info_ve  extends com.jotne.epmtech.Ap209_multidisciplinary_analysis_and_design_mim_LF.node_query.EDMbaseEntity  implements java.io.Serializable {
    private java.lang.String NODE_ID;

    private java.lang.String NODE_TYPE;

    private java.lang.String COORDSYS_ID;

    private java.lang.String COORDSYS_TYPE;

    private java.lang.String COORD1;

    private java.lang.String COORD2;

    private java.lang.String COORD3;

    public Node_info_ve() {
    }

    public Node_info_ve(
           java.lang.String NODE_ID,
           java.lang.String NODE_TYPE,
           java.lang.String COORDSYS_ID,
           java.lang.String COORDSYS_TYPE,
           java.lang.String COORD1,
           java.lang.String COORD2,
           java.lang.String COORD3) {
        this.NODE_ID = NODE_ID;
        this.NODE_TYPE = NODE_TYPE;
        this.COORDSYS_ID = COORDSYS_ID;
        this.COORDSYS_TYPE = COORDSYS_TYPE;
        this.COORD1 = COORD1;
        this.COORD2 = COORD2;
        this.COORD3 = COORD3;
    }


    /**
     * Gets the NODE_ID value for this Node_info_ve.
     * 
     * @return NODE_ID
     */
    public java.lang.String getNODE_ID() {
        return NODE_ID;
    }


    /**
     * Sets the NODE_ID value for this Node_info_ve.
     * 
     * @param NODE_ID
     */
    public void setNODE_ID(java.lang.String NODE_ID) {
        this.NODE_ID = NODE_ID;
    }


    /**
     * Gets the NODE_TYPE value for this Node_info_ve.
     * 
     * @return NODE_TYPE
     */
    public java.lang.String getNODE_TYPE() {
        return NODE_TYPE;
    }


    /**
     * Sets the NODE_TYPE value for this Node_info_ve.
     * 
     * @param NODE_TYPE
     */
    public void setNODE_TYPE(java.lang.String NODE_TYPE) {
        this.NODE_TYPE = NODE_TYPE;
    }


    /**
     * Gets the COORDSYS_ID value for this Node_info_ve.
     * 
     * @return COORDSYS_ID
     */
    public java.lang.String getCOORDSYS_ID() {
        return COORDSYS_ID;
    }


    /**
     * Sets the COORDSYS_ID value for this Node_info_ve.
     * 
     * @param COORDSYS_ID
     */
    public void setCOORDSYS_ID(java.lang.String COORDSYS_ID) {
        this.COORDSYS_ID = COORDSYS_ID;
    }


    /**
     * Gets the COORDSYS_TYPE value for this Node_info_ve.
     * 
     * @return COORDSYS_TYPE
     */
    public java.lang.String getCOORDSYS_TYPE() {
        return COORDSYS_TYPE;
    }


    /**
     * Sets the COORDSYS_TYPE value for this Node_info_ve.
     * 
     * @param COORDSYS_TYPE
     */
    public void setCOORDSYS_TYPE(java.lang.String COORDSYS_TYPE) {
        this.COORDSYS_TYPE = COORDSYS_TYPE;
    }


    /**
     * Gets the COORD1 value for this Node_info_ve.
     * 
     * @return COORD1
     */
    public java.lang.String getCOORD1() {
        return COORD1;
    }


    /**
     * Sets the COORD1 value for this Node_info_ve.
     * 
     * @param COORD1
     */
    public void setCOORD1(java.lang.String COORD1) {
        this.COORD1 = COORD1;
    }


    /**
     * Gets the COORD2 value for this Node_info_ve.
     * 
     * @return COORD2
     */
    public java.lang.String getCOORD2() {
        return COORD2;
    }


    /**
     * Sets the COORD2 value for this Node_info_ve.
     * 
     * @param COORD2
     */
    public void setCOORD2(java.lang.String COORD2) {
        this.COORD2 = COORD2;
    }


    /**
     * Gets the COORD3 value for this Node_info_ve.
     * 
     * @return COORD3
     */
    public java.lang.String getCOORD3() {
        return COORD3;
    }


    /**
     * Sets the COORD3 value for this Node_info_ve.
     * 
     * @param COORD3
     */
    public void setCOORD3(java.lang.String COORD3) {
        this.COORD3 = COORD3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Node_info_ve)) return false;
        Node_info_ve other = (Node_info_ve) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.NODE_ID==null && other.getNODE_ID()==null) || 
             (this.NODE_ID!=null &&
              this.NODE_ID.equals(other.getNODE_ID()))) &&
            ((this.NODE_TYPE==null && other.getNODE_TYPE()==null) || 
             (this.NODE_TYPE!=null &&
              this.NODE_TYPE.equals(other.getNODE_TYPE()))) &&
            ((this.COORDSYS_ID==null && other.getCOORDSYS_ID()==null) || 
             (this.COORDSYS_ID!=null &&
              this.COORDSYS_ID.equals(other.getCOORDSYS_ID()))) &&
            ((this.COORDSYS_TYPE==null && other.getCOORDSYS_TYPE()==null) || 
             (this.COORDSYS_TYPE!=null &&
              this.COORDSYS_TYPE.equals(other.getCOORDSYS_TYPE()))) &&
            ((this.COORD1==null && other.getCOORD1()==null) || 
             (this.COORD1!=null &&
              this.COORD1.equals(other.getCOORD1()))) &&
            ((this.COORD2==null && other.getCOORD2()==null) || 
             (this.COORD2!=null &&
              this.COORD2.equals(other.getCOORD2()))) &&
            ((this.COORD3==null && other.getCOORD3()==null) || 
             (this.COORD3!=null &&
              this.COORD3.equals(other.getCOORD3())));
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
        if (getNODE_ID() != null) {
            _hashCode += getNODE_ID().hashCode();
        }
        if (getNODE_TYPE() != null) {
            _hashCode += getNODE_TYPE().hashCode();
        }
        if (getCOORDSYS_ID() != null) {
            _hashCode += getCOORDSYS_ID().hashCode();
        }
        if (getCOORDSYS_TYPE() != null) {
            _hashCode += getCOORDSYS_TYPE().hashCode();
        }
        if (getCOORD1() != null) {
            _hashCode += getCOORD1().hashCode();
        }
        if (getCOORD2() != null) {
            _hashCode += getCOORD2().hashCode();
        }
        if (getCOORD3() != null) {
            _hashCode += getCOORD3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Node_info_ve.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/Ap209_multidisciplinary_analysis_and_design_mim_LF/node_query", "node_info_ve"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NODE_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NODE_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NODE_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NODE_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COORDSYS_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "COORDSYS_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COORDSYS_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "COORDSYS_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COORD1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "COORD1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COORD2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "COORD2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COORD3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "COORD3"));
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
