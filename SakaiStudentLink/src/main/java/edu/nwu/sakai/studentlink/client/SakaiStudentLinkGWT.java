package edu.nwu.sakai.studentlink.client;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.cell.client.Cell;
import com.google.gwt.cell.client.FieldUpdater;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;

import edu.nwu.sakai.studentlink.resources.SakaiStudentLinkBundle;
import edu.nwu.sakai.studentlink.resources.SakaiStudentLinkMessages;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class SakaiStudentLinkGWT implements EntryPoint {

    private final DockLayoutPanel dockLayoutPanel = new DockLayoutPanel(Unit.EM);

    private final LoginScreen loginScreen = new LoginScreen();

    private SearchModulePanel searchModule;

    private HeaderPanel headerPanel = null;

    private User user;

    private final SakaiStudentLinkServiceAsync sakaiStudentLinkService = GWT
            .create(SakaiStudentLinkService.class);

    private final List<ModuleDetail> linkedModules = new ArrayList<ModuleDetail>();

    private final List<ModuleDetail> unlinkedModules = new ArrayList<ModuleDetail>();

    /**
     * Get a cell value from a record.
     * 
     * @param <C>
     *            the cell type
     */
    private static interface GetValue<C> {

        C getValue(ModuleDetail module);
    }

    private static SakaiStudentLinkGWT singleton;

    public static SakaiStudentLinkGWT get() {
        return singleton;
    }

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
        SakaiStudentLinkBundle.INSTANCE.css().ensureInjected();
        singleton = this;
        createJQueryMaskDefinitions();
        searchModule = new SearchModulePanel();
        RootPanel.get().add(loginScreen);
    }

    private void createJQueryMaskDefinitions() {
        JQueryMaskUtility.createMaskDefinition("~", "%*A-Za-z");
        JQueryMaskUtility.createMaskDefinition("#", "%*0-9");
    }

    public void loadUserScreen() {
        RootPanel.get().clear();
        RootLayoutPanel.get().clear();
        searchModule.clearPanel();
        dockLayoutPanel.clear();
        headerPanel = new HeaderPanel(getUser().isAdminUser());
        dockLayoutPanel.addNorth(headerPanel, 10);
        dockLayoutPanel.add(searchModule);
        RootLayoutPanel.get().add(dockLayoutPanel);
        RootPanel.get().add(RootLayoutPanel.get());//this line is needed if performing 2+ logins during the same session
        headerPanel.setUserName(user.getFirstName() + " " + user.getSurname());
    }

    void saveAndExit() {
        //Save
        if (!linkedModules.isEmpty()) {
            linkInstructorToModules();
        }
        if (!unlinkedModules.isEmpty()) {
            unlinkInstructorFromModules();
        }
        //Exit
        RootPanel.get().clear();
        RootLayoutPanel.get().clear();
        loginScreen.clearPanel();
        RootPanel.get().add(loginScreen);
    }

    public void initModuleResults(CellTable<ModuleDetail> cellTable) {

        // CheckboxCell.
        EnabledCheckboxCell linkedToInstrChbx = new EnabledCheckboxCell();
        addColumn(linkedToInstrChbx, SakaiStudentLinkMessages.INSTANCE.linkedToInstructor(),
            new GetValue<Boolean>() {

                public Boolean getValue(ModuleDetail module) {
                    return module.isLinkedToLecturer();
                }
            }, new FieldUpdater<ModuleDetail, Boolean>() {

                public void update(int index, ModuleDetail module, Boolean value) {
                    //The check box is ON
                    if (value) {
                        if (module.isLinkedToLecturer()) {
                            unlinkedModules.remove(module);
                        }
                        else {
                            linkedModules.add(module);
                        }
                    }
                    //The check box is OFF
                    else {
                        if (module.isLinkedToLecturer()) {
                            unlinkedModules.add(module);
                        }
                        else {
                            linkedModules.remove(module);
                        }
                    }
                }
            }, cellTable);
        TextColumn<ModuleDetail> linkedByLecturerColumn = new TextColumn<ModuleDetail>() {

            public String getValue(ModuleDetail module) {
                return module.getLinkedByLecturer();
            }
        };
        cellTable.addColumn(linkedByLecturerColumn,
            SakaiStudentLinkMessages.INSTANCE.linkedByLecturer());
        
        TextColumn<ModuleDetail> campusColumn = new TextColumn<ModuleDetail>() {

            public String getValue(ModuleDetail module) {
                return module.getModulePresentingEngCampusName();
            }
        };
        TextColumn<ModuleDetail> moduleColumn = new TextColumn<ModuleDetail>() {

            public String getValue(ModuleDetail module) {
                StringBuilder sb = new StringBuilder(module.getCourseCode());
                sb.append(" ");
                sb.append(module.getCourseLevel());
                sb.append(" ");
                sb.append(module.getCourseModule());
                return sb.toString();
            }
        };
        TextColumn<ModuleDetail> nameColumn = new TextColumn<ModuleDetail>() {

            public String getValue(ModuleDetail module) {
                return module.getModuleEngName();
            }
        };
        cellTable.addColumn(campusColumn, SakaiStudentLinkMessages.INSTANCE.campus(""));
        cellTable.addColumn(moduleColumn, SakaiStudentLinkMessages.INSTANCE.module(""));
        cellTable.addColumn(nameColumn, SakaiStudentLinkMessages.INSTANCE.name());
        
        TextColumn<ModuleDetail> methodOfDeliveryColumn = new TextColumn<ModuleDetail>() {

            public String getValue(ModuleDetail module) {
                return module.getMethodOfDeliveryName();
            }
        };
        cellTable.addColumn(methodOfDeliveryColumn, SakaiStudentLinkMessages.INSTANCE.methodOfDelivery(""));
        TextColumn<ModuleDetail> presentationCategoryColumn = new TextColumn<ModuleDetail>() {

            public String getValue(ModuleDetail module) {
                return module.getPresentationCategoryName();
            }
        };
        cellTable.addColumn(presentationCategoryColumn, SakaiStudentLinkMessages.INSTANCE.presentationCategory(""));        
        cellTable.setRowData(0, new ArrayList<ModuleDetail>());
        cellTable.setRowCount(0);
        cellTable.setPageSize(10);
        cellTable.setWidth("100%");
        //cellTable.addStyleName("moduleResult");
    }

    private <C> void addColumn(final Cell<C> cell, String headerText, final GetValue<C> getter,
            FieldUpdater<ModuleDetail, C> fieldUpdater, CellTable<ModuleDetail> cellTable) {
        Column<ModuleDetail, C> column = new Column<ModuleDetail, C>(cell) {

            @Override
            public C getValue(ModuleDetail object) {
                if (cell instanceof EnabledCheckboxCell) {
                    EnabledCheckboxCell enabledCheckboxCell = (EnabledCheckboxCell) cell;
                    if (object.getLinkedByLecturer() == null
                            || "".equals(object.getLinkedByLecturer())
                            || user.getUserName().equals(object.getLinkedByLecturer())) {
                        enabledCheckboxCell.setDisabled(false);
                    }
                    else {
                        enabledCheckboxCell.setDisabled(true);
                    }
                }
                return getter.getValue(object);
            }
        };
        column.setFieldUpdater(fieldUpdater);
        cellTable.addColumn(column, headerText);
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    private void linkInstructorToModules() {
        AsyncCallback<Void> callBack = new AsyncCallback<Void>() {

            public void onFailure(Throwable caught) {
                MessageBox msg = new MessageBox(SakaiStudentLinkMessages.INSTANCE.error(),
                        caught.getMessage());
                msg.show();
            }

            public void onSuccess(Void result) {
                linkedModules.clear();
                //for (ModuleDetail module : modules) {
                //    module.setLinkedToLecturer(true);
                //}
            }
        };
        sakaiStudentLinkService.linkInstructorToModules(linkedModules,
            searchModule.buildModuleSearchCriteria(), callBack);
    }

    private void unlinkInstructorFromModules() {
        AsyncCallback<Void> callBack = new AsyncCallback<Void>() {

            public void onFailure(Throwable caught) {
                MessageBox msg = new MessageBox(SakaiStudentLinkMessages.INSTANCE.error(),
                        caught.getMessage());
                msg.show();
            }

            public void onSuccess(Void result) {
                unlinkedModules.clear();
            }
        };
        sakaiStudentLinkService.unlinkInstructorFromModules(unlinkedModules,
            searchModule.buildModuleSearchCriteria(), callBack);
    }
}
