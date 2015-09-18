/**
 * CalculadoraServerImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public class CalculadoraServerImplServiceLocator extends org.apache.axis.client.Service implements ws.CalculadoraServerImplService {

    public CalculadoraServerImplServiceLocator() {
    }


    public CalculadoraServerImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CalculadoraServerImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CalculadoraServerImplPort
    private java.lang.String CalculadoraServerImplPort_address = "http://127.0.0.1:9876/calc";

    public java.lang.String getCalculadoraServerImplPortAddress() {
        return CalculadoraServerImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CalculadoraServerImplPortWSDDServiceName = "CalculadoraServerImplPort";

    public java.lang.String getCalculadoraServerImplPortWSDDServiceName() {
        return CalculadoraServerImplPortWSDDServiceName;
    }

    public void setCalculadoraServerImplPortWSDDServiceName(java.lang.String name) {
        CalculadoraServerImplPortWSDDServiceName = name;
    }

    public ws.CalculadoraServer getCalculadoraServerImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CalculadoraServerImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCalculadoraServerImplPort(endpoint);
    }

    public ws.CalculadoraServer getCalculadoraServerImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ws.CalculadoraServerImplPortBindingStub _stub = new ws.CalculadoraServerImplPortBindingStub(portAddress, this);
            _stub.setPortName(getCalculadoraServerImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCalculadoraServerImplPortEndpointAddress(java.lang.String address) {
        CalculadoraServerImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ws.CalculadoraServer.class.isAssignableFrom(serviceEndpointInterface)) {
                ws.CalculadoraServerImplPortBindingStub _stub = new ws.CalculadoraServerImplPortBindingStub(new java.net.URL(CalculadoraServerImplPort_address), this);
                _stub.setPortName(getCalculadoraServerImplPortWSDDServiceName());
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
        if ("CalculadoraServerImplPort".equals(inputPortName)) {
            return getCalculadoraServerImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws/", "CalculadoraServerImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws/", "CalculadoraServerImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CalculadoraServerImplPort".equals(portName)) {
            setCalculadoraServerImplPortEndpointAddress(address);
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
