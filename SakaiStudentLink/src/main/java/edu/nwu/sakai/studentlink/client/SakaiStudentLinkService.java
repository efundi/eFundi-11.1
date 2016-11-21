package edu.nwu.sakai.studentlink.client;

import java.util.List;
import java.util.Map;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import edu.nwu.sakaistudentlink.ws.error.IntegrationException;

@RemoteServiceRelativePath("link")
public interface SakaiStudentLinkService extends RemoteService {

    public List<ModuleDetail> searchModules(Map<SearchCriteria, String> criteria)
            throws IntegrationException;

    public User validateLogin(User login) throws Exception;

    public void linkInstructorToModules(List<ModuleDetail> modules,
            Map<SearchCriteria, String> criteria);

    public void unlinkInstructorFromModules(List<ModuleDetail> module,
            Map<SearchCriteria, String> criteria);

    public User becomeUser(String userName) throws Exception;

}
