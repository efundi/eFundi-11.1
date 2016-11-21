/**
 * ModuleInformationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation;

public class ModuleInformationType  implements java.io.Serializable {
    private java.lang.Integer moduleAPID;

    private java.lang.String course;

    private java.lang.String courseLevel;

    private java.lang.String module;

    private java.lang.Integer nameType;

    private java.lang.String moduleName;

    private java.lang.Integer readLimit;

    private java.lang.String methodOfDeliveryCode;

    private java.lang.String presentationCategoryCode;

    private java.lang.String modulePeriodCode;

    private java.lang.String presentationOpportunityCode;

    private java.util.Date startDate;

    private java.util.Date endDate;

    public ModuleInformationType() {
    }

    public ModuleInformationType(
           java.lang.Integer moduleAPID,
           java.lang.String course,
           java.lang.String courseLevel,
           java.lang.String module,
           java.lang.Integer nameType,
           java.lang.String moduleName,
           java.lang.Integer readLimit,
           java.lang.String methodOfDeliveryCode,
           java.lang.String presentationCategoryCode,
           java.lang.String modulePeriodCode,
           java.lang.String presentationOpportunityCode,
           java.util.Date startDate,
           java.util.Date endDate) {
           this.moduleAPID = moduleAPID;
           this.course = course;
           this.courseLevel = courseLevel;
           this.module = module;
           this.nameType = nameType;
           this.moduleName = moduleName;
           this.readLimit = readLimit;
           this.methodOfDeliveryCode = methodOfDeliveryCode;
           this.presentationCategoryCode = presentationCategoryCode;
           this.modulePeriodCode = modulePeriodCode;
           this.presentationOpportunityCode = presentationOpportunityCode;
           this.startDate = startDate;
           this.endDate = endDate;
    }


    /**
     * Gets the moduleAPID value for this ModuleInformationType.
     * 
     * @return moduleAPID
     */
    public java.lang.Integer getModuleAPID() {
        return moduleAPID;
    }


    /**
     * Sets the moduleAPID value for this ModuleInformationType.
     * 
     * @param moduleAPID
     */
    public void setModuleAPID(java.lang.Integer moduleAPID) {
        this.moduleAPID = moduleAPID;
    }


    /**
     * Gets the course value for this ModuleInformationType.
     * 
     * @return course
     */
    public java.lang.String getCourse() {
        return course;
    }


    /**
     * Sets the course value for this ModuleInformationType.
     * 
     * @param course
     */
    public void setCourse(java.lang.String course) {
        this.course = course;
    }


    /**
     * Gets the courseLevel value for this ModuleInformationType.
     * 
     * @return courseLevel
     */
    public java.lang.String getCourseLevel() {
        return courseLevel;
    }


    /**
     * Sets the courseLevel value for this ModuleInformationType.
     * 
     * @param courseLevel
     */
    public void setCourseLevel(java.lang.String courseLevel) {
        this.courseLevel = courseLevel;
    }


    /**
     * Gets the module value for this ModuleInformationType.
     * 
     * @return module
     */
    public java.lang.String getModule() {
        return module;
    }


    /**
     * Sets the module value for this ModuleInformationType.
     * 
     * @param module
     */
    public void setModule(java.lang.String module) {
        this.module = module;
    }


    /**
     * Gets the nameType value for this ModuleInformationType.
     * 
     * @return nameType
     */
    public java.lang.Integer getNameType() {
        return nameType;
    }


    /**
     * Sets the nameType value for this ModuleInformationType.
     * 
     * @param nameType
     */
    public void setNameType(java.lang.Integer nameType) {
        this.nameType = nameType;
    }


    /**
     * Gets the moduleName value for this ModuleInformationType.
     * 
     * @return moduleName
     */
    public java.lang.String getModuleName() {
        return moduleName;
    }


    /**
     * Sets the moduleName value for this ModuleInformationType.
     * 
     * @param moduleName
     */
    public void setModuleName(java.lang.String moduleName) {
        this.moduleName = moduleName;
    }


    /**
     * Gets the readLimit value for this ModuleInformationType.
     * 
     * @return readLimit
     */
    public java.lang.Integer getReadLimit() {
        return readLimit;
    }


    /**
     * Sets the readLimit value for this ModuleInformationType.
     * 
     * @param readLimit
     */
    public void setReadLimit(java.lang.Integer readLimit) {
        this.readLimit = readLimit;
    }


    /**
     * Gets the methodOfDeliveryCode value for this ModuleInformationType.
     * 
     * @return methodOfDeliveryCode
     */
    public java.lang.String getMethodOfDeliveryCode() {
        return methodOfDeliveryCode;
    }


    /**
     * Sets the methodOfDeliveryCode value for this ModuleInformationType.
     * 
     * @param methodOfDeliveryCode
     */
    public void setMethodOfDeliveryCode(java.lang.String methodOfDeliveryCode) {
        this.methodOfDeliveryCode = methodOfDeliveryCode;
    }


    /**
     * Gets the presentationCategoryCode value for this ModuleInformationType.
     * 
     * @return presentationCategoryCode
     */
    public java.lang.String getPresentationCategoryCode() {
        return presentationCategoryCode;
    }


    /**
     * Sets the presentationCategoryCode value for this ModuleInformationType.
     * 
     * @param presentationCategoryCode
     */
    public void setPresentationCategoryCode(java.lang.String presentationCategoryCode) {
        this.presentationCategoryCode = presentationCategoryCode;
    }


    /**
     * Gets the modulePeriodCode value for this ModuleInformationType.
     * 
     * @return modulePeriodCode
     */
    public java.lang.String getModulePeriodCode() {
        return modulePeriodCode;
    }


    /**
     * Sets the modulePeriodCode value for this ModuleInformationType.
     * 
     * @param modulePeriodCode
     */
    public void setModulePeriodCode(java.lang.String modulePeriodCode) {
        this.modulePeriodCode = modulePeriodCode;
    }


    /**
     * Gets the presentationOpportunityCode value for this ModuleInformationType.
     * 
     * @return presentationOpportunityCode
     */
    public java.lang.String getPresentationOpportunityCode() {
        return presentationOpportunityCode;
    }


    /**
     * Sets the presentationOpportunityCode value for this ModuleInformationType.
     * 
     * @param presentationOpportunityCode
     */
    public void setPresentationOpportunityCode(java.lang.String presentationOpportunityCode) {
        this.presentationOpportunityCode = presentationOpportunityCode;
    }


    /**
     * Gets the startDate value for this ModuleInformationType.
     * 
     * @return startDate
     */
    public java.util.Date getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ModuleInformationType.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this ModuleInformationType.
     * 
     * @return endDate
     */
    public java.util.Date getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ModuleInformationType.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModuleInformationType)) return false;
        ModuleInformationType other = (ModuleInformationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.moduleAPID==null && other.getModuleAPID()==null) || 
             (this.moduleAPID!=null &&
              this.moduleAPID.equals(other.getModuleAPID()))) &&
            ((this.course==null && other.getCourse()==null) || 
             (this.course!=null &&
              this.course.equals(other.getCourse()))) &&
            ((this.courseLevel==null && other.getCourseLevel()==null) || 
             (this.courseLevel!=null &&
              this.courseLevel.equals(other.getCourseLevel()))) &&
            ((this.module==null && other.getModule()==null) || 
             (this.module!=null &&
              this.module.equals(other.getModule()))) &&
            ((this.nameType==null && other.getNameType()==null) || 
             (this.nameType!=null &&
              this.nameType.equals(other.getNameType()))) &&
            ((this.moduleName==null && other.getModuleName()==null) || 
             (this.moduleName!=null &&
              this.moduleName.equals(other.getModuleName()))) &&
            ((this.readLimit==null && other.getReadLimit()==null) || 
             (this.readLimit!=null &&
              this.readLimit.equals(other.getReadLimit()))) &&
            ((this.methodOfDeliveryCode==null && other.getMethodOfDeliveryCode()==null) || 
             (this.methodOfDeliveryCode!=null &&
              this.methodOfDeliveryCode.equals(other.getMethodOfDeliveryCode()))) &&
            ((this.presentationCategoryCode==null && other.getPresentationCategoryCode()==null) || 
             (this.presentationCategoryCode!=null &&
              this.presentationCategoryCode.equals(other.getPresentationCategoryCode()))) &&
            ((this.modulePeriodCode==null && other.getModulePeriodCode()==null) || 
             (this.modulePeriodCode!=null &&
              this.modulePeriodCode.equals(other.getModulePeriodCode()))) &&
            ((this.presentationOpportunityCode==null && other.getPresentationOpportunityCode()==null) || 
             (this.presentationOpportunityCode!=null &&
              this.presentationOpportunityCode.equals(other.getPresentationOpportunityCode()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getModuleAPID() != null) {
            _hashCode += getModuleAPID().hashCode();
        }
        if (getCourse() != null) {
            _hashCode += getCourse().hashCode();
        }
        if (getCourseLevel() != null) {
            _hashCode += getCourseLevel().hashCode();
        }
        if (getModule() != null) {
            _hashCode += getModule().hashCode();
        }
        if (getNameType() != null) {
            _hashCode += getNameType().hashCode();
        }
        if (getModuleName() != null) {
            _hashCode += getModuleName().hashCode();
        }
        if (getReadLimit() != null) {
            _hashCode += getReadLimit().hashCode();
        }
        if (getMethodOfDeliveryCode() != null) {
            _hashCode += getMethodOfDeliveryCode().hashCode();
        }
        if (getPresentationCategoryCode() != null) {
            _hashCode += getPresentationCategoryCode().hashCode();
        }
        if (getModulePeriodCode() != null) {
            _hashCode += getModulePeriodCode().hashCode();
        }
        if (getPresentationOpportunityCode() != null) {
            _hashCode += getPresentationOpportunityCode().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModuleInformationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "ModuleInformationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleAPID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "moduleAPID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("course");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "course"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courseLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "courseLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("module");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "module"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "nameType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "moduleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "readLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("methodOfDeliveryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "methodOfDeliveryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presentationCategoryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "presentationCategoryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulePeriodCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "modulePeriodCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presentationOpportunityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "presentationOpportunityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
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
