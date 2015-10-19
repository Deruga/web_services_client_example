/**
 * QuerySpecification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jotne.epmtech.ap209_multidisciplinary_analysis_and_design_mim_lf.SimDMobjectViewerQuerySchema;

public class QuerySpecification  extends com.jotne.epmtech.ap209_multidisciplinary_analysis_and_design_mim_lf.SimDMobjectViewerQuerySchema.EDMbaseEntity  implements java.io.Serializable {
    private java.lang.String name;

    private boolean use2InputParameters;

    private java.lang.String field_1_explanation;

    private java.lang.String field_2_explanation;

    private boolean useMaxMinButtons;

    private java.lang.String surveyOverUpperText;

    private java.lang.String surveyOverlowerText;

    public QuerySpecification() {
    }

    public QuerySpecification(
           java.lang.String name,
           boolean use2InputParameters,
           java.lang.String field_1_explanation,
           java.lang.String field_2_explanation,
           boolean useMaxMinButtons,
           java.lang.String surveyOverUpperText,
           java.lang.String surveyOverlowerText) {
        this.name = name;
        this.use2InputParameters = use2InputParameters;
        this.field_1_explanation = field_1_explanation;
        this.field_2_explanation = field_2_explanation;
        this.useMaxMinButtons = useMaxMinButtons;
        this.surveyOverUpperText = surveyOverUpperText;
        this.surveyOverlowerText = surveyOverlowerText;
    }


    /**
     * Gets the name value for this QuerySpecification.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this QuerySpecification.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the use2InputParameters value for this QuerySpecification.
     * 
     * @return use2InputParameters
     */
    public boolean isUse2InputParameters() {
        return use2InputParameters;
    }


    /**
     * Sets the use2InputParameters value for this QuerySpecification.
     * 
     * @param use2InputParameters
     */
    public void setUse2InputParameters(boolean use2InputParameters) {
        this.use2InputParameters = use2InputParameters;
    }


    /**
     * Gets the field_1_explanation value for this QuerySpecification.
     * 
     * @return field_1_explanation
     */
    public java.lang.String getField_1_explanation() {
        return field_1_explanation;
    }


    /**
     * Sets the field_1_explanation value for this QuerySpecification.
     * 
     * @param field_1_explanation
     */
    public void setField_1_explanation(java.lang.String field_1_explanation) {
        this.field_1_explanation = field_1_explanation;
    }


    /**
     * Gets the field_2_explanation value for this QuerySpecification.
     * 
     * @return field_2_explanation
     */
    public java.lang.String getField_2_explanation() {
        return field_2_explanation;
    }


    /**
     * Sets the field_2_explanation value for this QuerySpecification.
     * 
     * @param field_2_explanation
     */
    public void setField_2_explanation(java.lang.String field_2_explanation) {
        this.field_2_explanation = field_2_explanation;
    }


    /**
     * Gets the useMaxMinButtons value for this QuerySpecification.
     * 
     * @return useMaxMinButtons
     */
    public boolean isUseMaxMinButtons() {
        return useMaxMinButtons;
    }


    /**
     * Sets the useMaxMinButtons value for this QuerySpecification.
     * 
     * @param useMaxMinButtons
     */
    public void setUseMaxMinButtons(boolean useMaxMinButtons) {
        this.useMaxMinButtons = useMaxMinButtons;
    }


    /**
     * Gets the surveyOverUpperText value for this QuerySpecification.
     * 
     * @return surveyOverUpperText
     */
    public java.lang.String getSurveyOverUpperText() {
        return surveyOverUpperText;
    }


    /**
     * Sets the surveyOverUpperText value for this QuerySpecification.
     * 
     * @param surveyOverUpperText
     */
    public void setSurveyOverUpperText(java.lang.String surveyOverUpperText) {
        this.surveyOverUpperText = surveyOverUpperText;
    }


    /**
     * Gets the surveyOverlowerText value for this QuerySpecification.
     * 
     * @return surveyOverlowerText
     */
    public java.lang.String getSurveyOverlowerText() {
        return surveyOverlowerText;
    }


    /**
     * Sets the surveyOverlowerText value for this QuerySpecification.
     * 
     * @param surveyOverlowerText
     */
    public void setSurveyOverlowerText(java.lang.String surveyOverlowerText) {
        this.surveyOverlowerText = surveyOverlowerText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuerySpecification)) return false;
        QuerySpecification other = (QuerySpecification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.use2InputParameters == other.isUse2InputParameters() &&
            ((this.field_1_explanation==null && other.getField_1_explanation()==null) || 
             (this.field_1_explanation!=null &&
              this.field_1_explanation.equals(other.getField_1_explanation()))) &&
            ((this.field_2_explanation==null && other.getField_2_explanation()==null) || 
             (this.field_2_explanation!=null &&
              this.field_2_explanation.equals(other.getField_2_explanation()))) &&
            this.useMaxMinButtons == other.isUseMaxMinButtons() &&
            ((this.surveyOverUpperText==null && other.getSurveyOverUpperText()==null) || 
             (this.surveyOverUpperText!=null &&
              this.surveyOverUpperText.equals(other.getSurveyOverUpperText()))) &&
            ((this.surveyOverlowerText==null && other.getSurveyOverlowerText()==null) || 
             (this.surveyOverlowerText!=null &&
              this.surveyOverlowerText.equals(other.getSurveyOverlowerText())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += (isUse2InputParameters() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getField_1_explanation() != null) {
            _hashCode += getField_1_explanation().hashCode();
        }
        if (getField_2_explanation() != null) {
            _hashCode += getField_2_explanation().hashCode();
        }
        _hashCode += (isUseMaxMinButtons() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSurveyOverUpperText() != null) {
            _hashCode += getSurveyOverUpperText().hashCode();
        }
        if (getSurveyOverlowerText() != null) {
            _hashCode += getSurveyOverlowerText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuerySpecification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/ap209_multidisciplinary_analysis_and_design_mim_lf/SimDMobjectViewerQuerySchema", "QuerySpecification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("use2InputParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "use2inputParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("field_1_explanation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "field_1_explanation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("field_2_explanation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "field_2_explanation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useMaxMinButtons");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useMaxMinButtons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surveyOverUpperText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "surveyOverUpperText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surveyOverlowerText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "surveyOverlowerText"));
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
