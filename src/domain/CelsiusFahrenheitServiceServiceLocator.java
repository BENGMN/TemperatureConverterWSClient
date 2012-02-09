/**
 * CelsiusFahrenheitServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package domain;

public class CelsiusFahrenheitServiceServiceLocator extends org.apache.axis.client.Service implements domain.CelsiusFahrenheitServiceService {

    public CelsiusFahrenheitServiceServiceLocator() {
    }


    public CelsiusFahrenheitServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CelsiusFahrenheitServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CelsiusFahrenheitService
    private java.lang.String CelsiusFahrenheitService_address = "http://localhost:8080/TemperatureConverterWS/services/CelsiusFahrenheitService";

    public java.lang.String getCelsiusFahrenheitServiceAddress() {
        return CelsiusFahrenheitService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CelsiusFahrenheitServiceWSDDServiceName = "CelsiusFahrenheitService";

    public java.lang.String getCelsiusFahrenheitServiceWSDDServiceName() {
        return CelsiusFahrenheitServiceWSDDServiceName;
    }

    public void setCelsiusFahrenheitServiceWSDDServiceName(java.lang.String name) {
        CelsiusFahrenheitServiceWSDDServiceName = name;
    }

    public domain.CelsiusFahrenheitService getCelsiusFahrenheitService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CelsiusFahrenheitService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCelsiusFahrenheitService(endpoint);
    }

    public domain.CelsiusFahrenheitService getCelsiusFahrenheitService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            domain.CelsiusFahrenheitServiceSoapBindingStub _stub = new domain.CelsiusFahrenheitServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCelsiusFahrenheitServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCelsiusFahrenheitServiceEndpointAddress(java.lang.String address) {
        CelsiusFahrenheitService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (domain.CelsiusFahrenheitService.class.isAssignableFrom(serviceEndpointInterface)) {
                domain.CelsiusFahrenheitServiceSoapBindingStub _stub = new domain.CelsiusFahrenheitServiceSoapBindingStub(new java.net.URL(CelsiusFahrenheitService_address), this);
                _stub.setPortName(getCelsiusFahrenheitServiceWSDDServiceName());
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
        if ("CelsiusFahrenheitService".equals(inputPortName)) {
            return getCelsiusFahrenheitService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://domain", "CelsiusFahrenheitServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://domain", "CelsiusFahrenheitService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CelsiusFahrenheitService".equals(portName)) {
            setCelsiusFahrenheitServiceEndpointAddress(address);
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
