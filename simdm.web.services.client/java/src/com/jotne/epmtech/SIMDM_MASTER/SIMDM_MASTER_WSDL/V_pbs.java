/**
 * V_pbs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL;

public class V_pbs  extends com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.EDMbaseEntity  implements java.io.Serializable {
    private com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_nodus nodus;

    private java.lang.String[] parents;

    private long[] persons;

    private long[] organizations;

    private long[] approvals;

    private long[] properties;

    private long[] methods;

    public V_pbs() {
    }

    public V_pbs(
           com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_nodus nodus,
           java.lang.String[] parents,
           long[] persons,
           long[] organizations,
           long[] approvals,
           long[] properties,
           long[] methods) {
        this.nodus = nodus;
        this.parents = parents;
        this.persons = persons;
        this.organizations = organizations;
        this.approvals = approvals;
        this.properties = properties;
        this.methods = methods;
    }


    /**
     * Gets the nodus value for this V_pbs.
     * 
     * @return nodus
     */
    public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_nodus getNodus() {
        return nodus;
    }


    /**
     * Sets the nodus value for this V_pbs.
     * 
     * @param nodus
     */
    public void setNodus(com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_nodus nodus) {
        this.nodus = nodus;
    }


    /**
     * Gets the parents value for this V_pbs.
     * 
     * @return parents
     */
    public java.lang.String[] getParents() {
        return parents;
    }


    /**
     * Sets the parents value for this V_pbs.
     * 
     * @param parents
     */
    public void setParents(java.lang.String[] parents) {
        this.parents = parents;
    }

    public java.lang.String getParents(int i) {
        return this.parents[i];
    }

    public void setParents(int i, java.lang.String _value) {
        this.parents[i] = _value;
    }


    /**
     * Gets the persons value for this V_pbs.
     * 
     * @return persons
     */
    public long[] getPersons() {
        return persons;
    }


    /**
     * Sets the persons value for this V_pbs.
     * 
     * @param persons
     */
    public void setPersons(long[] persons) {
        this.persons = persons;
    }

    public long getPersons(int i) {
        return this.persons[i];
    }

    public void setPersons(int i, long _value) {
        this.persons[i] = _value;
    }


    /**
     * Gets the organizations value for this V_pbs.
     * 
     * @return organizations
     */
    public long[] getOrganizations() {
        return organizations;
    }


    /**
     * Sets the organizations value for this V_pbs.
     * 
     * @param organizations
     */
    public void setOrganizations(long[] organizations) {
        this.organizations = organizations;
    }

    public long getOrganizations(int i) {
        return this.organizations[i];
    }

    public void setOrganizations(int i, long _value) {
        this.organizations[i] = _value;
    }


    /**
     * Gets the approvals value for this V_pbs.
     * 
     * @return approvals
     */
    public long[] getApprovals() {
        return approvals;
    }


    /**
     * Sets the approvals value for this V_pbs.
     * 
     * @param approvals
     */
    public void setApprovals(long[] approvals) {
        this.approvals = approvals;
    }

    public long getApprovals(int i) {
        return this.approvals[i];
    }

    public void setApprovals(int i, long _value) {
        this.approvals[i] = _value;
    }


    /**
     * Gets the properties value for this V_pbs.
     * 
     * @return properties
     */
    public long[] getProperties() {
        return properties;
    }


    /**
     * Sets the properties value for this V_pbs.
     * 
     * @param properties
     */
    public void setProperties(long[] properties) {
        this.properties = properties;
    }

    public long getProperties(int i) {
        return this.properties[i];
    }

    public void setProperties(int i, long _value) {
        this.properties[i] = _value;
    }


    /**
     * Gets the methods value for this V_pbs.
     * 
     * @return methods
     */
    public long[] getMethods() {
        return methods;
    }


    /**
     * Sets the methods value for this V_pbs.
     * 
     * @param methods
     */
    public void setMethods(long[] methods) {
        this.methods = methods;
    }

    public long getMethods(int i) {
        return this.methods[i];
    }

    public void setMethods(int i, long _value) {
        this.methods[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof V_pbs)) return false;
        V_pbs other = (V_pbs) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.nodus==null && other.getNodus()==null) || 
             (this.nodus!=null &&
              this.nodus.equals(other.getNodus()))) &&
            ((this.parents==null && other.getParents()==null) || 
             (this.parents!=null &&
              java.util.Arrays.equals(this.parents, other.getParents()))) &&
            ((this.persons==null && other.getPersons()==null) || 
             (this.persons!=null &&
              java.util.Arrays.equals(this.persons, other.getPersons()))) &&
            ((this.organizations==null && other.getOrganizations()==null) || 
             (this.organizations!=null &&
              java.util.Arrays.equals(this.organizations, other.getOrganizations()))) &&
            ((this.approvals==null && other.getApprovals()==null) || 
             (this.approvals!=null &&
              java.util.Arrays.equals(this.approvals, other.getApprovals()))) &&
            ((this.properties==null && other.getProperties()==null) || 
             (this.properties!=null &&
              java.util.Arrays.equals(this.properties, other.getProperties()))) &&
            ((this.methods==null && other.getMethods()==null) || 
             (this.methods!=null &&
              java.util.Arrays.equals(this.methods, other.getMethods())));
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
        if (getNodus() != null) {
            _hashCode += getNodus().hashCode();
        }
        if (getParents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPersons() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPersons());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPersons(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrganizations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrganizations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrganizations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getMethods() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMethods());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMethods(), i);
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
        new org.apache.axis.description.TypeDesc(V_pbs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "v_pbs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nodus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "v_nodus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parents");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persons");
        elemField.setXmlName(new javax.xml.namespace.QName("", "persons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "organizations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvals");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approvals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("properties");
        elemField.setXmlName(new javax.xml.namespace.QName("", "properties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("methods");
        elemField.setXmlName(new javax.xml.namespace.QName("", "methods"));
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
