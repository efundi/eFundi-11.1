/**
 * Findsearchmoduleinformationprocess_client_epLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation;

public class Findsearchmoduleinformationprocess_client_epLocator extends org.apache.axis.client.Service implements za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation.Findsearchmoduleinformationprocess_client_ep {

    public Findsearchmoduleinformationprocess_client_epLocator() {
    }


    public Findsearchmoduleinformationprocess_client_epLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Findsearchmoduleinformationprocess_client_epLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FindSearchModuleInformationProcess_pt
    private java.lang.String FindSearchModuleInformationProcess_pt_address = "http://v-soatst-ap-lnx1.nwu.ac.za:8001/soa-infra/services/Development/FindSearchModuleInformation/findsearchmoduleinformationprocess_client_ep";

    public java.lang.String getFindSearchModuleInformationProcess_ptAddress() {
        return FindSearchModuleInformationProcess_pt_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FindSearchModuleInformationProcess_ptWSDDServiceName = "FindSearchModuleInformationProcess_pt";

    public java.lang.String getFindSearchModuleInformationProcess_ptWSDDServiceName() {
        return FindSearchModuleInformationProcess_ptWSDDServiceName;
    }

    public void setFindSearchModuleInformationProcess_ptWSDDServiceName(java.lang.String name) {
        FindSearchModuleInformationProcess_ptWSDDServiceName = name;
    }

    public za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation.FindSearchModuleInformationProcess getFindSearchModuleInformationProcess_pt() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FindSearchModuleInformationProcess_pt_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFindSearchModuleInformationProcess_pt(endpoint);
    }

    public za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation.FindSearchModuleInformationProcess getFindSearchModuleInformationProcess_pt(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation.FindSearchModuleInformationProcessBindingStub _stub = new za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation.FindSearchModuleInformationProcessBindingStub(portAddress, this);
            _stub.setPortName(getFindSearchModuleInformationProcess_ptWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFindSearchModuleInformationProcess_ptEndpointAddress(java.lang.String address) {
        FindSearchModuleInformationProcess_pt_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation.FindSearchModuleInformationProcess.class.isAssignableFrom(serviceEndpointInterface)) {
                za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation.FindSearchModuleInformationProcessBindingStub _stub = new za.ac.nwu.www.itcentral.bsi.moduleInformation.FindSearchModuleInformationService.moduleInformation.FindSearchModuleInformationProcessBindingStub(new java.net.URL(FindSearchModuleInformationProcess_pt_address), this);
                _stub.setPortName(getFindSearchModuleInformationProcess_ptWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("FindSearchModuleInformationProcess_pt".equals(inputPortName)) {
            return getFindSearchModuleInformationProcess_pt();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "findsearchmoduleinformationprocess_client_ep");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.nwu.ac.za/itcentral/bsi/moduleInformation/FindSearchModuleInformationService/moduleInformation", "FindSearchModuleInformationProcess_pt"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FindSearchModuleInformationProcess_pt".equals(portName)) {
            setFindSearchModuleInformationProcess_ptEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
