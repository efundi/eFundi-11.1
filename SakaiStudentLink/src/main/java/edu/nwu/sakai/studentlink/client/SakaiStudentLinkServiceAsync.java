package edu.nwu.sakai.studentlink.client;

import java.util.List;
import java.util.Map;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface SakaiStudentLinkServiceAsync {

    void searchModules(Map<SearchCriteria, String> criteria,
            AsyncCallback<List<ModuleDetail>> callback);

    void validateLogin(User login, AsyncCallback<User> callback);

    void linkInstructorToModules(List<ModuleDetail> modules, Map<SearchCriteria, String> criteria,
            AsyncCallback<Void> callback);

    void unlinkInstructorFromModules(List<ModuleDetail> modules,
            Map<SearchCriteria, String> criteria, AsyncCallback<Void> callback);

	void becomeUser(String userName, AsyncCallback<User> callback);
}
