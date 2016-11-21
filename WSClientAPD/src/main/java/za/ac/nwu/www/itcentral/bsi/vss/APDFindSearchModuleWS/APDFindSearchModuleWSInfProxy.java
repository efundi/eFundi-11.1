package za.ac.nwu.www.itcentral.bsi.vss.APDFindSearchModuleWS;

public class APDFindSearchModuleWSInfProxy implements za.ac.nwu.www.itcentral.bsi.vss.APDFindSearchModuleWS.APDFindSearchModuleWSInf {
  private String _endpoint = null;
  private za.ac.nwu.www.itcentral.bsi.vss.APDFindSearchModuleWS.APDFindSearchModuleWSInf aPDFindSearchModuleWSInf = null;
  
  public APDFindSearchModuleWSInfProxy() {
    _initAPDFindSearchModuleWSInfProxy();
  }
  
  public APDFindSearchModuleWSInfProxy(String endpoint) {
    _endpoint = endpoint;
    _initAPDFindSearchModuleWSInfProxy();
  }
  
  private void _initAPDFindSearchModuleWSInfProxy() {
    try {
      aPDFindSearchModuleWSInf = (new za.ac.nwu.www.itcentral.bsi.vss.APDFindSearchModuleWS.APDFindSearchModuleWSLocator()).getAPDFindSearchModuleWSInfPort();
      if (aPDFindSearchModuleWSInf != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)aPDFindSearchModuleWSInf)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)aPDFindSearchModuleWSInf)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (aPDFindSearchModuleWSInf != null)
      ((javax.xml.rpc.Stub)aPDFindSearchModuleWSInf)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public za.ac.nwu.www.itcentral.bsi.vss.APDFindSearchModuleWS.APDFindSearchModuleWSInf getAPDFindSearchModuleWSInf() {
    if (aPDFindSearchModuleWSInf == null)
      _initAPDFindSearchModuleWSInfProxy();
    return aPDFindSearchModuleWSInf;
  }
  
  public za.ac.nwu.www.itcentral.bsi.vss.APDFindSearchModuleWS.types.WSModuleDetailResult findSearchModule(za.ac.nwu.www.itcentral.bsi.vss.APDFindSearchModuleWS.types.WebServiceUser webServiceUser_1, za.ac.nwu.www.itcentral.bsi.vss.APDFindSearchModuleWS.types.WSFindSearchModule findSearchModule) throws java.rmi.RemoteException{
    if (aPDFindSearchModuleWSInf == null)
      _initAPDFindSearchModuleWSInfProxy();
    return aPDFindSearchModuleWSInf.findSearchModule(webServiceUser_1, findSearchModule);
  }
  
  
}