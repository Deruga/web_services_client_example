/**
 * V_node.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL;

public class V_node  extends com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.EDMbaseEntity  implements java.io.Serializable {
    private com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_nodus nodus;

    private java.lang.String id;

    private java.lang.String realization;

    private com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Specified_master_item[] parents;

    private int[] baselines;

    private int[] file_shortcuts;

    private int[] node_shortcuts;

    private int[] back_links;

    private int[] assigned_persons;

    private int[] assigned_organizations;

    private int[] attached_files;

    private int[] assigned_approvals;

    private int[] assigned_properties;

    private int[] tasks;

    public V_node() {
    }

    public V_node(
           com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_nodus nodus,
           java.lang.String id,
           java.lang.String realization,
           com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Specified_master_item[] parents,
           int[] baselines,
           int[] file_shortcuts,
           int[] node_shortcuts,
           int[] back_links,
           int[] assigned_persons,
           int[] assigned_organizations,
           int[] attached_files,
           int[] assigned_approvals,
           int[] assigned_properties,
           int[] tasks) {
        this.nodus = nodus;
        this.id = id;
        this.realization = realization;
        this.parents = parents;
        this.baselines = baselines;
        this.file_shortcuts = file_shortcuts;
        this.node_shortcuts = node_shortcuts;
        this.back_links = back_links;
        this.assigned_persons = assigned_persons;
        this.assigned_organizations = assigned_organizations;
        this.attached_files = attached_files;
        this.assigned_approvals = assigned_approvals;
        this.assigned_properties = assigned_properties;
        this.tasks = tasks;
    }


    /**
     * Gets the nodus value for this V_node.
     * 
     * @return nodus
     */
    public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_nodus getNodus() {
        return nodus;
    }


    /**
     * Sets the nodus value for this V_node.
     * 
     * @param nodus
     */
    public void setNodus(com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.V_nodus nodus) {
        this.nodus = nodus;
    }


    /**
     * Gets the id value for this V_node.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this V_node.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the realization value for this V_node.
     * 
     * @return realization
     */
    public java.lang.String getRealization() {
        return realization;
    }


    /**
     * Sets the realization value for this V_node.
     * 
     * @param realization
     */
    public void setRealization(java.lang.String realization) {
        this.realization = realization;
    }


    /**
     * Gets the parents value for this V_node.
     * 
     * @return parents
     */
    public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Specified_master_item[] getParents() {
        return parents;
    }


    /**
     * Sets the parents value for this V_node.
     * 
     * @param parents
     */
    public void setParents(com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Specified_master_item[] parents) {
        this.parents = parents;
    }

    public com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Specified_master_item getParents(int i) {
        return this.parents[i];
    }

    public void setParents(int i, com.jotne.epmtech.SIMDM_MASTER.SIMDM_MASTER_WSDL.Specified_master_item _value) {
        this.parents[i] = _value;
    }


    /**
     * Gets the baselines value for this V_node.
     * 
     * @return baselines
     */
    public int[] getBaselines() {
        return baselines;
    }


    /**
     * Sets the baselines value for this V_node.
     * 
     * @param baselines
     */
    public void setBaselines(int[] baselines) {
        this.baselines = baselines;
    }

    public int getBaselines(int i) {
        return this.baselines[i];
    }

    public void setBaselines(int i, int _value) {
        this.baselines[i] = _value;
    }


    /**
     * Gets the file_shortcuts value for this V_node.
     * 
     * @return file_shortcuts
     */
    public int[] getFile_shortcuts() {
        return file_shortcuts;
    }


    /**
     * Sets the file_shortcuts value for this V_node.
     * 
     * @param file_shortcuts
     */
    public void setFile_shortcuts(int[] file_shortcuts) {
        this.file_shortcuts = file_shortcuts;
    }

    public int getFile_shortcuts(int i) {
        return this.file_shortcuts[i];
    }

    public void setFile_shortcuts(int i, int _value) {
        this.file_shortcuts[i] = _value;
    }


    /**
     * Gets the node_shortcuts value for this V_node.
     * 
     * @return node_shortcuts
     */
    public int[] getNode_shortcuts() {
        return node_shortcuts;
    }


    /**
     * Sets the node_shortcuts value for this V_node.
     * 
     * @param node_shortcuts
     */
    public void setNode_shortcuts(int[] node_shortcuts) {
        this.node_shortcuts = node_shortcuts;
    }

    public int getNode_shortcuts(int i) {
        return this.node_shortcuts[i];
    }

    public void setNode_shortcuts(int i, int _value) {
        this.node_shortcuts[i] = _value;
    }


    /**
     * Gets the back_links value for this V_node.
     * 
     * @return back_links
     */
    public int[] getBack_links() {
        return back_links;
    }


    /**
     * Sets the back_links value for this V_node.
     * 
     * @param back_links
     */
    public void setBack_links(int[] back_links) {
        this.back_links = back_links;
    }

    public int getBack_links(int i) {
        return this.back_links[i];
    }

    public void setBack_links(int i, int _value) {
        this.back_links[i] = _value;
    }


    /**
     * Gets the assigned_persons value for this V_node.
     * 
     * @return assigned_persons
     */
    public int[] getAssigned_persons() {
        return assigned_persons;
    }


    /**
     * Sets the assigned_persons value for this V_node.
     * 
     * @param assigned_persons
     */
    public void setAssigned_persons(int[] assigned_persons) {
        this.assigned_persons = assigned_persons;
    }

    public int getAssigned_persons(int i) {
        return this.assigned_persons[i];
    }

    public void setAssigned_persons(int i, int _value) {
        this.assigned_persons[i] = _value;
    }


    /**
     * Gets the assigned_organizations value for this V_node.
     * 
     * @return assigned_organizations
     */
    public int[] getAssigned_organizations() {
        return assigned_organizations;
    }


    /**
     * Sets the assigned_organizations value for this V_node.
     * 
     * @param assigned_organizations
     */
    public void setAssigned_organizations(int[] assigned_organizations) {
        this.assigned_organizations = assigned_organizations;
    }

    public int getAssigned_organizations(int i) {
        return this.assigned_organizations[i];
    }

    public void setAssigned_organizations(int i, int _value) {
        this.assigned_organizations[i] = _value;
    }


    /**
     * Gets the attached_files value for this V_node.
     * 
     * @return attached_files
     */
    public int[] getAttached_files() {
        return attached_files;
    }


    /**
     * Sets the attached_files value for this V_node.
     * 
     * @param attached_files
     */
    public void setAttached_files(int[] attached_files) {
        this.attached_files = attached_files;
    }

    public int getAttached_files(int i) {
        return this.attached_files[i];
    }

    public void setAttached_files(int i, int _value) {
        this.attached_files[i] = _value;
    }


    /**
     * Gets the assigned_approvals value for this V_node.
     * 
     * @return assigned_approvals
     */
    public int[] getAssigned_approvals() {
        return assigned_approvals;
    }


    /**
     * Sets the assigned_approvals value for this V_node.
     * 
     * @param assigned_approvals
     */
    public void setAssigned_approvals(int[] assigned_approvals) {
        this.assigned_approvals = assigned_approvals;
    }

    public int getAssigned_approvals(int i) {
        return this.assigned_approvals[i];
    }

    public void setAssigned_approvals(int i, int _value) {
        this.assigned_approvals[i] = _value;
    }


    /**
     * Gets the assigned_properties value for this V_node.
     * 
     * @return assigned_properties
     */
    public int[] getAssigned_properties() {
        return assigned_properties;
    }


    /**
     * Sets the assigned_properties value for this V_node.
     * 
     * @param assigned_properties
     */
    public void setAssigned_properties(int[] assigned_properties) {
        this.assigned_properties = assigned_properties;
    }

    public int getAssigned_properties(int i) {
        return this.assigned_properties[i];
    }

    public void setAssigned_properties(int i, int _value) {
        this.assigned_properties[i] = _value;
    }


    /**
     * Gets the tasks value for this V_node.
     * 
     * @return tasks
     */
    public int[] getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this V_node.
     * 
     * @param tasks
     */
    public void setTasks(int[] tasks) {
        this.tasks = tasks;
    }

    public int getTasks(int i) {
        return this.tasks[i];
    }

    public void setTasks(int i, int _value) {
        this.tasks[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof V_node)) return false;
        V_node other = (V_node) obj;
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
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.realization==null && other.getRealization()==null) || 
             (this.realization!=null &&
              this.realization.equals(other.getRealization()))) &&
            ((this.parents==null && other.getParents()==null) || 
             (this.parents!=null &&
              java.util.Arrays.equals(this.parents, other.getParents()))) &&
            ((this.baselines==null && other.getBaselines()==null) || 
             (this.baselines!=null &&
              java.util.Arrays.equals(this.baselines, other.getBaselines()))) &&
            ((this.file_shortcuts==null && other.getFile_shortcuts()==null) || 
             (this.file_shortcuts!=null &&
              java.util.Arrays.equals(this.file_shortcuts, other.getFile_shortcuts()))) &&
            ((this.node_shortcuts==null && other.getNode_shortcuts()==null) || 
             (this.node_shortcuts!=null &&
              java.util.Arrays.equals(this.node_shortcuts, other.getNode_shortcuts()))) &&
            ((this.back_links==null && other.getBack_links()==null) || 
             (this.back_links!=null &&
              java.util.Arrays.equals(this.back_links, other.getBack_links()))) &&
            ((this.assigned_persons==null && other.getAssigned_persons()==null) || 
             (this.assigned_persons!=null &&
              java.util.Arrays.equals(this.assigned_persons, other.getAssigned_persons()))) &&
            ((this.assigned_organizations==null && other.getAssigned_organizations()==null) || 
             (this.assigned_organizations!=null &&
              java.util.Arrays.equals(this.assigned_organizations, other.getAssigned_organizations()))) &&
            ((this.attached_files==null && other.getAttached_files()==null) || 
             (this.attached_files!=null &&
              java.util.Arrays.equals(this.attached_files, other.getAttached_files()))) &&
            ((this.assigned_approvals==null && other.getAssigned_approvals()==null) || 
             (this.assigned_approvals!=null &&
              java.util.Arrays.equals(this.assigned_approvals, other.getAssigned_approvals()))) &&
            ((this.assigned_properties==null && other.getAssigned_properties()==null) || 
             (this.assigned_properties!=null &&
              java.util.Arrays.equals(this.assigned_properties, other.getAssigned_properties()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              java.util.Arrays.equals(this.tasks, other.getTasks())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getRealization() != null) {
            _hashCode += getRealization().hashCode();
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
        if (getBaselines() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBaselines());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBaselines(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFile_shortcuts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFile_shortcuts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFile_shortcuts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNode_shortcuts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNode_shortcuts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNode_shortcuts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBack_links() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBack_links());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBack_links(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAssigned_persons() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssigned_persons());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssigned_persons(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAssigned_organizations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssigned_organizations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssigned_organizations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAttached_files() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttached_files());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttached_files(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAssigned_approvals() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssigned_approvals());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssigned_approvals(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAssigned_properties() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssigned_properties());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssigned_properties(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTasks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTasks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTasks(), i);
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
        new org.apache.axis.description.TypeDesc(V_node.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "v_node"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nodus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "v_nodus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realization");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parents");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://epmtech.jotne.com/SIMDM_MASTER/SIMDM_MASTER_WSDL", "specified_master_item"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baselines");
        elemField.setXmlName(new javax.xml.namespace.QName("", "baselines"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file_shortcuts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "file_shortcuts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("node_shortcuts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "node_shortcuts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("back_links");
        elemField.setXmlName(new javax.xml.namespace.QName("", "back_links"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigned_persons");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assigned_persons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigned_organizations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assigned_organizations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attached_files");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attached_files"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigned_approvals");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assigned_approvals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigned_properties");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assigned_properties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tasks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tasks"));
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
