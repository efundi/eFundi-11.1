package edu.nwu.sakaistudentlink.ws.impl;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import edu.nwu.sakaistudentlink.ws.APDService;
import edu.nwu.sakaistudentlink.ws.AxisSetup;
import edu.nwu.sakaistudentlink.ws.error.IntegrationError;
import edu.nwu.sakaistudentlink.ws.error.IntegrationException;
import za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation.FindSearchModuleInformationProcessProxy;
import za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation.ModuleInformationType;
import za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation.ModuleResultType;
import za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation.ModuleSearchResult;
import za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation.WebServiceErrorsType;
import za.ac.nwu.www.itcentral.bsi.vss.APDFindSearchModuleWS.types.WSModuleDetail;

public class APDServiceBPELImpl implements APDService {

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
    	AxisSetup.setup();
//    	setupProxy();
        List<WSModuleDetail> moduleList = new ArrayList<WSModuleDetail>();
        try {
        	FindSearchModuleInformationProcessProxy apdModuleService = new FindSearchModuleInformationProcessProxy(port_url);
        	ModuleInformationType payload = new ModuleInformationType(moduleAPID, courseCode, courseLevel, courseModule, nameType
        			, moduleName, 100, methodOfDeliveryCode, presentationCategoryCode, modulePeriodCode, presentationOpportunityCode,
        			startDate, endDate);
            ModuleSearchResult result = apdModuleService.process(payload);
            if (result == null) {
                throw new IntegrationException("No result returned");
            }
            else if (result.isError()) {
                WebServiceErrorsType[] errors = result
                        .getWebServiceErrors();
                IntegrationException ie = new IntegrationException(
                        "Errors occured, see detailed errors.");
                for (WebServiceErrorsType error : errors) {                	
                    ie.addError(parseError(error));
                }
                throw ie;
            }
            else if ((result.getIndividuals() != null) && (result.getIndividuals().length > 0)) {
                ModuleResultType[] wsModuleDetailArray = result.getIndividuals();
                for (int i = 0; i < wsModuleDetailArray.length; i++) {
                    WSModuleDetail wsModuleDetail = createWSModuleDetail(wsModuleDetailArray[i]);
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
    private IntegrationError parseError(WebServiceErrorsType error) {
        IntegrationError e = new IntegrationError();
        //e.setErrorKey(error.getErrorKey());
        e.setErrorMessage(error.getErrorMessage());
        e.setErrorCategory(error.getErrorCategory());
        //e.setParameters(error.getParameters());
        return e;
    }    
    
    private WSModuleDetail createWSModuleDetail(ModuleResultType module) {
    	WSModuleDetail wSModuleDetail = new WSModuleDetail();
    	wSModuleDetail.setCourseCode(module.getCourse());
    	wSModuleDetail.setCourseLevel(module.getCourseLevel());
    	wSModuleDetail.setCourseModule(module.getModule());
    	wSModuleDetail.setModuleEngName(module.getModuleEngName());
		wSModuleDetail.setModulePresentingEngCampusName(module.getModulePresEngCampusName());
		wSModuleDetail.setModulePresentingCampus(module.getModulePresCampus());
		wSModuleDetail.setModPresStartDate(module.getModulePeriodStartDate());
		wSModuleDetail.setModPresEndDate(module.getModulePeriodEndDate());
    	wSModuleDetail.setMethodOfDeliveryName(module.getMethodOfDeliveryName());
    	wSModuleDetail.setMethodOfDeliveryCode(module.getMODCode());
    	wSModuleDetail.setPresentationCategoryName(module.getPresentationCategoryName());
    	wSModuleDetail.setPresentationCategoryCode(module.getPresentationCategoryCode());
        return wSModuleDetail;
    }        
  

}
