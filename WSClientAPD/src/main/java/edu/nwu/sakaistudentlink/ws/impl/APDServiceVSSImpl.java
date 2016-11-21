package edu.nwu.sakaistudentlink.ws.impl;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation.WebServiceErrorsType;
import za.ac.nwu.www.itcentral.bsi.vss.APDFindSearchModuleWS.APDFindSearchModuleWSInfProxy;
import za.ac.nwu.www.itcentral.bsi.vss.APDFindSearchModuleWS.types.WSFindSearchModule;
import za.ac.nwu.www.itcentral.bsi.vss.APDFindSearchModuleWS.types.WSModuleDetail;
import za.ac.nwu.www.itcentral.bsi.vss.APDFindSearchModuleWS.types.WSModuleDetailResult;
import za.ac.nwu.www.itcentral.bsi.vss.APDFindSearchModuleWS.types.WebServiceUser;
import za.ac.nwu.www.itcentral.bsi.vss.APDFindSearchModuleWS.types.WebserviceError;
import edu.nwu.sakaistudentlink.ws.APDService;
import edu.nwu.sakaistudentlink.ws.error.IntegrationError;
import edu.nwu.sakaistudentlink.ws.error.IntegrationException;

public class APDServiceVSSImpl implements APDService {

    /*
     * Check to setup proxy - used for monotoring
     */
    public void setupProxy() {
        Properties props = new Properties(System.getProperties());
        props.put("http.proxySet", "true");
        props.put("http.proxyHost", "192.168.168.106");
        props.put("http.proxyPort", "2000");
        Properties newprops = new Properties(props);
        System.setProperties(newprops);
    }	
	
    public List<WSModuleDetail> findSearchModule(String courseCode,
            String courseLevel, String courseModule, Date endDate, String methodOfDeliveryCode,
            int moduleAPID, String moduleName, String modulePeriodCode, int nameType,
            String presentationCategoryCode, String presentationOpportunityCode, int readLimit,
            Date startDate, String port_url) throws IntegrationException {
//    	setupProxy();
        List<WSModuleDetail> moduleList = new ArrayList<WSModuleDetail>();
        WSFindSearchModule findSearchModule = buildWSFindSearchModule(courseCode, courseLevel,
            courseModule, endDate, methodOfDeliveryCode, moduleAPID, moduleName, modulePeriodCode,
            nameType, presentationCategoryCode, presentationOpportunityCode, readLimit, startDate);
        try {
        	APDFindSearchModuleWSInfProxy apdModuleService = new APDFindSearchModuleWSInfProxy(port_url);
            WSModuleDetailResult result = apdModuleService.findSearchModule(new WebServiceUser("4", "3", "password", 1, "VSSBSI"), findSearchModule);
            if (result == null) {
                throw new IntegrationException("No result returned");
            }
            else if (result.isError()) {
                WebserviceError[] errors = result
                        .getWebServiceErrors();
                IntegrationException ie = new IntegrationException(
                        "Errors occured, see detailed errors.");
                for (WebserviceError error : errors) {                	
                    ie.addError(parseError(error));
                }
                throw ie;
            }
            else if ((result.getResults() != null) && (result.getResults().length > 0)) {
                WSModuleDetail[] wsModuleDetailArray = result.getResults();
                for (int i = 0; i < wsModuleDetailArray.length; i++) {
                    WSModuleDetail wsModuleDetail = wsModuleDetailArray[i];
                    moduleList.add(wsModuleDetail);
                }
            }
            return moduleList;
        }
        catch (RemoteException e) {
        	IntegrationException ie = new IntegrationException("Could not retrieve the modules", e);
        	IntegrationError error = new IntegrationError();
        	error.setErrorMessage("Could not connect to " + port_url);
        	ie.addError(error);
            throw ie;
        }
    }
    
    /**
     * Parse a ws error to a integration error
     */
    private IntegrationError parseError(WebserviceError error) {
        IntegrationError e = new IntegrationError();
        //e.setErrorKey(error.getErrorKey());
        e.setErrorMessage(error.getErrorMessage());
        e.setErrorCategory(error.getErrorCategory());
        //e.setParameters(error.getParameters());
        return e;
    }     
    
    private WSFindSearchModule buildWSFindSearchModule(String courseCode, String courseLevel,
            String courseModule, Date endDate, String methodOfDeliveryCode, int moduleAPID,
            String moduleName, String modulePeriodCode, int nameType,
            String presentationCategoryCode, String presentationOpportunityCode, int readLimit,
            Date startDate) {
        WSFindSearchModule wsFindSearchModule = new WSFindSearchModule();
        wsFindSearchModule.setCourseCode(courseCode);
        wsFindSearchModule.setCourseLevel(courseLevel);
        wsFindSearchModule.setCourseModule(courseModule);
        wsFindSearchModule.setEndDate(endDate);
        wsFindSearchModule.setMethodOfDeliveryCode(methodOfDeliveryCode);
        wsFindSearchModule.setModuleAPID(moduleAPID);
        wsFindSearchModule.setModuleName(moduleName);
        wsFindSearchModule.setModulePeriodCode(modulePeriodCode);
        wsFindSearchModule.setNameType(nameType);
        wsFindSearchModule.setPresentationCategoryCode(presentationCategoryCode);
        wsFindSearchModule.setPresentationOpportunityCode(presentationOpportunityCode);
        wsFindSearchModule.setReadLimit(readLimit);
        wsFindSearchModule.setStartDate(startDate);
        return wsFindSearchModule;
    }    

}
