/**
 * ModuleResultType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation;

public class ModuleResultType  implements java.io.Serializable {
    private int moduleAPID;

    private java.lang.String course;

    private java.lang.String courseLevel;

    private java.lang.String module;

    private java.lang.String moduleAfrName;

    private java.lang.String moduleEngName;

    private java.util.Date moduleStartDate;

    private java.util.Date moduleEndDate;

    private java.lang.String moduleChangeIND;

    private java.lang.Integer modulePresentingOU;

    private java.lang.String modulePresOUAfrName;

    private java.lang.String modulePresOUEngName;

    private java.lang.Integer facultyOU;

    private java.lang.String facultyOUAfrName;

    private java.lang.String facultyOUEngName;

    private java.lang.Integer modulePresCampus;

    private java.lang.String modulePresAfrCampusName;

    private java.lang.String modulePresEngCampusName;

    private java.lang.Integer modulePresOUCampusDeanUniNr;

    private java.lang.String modulePresOUCampusDeanName;

    private java.lang.Integer modulePresOUCampusDirUniNr;

    private java.lang.String modulePresOUCampusDirName;

    private java.lang.Integer modulePresOUCampusLecturerUniNr;

    private java.lang.String modulePresOUCampusLecturerName;

    private java.lang.String campusLecturerOfficeTel;

    private java.lang.String campusLecturerMobile;

    private java.util.Date modulePresOUCampusStartDate;

    private java.util.Date modulePresOUCampusEndDate;

    private java.lang.String modulePresOUChangeIND;

    private java.lang.Integer MODCodeId;

    private java.lang.Integer MODCode;

    private java.lang.String methodOfDeliveryName;

    private java.lang.Integer presentationCategoryCodeId;

    private java.lang.Integer presentationCategoryCode;

    private java.lang.String presentationCategoryName;

    private java.util.Date MODPresStartDate;

    private java.util.Date MODPresEndDate;

    private java.lang.String MODPresChangeIND;

    private java.lang.Integer modulePeriodCodeId;

    private java.lang.String modulePeriodCode;

    private java.util.Date modulePeriodStartDate;

    private java.util.Date modulePeriodEndDate;

    private java.lang.String modulePeriodChangeIND;

    private java.lang.Integer presentationOpportunityCodeID;

    private java.lang.Integer presentationOpportunityCode;

    private java.util.Date presentationOpportunityStartDate;

    private java.util.Date presentationOpportunityEndDate;

    private java.lang.String presentationOpportunityChangeIND;

    public ModuleResultType() {
    }

    public ModuleResultType(
           int moduleAPID,
           java.lang.String course,
           java.lang.String courseLevel,
           java.lang.String module,
           java.lang.String moduleAfrName,
           java.lang.String moduleEngName,
           java.util.Date moduleStartDate,
           java.util.Date moduleEndDate,
           java.lang.String moduleChangeIND,
           java.lang.Integer modulePresentingOU,
           java.lang.String modulePresOUAfrName,
           java.lang.String modulePresOUEngName,
           java.lang.Integer facultyOU,
           java.lang.String facultyOUAfrName,
           java.lang.String facultyOUEngName,
           java.lang.Integer modulePresCampus,
           java.lang.String modulePresAfrCampusName,
           java.lang.String modulePresEngCampusName,
           java.lang.Integer modulePresOUCampusDeanUniNr,
           java.lang.String modulePresOUCampusDeanName,
           java.lang.Integer modulePresOUCampusDirUniNr,
           java.lang.String modulePresOUCampusDirName,
           java.lang.Integer modulePresOUCampusLecturerUniNr,
           java.lang.String modulePresOUCampusLecturerName,
           java.lang.String campusLecturerOfficeTel,
           java.lang.String campusLecturerMobile,
           java.util.Date modulePresOUCampusStartDate,
           java.util.Date modulePresOUCampusEndDate,
           java.lang.String modulePresOUChangeIND,
           java.lang.Integer MODCodeId,
           java.lang.Integer MODCode,
           java.lang.String methodOfDeliveryName,
           java.lang.Integer presentationCategoryCodeId,
           java.lang.Integer presentationCategoryCode,
           java.lang.String presentationCategoryName,
           java.util.Date MODPresStartDate,
           java.util.Date MODPresEndDate,
           java.lang.String MODPresChangeIND,
           java.lang.Integer modulePeriodCodeId,
           java.lang.String modulePeriodCode,
           java.util.Date modulePeriodStartDate,
           java.util.Date modulePeriodEndDate,
           java.lang.String modulePeriodChangeIND,
           java.lang.Integer presentationOpportunityCodeID,
           java.lang.Integer presentationOpportunityCode,
           java.util.Date presentationOpportunityStartDate,
           java.util.Date presentationOpportunityEndDate,
           java.lang.String presentationOpportunityChangeIND) {
           this.moduleAPID = moduleAPID;
           this.course = course;
           this.courseLevel = courseLevel;
           this.module = module;
           this.moduleAfrName = moduleAfrName;
           this.moduleEngName = moduleEngName;
           this.moduleStartDate = moduleStartDate;
           this.moduleEndDate = moduleEndDate;
           this.moduleChangeIND = moduleChangeIND;
           this.modulePresentingOU = modulePresentingOU;
           this.modulePresOUAfrName = modulePresOUAfrName;
           this.modulePresOUEngName = modulePresOUEngName;
           this.facultyOU = facultyOU;
           this.facultyOUAfrName = facultyOUAfrName;
           this.facultyOUEngName = facultyOUEngName;
           this.modulePresCampus = modulePresCampus;
           this.modulePresAfrCampusName = modulePresAfrCampusName;
           this.modulePresEngCampusName = modulePresEngCampusName;
           this.modulePresOUCampusDeanUniNr = modulePresOUCampusDeanUniNr;
           this.modulePresOUCampusDeanName = modulePresOUCampusDeanName;
           this.modulePresOUCampusDirUniNr = modulePresOUCampusDirUniNr;
           this.modulePresOUCampusDirName = modulePresOUCampusDirName;
           this.modulePresOUCampusLecturerUniNr = modulePresOUCampusLecturerUniNr;
           this.modulePresOUCampusLecturerName = modulePresOUCampusLecturerName;
           this.campusLecturerOfficeTel = campusLecturerOfficeTel;
           this.campusLecturerMobile = campusLecturerMobile;
           this.modulePresOUCampusStartDate = modulePresOUCampusStartDate;
           this.modulePresOUCampusEndDate = modulePresOUCampusEndDate;
           this.modulePresOUChangeIND = modulePresOUChangeIND;
           this.MODCodeId = MODCodeId;
           this.MODCode = MODCode;
           this.methodOfDeliveryName = methodOfDeliveryName;
           this.presentationCategoryCodeId = presentationCategoryCodeId;
           this.presentationCategoryCode = presentationCategoryCode;
           this.presentationCategoryName = presentationCategoryName;
           this.MODPresStartDate = MODPresStartDate;
           this.MODPresEndDate = MODPresEndDate;
           this.MODPresChangeIND = MODPresChangeIND;
           this.modulePeriodCodeId = modulePeriodCodeId;
           this.modulePeriodCode = modulePeriodCode;
           this.modulePeriodStartDate = modulePeriodStartDate;
           this.modulePeriodEndDate = modulePeriodEndDate;
           this.modulePeriodChangeIND = modulePeriodChangeIND;
           this.presentationOpportunityCodeID = presentationOpportunityCodeID;
           this.presentationOpportunityCode = presentationOpportunityCode;
           this.presentationOpportunityStartDate = presentationOpportunityStartDate;
           this.presentationOpportunityEndDate = presentationOpportunityEndDate;
           this.presentationOpportunityChangeIND = presentationOpportunityChangeIND;
    }


    /**
     * Gets the moduleAPID value for this ModuleResultType.
     * 
     * @return moduleAPID
     */
    public int getModuleAPID() {
        return moduleAPID;
    }


    /**
     * Sets the moduleAPID value for this ModuleResultType.
     * 
     * @param moduleAPID
     */
    public void setModuleAPID(int moduleAPID) {
        this.moduleAPID = moduleAPID;
    }


    /**
     * Gets the course value for this ModuleResultType.
     * 
     * @return course
     */
    public java.lang.String getCourse() {
        return course;
    }


    /**
     * Sets the course value for this ModuleResultType.
     * 
     * @param course
     */
    public void setCourse(java.lang.String course) {
        this.course = course;
    }


    /**
     * Gets the courseLevel value for this ModuleResultType.
     * 
     * @return courseLevel
     */
    public java.lang.String getCourseLevel() {
        return courseLevel;
    }


    /**
     * Sets the courseLevel value for this ModuleResultType.
     * 
     * @param courseLevel
     */
    public void setCourseLevel(java.lang.String courseLevel) {
        this.courseLevel = courseLevel;
    }


    /**
     * Gets the module value for this ModuleResultType.
     * 
     * @return module
     */
    public java.lang.String getModule() {
        return module;
    }


    /**
     * Sets the module value for this ModuleResultType.
     * 
     * @param module
     */
    public void setModule(java.lang.String module) {
        this.module = module;
    }


    /**
     * Gets the moduleAfrName value for this ModuleResultType.
     * 
     * @return moduleAfrName
     */
    public java.lang.String getModuleAfrName() {
        return moduleAfrName;
    }


    /**
     * Sets the moduleAfrName value for this ModuleResultType.
     * 
     * @param moduleAfrName
     */
    public void setModuleAfrName(java.lang.String moduleAfrName) {
        this.moduleAfrName = moduleAfrName;
    }


    /**
     * Gets the moduleEngName value for this ModuleResultType.
     * 
     * @return moduleEngName
     */
    public java.lang.String getModuleEngName() {
        return moduleEngName;
    }


    /**
     * Sets the moduleEngName value for this ModuleResultType.
     * 
     * @param moduleEngName
     */
    public void setModuleEngName(java.lang.String moduleEngName) {
        this.moduleEngName = moduleEngName;
    }


    /**
     * Gets the moduleStartDate value for this ModuleResultType.
     * 
     * @return moduleStartDate
     */
    public java.util.Date getModuleStartDate() {
        return moduleStartDate;
    }


    /**
     * Sets the moduleStartDate value for this ModuleResultType.
     * 
     * @param moduleStartDate
     */
    public void setModuleStartDate(java.util.Date moduleStartDate) {
        this.moduleStartDate = moduleStartDate;
    }


    /**
     * Gets the moduleEndDate value for this ModuleResultType.
     * 
     * @return moduleEndDate
     */
    public java.util.Date getModuleEndDate() {
        return moduleEndDate;
    }


    /**
     * Sets the moduleEndDate value for this ModuleResultType.
     * 
     * @param moduleEndDate
     */
    public void setModuleEndDate(java.util.Date moduleEndDate) {
        this.moduleEndDate = moduleEndDate;
    }


    /**
     * Gets the moduleChangeIND value for this ModuleResultType.
     * 
     * @return moduleChangeIND
     */
    public java.lang.String getModuleChangeIND() {
        return moduleChangeIND;
    }


    /**
     * Sets the moduleChangeIND value for this ModuleResultType.
     * 
     * @param moduleChangeIND
     */
    public void setModuleChangeIND(java.lang.String moduleChangeIND) {
        this.moduleChangeIND = moduleChangeIND;
    }


    /**
     * Gets the modulePresentingOU value for this ModuleResultType.
     * 
     * @return modulePresentingOU
     */
    public java.lang.Integer getModulePresentingOU() {
        return modulePresentingOU;
    }


    /**
     * Sets the modulePresentingOU value for this ModuleResultType.
     * 
     * @param modulePresentingOU
     */
    public void setModulePresentingOU(java.lang.Integer modulePresentingOU) {
        this.modulePresentingOU = modulePresentingOU;
    }


    /**
     * Gets the modulePresOUAfrName value for this ModuleResultType.
     * 
     * @return modulePresOUAfrName
     */
    public java.lang.String getModulePresOUAfrName() {
        return modulePresOUAfrName;
    }


    /**
     * Sets the modulePresOUAfrName value for this ModuleResultType.
     * 
     * @param modulePresOUAfrName
     */
    public void setModulePresOUAfrName(java.lang.String modulePresOUAfrName) {
        this.modulePresOUAfrName = modulePresOUAfrName;
    }


    /**
     * Gets the modulePresOUEngName value for this ModuleResultType.
     * 
     * @return modulePresOUEngName
     */
    public java.lang.String getModulePresOUEngName() {
        return modulePresOUEngName;
    }


    /**
     * Sets the modulePresOUEngName value for this ModuleResultType.
     * 
     * @param modulePresOUEngName
     */
    public void setModulePresOUEngName(java.lang.String modulePresOUEngName) {
        this.modulePresOUEngName = modulePresOUEngName;
    }


    /**
     * Gets the facultyOU value for this ModuleResultType.
     * 
     * @return facultyOU
     */
    public java.lang.Integer getFacultyOU() {
        return facultyOU;
    }


    /**
     * Sets the facultyOU value for this ModuleResultType.
     * 
     * @param facultyOU
     */
    public void setFacultyOU(java.lang.Integer facultyOU) {
        this.facultyOU = facultyOU;
    }


    /**
     * Gets the facultyOUAfrName value for this ModuleResultType.
     * 
     * @return facultyOUAfrName
     */
    public java.lang.String getFacultyOUAfrName() {
        return facultyOUAfrName;
    }


    /**
     * Sets the facultyOUAfrName value for this ModuleResultType.
     * 
     * @param facultyOUAfrName
     */
    public void setFacultyOUAfrName(java.lang.String facultyOUAfrName) {
        this.facultyOUAfrName = facultyOUAfrName;
    }


    /**
     * Gets the facultyOUEngName value for this ModuleResultType.
     * 
     * @return facultyOUEngName
     */
    public java.lang.String getFacultyOUEngName() {
        return facultyOUEngName;
    }


    /**
     * Sets the facultyOUEngName value for this ModuleResultType.
     * 
     * @param facultyOUEngName
     */
    public void setFacultyOUEngName(java.lang.String facultyOUEngName) {
        this.facultyOUEngName = facultyOUEngName;
    }


    /**
     * Gets the modulePresCampus value for this ModuleResultType.
     * 
     * @return modulePresCampus
     */
    public java.lang.Integer getModulePresCampus() {
        return modulePresCampus;
    }


    /**
     * Sets the modulePresCampus value for this ModuleResultType.
     * 
     * @param modulePresCampus
     */
    public void setModulePresCampus(java.lang.Integer modulePresCampus) {
        this.modulePresCampus = modulePresCampus;
    }


    /**
     * Gets the modulePresAfrCampusName value for this ModuleResultType.
     * 
     * @return modulePresAfrCampusName
     */
    public java.lang.String getModulePresAfrCampusName() {
        return modulePresAfrCampusName;
    }


    /**
     * Sets the modulePresAfrCampusName value for this ModuleResultType.
     * 
     * @param modulePresAfrCampusName
     */
    public void setModulePresAfrCampusName(java.lang.String modulePresAfrCampusName) {
        this.modulePresAfrCampusName = modulePresAfrCampusName;
    }


    /**
     * Gets the modulePresEngCampusName value for this ModuleResultType.
     * 
     * @return modulePresEngCampusName
     */
    public java.lang.String getModulePresEngCampusName() {
        return modulePresEngCampusName;
    }


    /**
     * Sets the modulePresEngCampusName value for this ModuleResultType.
     * 
     * @param modulePresEngCampusName
     */
    public void setModulePresEngCampusName(java.lang.String modulePresEngCampusName) {
        this.modulePresEngCampusName = modulePresEngCampusName;
    }


    /**
     * Gets the modulePresOUCampusDeanUniNr value for this ModuleResultType.
     * 
     * @return modulePresOUCampusDeanUniNr
     */
    public java.lang.Integer getModulePresOUCampusDeanUniNr() {
        return modulePresOUCampusDeanUniNr;
    }


    /**
     * Sets the modulePresOUCampusDeanUniNr value for this ModuleResultType.
     * 
     * @param modulePresOUCampusDeanUniNr
     */
    public void setModulePresOUCampusDeanUniNr(java.lang.Integer modulePresOUCampusDeanUniNr) {
        this.modulePresOUCampusDeanUniNr = modulePresOUCampusDeanUniNr;
    }


    /**
     * Gets the modulePresOUCampusDeanName value for this ModuleResultType.
     * 
     * @return modulePresOUCampusDeanName
     */
    public java.lang.String getModulePresOUCampusDeanName() {
        return modulePresOUCampusDeanName;
    }


    /**
     * Sets the modulePresOUCampusDeanName value for this ModuleResultType.
     * 
     * @param modulePresOUCampusDeanName
     */
    public void setModulePresOUCampusDeanName(java.lang.String modulePresOUCampusDeanName) {
        this.modulePresOUCampusDeanName = modulePresOUCampusDeanName;
    }


    /**
     * Gets the modulePresOUCampusDirUniNr value for this ModuleResultType.
     * 
     * @return modulePresOUCampusDirUniNr
     */
    public java.lang.Integer getModulePresOUCampusDirUniNr() {
        return modulePresOUCampusDirUniNr;
    }


    /**
     * Sets the modulePresOUCampusDirUniNr value for this ModuleResultType.
     * 
     * @param modulePresOUCampusDirUniNr
     */
    public void setModulePresOUCampusDirUniNr(java.lang.Integer modulePresOUCampusDirUniNr) {
        this.modulePresOUCampusDirUniNr = modulePresOUCampusDirUniNr;
    }


    /**
     * Gets the modulePresOUCampusDirName value for this ModuleResultType.
     * 
     * @return modulePresOUCampusDirName
     */
    public java.lang.String getModulePresOUCampusDirName() {
        return modulePresOUCampusDirName;
    }


    /**
     * Sets the modulePresOUCampusDirName value for this ModuleResultType.
     * 
     * @param modulePresOUCampusDirName
     */
    public void setModulePresOUCampusDirName(java.lang.String modulePresOUCampusDirName) {
        this.modulePresOUCampusDirName = modulePresOUCampusDirName;
    }


    /**
     * Gets the modulePresOUCampusLecturerUniNr value for this ModuleResultType.
     * 
     * @return modulePresOUCampusLecturerUniNr
     */
    public java.lang.Integer getModulePresOUCampusLecturerUniNr() {
        return modulePresOUCampusLecturerUniNr;
    }


    /**
     * Sets the modulePresOUCampusLecturerUniNr value for this ModuleResultType.
     * 
     * @param modulePresOUCampusLecturerUniNr
     */
    public void setModulePresOUCampusLecturerUniNr(java.lang.Integer modulePresOUCampusLecturerUniNr) {
        this.modulePresOUCampusLecturerUniNr = modulePresOUCampusLecturerUniNr;
    }


    /**
     * Gets the modulePresOUCampusLecturerName value for this ModuleResultType.
     * 
     * @return modulePresOUCampusLecturerName
     */
    public java.lang.String getModulePresOUCampusLecturerName() {
        return modulePresOUCampusLecturerName;
    }


    /**
     * Sets the modulePresOUCampusLecturerName value for this ModuleResultType.
     * 
     * @param modulePresOUCampusLecturerName
     */
    public void setModulePresOUCampusLecturerName(java.lang.String modulePresOUCampusLecturerName) {
        this.modulePresOUCampusLecturerName = modulePresOUCampusLecturerName;
    }


    /**
     * Gets the campusLecturerOfficeTel value for this ModuleResultType.
     * 
     * @return campusLecturerOfficeTel
     */
    public java.lang.String getCampusLecturerOfficeTel() {
        return campusLecturerOfficeTel;
    }


    /**
     * Sets the campusLecturerOfficeTel value for this ModuleResultType.
     * 
     * @param campusLecturerOfficeTel
     */
    public void setCampusLecturerOfficeTel(java.lang.String campusLecturerOfficeTel) {
        this.campusLecturerOfficeTel = campusLecturerOfficeTel;
    }


    /**
     * Gets the campusLecturerMobile value for this ModuleResultType.
     * 
     * @return campusLecturerMobile
     */
    public java.lang.String getCampusLecturerMobile() {
        return campusLecturerMobile;
    }


    /**
     * Sets the campusLecturerMobile value for this ModuleResultType.
     * 
     * @param campusLecturerMobile
     */
    public void setCampusLecturerMobile(java.lang.String campusLecturerMobile) {
        this.campusLecturerMobile = campusLecturerMobile;
    }


    /**
     * Gets the modulePresOUCampusStartDate value for this ModuleResultType.
     * 
     * @return modulePresOUCampusStartDate
     */
    public java.util.Date getModulePresOUCampusStartDate() {
        return modulePresOUCampusStartDate;
    }


    /**
     * Sets the modulePresOUCampusStartDate value for this ModuleResultType.
     * 
     * @param modulePresOUCampusStartDate
     */
    public void setModulePresOUCampusStartDate(java.util.Date modulePresOUCampusStartDate) {
        this.modulePresOUCampusStartDate = modulePresOUCampusStartDate;
    }


    /**
     * Gets the modulePresOUCampusEndDate value for this ModuleResultType.
     * 
     * @return modulePresOUCampusEndDate
     */
    public java.util.Date getModulePresOUCampusEndDate() {
        return modulePresOUCampusEndDate;
    }


    /**
     * Sets the modulePresOUCampusEndDate value for this ModuleResultType.
     * 
     * @param modulePresOUCampusEndDate
     */
    public void setModulePresOUCampusEndDate(java.util.Date modulePresOUCampusEndDate) {
        this.modulePresOUCampusEndDate = modulePresOUCampusEndDate;
    }


    /**
     * Gets the modulePresOUChangeIND value for this ModuleResultType.
     * 
     * @return modulePresOUChangeIND
     */
    public java.lang.String getModulePresOUChangeIND() {
        return modulePresOUChangeIND;
    }


    /**
     * Sets the modulePresOUChangeIND value for this ModuleResultType.
     * 
     * @param modulePresOUChangeIND
     */
    public void setModulePresOUChangeIND(java.lang.String modulePresOUChangeIND) {
        this.modulePresOUChangeIND = modulePresOUChangeIND;
    }


    /**
     * Gets the MODCodeId value for this ModuleResultType.
     * 
     * @return MODCodeId
     */
    public java.lang.Integer getMODCodeId() {
        return MODCodeId;
    }


    /**
     * Sets the MODCodeId value for this ModuleResultType.
     * 
     * @param MODCodeId
     */
    public void setMODCodeId(java.lang.Integer MODCodeId) {
        this.MODCodeId = MODCodeId;
    }


    /**
     * Gets the MODCode value for this ModuleResultType.
     * 
     * @return MODCode
     */
    public java.lang.Integer getMODCode() {
        return MODCode;
    }


    /**
     * Sets the MODCode value for this ModuleResultType.
     * 
     * @param MODCode
     */
    public void setMODCode(java.lang.Integer MODCode) {
        this.MODCode = MODCode;
    }


    /**
     * Gets the methodOfDeliveryName value for this ModuleResultType.
     * 
     * @return methodOfDeliveryName
     */
    public java.lang.String getMethodOfDeliveryName() {
        return methodOfDeliveryName;
    }


    /**
     * Sets the methodOfDeliveryName value for this ModuleResultType.
     * 
     * @param methodOfDeliveryName
     */
    public void setMethodOfDeliveryName(java.lang.String methodOfDeliveryName) {
        this.methodOfDeliveryName = methodOfDeliveryName;
    }


    /**
     * Gets the presentationCategoryCodeId value for this ModuleResultType.
     * 
     * @return presentationCategoryCodeId
     */
    public java.lang.Integer getPresentationCategoryCodeId() {
        return presentationCategoryCodeId;
    }


    /**
     * Sets the presentationCategoryCodeId value for this ModuleResultType.
     * 
     * @param presentationCategoryCodeId
     */
    public void setPresentationCategoryCodeId(java.lang.Integer presentationCategoryCodeId) {
        this.presentationCategoryCodeId = presentationCategoryCodeId;
    }


    /**
     * Gets the presentationCategoryCode value for this ModuleResultType.
     * 
     * @return presentationCategoryCode
     */
    public java.lang.Integer getPresentationCategoryCode() {
        return presentationCategoryCode;
    }


    /**
     * Sets the presentationCategoryCode value for this ModuleResultType.
     * 
     * @param presentationCategoryCode
     */
    public void setPresentationCategoryCode(java.lang.Integer presentationCategoryCode) {
        this.presentationCategoryCode = presentationCategoryCode;
    }


    /**
     * Gets the presentationCategoryName value for this ModuleResultType.
     * 
     * @return presentationCategoryName
     */
    public java.lang.String getPresentationCategoryName() {
        return presentationCategoryName;
    }


    /**
     * Sets the presentationCategoryName value for this ModuleResultType.
     * 
     * @param presentationCategoryName
     */
    public void setPresentationCategoryName(java.lang.String presentationCategoryName) {
        this.presentationCategoryName = presentationCategoryName;
    }


    /**
     * Gets the MODPresStartDate value for this ModuleResultType.
     * 
     * @return MODPresStartDate
     */
    public java.util.Date getMODPresStartDate() {
        return MODPresStartDate;
    }


    /**
     * Sets the MODPresStartDate value for this ModuleResultType.
     * 
     * @param MODPresStartDate
     */
    public void setMODPresStartDate(java.util.Date MODPresStartDate) {
        this.MODPresStartDate = MODPresStartDate;
    }


    /**
     * Gets the MODPresEndDate value for this ModuleResultType.
     * 
     * @return MODPresEndDate
     */
    public java.util.Date getMODPresEndDate() {
        return MODPresEndDate;
    }


    /**
     * Sets the MODPresEndDate value for this ModuleResultType.
     * 
     * @param MODPresEndDate
     */
    public void setMODPresEndDate(java.util.Date MODPresEndDate) {
        this.MODPresEndDate = MODPresEndDate;
    }


    /**
     * Gets the MODPresChangeIND value for this ModuleResultType.
     * 
     * @return MODPresChangeIND
     */
    public java.lang.String getMODPresChangeIND() {
        return MODPresChangeIND;
    }


    /**
     * Sets the MODPresChangeIND value for this ModuleResultType.
     * 
     * @param MODPresChangeIND
     */
    public void setMODPresChangeIND(java.lang.String MODPresChangeIND) {
        this.MODPresChangeIND = MODPresChangeIND;
    }


    /**
     * Gets the modulePeriodCodeId value for this ModuleResultType.
     * 
     * @return modulePeriodCodeId
     */
    public java.lang.Integer getModulePeriodCodeId() {
        return modulePeriodCodeId;
    }


    /**
     * Sets the modulePeriodCodeId value for this ModuleResultType.
     * 
     * @param modulePeriodCodeId
     */
    public void setModulePeriodCodeId(java.lang.Integer modulePeriodCodeId) {
        this.modulePeriodCodeId = modulePeriodCodeId;
    }


    /**
     * Gets the modulePeriodCode value for this ModuleResultType.
     * 
     * @return modulePeriodCode
     */
    public java.lang.String getModulePeriodCode() {
        return modulePeriodCode;
    }


    /**
     * Sets the modulePeriodCode value for this ModuleResultType.
     * 
     * @param modulePeriodCode
     */
    public void setModulePeriodCode(java.lang.String modulePeriodCode) {
        this.modulePeriodCode = modulePeriodCode;
    }


    /**
     * Gets the modulePeriodStartDate value for this ModuleResultType.
     * 
     * @return modulePeriodStartDate
     */
    public java.util.Date getModulePeriodStartDate() {
        return modulePeriodStartDate;
    }


    /**
     * Sets the modulePeriodStartDate value for this ModuleResultType.
     * 
     * @param modulePeriodStartDate
     */
    public void setModulePeriodStartDate(java.util.Date modulePeriodStartDate) {
        this.modulePeriodStartDate = modulePeriodStartDate;
    }


    /**
     * Gets the modulePeriodEndDate value for this ModuleResultType.
     * 
     * @return modulePeriodEndDate
     */
    public java.util.Date getModulePeriodEndDate() {
        return modulePeriodEndDate;
    }


    /**
     * Sets the modulePeriodEndDate value for this ModuleResultType.
     * 
     * @param modulePeriodEndDate
     */
    public void setModulePeriodEndDate(java.util.Date modulePeriodEndDate) {
        this.modulePeriodEndDate = modulePeriodEndDate;
    }


    /**
     * Gets the modulePeriodChangeIND value for this ModuleResultType.
     * 
     * @return modulePeriodChangeIND
     */
    public java.lang.String getModulePeriodChangeIND() {
        return modulePeriodChangeIND;
    }


    /**
     * Sets the modulePeriodChangeIND value for this ModuleResultType.
     * 
     * @param modulePeriodChangeIND
     */
    public void setModulePeriodChangeIND(java.lang.String modulePeriodChangeIND) {
        this.modulePeriodChangeIND = modulePeriodChangeIND;
    }


    /**
     * Gets the presentationOpportunityCodeID value for this ModuleResultType.
     * 
     * @return presentationOpportunityCodeID
     */
    public java.lang.Integer getPresentationOpportunityCodeID() {
        return presentationOpportunityCodeID;
    }


    /**
     * Sets the presentationOpportunityCodeID value for this ModuleResultType.
     * 
     * @param presentationOpportunityCodeID
     */
    public void setPresentationOpportunityCodeID(java.lang.Integer presentationOpportunityCodeID) {
        this.presentationOpportunityCodeID = presentationOpportunityCodeID;
    }


    /**
     * Gets the presentationOpportunityCode value for this ModuleResultType.
     * 
     * @return presentationOpportunityCode
     */
    public java.lang.Integer getPresentationOpportunityCode() {
        return presentationOpportunityCode;
    }


    /**
     * Sets the presentationOpportunityCode value for this ModuleResultType.
     * 
     * @param presentationOpportunityCode
     */
    public void setPresentationOpportunityCode(java.lang.Integer presentationOpportunityCode) {
        this.presentationOpportunityCode = presentationOpportunityCode;
    }


    /**
     * Gets the presentationOpportunityStartDate value for this ModuleResultType.
     * 
     * @return presentationOpportunityStartDate
     */
    public java.util.Date getPresentationOpportunityStartDate() {
        return presentationOpportunityStartDate;
    }


    /**
     * Sets the presentationOpportunityStartDate value for this ModuleResultType.
     * 
     * @param presentationOpportunityStartDate
     */
    public void setPresentationOpportunityStartDate(java.util.Date presentationOpportunityStartDate) {
        this.presentationOpportunityStartDate = presentationOpportunityStartDate;
    }


    /**
     * Gets the presentationOpportunityEndDate value for this ModuleResultType.
     * 
     * @return presentationOpportunityEndDate
     */
    public java.util.Date getPresentationOpportunityEndDate() {
        return presentationOpportunityEndDate;
    }


    /**
     * Sets the presentationOpportunityEndDate value for this ModuleResultType.
     * 
     * @param presentationOpportunityEndDate
     */
    public void setPresentationOpportunityEndDate(java.util.Date presentationOpportunityEndDate) {
        this.presentationOpportunityEndDate = presentationOpportunityEndDate;
    }


    /**
     * Gets the presentationOpportunityChangeIND value for this ModuleResultType.
     * 
     * @return presentationOpportunityChangeIND
     */
    public java.lang.String getPresentationOpportunityChangeIND() {
        return presentationOpportunityChangeIND;
    }


    /**
     * Sets the presentationOpportunityChangeIND value for this ModuleResultType.
     * 
     * @param presentationOpportunityChangeIND
     */
    public void setPresentationOpportunityChangeIND(java.lang.String presentationOpportunityChangeIND) {
        this.presentationOpportunityChangeIND = presentationOpportunityChangeIND;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModuleResultType)) return false;
        ModuleResultType other = (ModuleResultType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.moduleAPID == other.getModuleAPID() &&
            ((this.course==null && other.getCourse()==null) || 
             (this.course!=null &&
              this.course.equals(other.getCourse()))) &&
            ((this.courseLevel==null && other.getCourseLevel()==null) || 
             (this.courseLevel!=null &&
              this.courseLevel.equals(other.getCourseLevel()))) &&
            ((this.module==null && other.getModule()==null) || 
             (this.module!=null &&
              this.module.equals(other.getModule()))) &&
            ((this.moduleAfrName==null && other.getModuleAfrName()==null) || 
             (this.moduleAfrName!=null &&
              this.moduleAfrName.equals(other.getModuleAfrName()))) &&
            ((this.moduleEngName==null && other.getModuleEngName()==null) || 
             (this.moduleEngName!=null &&
              this.moduleEngName.equals(other.getModuleEngName()))) &&
            ((this.moduleStartDate==null && other.getModuleStartDate()==null) || 
             (this.moduleStartDate!=null &&
              this.moduleStartDate.equals(other.getModuleStartDate()))) &&
            ((this.moduleEndDate==null && other.getModuleEndDate()==null) || 
             (this.moduleEndDate!=null &&
              this.moduleEndDate.equals(other.getModuleEndDate()))) &&
            ((this.moduleChangeIND==null && other.getModuleChangeIND()==null) || 
             (this.moduleChangeIND!=null &&
              this.moduleChangeIND.equals(other.getModuleChangeIND()))) &&
            ((this.modulePresentingOU==null && other.getModulePresentingOU()==null) || 
             (this.modulePresentingOU!=null &&
              this.modulePresentingOU.equals(other.getModulePresentingOU()))) &&
            ((this.modulePresOUAfrName==null && other.getModulePresOUAfrName()==null) || 
             (this.modulePresOUAfrName!=null &&
              this.modulePresOUAfrName.equals(other.getModulePresOUAfrName()))) &&
            ((this.modulePresOUEngName==null && other.getModulePresOUEngName()==null) || 
             (this.modulePresOUEngName!=null &&
              this.modulePresOUEngName.equals(other.getModulePresOUEngName()))) &&
            ((this.facultyOU==null && other.getFacultyOU()==null) || 
             (this.facultyOU!=null &&
              this.facultyOU.equals(other.getFacultyOU()))) &&
            ((this.facultyOUAfrName==null && other.getFacultyOUAfrName()==null) || 
             (this.facultyOUAfrName!=null &&
              this.facultyOUAfrName.equals(other.getFacultyOUAfrName()))) &&
            ((this.facultyOUEngName==null && other.getFacultyOUEngName()==null) || 
             (this.facultyOUEngName!=null &&
              this.facultyOUEngName.equals(other.getFacultyOUEngName()))) &&
            ((this.modulePresCampus==null && other.getModulePresCampus()==null) || 
             (this.modulePresCampus!=null &&
              this.modulePresCampus.equals(other.getModulePresCampus()))) &&
            ((this.modulePresAfrCampusName==null && other.getModulePresAfrCampusName()==null) || 
             (this.modulePresAfrCampusName!=null &&
              this.modulePresAfrCampusName.equals(other.getModulePresAfrCampusName()))) &&
            ((this.modulePresEngCampusName==null && other.getModulePresEngCampusName()==null) || 
             (this.modulePresEngCampusName!=null &&
              this.modulePresEngCampusName.equals(other.getModulePresEngCampusName()))) &&
            ((this.modulePresOUCampusDeanUniNr==null && other.getModulePresOUCampusDeanUniNr()==null) || 
             (this.modulePresOUCampusDeanUniNr!=null &&
              this.modulePresOUCampusDeanUniNr.equals(other.getModulePresOUCampusDeanUniNr()))) &&
            ((this.modulePresOUCampusDeanName==null && other.getModulePresOUCampusDeanName()==null) || 
             (this.modulePresOUCampusDeanName!=null &&
              this.modulePresOUCampusDeanName.equals(other.getModulePresOUCampusDeanName()))) &&
            ((this.modulePresOUCampusDirUniNr==null && other.getModulePresOUCampusDirUniNr()==null) || 
             (this.modulePresOUCampusDirUniNr!=null &&
              this.modulePresOUCampusDirUniNr.equals(other.getModulePresOUCampusDirUniNr()))) &&
            ((this.modulePresOUCampusDirName==null && other.getModulePresOUCampusDirName()==null) || 
             (this.modulePresOUCampusDirName!=null &&
              this.modulePresOUCampusDirName.equals(other.getModulePresOUCampusDirName()))) &&
            ((this.modulePresOUCampusLecturerUniNr==null && other.getModulePresOUCampusLecturerUniNr()==null) || 
             (this.modulePresOUCampusLecturerUniNr!=null &&
              this.modulePresOUCampusLecturerUniNr.equals(other.getModulePresOUCampusLecturerUniNr()))) &&
            ((this.modulePresOUCampusLecturerName==null && other.getModulePresOUCampusLecturerName()==null) || 
             (this.modulePresOUCampusLecturerName!=null &&
              this.modulePresOUCampusLecturerName.equals(other.getModulePresOUCampusLecturerName()))) &&
            ((this.campusLecturerOfficeTel==null && other.getCampusLecturerOfficeTel()==null) || 
             (this.campusLecturerOfficeTel!=null &&
              this.campusLecturerOfficeTel.equals(other.getCampusLecturerOfficeTel()))) &&
            ((this.campusLecturerMobile==null && other.getCampusLecturerMobile()==null) || 
             (this.campusLecturerMobile!=null &&
              this.campusLecturerMobile.equals(other.getCampusLecturerMobile()))) &&
            ((this.modulePresOUCampusStartDate==null && other.getModulePresOUCampusStartDate()==null) || 
             (this.modulePresOUCampusStartDate!=null &&
              this.modulePresOUCampusStartDate.equals(other.getModulePresOUCampusStartDate()))) &&
            ((this.modulePresOUCampusEndDate==null && other.getModulePresOUCampusEndDate()==null) || 
             (this.modulePresOUCampusEndDate!=null &&
              this.modulePresOUCampusEndDate.equals(other.getModulePresOUCampusEndDate()))) &&
            ((this.modulePresOUChangeIND==null && other.getModulePresOUChangeIND()==null) || 
             (this.modulePresOUChangeIND!=null &&
              this.modulePresOUChangeIND.equals(other.getModulePresOUChangeIND()))) &&
            ((this.MODCodeId==null && other.getMODCodeId()==null) || 
             (this.MODCodeId!=null &&
              this.MODCodeId.equals(other.getMODCodeId()))) &&
            ((this.MODCode==null && other.getMODCode()==null) || 
             (this.MODCode!=null &&
              this.MODCode.equals(other.getMODCode()))) &&
            ((this.methodOfDeliveryName==null && other.getMethodOfDeliveryName()==null) || 
             (this.methodOfDeliveryName!=null &&
              this.methodOfDeliveryName.equals(other.getMethodOfDeliveryName()))) &&
            ((this.presentationCategoryCodeId==null && other.getPresentationCategoryCodeId()==null) || 
             (this.presentationCategoryCodeId!=null &&
              this.presentationCategoryCodeId.equals(other.getPresentationCategoryCodeId()))) &&
            ((this.presentationCategoryCode==null && other.getPresentationCategoryCode()==null) || 
             (this.presentationCategoryCode!=null &&
              this.presentationCategoryCode.equals(other.getPresentationCategoryCode()))) &&
            ((this.presentationCategoryName==null && other.getPresentationCategoryName()==null) || 
             (this.presentationCategoryName!=null &&
              this.presentationCategoryName.equals(other.getPresentationCategoryName()))) &&
            ((this.MODPresStartDate==null && other.getMODPresStartDate()==null) || 
             (this.MODPresStartDate!=null &&
              this.MODPresStartDate.equals(other.getMODPresStartDate()))) &&
            ((this.MODPresEndDate==null && other.getMODPresEndDate()==null) || 
             (this.MODPresEndDate!=null &&
              this.MODPresEndDate.equals(other.getMODPresEndDate()))) &&
            ((this.MODPresChangeIND==null && other.getMODPresChangeIND()==null) || 
             (this.MODPresChangeIND!=null &&
              this.MODPresChangeIND.equals(other.getMODPresChangeIND()))) &&
            ((this.modulePeriodCodeId==null && other.getModulePeriodCodeId()==null) || 
             (this.modulePeriodCodeId!=null &&
              this.modulePeriodCodeId.equals(other.getModulePeriodCodeId()))) &&
            ((this.modulePeriodCode==null && other.getModulePeriodCode()==null) || 
             (this.modulePeriodCode!=null &&
              this.modulePeriodCode.equals(other.getModulePeriodCode()))) &&
            ((this.modulePeriodStartDate==null && other.getModulePeriodStartDate()==null) || 
             (this.modulePeriodStartDate!=null &&
              this.modulePeriodStartDate.equals(other.getModulePeriodStartDate()))) &&
            ((this.modulePeriodEndDate==null && other.getModulePeriodEndDate()==null) || 
             (this.modulePeriodEndDate!=null &&
              this.modulePeriodEndDate.equals(other.getModulePeriodEndDate()))) &&
            ((this.modulePeriodChangeIND==null && other.getModulePeriodChangeIND()==null) || 
             (this.modulePeriodChangeIND!=null &&
              this.modulePeriodChangeIND.equals(other.getModulePeriodChangeIND()))) &&
            ((this.presentationOpportunityCodeID==null && other.getPresentationOpportunityCodeID()==null) || 
             (this.presentationOpportunityCodeID!=null &&
              this.presentationOpportunityCodeID.equals(other.getPresentationOpportunityCodeID()))) &&
            ((this.presentationOpportunityCode==null && other.getPresentationOpportunityCode()==null) || 
             (this.presentationOpportunityCode!=null &&
              this.presentationOpportunityCode.equals(other.getPresentationOpportunityCode()))) &&
            ((this.presentationOpportunityStartDate==null && other.getPresentationOpportunityStartDate()==null) || 
             (this.presentationOpportunityStartDate!=null &&
              this.presentationOpportunityStartDate.equals(other.getPresentationOpportunityStartDate()))) &&
            ((this.presentationOpportunityEndDate==null && other.getPresentationOpportunityEndDate()==null) || 
             (this.presentationOpportunityEndDate!=null &&
              this.presentationOpportunityEndDate.equals(other.getPresentationOpportunityEndDate()))) &&
            ((this.presentationOpportunityChangeIND==null && other.getPresentationOpportunityChangeIND()==null) || 
             (this.presentationOpportunityChangeIND!=null &&
              this.presentationOpportunityChangeIND.equals(other.getPresentationOpportunityChangeIND())));
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
        _hashCode += getModuleAPID();
        if (getCourse() != null) {
            _hashCode += getCourse().hashCode();
        }
        if (getCourseLevel() != null) {
            _hashCode += getCourseLevel().hashCode();
        }
        if (getModule() != null) {
            _hashCode += getModule().hashCode();
        }
        if (getModuleAfrName() != null) {
            _hashCode += getModuleAfrName().hashCode();
        }
        if (getModuleEngName() != null) {
            _hashCode += getModuleEngName().hashCode();
        }
        if (getModuleStartDate() != null) {
            _hashCode += getModuleStartDate().hashCode();
        }
        if (getModuleEndDate() != null) {
            _hashCode += getModuleEndDate().hashCode();
        }
        if (getModuleChangeIND() != null) {
            _hashCode += getModuleChangeIND().hashCode();
        }
        if (getModulePresentingOU() != null) {
            _hashCode += getModulePresentingOU().hashCode();
        }
        if (getModulePresOUAfrName() != null) {
            _hashCode += getModulePresOUAfrName().hashCode();
        }
        if (getModulePresOUEngName() != null) {
            _hashCode += getModulePresOUEngName().hashCode();
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
        if (getModulePresCampus() != null) {
            _hashCode += getModulePresCampus().hashCode();
        }
        if (getModulePresAfrCampusName() != null) {
            _hashCode += getModulePresAfrCampusName().hashCode();
        }
        if (getModulePresEngCampusName() != null) {
            _hashCode += getModulePresEngCampusName().hashCode();
        }
        if (getModulePresOUCampusDeanUniNr() != null) {
            _hashCode += getModulePresOUCampusDeanUniNr().hashCode();
        }
        if (getModulePresOUCampusDeanName() != null) {
            _hashCode += getModulePresOUCampusDeanName().hashCode();
        }
        if (getModulePresOUCampusDirUniNr() != null) {
            _hashCode += getModulePresOUCampusDirUniNr().hashCode();
        }
        if (getModulePresOUCampusDirName() != null) {
            _hashCode += getModulePresOUCampusDirName().hashCode();
        }
        if (getModulePresOUCampusLecturerUniNr() != null) {
            _hashCode += getModulePresOUCampusLecturerUniNr().hashCode();
        }
        if (getModulePresOUCampusLecturerName() != null) {
            _hashCode += getModulePresOUCampusLecturerName().hashCode();
        }
        if (getCampusLecturerOfficeTel() != null) {
            _hashCode += getCampusLecturerOfficeTel().hashCode();
        }
        if (getCampusLecturerMobile() != null) {
            _hashCode += getCampusLecturerMobile().hashCode();
        }
        if (getModulePresOUCampusStartDate() != null) {
            _hashCode += getModulePresOUCampusStartDate().hashCode();
        }
        if (getModulePresOUCampusEndDate() != null) {
            _hashCode += getModulePresOUCampusEndDate().hashCode();
        }
        if (getModulePresOUChangeIND() != null) {
            _hashCode += getModulePresOUChangeIND().hashCode();
        }
        if (getMODCodeId() != null) {
            _hashCode += getMODCodeId().hashCode();
        }
        if (getMODCode() != null) {
            _hashCode += getMODCode().hashCode();
        }
        if (getMethodOfDeliveryName() != null) {
            _hashCode += getMethodOfDeliveryName().hashCode();
        }
        if (getPresentationCategoryCodeId() != null) {
            _hashCode += getPresentationCategoryCodeId().hashCode();
        }
        if (getPresentationCategoryCode() != null) {
            _hashCode += getPresentationCategoryCode().hashCode();
        }
        if (getPresentationCategoryName() != null) {
            _hashCode += getPresentationCategoryName().hashCode();
        }
        if (getMODPresStartDate() != null) {
            _hashCode += getMODPresStartDate().hashCode();
        }
        if (getMODPresEndDate() != null) {
            _hashCode += getMODPresEndDate().hashCode();
        }
        if (getMODPresChangeIND() != null) {
            _hashCode += getMODPresChangeIND().hashCode();
        }
        if (getModulePeriodCodeId() != null) {
            _hashCode += getModulePeriodCodeId().hashCode();
        }
        if (getModulePeriodCode() != null) {
            _hashCode += getModulePeriodCode().hashCode();
        }
        if (getModulePeriodStartDate() != null) {
            _hashCode += getModulePeriodStartDate().hashCode();
        }
        if (getModulePeriodEndDate() != null) {
            _hashCode += getModulePeriodEndDate().hashCode();
        }
        if (getModulePeriodChangeIND() != null) {
            _hashCode += getModulePeriodChangeIND().hashCode();
        }
        if (getPresentationOpportunityCodeID() != null) {
            _hashCode += getPresentationOpportunityCodeID().hashCode();
        }
        if (getPresentationOpportunityCode() != null) {
            _hashCode += getPresentationOpportunityCode().hashCode();
        }
        if (getPresentationOpportunityStartDate() != null) {
            _hashCode += getPresentationOpportunityStartDate().hashCode();
        }
        if (getPresentationOpportunityEndDate() != null) {
            _hashCode += getPresentationOpportunityEndDate().hashCode();
        }
        if (getPresentationOpportunityChangeIND() != null) {
            _hashCode += getPresentationOpportunityChangeIND().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModuleResultType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "ModuleResultType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleAPID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "moduleAPID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("course");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "course"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courseLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "courseLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("module");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "module"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleAfrName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "moduleAfrName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleEngName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "moduleEngName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "moduleStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "moduleEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleChangeIND");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "moduleChangeIND"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulePresentingOU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "modulePresentingOU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulePresOUAfrName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "modulePresOUAfrName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulePresOUEngName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "modulePresOUEngName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("facultyOU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "facultyOU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("facultyOUAfrName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "facultyOUAfrName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("facultyOUEngName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "facultyOUEngName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulePresCampus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "modulePresCampus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulePresAfrCampusName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "modulePresAfrCampusName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulePresEngCampusName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "modulePresEngCampusName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulePresOUCampusDeanUniNr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "modulePresOUCampusDeanUniNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulePresOUCampusDeanName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "modulePresOUCampusDeanName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulePresOUCampusDirUniNr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "modulePresOUCampusDirUniNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulePresOUCampusDirName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "modulePresOUCampusDirName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulePresOUCampusLecturerUniNr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "modulePresOUCampusLecturerUniNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulePresOUCampusLecturerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "modulePresOUCampusLecturerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campusLecturerOfficeTel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "campusLecturerOfficeTel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campusLecturerMobile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "campusLecturerMobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulePresOUCampusStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "modulePresOUCampusStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulePresOUCampusEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "modulePresOUCampusEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulePresOUChangeIND");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "modulePresOUChangeIND"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MODCodeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "MODCodeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MODCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "MODCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("methodOfDeliveryName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "methodOfDeliveryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presentationCategoryCodeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "presentationCategoryCodeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presentationCategoryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "presentationCategoryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presentationCategoryName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "presentationCategoryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MODPresStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "MODPresStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MODPresEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "MODPresEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MODPresChangeIND");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "MODPresChangeIND"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulePeriodCodeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "modulePeriodCodeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulePeriodCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "modulePeriodCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulePeriodStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "modulePeriodStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulePeriodEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "modulePeriodEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulePeriodChangeIND");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "modulePeriodChangeIND"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presentationOpportunityCodeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "presentationOpportunityCodeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presentationOpportunityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "presentationOpportunityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presentationOpportunityStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "presentationOpportunityStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presentationOpportunityEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "presentationOpportunityEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presentationOpportunityChangeIND");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "presentationOpportunityChangeIND"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
