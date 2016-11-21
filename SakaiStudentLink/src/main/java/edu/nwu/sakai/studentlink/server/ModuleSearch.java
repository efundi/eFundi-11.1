package edu.nwu.sakai.studentlink.server;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.apache.log4j.Logger;

import edu.nwu.sakai.studentlink.client.ModuleDetail;
import edu.nwu.sakai.studentlink.client.SearchCriteria;
import edu.nwu.sakaistudentlink.ws.APDService;
import edu.nwu.sakaistudentlink.ws.APDServiceLocator;
import edu.nwu.sakaistudentlink.ws.error.IntegrationException;
import za.ac.nwu.www.itcentral.bsi.vss.APDFindSearchModuleWS.types.WSModuleDetail;

public class ModuleSearch {

    private static final Logger log = Logger.getLogger(ModuleSearch.class);

    private static ModuleSearch instance;

    private ModuleSearch() {
    }

    public static ModuleSearch getInstance() {
        if (instance == null) {
            instance = new ModuleSearch();
        }
        return instance;
    }

    @SuppressWarnings("deprecation")
    public List<ModuleDetail> findSearchModule(Map<SearchCriteria, String> criteria)
            throws IntegrationException {
        if ("1".equals(SettingsProperties.getProperty("kons.jdbc.modules", "0"))) {
            return findSearchModuleJDBC(criteria);
        }
        APDService service = APDServiceLocator.getInstance(SettingsProperties.getProperty(
            "ws.module.client", "edu.nwu.sakaistudentlink.ws.impl.APDServiceBPELImpl"));
        List<ModuleDetail> modules = new ArrayList<ModuleDetail>();
        TreeSet<ModuleDetail> moduleSet = new TreeSet<ModuleDetail>();
        int year = getYear(criteria.get(SearchCriteria.YEAR));
        Date startDate = new Date(year - 1900, 0, 1);
        Date endDate = new Date(year - 1900, 11, 30);

        final String methodOfDeliveryCode = criteria.get(SearchCriteria.METHOD_OF_DEL);
        final String presentationCategoryCode = criteria.get(SearchCriteria.PRESENT_CAT);   
        List<WSModuleDetail> result = service
                .findSearchModule(
                    criteria.get(SearchCriteria.COURSE_CODE),
                    criteria.get(SearchCriteria.COURSE_LEVEL),
                    criteria.get(SearchCriteria.COURSE_MODULE),
                    null,
                    methodOfDeliveryCode,
                    0,
                    "",
                    "",
                    0,
                    presentationCategoryCode,
                    "",
                    100,
                    null,
                    SettingsProperties
                            .getProperty("ws.module.port",
                                "http://v-soatst-ap-lnx1.nwu.ac.za:8001/soa-infra/services/Development/FindSearchModuleInformation/findsearchmoduleinformationprocess_client_ep"));
        // new Date(getYear(criteria.get("YEAR"))-1900, 0, 1)		
        for (WSModuleDetail module : result) {
            if (module.getModulePresentingCampus() != null
                    && (module.getModulePresentingCampus().toString()
                            .equals(criteria.get(SearchCriteria.CAMPUS)) || criteria.get(
                        SearchCriteria.CAMPUS).equals("0"))) {
                Date moduleStart = module.getModPresStartDate();
                Date moduleEnd = module.getModPresEndDate();
                if ((moduleStart == null || startDate.after(moduleStart) || startDate
                        .compareTo(moduleStart) == 0)
                        && (moduleEnd == null || endDate.before(moduleEnd) || endDate
                                .compareTo(moduleEnd) == 0)) {
                    ModuleDetail detail = new ModuleDetail();
                    detail.setCourseCode(module.getCourseCode());
                    detail.setCourseLevel(module.getCourseLevel());
                    detail.setCourseModule(module.getCourseModule());
                    detail.setModuleEngName(module.getModuleEngName());
                    detail.setModulePresentingEngCampusName(module
                            .getModulePresentingEngCampusName());
                    detail.setModulePresentingCampus(module.getModulePresentingCampus());
                    detail.setModuleStartDate(moduleStart);
                    detail.setModuleEndDate(moduleEnd);
                    detail.setLinkedByLecturer(getLinkedByLecturer(year, module.getCourseCode(),
                        module.getCourseLevel(), module.getCourseModule(),
                        module.getModulePresentingCampus(), presentationCategoryCode, methodOfDeliveryCode));
                    detail.setMethodOfDeliveryName(module.getMethodOfDeliveryName());
                    detail.setMethodOfDeliveryCode(module.getMethodOfDeliveryCode());
                	detail.setPresentationCategoryName(module.getPresentationCategoryName());
                	detail.setPresentationCategoryCode(module.getPresentationCategoryCode());                	
                    moduleSet.add(detail);
                }
            }
        }
        modules.addAll(moduleSet);
        return modules;
    }

    private String getLinkedByLecturer(int year, String courseCode, String courseLevel,
            String courseModule, Integer campus, String presentationCategoryCode, String methodOfDeliveryCode) {
        log.info("Performing ModuleSearch.getLinkedByLecturer ");
        PreparedStatement pstmt = null;
        Connection conn = null;
        ResultSet rset = null;
        String lecturerName = "";
        try {
            conn = ConnectionManager.getCourseManagementConnection();
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT l.username ");
            sql.append("FROM CM_MODULES m, ");
            sql.append("CM_LECTURER l, ");
            sql.append("CM_YEAR_CAMPUS c ");
            sql.append("WHERE  ");
            //            sql.append("-- AND m.status in ('') DONE, INSERTED ? ");
            sql.append("m.lecturer_f_id = l.lecturer_id ");
            sql.append("AND l.year_campus_f_id = c.year_campus_id ");
            sql.append("AND c.year = ? ");
            sql.append("AND m.course_code = ? ");
            sql.append("AND m.course_level = ? ");
            sql.append("AND m.course_module = ? ");
            if (campus.intValue() != 0) {
                sql.append("AND c.campus_code = ? ");
            }
            sql.append("and m.method_of_del = ? ");
            sql.append("and m.present_cat = ?");
            pstmt = conn.prepareStatement(sql.toString());
            int cnt = 1;
            pstmt.setInt(cnt++, year);
            pstmt.setString(cnt++, courseCode);
            pstmt.setString(cnt++, courseLevel);
            pstmt.setString(cnt++, courseModule);
            if (campus.intValue() != 0) {
                pstmt.setInt(cnt++, campus.intValue());
            }
            pstmt.setInt(cnt++, methodOfDeliveryCode == null ? 0 : Integer.valueOf(methodOfDeliveryCode));
            pstmt.setInt(cnt++, presentationCategoryCode == null ? 0 : Integer.valueOf(presentationCategoryCode));
            rset = pstmt.executeQuery();
            while (rset.next()) {
                lecturerName = rset.getString(1);
                break;
            }
        }
        catch (ConnectionNotEstablishedException e) {
            log.error(
                "A SQL Connection could not be established while performing findSearchModuleJDBC",
                e);
        }
        catch (SQLException e) {
            log.error("SQL error occured when performing ModuleSearch.getLinkedByLecturer", e);
        }
        finally {
            try {
                ConnectionManager.close(rset, pstmt, conn);
            }
            catch (Exception e) {
                log.error("Error closing connection", e);
            }
        }
        return lecturerName;
    }

    private int getYear(String year) {
        return Integer.parseInt(year);
    }

    private List<ModuleDetail> findSearchModuleJDBC(Map<SearchCriteria, String> criteria) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        List<ModuleDetail> modules = new ArrayList<ModuleDetail>();
        Set<ModuleDetail> moduleSet = new TreeSet<ModuleDetail>();
        final int year = getYear(criteria.get(SearchCriteria.YEAR));
        final String courseCode = criteria.get(SearchCriteria.COURSE_CODE);
        final String courseLevel = criteria.get(SearchCriteria.COURSE_LEVEL);
        final String courseModule = criteria.get(SearchCriteria.COURSE_MODULE);
        final String campus = criteria.get(SearchCriteria.CAMPUS);
        final String methodOfDeliveryCode = criteria.get(SearchCriteria.METHOD_OF_DEL);
        final String presentationCategoryCode = criteria.get(SearchCriteria.PRESENT_CAT);   
        try {
            conn = ConnectionManager.getConsolidationConnection();
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT COURSE_CODE,COURSE_LEVEL,COURSE_MODULE,MODULE_NAME,CAMPUS_NAME,CAMPUS_CODE,START_DATE,END_DATE ");
            sql.append("FROM MODULES ");
            sql.append("WHERE COURSE_CODE LIKE ? ");
            sql.append("AND COURSE_LEVEL LIKE ? ");
            sql.append("AND COURSE_MODULE LIKE ? ");
            if (!campus.equals("0")) {
                sql.append("AND CAMPUS_CODE = ?");
            }
            System.out.println(sql.toString());
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1, "".equals(courseCode) ? "'%'" : courseCode);
            pstmt.setString(2, "".equals(courseLevel) ? "'%'" : courseLevel);
            pstmt.setString(3, "".equals(courseModule) ? "'%'" : courseModule);
            if (!campus.equals("0")) {
                pstmt.setString(4, campus);
            }
            rset = pstmt.executeQuery();
            while (rset.next()) {
                ModuleDetail mod = new ModuleDetail();
                String rsCourseCode = rset.getString(1);
                String rsCourseLevel = rset.getString(2);
                String rsCourseModule = rset.getString(3);
                mod.setCourseCode(rsCourseCode);
                mod.setCourseLevel(rsCourseLevel);
                mod.setCourseModule(rsCourseModule);
                mod.setModuleEngName(rset.getString(4));
                mod.setModulePresentingEngCampusName(rset.getString(5));
                int rsCampus = rset.getInt(6);
                mod.setModulePresentingCampus(rsCampus);
                mod.setModuleStartDate(rset.getDate(7));
                mod.setModuleEndDate(rset.getDate(8));
                mod.setLinkedByLecturer(getLinkedByLecturer(year, rsCourseCode, rsCourseLevel,
                    rsCourseModule, rsCampus, presentationCategoryCode, methodOfDeliveryCode));
                moduleSet.add(mod);
            }
        }
        catch (ConnectionNotEstablishedException e) {
            log.error(
                "A SQL Connection could not be established while performing findSearchModuleJDBC",
                e);
        }
        catch (SQLException e) {
            log.error("A SQL Error occurred while performing findSearchModuleJDBC", e);
        }
        finally {
            ConnectionManager.close(rset, pstmt, conn);
        }
        modules.addAll(moduleSet);
        return modules;
    }
}