package edu.nwu.sakaistudentlink.ws;

import java.util.Date;
import java.util.List;

import edu.nwu.sakaistudentlink.ws.error.IntegrationException;


import za.ac.nwu.www.itcentral.bsi.vss.APDFindSearchModuleWS.types.WSModuleDetail;

public interface APDService {
	
	public List<WSModuleDetail> findSearchModule(String courseCode,
            String courseLevel, String courseModule, Date endDate, String methodOfDeliveryCode,
            int moduleAPID, String moduleName, String modulePeriodCode, int nameType,
            String presentationCategoryCode, String presentationOpportunityCode, int readLimit,
            Date startDate, String port_url) throws IntegrationException;

}
