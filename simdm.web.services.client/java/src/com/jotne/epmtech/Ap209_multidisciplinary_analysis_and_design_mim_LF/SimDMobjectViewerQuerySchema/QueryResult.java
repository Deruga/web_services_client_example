/**
 * QueryResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jotne.epmtech.ap209_multidisciplinary_analysis_and_design_mim_lf.SimDMobjectViewerQuerySchema;

public class QueryResult  extends com.jotne.epmtech.ap209_multidisciplinary_analysis_and_design_mim_lf.SimDMobjectViewerQuerySchema.EDMbaseEntity  implements java.io.Serializable {
    private java.lang.String html;

    private long noOfRowsReturned;

    private boolean moreRows;

    public QueryResult() {
    }

    public QueryResult(
           java.lang.String html,
           long noOfRowsReturned,
           boolean moreRows) {
        this.html = html;
        this.noOfRowsReturned = noOfRowsReturned;
        this.moreRows = moreRows;
    }


    /**
     * Gets the html value for this QueryResult.
     * 
     * @return html
     */
    public java.lang.String getHtml() {
        return html;
    }


    /**
     * Sets the html value for this QueryResult.
     * 
     * @param html
     */
    public void setHtml(java.lang.String html) {
        this.html = html;
    }


    /**
     * Gets the noOfRowsReturned value for this QueryResult.
     * 
     * @return noOfRowsReturned
     */
    public long getNoOfRowsReturned() {
        return noOfRowsReturned;
    }


    /**
     * Sets the noOfRowsReturned value for this QueryResult.
     * 
     * @param noOfRowsReturned
     */
    public void setNoOfRowsReturned(long noOfRowsReturned) {
        this.noOfRowsReturned = noOfRowsReturned;
    }


    /**
     * Gets the moreRows value for this QueryResult.
     * 
     * @return moreRows
     */
    public boolean isMoreRows() {
        return moreRows;
    }


    /**
     * Sets the moreRows value for this QueryResult.
     * 
     * @param moreRows
     */
    public void setMoreRows(boolean moreRows) {
        this.moreRows = moreRows;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryResult)) return false;
        QueryResult other = (QueryResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.html==null && other.getHtml()==null) || 
             (this.html!=null &&
              this.html.equals(other.getHtml()))) &&
            this.noOfRowsReturned == other.getNoOfRowsReturned() &&
            this.moreRows == other.isMoreRows();
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
        if (getHtml() != null) {
            _hashCode += getHtml().hashCode();
        }
        _hashCode += new Long(getNoOfRowsReturned()).hashCode();
        _hashCode += (isMoreRows() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/ap209_multidisciplinary_analysis_and_design_mim_lf/SimDMobjectViewerQuerySchema", "QueryResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("html");
        elemField.setXmlName(new javax.xml.namespace.QName("", "html"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noOfRowsReturned");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noOfRowsReturned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moreRows");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moreRows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
