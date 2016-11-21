package edu.nwu.sakai.studentlink.client;

@SuppressWarnings("serial")
public class ModuleDetail implements java.io.Serializable, Comparable<ModuleDetail> {

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

    private boolean linkedToLecturer;

    private java.lang.String linkedByLecturer;

    public ModuleDetail() {
    }

    public ModuleDetail(java.lang.String courseCode, java.lang.String courseLevel,
            java.lang.String courseModule, java.lang.Integer facultyOU,
            java.lang.String facultyOUAfrName, java.lang.String facultyOUEngName,
            java.lang.Integer methodOfDeliveryCode, java.lang.Integer methodOfDeliveryCodeID,
            java.lang.String methodOfDeliveryName,
            java.lang.String modPresChangeIND, java.util.Date modPresEndDate,
            java.lang.String modPresOUCampusDeanName, java.lang.Integer modPresOUCampusDeanUnivNr,
            java.lang.String modPresOUCampusDirectorName,
            java.lang.Integer modPresOUCampusDirectorUnivNr, java.util.Date modPresOUCampusEndDate,
            java.lang.String modPresOUCampusLecturerName,
            java.lang.String modPresOUCampusLecturerTelMobile,
            java.lang.String modPresOUCampusLecturerTelOffice,
            java.lang.Integer modPresOUCampusLecturerUnivNr,
            java.util.Date modPresOUCampusStartDate, java.lang.String modPresOUChangeIND,
            java.util.Date modPresStartDate, int moduleAPID, java.lang.String moduleAfrName,
            java.lang.String moduleChangeIND, java.util.Date moduleEndDate,
            java.lang.String moduleEngName, java.lang.String modulePeriodChangeIND,
            java.lang.String modulePeriodCode, java.lang.Integer modulePeriodCodeID,
            java.util.Date modulePeriodEndDate, java.util.Date modulePeriodStartDate,
            java.lang.String modulePresentingAfrCampusName,
            java.lang.Integer modulePresentingCampus,
            java.lang.String modulePresentingEngCampusName, java.lang.Integer modulePresentingOU,
            java.lang.String modulePresentingOUAfrName, java.lang.String modulePresentingOUEngName,
            java.util.Date moduleStartDate, java.lang.Integer presentationCategoryCode,
            java.lang.Integer presentationCategoryCodeID,
            java.lang.String presentationCategoryName,
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
        this.methodOfDeliveryName = methodOfDeliveryName;
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
        this.presentationCategoryName = presentationCategoryName;
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
    public void setModPresOUCampusLecturerTelMobile(
            java.lang.String modPresOUCampusLecturerTelMobile) {
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
    public void setModPresOUCampusLecturerTelOffice(
            java.lang.String modPresOUCampusLecturerTelOffice) {
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
    public void setPresentationOpportunityChangeIND(
            java.lang.String presentationOpportunityChangeIND) {
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

	/**
     * Sets the presentationOpportunityStartDate value for this WSModuleDetail.
     * 
     * @param presentationOpportunityStartDate
     */
    public void setPresentationOpportunityStartDate(java.util.Date presentationOpportunityStartDate) {
        this.presentationOpportunityStartDate = presentationOpportunityStartDate;
    }

    public boolean isLinkedToLecturer() {
        return linkedToLecturer;
    }

    public void setLinkedToLecturer(boolean linkedToLecturer) {
        this.linkedToLecturer = linkedToLecturer;
    }

    public String toString() {
        return courseCode + " " + courseLevel + " " + courseModule;
    }

    public int compareTo(ModuleDetail o) {
        if (o == null) {
            return 1;
        }
        return this.toString().compareTo(o.toString());
    }

    /**
     * Course Management Helper method - CanonicalCourse eid example: WISK 111
     */
    public String getCanonicalCourseReference(String presentationCategoryCode, String methodOfDeliveryCode) {
        return courseCode + " " + courseLevel + courseModule + getMODAndPresentCatStr(presentationCategoryCode, methodOfDeliveryCode);
    }

    /**
     * Course Management Helper method - CourseOffering eid example: WISK 111 P 2011
     */
    public String getCourseOfferingReference(int year, String presentationCategoryCode, String methodOfDeliveryCode) {
        return getCanonicalCourseReference(presentationCategoryCode, methodOfDeliveryCode)
                + " "
                + Campus.getCampus(getModulePresentingCampus()).getCode()
                + " "
                + year;
    }
    
    private String getMODAndPresentCatStr(String presentationCategoryCode, String methodOfDeliveryCode){    	
    	StringBuilder strValue = new StringBuilder();
    	if(methodOfDeliveryCode != null && presentationCategoryCode != null){
    		strValue.append(" " + methodOfDeliveryCode + "-" + getConvertedPresentCatCodeValue(presentationCategoryCode));
		}
    	else if(methodOfDeliveryCode != null){
    		strValue.append(" " + methodOfDeliveryCode);    		
    	}
    	else if(presentationCategoryCode != null){
    		strValue.append(" " + getConvertedPresentCatCodeValue(presentationCategoryCode));    		
    	}
    	return strValue.toString();
    }
    
    private String getConvertedPresentCatCodeValue(String presentationCategoryCode){
    	//XXX NOT Correct solution, iterim solution
    	if(presentationCategoryCode != null && Integer.valueOf(presentationCategoryCode).compareTo(new Integer(1)) == 0){
    		return "C"; // Short for Contact
    	}
    	else if(presentationCategoryCode != null && Integer.valueOf(presentationCategoryCode).compareTo(new Integer(2)) == 0){
    		return "D"; // Short for Distant
    	}
    	return "";
    }

    /**
     * Course Management Helper method - EnrollmentSet eid example: WISK 111 P 2011 ES
     */
    public String getEnrollmentSetReference(int year, String presentationCategoryCode, String methodOfDeliveryCode) {
        return getCourseOfferingReference(year, presentationCategoryCode, methodOfDeliveryCode) + " ES";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (obj instanceof ModuleDetail) {
            ModuleDetail other = (ModuleDetail) obj;
            return Utility.equals(courseCode, other.courseCode)
                    && Utility.equals(courseLevel, other.courseLevel)
                    && Utility.equals(courseModule, other.courseModule)
                    && Utility.equals(modulePresentingCampus, other.modulePresentingCampus);
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Utility.hashCode(courseCode, courseLevel, courseModule, modulePresentingCampus);
    }

    public java.lang.String getLinkedByLecturer() {
        return linkedByLecturer;
    }

    public void setLinkedByLecturer(java.lang.String linkedByLecturer) {
        this.linkedByLecturer = linkedByLecturer;
    }
}