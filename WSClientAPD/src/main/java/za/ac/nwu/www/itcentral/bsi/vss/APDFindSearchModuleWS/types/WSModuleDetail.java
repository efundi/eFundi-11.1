/**
 * WSModuleDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package za.ac.nwu.www.itcentral.bsi.vss.APDFindSearchModuleWS.types;

import edu.nwu.sakaistudentlink.ws.BPELBeanDeserializer;

public class WSModuleDetail  implements java.io.Serializable {
    private java.lang.String courseCode;

    private java.lang.String courseLevel;

    private java.lang.String courseModule;

    private java.lang.Integer facultyOU;

    private java.lang.String facultyOUAfrName;

    private java.lang.String facultyOUEngName;

    private java.lang.Integer methodOfDeliveryCode;

    private java.lang.Integer methodOfDeliveryCodeID;

    private java.lang.String methodOfDeliveryName;

    private java.lang.String modPresChangeIND;

    private java.util.Date modPresEndDate;

    private java.lang.String modPresOUCampusDeanName;

    private java.lang.Integer modPresOUCampusDeanUnivNr;

    private java.lang.String modPresOUCampusDirectorName;

    private java.lang.Integer modPresOUCampusDirectorUnivNr;

    private java.util.Date modPresOUCampusEndDate;

    private java.lang.String modPresOUCampusLecturerName;

    private java.lang.String modPresOUCampusLecturerTelMobile;

    private java.lang.String modPresOUCampusLecturerTelOffice;

    private java.lang.Integer modPresOUCampusLecturerUnivNr;

    private java.util.Date modPresOUCampusStartDate;

    private java.lang.String modPresOUChangeIND;

    private java.util.Date modPresStartDate;

    private int moduleAPID;

    private java.lang.String moduleAfrName;

    private java.lang.String moduleChangeIND;

    private java.util.Date moduleEndDate;

    private java.lang.String moduleEngName;

    private java.lang.String modulePeriodChangeIND;

    private java.lang.String modulePeriodCode;

    private java.lang.Integer modulePeriodCodeID;

    private java.util.Date modulePeriodEndDate;

    private java.util.Date modulePeriodStartDate;

    private java.lang.String modulePresentingAfrCampusName;

    private java.lang.Integer modulePresentingCampus;

    private java.lang.String modulePresentingEngCampusName;

    private java.lang.Integer modulePresentingOU;

    private java.lang.String modulePresentingOUAfrName;

    private java.lang.String modulePresentingOUEngName;

    private java.util.Date moduleStartDate;

    private java.lang.Integer presentationCategoryCode;

    private java.lang.Integer presentationCategoryCodeID;

    private java.lang.String presentationCategoryName;

    private java.lang.String presentationOpportunityChangeIND;

    private java.lang.Integer presentationOpportunityCode;

    private java.lang.Integer presentationOpportunityCodeID;

    private java.util.Date presentationOpportunityEndDate;

    private java.util.Date presentationOpportunityStartDate;

    public WSModuleDetail() {
    }

    public WSModuleDetail(
           java.lang.String courseCode,
           java.lang.String courseLevel,
           java.lang.String courseModule,
           java.lang.Integer facultyOU,
           java.lang.String facultyOUAfrName,
           java.lang.String facultyOUEngName,
           java.lang.Integer methodOfDeliveryCode,
           java.lang.Integer methodOfDeliveryCodeID,
           java.lang.String modPresChangeIND,
           java.util.Date modPresEndDate,
           java.lang.String modPresOUCampusDeanName,
           java.lang.Integer modPresOUCampusDeanUnivNr,
           java.lang.String modPresOUCampusDirectorName,
           java.lang.Integer modPresOUCampusDirectorUnivNr,
           java.util.Date modPresOUCampusEndDate,
           java.lang.String modPresOUCampusLecturerName,
           java.lang.String modPresOUCampusLecturerTelMobile,
           java.lang.String modPresOUCampusLecturerTelOffice,
           java.lang.Integer modPresOUCampusLecturerUnivNr,
           java.util.Date modPresOUCampusStartDate,
           java.lang.String modPresOUChangeIND,
           java.util.Date modPresStartDate,
           int moduleAPID,
           java.lang.String moduleAfrName,
           java.lang.String moduleChangeIND,
           java.util.Date moduleEndDate,
           java.lang.String moduleEngName,
           java.lang.String modulePeriodChangeIND,
           java.lang.String modulePeriodCode,
           java.lang.Integer modulePeriodCodeID,
           java.util.Date modulePeriodEndDate,
           java.util.Date modulePeriodStartDate,
           java.lang.String modulePresentingAfrCampusName,
           java.lang.Integer modulePresentingCampus,
           java.lang.String modulePresentingEngCampusName,
           java.lang.Integer modulePresentingOU,
           java.lang.String modulePresentingOUAfrName,
           java.lang.String modulePresentingOUEngName,
           java.util.Date moduleStartDate,
           java.lang.Integer presentationCategoryCode,
           java.lang.Integer presentationCategoryCodeID,
           java.lang.String presentationOpportunityChangeIND,
           java.lang.Integer presentationOpportunityCode,
           java.lang.Integer presentationOpportunityCodeID,
           java.util.Date presentationOpportunityEndDate,
           java.util.Date presentationOpportunityStartDate) {
           this.courseCode = courseCode;
           this.courseLevel = courseLevel;
           this.courseModule = courseModule;
           this.facultyOU = facultyOU;
           this.facultyOUAfrName = facultyOUAfrName;
           this.facultyOUEngName = facultyOUEngName;
           this.methodOfDeliveryCode = methodOfDeliveryCode;
           this.methodOfDeliveryCodeID = methodOfDeliveryCodeID;
           this.modPresChangeIND = modPresChangeIND;
           this.modPresEndDate = modPresEndDate;
           this.modPresOUCampusDeanName = modPresOUCampusDeanName;
           this.modPresOUCampusDeanUnivNr = modPresOUCampusDeanUnivNr;
           this.modPresOUCampusDirectorName = modPresOUCampusDirectorName;
           this.modPresOUCampusDirectorUnivNr = modPresOUCampusDirectorUnivNr;
           this.modPresOUCampusEndDate = modPresOUCampusEndDate;
           this.modPresOUCampusLecturerName = modPresOUCampusLecturerName;
           this.modPresOUCampusLecturerTelMobile = modPresOUCampusLecturerTelMobile;
           this.modPresOUCampusLecturerTelOffice = modPresOUCampusLecturerTelOffice;
           this.modPresOUCampusLecturerUnivNr = modPresOUCampusLecturerUnivNr;
           this.modPresOUCampusStartDate = modPresOUCampusStartDate;
           this.modPresOUChangeIND = modPresOUChangeIND;
           this.modPresStartDate = modPresStartDate;
           this.moduleAPID = moduleAPID;
           this.moduleAfrName = moduleAfrName;
           this.moduleChangeIND = moduleChangeIND;
           this.moduleEndDate = moduleEndDate;
           this.moduleEngName = moduleEngName;
           this.modulePeriodChangeIND = modulePeriodChangeIND;
           this.modulePeriodCode = modulePeriodCode;
           this.modulePeriodCodeID = modulePeriodCodeID;
           this.modulePeriodEndDate = modulePeriodEndDate;
           this.modulePeriodStartDate = modulePeriodStartDate;
           this.modulePresentingAfrCampusName = modulePresentingAfrCampusName;
           this.modulePresentingCampus = modulePresentingCampus;
           this.modulePresentingEngCampusName = modulePresentingEngCampusName;
           this.modulePresentingOU = modulePresentingOU;
           this.modulePresentingOUAfrName = modulePresentingOUAfrName;
           this.modulePresentingOUEngName = modulePresentingOUEngName;
           this.moduleStartDate = moduleStartDate;
           this.presentationCategoryCode = presentationCategoryCode;
           this.presentationCategoryCodeID = presentationCategoryCodeID;
           this.presentationOpportunityChangeIND = presentationOpportunityChangeIND;
           this.presentationOpportunityCode = presentationOpportunityCode;
           this.presentationOpportunityCodeID = presentationOpportunityCodeID;
           this.presentationOpportunityEndDate = presentationOpportunityEndDate;
           this.presentationOpportunityStartDate = presentationOpportunityStartDate;
    }


    /**
     * Gets the courseCode value for this WSModuleDetail.
     * 
     * @return courseCode
     */
    public java.lang.String getCourseCode() {
        return courseCode;
    }


    /**
     * Sets the courseCode value for this WSModuleDetail.
     * 
     * @param courseCode
     */
    public void setCourseCode(java.lang.String courseCode) {
        this.courseCode = courseCode;
    }


    /**
     * Gets the courseLevel value for this WSModuleDetail.
     * 
     * @return courseLevel
     */
    public java.lang.String getCourseLevel() {
        return courseLevel;
    }


    /**
     * Sets the courseLevel value for this WSModuleDetail.
     * 
     * @param courseLevel
     */
    public void setCourseLevel(java.lang.String courseLevel) {
        this.courseLevel = courseLevel;
    }


    /**
     * Gets the courseModule value for this WSModuleDetail.
     * 
     * @return courseModule
     */
    public java.lang.String getCourseModule() {
        return courseModule;
    }


    /**
     * Sets the courseModule value for this WSModuleDetail.
     * 
     * @param courseModule
     */
    public void setCourseModule(java.lang.String courseModule) {
        this.courseModule = courseModule;
    }


    /**
     * Gets the facultyOU value for this WSModuleDetail.
     * 
     * @return facultyOU
     */
    public java.lang.Integer getFacultyOU() {
        return facultyOU;
    }


    /**
     * Sets the facultyOU value for this WSModuleDetail.
     * 
     * @param facultyOU
     */
    public void setFacultyOU(java.lang.Integer facultyOU) {
        this.facultyOU = facultyOU;
    }


    /**
     * Gets the facultyOUAfrName value for this WSModuleDetail.
     * 
     * @return facultyOUAfrName
     */
    public java.lang.String getFacultyOUAfrName() {
        return facultyOUAfrName;
    }


    /**
     * Sets the facultyOUAfrName value for this WSModuleDetail.
     * 
     * @param facultyOUAfrName
     */
    public void setFacultyOUAfrName(java.lang.String facultyOUAfrName) {
        this.facultyOUAfrName = facultyOUAfrName;
    }


    /**
     * Gets the facultyOUEngName value for this WSModuleDetail.
     * 
     * @return facultyOUEngName
     */
    public java.lang.String getFacultyOUEngName() {
        return facultyOUEngName;
    }


    /**
     * Sets the facultyOUEngName value for this WSModuleDetail.
     * 
     * @param facultyOUEngName
     */
    public void setFacultyOUEngName(java.lang.String facultyOUEngName) {
        this.facultyOUEngName = facultyOUEngName;
    }


    /**
     * Gets the methodOfDeliveryCode value for this WSModuleDetail.
     * 
     * @return methodOfDeliveryCode
     */
    public java.lang.Integer getMethodOfDeliveryCode() {
        return methodOfDeliveryCode;
    }


    /**
     * Sets the methodOfDeliveryCode value for this WSModuleDetail.
     * 
     * @param methodOfDeliveryCode
     */
    public void setMethodOfDeliveryCode(java.lang.Integer methodOfDeliveryCode) {
        this.methodOfDeliveryCode = methodOfDeliveryCode;
    }


    /**
     * Gets the methodOfDeliveryCodeID value for this WSModuleDetail.
     * 
     * @return methodOfDeliveryCodeID
     */
    public java.lang.Integer getMethodOfDeliveryCodeID() {
        return methodOfDeliveryCodeID;
    }


    /**
     * Sets the methodOfDeliveryCodeID value for this WSModuleDetail.
     * 
     * @param methodOfDeliveryCodeID
     */
    public void setMethodOfDeliveryCodeID(java.lang.Integer methodOfDeliveryCodeID) {
        this.methodOfDeliveryCodeID = methodOfDeliveryCodeID;
    }


    /**
     * Gets the modPresChangeIND value for this WSModuleDetail.
     * 
     * @return modPresChangeIND
     */
    public java.lang.String getModPresChangeIND() {
        return modPresChangeIND;
    }


    /**
     * Sets the modPresChangeIND value for this WSModuleDetail.
     * 
     * @param modPresChangeIND
     */
    public void setModPresChangeIND(java.lang.String modPresChangeIND) {
        this.modPresChangeIND = modPresChangeIND;
    }


    /**
     * Gets the modPresEndDate value for this WSModuleDetail.
     * 
     * @return modPresEndDate
     */
    public java.util.Date getModPresEndDate() {
        return modPresEndDate;
    }


    /**
     * Sets the modPresEndDate value for this WSModuleDetail.
     * 
     * @param modPresEndDate
     */
    public void setModPresEndDate(java.util.Date modPresEndDate) {
        this.modPresEndDate = modPresEndDate;
    }


    /**
     * Gets the modPresOUCampusDeanName value for this WSModuleDetail.
     * 
     * @return modPresOUCampusDeanName
     */
    public java.lang.String getModPresOUCampusDeanName() {
        return modPresOUCampusDeanName;
    }


    /**
     * Sets the modPresOUCampusDeanName value for this WSModuleDetail.
     * 
     * @param modPresOUCampusDeanName
     */
    public void setModPresOUCampusDeanName(java.lang.String modPresOUCampusDeanName) {
        this.modPresOUCampusDeanName = modPresOUCampusDeanName;
    }


    /**
     * Gets the modPresOUCampusDeanUnivNr value for this WSModuleDetail.
     * 
     * @return modPresOUCampusDeanUnivNr
     */
    public java.lang.Integer getModPresOUCampusDeanUnivNr() {
        return modPresOUCampusDeanUnivNr;
    }


    /**
     * Sets the modPresOUCampusDeanUnivNr value for this WSModuleDetail.
     * 
     * @param modPresOUCampusDeanUnivNr
     */
    public void setModPresOUCampusDeanUnivNr(java.lang.Integer modPresOUCampusDeanUnivNr) {
        this.modPresOUCampusDeanUnivNr = modPresOUCampusDeanUnivNr;
    }


    /**
     * Gets the modPresOUCampusDirectorName value for this WSModuleDetail.
     * 
     * @return modPresOUCampusDirectorName
     */
    public java.lang.String getModPresOUCampusDirectorName() {
        return modPresOUCampusDirectorName;
    }


    /**
     * Sets the modPresOUCampusDirectorName value for this WSModuleDetail.
     * 
     * @param modPresOUCampusDirectorName
     */
    public void setModPresOUCampusDirectorName(java.lang.String modPresOUCampusDirectorName) {
        this.modPresOUCampusDirectorName = modPresOUCampusDirectorName;
    }


    /**
     * Gets the modPresOUCampusDirectorUnivNr value for this WSModuleDetail.
     * 
     * @return modPresOUCampusDirectorUnivNr
     */
    public java.lang.Integer getModPresOUCampusDirectorUnivNr() {
        return modPresOUCampusDirectorUnivNr;
    }


    /**
     * Sets the modPresOUCampusDirectorUnivNr value for this WSModuleDetail.
     * 
     * @param modPresOUCampusDirectorUnivNr
     */
    public void setModPresOUCampusDirectorUnivNr(java.lang.Integer modPresOUCampusDirectorUnivNr) {
        this.modPresOUCampusDirectorUnivNr = modPresOUCampusDirectorUnivNr;
    }


    /**
     * Gets the modPresOUCampusEndDate value for this WSModuleDetail.
     * 
     * @return modPresOUCampusEndDate
     */
    public java.util.Date getModPresOUCampusEndDate() {
        return modPresOUCampusEndDate;
    }


    /**
     * Sets the modPresOUCampusEndDate value for this WSModuleDetail.
     * 
     * @param modPresOUCampusEndDate
     */
    public void setModPresOUCampusEndDate(java.util.Date modPresOUCampusEndDate) {
        this.modPresOUCampusEndDate = modPresOUCampusEndDate;
    }


    /**
     * Gets the modPresOUCampusLecturerName value for this WSModuleDetail.
     * 
     * @return modPresOUCampusLecturerName
     */
    public java.lang.String getModPresOUCampusLecturerName() {
        return modPresOUCampusLecturerName;
    }


    /**
     * Sets the modPresOUCampusLecturerName value for this WSModuleDetail.
     * 
     * @param modPresOUCampusLecturerName
     */
    public void setModPresOUCampusLecturerName(java.lang.String modPresOUCampusLecturerName) {
        this.modPresOUCampusLecturerName = modPresOUCampusLecturerName;
    }


    /**
     * Gets the modPresOUCampusLecturerTelMobile value for this WSModuleDetail.
     * 
     * @return modPresOUCampusLecturerTelMobile
     */
    public java.lang.String getModPresOUCampusLecturerTelMobile() {
        return modPresOUCampusLecturerTelMobile;
    }


    /**
     * Sets the modPresOUCampusLecturerTelMobile value for this WSModuleDetail.
     * 
     * @param modPresOUCampusLecturerTelMobile
     */
    public void setModPresOUCampusLecturerTelMobile(java.lang.String modPresOUCampusLecturerTelMobile) {
        this.modPresOUCampusLecturerTelMobile = modPresOUCampusLecturerTelMobile;
    }


    /**
     * Gets the modPresOUCampusLecturerTelOffice value for this WSModuleDetail.
     * 
     * @return modPresOUCampusLecturerTelOffice
     */
    public java.lang.String getModPresOUCampusLecturerTelOffice() {
        return modPresOUCampusLecturerTelOffice;
    }


    /**
     * Sets the modPresOUCampusLecturerTelOffice value for this WSModuleDetail.
     * 
     * @param modPresOUCampusLecturerTelOffice
     */
    public void setModPresOUCampusLecturerTelOffice(java.lang.String modPresOUCampusLecturerTelOffice) {
        this.modPresOUCampusLecturerTelOffice = modPresOUCampusLecturerTelOffice;
    }


    /**
     * Gets the modPresOUCampusLecturerUnivNr value for this WSModuleDetail.
     * 
     * @return modPresOUCampusLecturerUnivNr
     */
    public java.lang.Integer getModPresOUCampusLecturerUnivNr() {
        return modPresOUCampusLecturerUnivNr;
    }


    /**
     * Sets the modPresOUCampusLecturerUnivNr value for this WSModuleDetail.
     * 
     * @param modPresOUCampusLecturerUnivNr
     */
    public void setModPresOUCampusLecturerUnivNr(java.lang.Integer modPresOUCampusLecturerUnivNr) {
        this.modPresOUCampusLecturerUnivNr = modPresOUCampusLecturerUnivNr;
    }


    /**
     * Gets the modPresOUCampusStartDate value for this WSModuleDetail.
     * 
     * @return modPresOUCampusStartDate
     */
    public java.util.Date getModPresOUCampusStartDate() {
        return modPresOUCampusStartDate;
    }


    /**
     * Sets the modPresOUCampusStartDate value for this WSModuleDetail.
     * 
     * @param modPresOUCampusStartDate
     */
    public void setModPresOUCampusStartDate(java.util.Date modPresOUCampusStartDate) {
        this.modPresOUCampusStartDate = modPresOUCampusStartDate;
    }


    /**
     * Gets the modPresOUChangeIND value for this WSModuleDetail.
     * 
     * @return modPresOUChangeIND
     */
    public java.lang.String getModPresOUChangeIND() {
        return modPresOUChangeIND;
    }


    /**
     * Sets the modPresOUChangeIND value for this WSModuleDetail.
     * 
     * @param modPresOUChangeIND
     */
    public void setModPresOUChangeIND(java.lang.String modPresOUChangeIND) {
        this.modPresOUChangeIND = modPresOUChangeIND;
    }


    /**
     * Gets the modPresStartDate value for this WSModuleDetail.
     * 
     * @return modPresStartDate
     */
    public java.util.Date getModPresStartDate() {
        return modPresStartDate;
    }


    /**
     * Sets the modPresStartDate value for this WSModuleDetail.
     * 
     * @param modPresStartDate
     */
    public void setModPresStartDate(java.util.Date modPresStartDate) {
        this.modPresStartDate = modPresStartDate;
    }


    /**
     * Gets the moduleAPID value for this WSModuleDetail.
     * 
     * @return moduleAPID
     */
    public int getModuleAPID() {
        return moduleAPID;
    }


    /**
     * Sets the moduleAPID value for this WSModuleDetail.
     * 
     * @param moduleAPID
     */
    public void setModuleAPID(int moduleAPID) {
        this.moduleAPID = moduleAPID;
    }


    /**
     * Gets the moduleAfrName value for this WSModuleDetail.
     * 
     * @return moduleAfrName
     */
    public java.lang.String getModuleAfrName() {
        return moduleAfrName;
    }


    /**
     * Sets the moduleAfrName value for this WSModuleDetail.
     * 
     * @param moduleAfrName
     */
    public void setModuleAfrName(java.lang.String moduleAfrName) {
        this.moduleAfrName = moduleAfrName;
    }


    /**
     * Gets the moduleChangeIND value for this WSModuleDetail.
     * 
     * @return moduleChangeIND
     */
    public java.lang.String getModuleChangeIND() {
        return moduleChangeIND;
    }


    /**
     * Sets the moduleChangeIND value for this WSModuleDetail.
     * 
     * @param moduleChangeIND
     */
    public void setModuleChangeIND(java.lang.String moduleChangeIND) {
        this.moduleChangeIND = moduleChangeIND;
    }


    /**
     * Gets the moduleEndDate value for this WSModuleDetail.
     * 
     * @return moduleEndDate
     */
    public java.util.Date getModuleEndDate() {
        return moduleEndDate;
    }


    /**
     * Sets the moduleEndDate value for this WSModuleDetail.
     * 
     * @param moduleEndDate
     */
    public void setModuleEndDate(java.util.Date moduleEndDate) {
        this.moduleEndDate = moduleEndDate;
    }


    /**
     * Gets the moduleEngName value for this WSModuleDetail.
     * 
     * @return moduleEngName
     */
    public java.lang.String getModuleEngName() {
        return moduleEngName;
    }


    /**
     * Sets the moduleEngName value for this WSModuleDetail.
     * 
     * @param moduleEngName
     */
    public void setModuleEngName(java.lang.String moduleEngName) {
        this.moduleEngName = moduleEngName;
    }


    /**
     * Gets the modulePeriodChangeIND value for this WSModuleDetail.
     * 
     * @return modulePeriodChangeIND
     */
    public java.lang.String getModulePeriodChangeIND() {
        return modulePeriodChangeIND;
    }


    /**
     * Sets the modulePeriodChangeIND value for this WSModuleDetail.
     * 
     * @param modulePeriodChangeIND
     */
    public void setModulePeriodChangeIND(java.lang.String modulePeriodChangeIND) {
        this.modulePeriodChangeIND = modulePeriodChangeIND;
    }


    /**
     * Gets the modulePeriodCode value for this WSModuleDetail.
     * 
     * @return modulePeriodCode
     */
    public java.lang.String getModulePeriodCode() {
        return modulePeriodCode;
    }


    /**
     * Sets the modulePeriodCode value for this WSModuleDetail.
     * 
     * @param modulePeriodCode
     */
    public void setModulePeriodCode(java.lang.String modulePeriodCode) {
        this.modulePeriodCode = modulePeriodCode;
    }


    /**
     * Gets the modulePeriodCodeID value for this WSModuleDetail.
     * 
     * @return modulePeriodCodeID
     */
    public java.lang.Integer getModulePeriodCodeID() {
        return modulePeriodCodeID;
    }


    /**
     * Sets the modulePeriodCodeID value for this WSModuleDetail.
     * 
     * @param modulePeriodCodeID
     */
    public void setModulePeriodCodeID(java.lang.Integer modulePeriodCodeID) {
        this.modulePeriodCodeID = modulePeriodCodeID;
    }


    /**
     * Gets the modulePeriodEndDate value for this WSModuleDetail.
     * 
     * @return modulePeriodEndDate
     */
    public java.util.Date getModulePeriodEndDate() {
        return modulePeriodEndDate;
    }


    /**
     * Sets the modulePeriodEndDate value for this WSModuleDetail.
     * 
     * @param modulePeriodEndDate
     */
    public void setModulePeriodEndDate(java.util.Date modulePeriodEndDate) {
        this.modulePeriodEndDate = modulePeriodEndDate;
    }


    /**
     * Gets the modulePeriodStartDate value for this WSModuleDetail.
     * 
     * @return modulePeriodStartDate
     */
    public java.util.Date getModulePeriodStartDate() {
        return modulePeriodStartDate;
    }


    /**
     * Sets the modulePeriodStartDate value for this WSModuleDetail.
     * 
     * @param modulePeriodStartDate
     */
    public void setModulePeriodStartDate(java.util.Date modulePeriodStartDate) {
        this.modulePeriodStartDate = modulePeriodStartDate;
    }


    /**
     * Gets the modulePresentingAfrCampusName value for this WSModuleDetail.
     * 
     * @return modulePresentingAfrCampusName
     */
    public java.lang.String getModulePresentingAfrCampusName() {
        return modulePresentingAfrCampusName;
    }


    /**
     * Sets the modulePresentingAfrCampusName value for this WSModuleDetail.
     * 
     * @param modulePresentingAfrCampusName
     */
    public void setModulePresentingAfrCampusName(java.lang.String modulePresentingAfrCampusName) {
        this.modulePresentingAfrCampusName = modulePresentingAfrCampusName;
    }


    /**
     * Gets the modulePresentingCampus value for this WSModuleDetail.
     * 
     * @return modulePresentingCampus
     */
    public java.lang.Integer getModulePresentingCampus() {
        return modulePresentingCampus;
    }


    /**
     * Sets the modulePresentingCampus value for this WSModuleDetail.
     * 
     * @param modulePresentingCampus
     */
    public void setModulePresentingCampus(java.lang.Integer modulePresentingCampus) {
        this.modulePresentingCampus = modulePresentingCampus;
    }


    /**
     * Gets the modulePresentingEngCampusName value for this WSModuleDetail.
     * 
     * @return modulePresentingEngCampusName
     */
    public java.lang.String getModulePresentingEngCampusName() {
        return modulePresentingEngCampusName;
    }


    /**
     * Sets the modulePresentingEngCampusName value for this WSModuleDetail.
     * 
     * @param modulePresentingEngCampusName
     */
    public void setModulePresentingEngCampusName(java.lang.String modulePresentingEngCampusName) {
        this.modulePresentingEngCampusName = modulePresentingEngCampusName;
    }


    /**
     * Gets the modulePresentingOU value for this WSModuleDetail.
     * 
     * @return modulePresentingOU
     */
    public java.lang.Integer getModulePresentingOU() {
        return modulePresentingOU;
    }


    /**
     * Sets the modulePresentingOU value for this WSModuleDetail.
     * 
     * @param modulePresentingOU
     */
    public void setModulePresentingOU(java.lang.Integer modulePresentingOU) {
        this.modulePresentingOU = modulePresentingOU;
    }


    /**
     * Gets the modulePresentingOUAfrName value for this WSModuleDetail.
     * 
     * @return modulePresentingOUAfrName
     */
    public java.lang.String getModulePresentingOUAfrName() {
        return modulePresentingOUAfrName;
    }


    /**
     * Sets the modulePresentingOUAfrName value for this WSModuleDetail.
     * 
     * @param modulePresentingOUAfrName
     */
    public void setModulePresentingOUAfrName(java.lang.String modulePresentingOUAfrName) {
        this.modulePresentingOUAfrName = modulePresentingOUAfrName;
    }


    /**
     * Gets the modulePresentingOUEngName value for this WSModuleDetail.
     * 
     * @return modulePresentingOUEngName
     */
    public java.lang.String getModulePresentingOUEngName() {
        return modulePresentingOUEngName;
    }


    /**
     * Sets the modulePresentingOUEngName value for this WSModuleDetail.
     * 
     * @param modulePresentingOUEngName
     */
    public void setModulePresentingOUEngName(java.lang.String modulePresentingOUEngName) {
        this.modulePresentingOUEngName = modulePresentingOUEngName;
    }


    /**
     * Gets the moduleStartDate value for this WSModuleDetail.
     * 
     * @return moduleStartDate
     */
    public java.util.Date getModuleStartDate() {
        return moduleStartDate;
    }


    /**
     * Sets the moduleStartDate value for this WSModuleDetail.
     * 
     * @param moduleStartDate
     */
    public void setModuleStartDate(java.util.Date moduleStartDate) {
        this.moduleStartDate = moduleStartDate;
    }


    /**
     * Gets the presentationCategoryCode value for this WSModuleDetail.
     * 
     * @return presentationCategoryCode
     */
    public java.lang.Integer getPresentationCategoryCode() {
        return presentationCategoryCode;
    }


    /**
     * Sets the presentationCategoryCode value for this WSModuleDetail.
     * 
     * @param presentationCategoryCode
     */
    public void setPresentationCategoryCode(java.lang.Integer presentationCategoryCode) {
        this.presentationCategoryCode = presentationCategoryCode;
    }


    /**
     * Gets the presentationCategoryCodeID value for this WSModuleDetail.
     * 
     * @return presentationCategoryCodeID
     */
    public java.lang.Integer getPresentationCategoryCodeID() {
        return presentationCategoryCodeID;
    }


    /**
     * Sets the presentationCategoryCodeID value for this WSModuleDetail.
     * 
     * @param presentationCategoryCodeID
     */
    public void setPresentationCategoryCodeID(java.lang.Integer presentationCategoryCodeID) {
        this.presentationCategoryCodeID = presentationCategoryCodeID;
    }


    /**
     * Gets the presentationOpportunityChangeIND value for this WSModuleDetail.
     * 
     * @return presentationOpportunityChangeIND
     */
    public java.lang.String getPresentationOpportunityChangeIND() {
        return presentationOpportunityChangeIND;
    }


    /**
     * Sets the presentationOpportunityChangeIND value for this WSModuleDetail.
     * 
     * @param presentationOpportunityChangeIND
     */
    public void setPresentationOpportunityChangeIND(java.lang.String presentationOpportunityChangeIND) {
        this.presentationOpportunityChangeIND = presentationOpportunityChangeIND;
    }


    /**
     * Gets the presentationOpportunityCode value for this WSModuleDetail.
     * 
     * @return presentationOpportunityCode
     */
    public java.lang.Integer getPresentationOpportunityCode() {
        return presentationOpportunityCode;
    }


    /**
     * Sets the presentationOpportunityCode value for this WSModuleDetail.
     * 
     * @param presentationOpportunityCode
     */
    public void setPresentationOpportunityCode(java.lang.Integer presentationOpportunityCode) {
        this.presentationOpportunityCode = presentationOpportunityCode;
    }


    /**
     * Gets the presentationOpportunityCodeID value for this WSModuleDetail.
     * 
     * @return presentationOpportunityCodeID
     */
    public java.lang.Integer getPresentationOpportunityCodeID() {
        return presentationOpportunityCodeID;
    }


    /**
     * Sets the presentationOpportunityCodeID value for this WSModuleDetail.
     * 
     * @param presentationOpportunityCodeID
     */
    public void setPresentationOpportunityCodeID(java.lang.Integer presentationOpportunityCodeID) {
        this.presentationOpportunityCodeID = presentationOpportunityCodeID;
    }


    /**
     * Gets the presentationOpportunityEndDate value for this WSModuleDetail.
     * 
     * @return presentationOpportunityEndDate
     */
    public java.util.Date getPresentationOpportunityEndDate() {
        return presentationOpportunityEndDate;
    }


    /**
     * Sets the presentationOpportunityEndDate value for this WSModuleDetail.
     * 
     * @param presentationOpportunityEndDate
     */
    public void setPresentationOpportunityEndDate(java.util.Date presentationOpportunityEndDate) {
        this.presentationOpportunityEndDate = presentationOpportunityEndDate;
    }


    /**
     * Gets the presentationOpportunityStartDate value for this WSModuleDetail.
     * 
     * @return presentationOpportunityStartDate
     */
    public java.util.Date getPresentationOpportunityStartDate() {
        return presentationOpportunityStartDate;
    }


    /**
     * Sets the presentationOpportunityStartDate value for this WSModuleDetail.
     * 
     * @param presentationOpportunityStartDate
     */
    public void setPresentationOpportunityStartDate(java.util.Date presentationOpportunityStartDate) {
        this.presentationOpportunityStartDate = presentationOpportunityStartDate;
    }
    
    
    
    public java.lang.String getMethodOfDeliveryName() {
		return methodOfDeliveryName;
	}

	public void setMethodOfDeliveryName(java.lang.String methodOfDeliveryName) {
		this.methodOfDeliveryName = methodOfDeliveryName;
	}

	public java.lang.String getPresentationCategoryName() {
		return presentationCategoryName;
	}

	public void setPresentationCategoryName(java.lang.String presentationCategoryName) {
		this.presentationCategoryName = presentationCategoryName;
	}



	private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSModuleDetail)) return false;
        WSModuleDetail other = (WSModuleDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.courseCode==null && other.getCourseCode()==null) || 
             (this.courseCode!=null &&
              this.courseCode.equals(other.getCourseCode()))) &&
            ((this.courseLevel==null && other.getCourseLevel()==null) || 
             (this.courseLevel!=null &&
              this.courseLevel.equals(other.getCourseLevel()))) &&
            ((this.courseModule==null && other.getCourseModule()==null) || 
             (this.courseModule!=null &&
              this.courseModule.equals(other.getCourseModule()))) &&
            ((this.facultyOU==null && other.getFacultyOU()==null) || 
             (this.facultyOU!=null &&
              this.facultyOU.equals(other.getFacultyOU()))) &&
            ((this.facultyOUAfrName==null && other.getFacultyOUAfrName()==null) || 
             (this.facultyOUAfrName!=null &&
              this.facultyOUAfrName.equals(other.getFacultyOUAfrName()))) &&
            ((this.facultyOUEngName==null && other.getFacultyOUEngName()==null) || 
             (this.facultyOUEngName!=null &&
              this.facultyOUEngName.equals(other.getFacultyOUEngName()))) &&
            ((this.methodOfDeliveryCode==null && other.getMethodOfDeliveryCode()==null) || 
             (this.methodOfDeliveryCode!=null &&
              this.methodOfDeliveryCode.equals(other.getMethodOfDeliveryCode()))) &&
            ((this.methodOfDeliveryCodeID==null && other.getMethodOfDeliveryCodeID()==null) || 
             (this.methodOfDeliveryCodeID!=null &&
              this.methodOfDeliveryCodeID.equals(other.getMethodOfDeliveryCodeID()))) &&
            ((this.modPresChangeIND==null && other.getModPresChangeIND()==null) || 
             (this.modPresChangeIND!=null &&
              this.modPresChangeIND.equals(other.getModPresChangeIND()))) &&
            ((this.modPresEndDate==null && other.getModPresEndDate()==null) || 
             (this.modPresEndDate!=null &&
              this.modPresEndDate.equals(other.getModPresEndDate()))) &&
            ((this.modPresOUCampusDeanName==null && other.getModPresOUCampusDeanName()==null) || 
             (this.modPresOUCampusDeanName!=null &&
              this.modPresOUCampusDeanName.equals(other.getModPresOUCampusDeanName()))) &&
            ((this.modPresOUCampusDeanUnivNr==null && other.getModPresOUCampusDeanUnivNr()==null) || 
             (this.modPresOUCampusDeanUnivNr!=null &&
              this.modPresOUCampusDeanUnivNr.equals(other.getModPresOUCampusDeanUnivNr()))) &&
            ((this.modPresOUCampusDirectorName==null && other.getModPresOUCampusDirectorName()==null) || 
             (this.modPresOUCampusDirectorName!=null &&
              this.modPresOUCampusDirectorName.equals(other.getModPresOUCampusDirectorName()))) &&
            ((this.modPresOUCampusDirectorUnivNr==null && other.getModPresOUCampusDirectorUnivNr()==null) || 
             (this.modPresOUCampusDirectorUnivNr!=null &&
              this.modPresOUCampusDirectorUnivNr.equals(other.getModPresOUCampusDirectorUnivNr()))) &&
            ((this.modPresOUCampusEndDate==null && other.getModPresOUCampusEndDate()==null) || 
             (this.modPresOUCampusEndDate!=null &&
              this.modPresOUCampusEndDate.equals(other.getModPresOUCampusEndDate()))) &&
            ((this.modPresOUCampusLecturerName==null && other.getModPresOUCampusLecturerName()==null) || 
             (this.modPresOUCampusLecturerName!=null &&
              this.modPresOUCampusLecturerName.equals(other.getModPresOUCampusLecturerName()))) &&
            ((this.modPresOUCampusLecturerTelMobile==null && other.getModPresOUCampusLecturerTelMobile()==null) || 
             (this.modPresOUCampusLecturerTelMobile!=null &&
              this.modPresOUCampusLecturerTelMobile.equals(other.getModPresOUCampusLecturerTelMobile()))) &&
            ((this.modPresOUCampusLecturerTelOffice==null && other.getModPresOUCampusLecturerTelOffice()==null) || 
             (this.modPresOUCampusLecturerTelOffice!=null &&
              this.modPresOUCampusLecturerTelOffice.equals(other.getModPresOUCampusLecturerTelOffice()))) &&
            ((this.modPresOUCampusLecturerUnivNr==null && other.getModPresOUCampusLecturerUnivNr()==null) || 
             (this.modPresOUCampusLecturerUnivNr!=null &&
              this.modPresOUCampusLecturerUnivNr.equals(other.getModPresOUCampusLecturerUnivNr()))) &&
            ((this.modPresOUCampusStartDate==null && other.getModPresOUCampusStartDate()==null) || 
             (this.modPresOUCampusStartDate!=null &&
              this.modPresOUCampusStartDate.equals(other.getModPresOUCampusStartDate()))) &&
            ((this.modPresOUChangeIND==null && other.getModPresOUChangeIND()==null) || 
             (this.modPresOUChangeIND!=null &&
              this.modPresOUChangeIND.equals(other.getModPresOUChangeIND()))) &&
            ((this.modPresStartDate==null && other.getModPresStartDate()==null) || 
             (this.modPresStartDate!=null &&
              this.modPresStartDate.equals(other.getModPresStartDate()))) &&
            this.moduleAPID == other.getModuleAPID() &&
            ((this.moduleAfrName==null && other.getModuleAfrName()==null) || 
             (this.moduleAfrName!=null &&
              this.moduleAfrName.equals(other.getModuleAfrName()))) &&
            ((this.moduleChangeIND==null && other.getModuleChangeIND()==null) || 
             (this.moduleChangeIND!=null &&
              this.moduleChangeIND.equals(other.getModuleChangeIND()))) &&
            ((this.moduleEndDate==null && other.getModuleEndDate()==null) || 
             (this.moduleEndDate!=null &&
              this.moduleEndDate.equals(other.getModuleEndDate()))) &&
            ((this.moduleEngName==null && other.getModuleEngName()==null) || 
             (this.moduleEngName!=null &&
              this.moduleEngName.equals(other.getModuleEngName()))) &&
            ((this.modulePeriodChangeIND==null && other.getModulePeriodChangeIND()==null) || 
             (this.modulePeriodChangeIND!=null &&
              this.modulePeriodChangeIND.equals(other.getModulePeriodChangeIND()))) &&
            ((this.modulePeriodCode==null && other.getModulePeriodCode()==null) || 
             (this.modulePeriodCode!=null &&
              this.modulePeriodCode.equals(other.getModulePeriodCode()))) &&
            ((this.modulePeriodCodeID==null && other.getModulePeriodCodeID()==null) || 
             (this.modulePeriodCodeID!=null &&
              this.modulePeriodCodeID.equals(other.getModulePeriodCodeID()))) &&
            ((this.modulePeriodEndDate==null && other.getModulePeriodEndDate()==null) || 
             (this.modulePeriodEndDate!=null &&
              this.modulePeriodEndDate.equals(other.getModulePeriodEndDate()))) &&
            ((this.modulePeriodStartDate==null && other.getModulePeriodStartDate()==null) || 
             (this.modulePeriodStartDate!=null &&
              this.modulePeriodStartDate.equals(other.getModulePeriodStartDate()))) &&
            ((this.modulePresentingAfrCampusName==null && other.getModulePresentingAfrCampusName()==null) || 
             (this.modulePresentingAfrCampusName!=null &&
              this.modulePresentingAfrCampusName.equals(other.getModulePresentingAfrCampusName()))) &&
            ((this.modulePresentingCampus==null && other.getModulePresentingCampus()==null) || 
             (this.modulePresentingCampus!=null &&
              this.modulePresentingCampus.equals(other.getModulePresentingCampus()))) &&
            ((this.modulePresentingEngCampusName==null && other.getModulePresentingEngCampusName()==null) || 
             (this.modulePresentingEngCampusName!=null &&
              this.modulePresentingEngCampusName.equals(other.getModulePresentingEngCampusName()))) &&
            ((this.modulePresentingOU==null && other.getModulePresentingOU()==null) || 
             (this.modulePresentingOU!=null &&
              this.modulePresentingOU.equals(other.getModulePresentingOU()))) &&
            ((this.modulePresentingOUAfrName==null && other.getModulePresentingOUAfrName()==null) || 
             (this.modulePresentingOUAfrName!=null &&
              this.modulePresentingOUAfrName.equals(other.getModulePresentingOUAfrName()))) &&
            ((this.modulePresentingOUEngName==null && other.getModulePresentingOUEngName()==null) || 
             (this.modulePresentingOUEngName!=null &&
              this.modulePresentingOUEngName.equals(other.getModulePresentingOUEngName()))) &&
            ((this.moduleStartDate==null && other.getModuleStartDate()==null) || 
             (this.moduleStartDate!=null &&
              this.moduleStartDate.equals(other.getModuleStartDate()))) &&
            ((this.presentationCategoryCode==null && other.getPresentationCategoryCode()==null) || 
             (this.presentationCategoryCode!=null &&
              this.presentationCategoryCode.equals(other.getPresentationCategoryCode()))) &&
            ((this.presentationCategoryCodeID==null && other.getPresentationCategoryCodeID()==null) || 
             (this.presentationCategoryCodeID!=null &&
              this.presentationCategoryCodeID.equals(other.getPresentationCategoryCodeID()))) &&
            ((this.presentationOpportunityChangeIND==null && other.getPresentationOpportunityChangeIND()==null) || 
             (this.presentationOpportunityChangeIND!=null &&
              this.presentationOpportunityChangeIND.equals(other.getPresentationOpportunityChangeIND()))) &&
            ((this.presentationOpportunityCode==null && other.getPresentationOpportunityCode()==null) || 
             (this.presentationOpportunityCode!=null &&
              this.presentationOpportunityCode.equals(other.getPresentationOpportunityCode()))) &&
            ((this.presentationOpportunityCodeID==null && other.getPresentationOpportunityCodeID()==null) || 
             (this.presentationOpportunityCodeID!=null &&
              this.presentationOpportunityCodeID.equals(other.getPresentationOpportunityCodeID()))) &&
            ((this.presentationOpportunityEndDate==null && other.getPresentationOpportunityEndDate()==null) || 
             (this.presentationOpportunityEndDate!=null &&
              this.presentationOpportunityEndDate.equals(other.getPresentationOpportunityEndDate()))) &&
            ((this.presentationOpportunityStartDate==null && other.getPresentationOpportunityStartDate()==null) || 
             (this.presentationOpportunityStartDate!=null &&
              this.presentationOpportunityStartDate.equals(other.getPresentationOpportunityStartDate())));
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
        if (getCourseCode() != null) {
            _hashCode += getCourseCode().hashCode();
        }
        if (getCourseLevel() != null) {
            _hashCode += getCourseLevel().hashCode();
        }
        if (getCourseModule() != null) {
            _hashCode += getCourseModule().hashCode();
        }
        if (getFacultyOU() != null) {
            _hashCode += getFacultyOU().hashCode();
        }
        if (getFacultyOUAfrName() != null) {
            _hashCode += getFacultyOUAfrName().hashCode();
        }
        if (getFacultyOUEngName() != null) {
            _hashCode += getFacultyOUEngName().hashCode();
        }
        if (getMethodOfDeliveryCode() != null) {
            _hashCode += getMethodOfDeliveryCode().hashCode();
        }
        if (getMethodOfDeliveryCodeID() != null) {
            _hashCode += getMethodOfDeliveryCodeID().hashCode();
        }
        if (getModPresChangeIND() != null) {
            _hashCode += getModPresChangeIND().hashCode();
        }
        if (getModPresEndDate() != null) {
            _hashCode += getModPresEndDate().hashCode();
        }
        if (getModPresOUCampusDeanName() != null) {
            _hashCode += getModPresOUCampusDeanName().hashCode();
        }
        if (getModPresOUCampusDeanUnivNr() != null) {
            _hashCode += getModPresOUCampusDeanUnivNr().hashCode();
        }
        if (getModPresOUCampusDirectorName() != null) {
            _hashCode += getModPresOUCampusDirectorName().hashCode();
        }
        if (getModPresOUCampusDirectorUnivNr() != null) {
            _hashCode += getModPresOUCampusDirectorUnivNr().hashCode();
        }
        if (getModPresOUCampusEndDate() != null) {
            _hashCode += getModPresOUCampusEndDate().hashCode();
        }
        if (getModPresOUCampusLecturerName() != null) {
            _hashCode += getModPresOUCampusLecturerName().hashCode();
        }
        if (getModPresOUCampusLecturerTelMobile() != null) {
            _hashCode += getModPresOUCampusLecturerTelMobile().hashCode();
        }
        if (getModPresOUCampusLecturerTelOffice() != null) {
            _hashCode += getModPresOUCampusLecturerTelOffice().hashCode();
        }
        if (getModPresOUCampusLecturerUnivNr() != null) {
            _hashCode += getModPresOUCampusLecturerUnivNr().hashCode();
        }
        if (getModPresOUCampusStartDate() != null) {
            _hashCode += getModPresOUCampusStartDate().hashCode();
        }
        if (getModPresOUChangeIND() != null) {
            _hashCode += getModPresOUChangeIND().hashCode();
        }
        if (getModPresStartDate() != null) {
            _hashCode += getModPresStartDate().hashCode();
        }
        _hashCode += getModuleAPID();
        if (getModuleAfrName() != null) {
            _hashCode += getModuleAfrName().hashCode();
        }
        if (getModuleChangeIND() != null) {
            _hashCode += getModuleChangeIND().hashCode();
        }
        if (getModuleEndDate() != null) {
            _hashCode += getModuleEndDate().hashCode();
        }
        if (getModuleEngName() != null) {
            _hashCode += getModuleEngName().hashCode();
        }
        if (getModulePeriodChangeIND() != null) {
            _hashCode += getModulePeriodChangeIND().hashCode();
        }
        if (getModulePeriodCode() != null) {
            _hashCode += getModulePeriodCode().hashCode();
        }
        if (getModulePeriodCodeID() != null) {
            _hashCode += getModulePeriodCodeID().hashCode();
        }
        if (getModulePeriodEndDate() != null) {
            _hashCode += getModulePeriodEndDate().hashCode();
        }
        if (getModulePeriodStartDate() != null) {
            _hashCode += getModulePeriodStartDate().hashCode();
        }
        if (getModulePresentingAfrCampusName() != null) {
            _hashCode += getModulePresentingAfrCampusName().hashCode();
        }
        if (getModulePresentingCampus() != null) {
            _hashCode += getModulePresentingCampus().hashCode();
        }
        if (getModulePresentingEngCampusName() != null) {
            _hashCode += getModulePresentingEngCampusName().hashCode();
        }
        if (getModulePresentingOU() != null) {
            _hashCode += getModulePresentingOU().hashCode();
        }
        if (getModulePresentingOUAfrName() != null) {
            _hashCode += getModulePresentingOUAfrName().hashCode();
        }
        if (getModulePresentingOUEngName() != null) {
            _hashCode += getModulePresentingOUEngName().hashCode();
        }
        if (getModuleStartDate() != null) {
            _hashCode += getModuleStartDate().hashCode();
        }
        if (getPresentationCategoryCode() != null) {
            _hashCode += getPresentationCategoryCode().hashCode();
        }
        if (getPresentationCategoryCodeID() != null) {
            _hashCode += getPresentationCategoryCodeID().hashCode();
        }
        if (getPresentationOpportunityChangeIND() != null) {
            _hashCode += getPresentationOpportunityChangeIND().hashCode();
        }
        if (getPresentationOpportunityCode() != null) {
            _hashCode += getPresentationOpportunityCode().hashCode();
        }
        if (getPresentationOpportunityCodeID() != null) {
            _hashCode += getPresentationOpportunityCodeID().hashCode();
        }
        if (getPresentationOpportunityEndDate() != null) {
            _hashCode += getPresentationOpportunityEndDate().hashCode();
        }
        if (getPresentationOpportunityStartDate() != null) {
            _hashCode += getPresentationOpportunityStartDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSModuleDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/vss/APDFindSearchModuleWS/types/", "WSModuleDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "courseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courseLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "courseLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courseModule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "courseModule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("facultyOU");
        elemField.setXmlName(new javax.xml.namespace.QName("", "facultyOU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("facultyOUAfrName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "facultyOUAfrName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("facultyOUEngName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "facultyOUEngName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("methodOfDeliveryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "methodOfDeliveryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("methodOfDeliveryCodeID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "methodOfDeliveryCodeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modPresChangeIND");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modPresChangeIND"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modPresEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modPresEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modPresOUCampusDeanName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modPresOUCampusDeanName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modPresOUCampusDeanUnivNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modPresOUCampusDeanUnivNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modPresOUCampusDirectorName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modPresOUCampusDirectorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modPresOUCampusDirectorUnivNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modPresOUCampusDirectorUnivNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modPresOUCampusEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modPresOUCampusEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modPresOUCampusLecturerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modPresOUCampusLecturerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modPresOUCampusLecturerTelMobile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modPresOUCampusLecturerTelMobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modPresOUCampusLecturerTelOffice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modPresOUCampusLecturerTelOffice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modPresOUCampusLecturerUnivNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modPresOUCampusLecturerUnivNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modPresOUCampusStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modPresOUCampusStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modPresOUChangeIND");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modPresOUChangeIND"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modPresStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modPresStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleAPID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moduleAPID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleAfrName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moduleAfrName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleChangeIND");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moduleChangeIND"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moduleEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleEngName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moduleEngName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulePeriodChangeIND");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modulePeriodChangeIND"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulePeriodCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modulePeriodCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulePeriodCodeID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modulePeriodCodeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulePeriodEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modulePeriodEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulePeriodStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modulePeriodStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulePresentingAfrCampusName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modulePresentingAfrCampusName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulePresentingCampus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modulePresentingCampus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulePresentingEngCampusName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modulePresentingEngCampusName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulePresentingOU");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modulePresentingOU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulePresentingOUAfrName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modulePresentingOUAfrName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulePresentingOUEngName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modulePresentingOUEngName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moduleStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presentationCategoryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "presentationCategoryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presentationCategoryCodeID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "presentationCategoryCodeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presentationOpportunityChangeIND");
        elemField.setXmlName(new javax.xml.namespace.QName("", "presentationOpportunityChangeIND"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presentationOpportunityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "presentationOpportunityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presentationOpportunityCodeID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "presentationOpportunityCodeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presentationOpportunityEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "presentationOpportunityEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presentationOpportunityStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "presentationOpportunityStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
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
        return new BPELBeanDeserializer(_javaType, _xmlType, typeDesc);        
//          new  org.apache.axis.encoding.ser.BeanDeserializer(
//            _javaType, _xmlType, typeDesc);
    }

}
