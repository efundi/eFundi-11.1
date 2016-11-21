package za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation;

public class FindSearchModuleInformationProcessProxy implements za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation.FindSearchModuleInformationProcess {
  private String _endpoint = null;
  private za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation.FindSearchModuleInformationProcess findSearchModuleInformationProcess = null;
  
  public FindSearchModuleInformationProcessProxy() {
    _initFindSearchModuleInformationProcessProxy();
  }
  
  public FindSearchModuleInformationProcessProxy(String endpoint) {
    _endpoint = endpoint;
    _initFindSearchModuleInformationProcessProxy();
  }
  
  private void _initFindSearchModuleInformationProcessProxy() {
    try {
      findSearchModuleInformationProcess = (new za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation.Findsearchmoduleinformationprocess_client_epLocator()).getFindSearchModuleInformationProcess_pt();
      if (findSearchModuleInformationProcess != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)findSearchModuleInformationProcess)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)findSearchModuleInformationProcess)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (findSearchModuleInformationProcess != null)
      ((javax.xml.rpc.Stub)findSearchModuleInformationProcess)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation.FindSearchModuleInformationProcess getFindSearchModuleInformationProcess() {
    if (findSearchModuleInformationProcess == null)
      _initFindSearchModuleInformationProcessProxy();
    return findSearchModuleInformationProcess;
  }
  
  public za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation.ModuleSearchResult process(za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation.ModuleInformationType payload) throws java.rmi.RemoteException{
    if (findSearchModuleInformationProcess == null)
      _initFindSearchModuleInformationProcessProxy();
    return findSearchModuleInformationProcess.process(payload);
  }
  
  
}