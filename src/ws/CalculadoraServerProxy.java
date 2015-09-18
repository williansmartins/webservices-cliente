package ws;

public class CalculadoraServerProxy implements ws.CalculadoraServer {
  private String _endpoint = null;
  private ws.CalculadoraServer calculadoraServer = null;
  
  public CalculadoraServerProxy() {
    _initCalculadoraServerProxy();
  }
  
  public CalculadoraServerProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculadoraServerProxy();
  }
  
  private void _initCalculadoraServerProxy() {
    try {
      calculadoraServer = (new ws.CalculadoraServerImplServiceLocator()).getCalculadoraServerImplPort();
      if (calculadoraServer != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculadoraServer)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculadoraServer)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculadoraServer != null)
      ((javax.xml.rpc.Stub)calculadoraServer)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ws.CalculadoraServer getCalculadoraServer() {
    if (calculadoraServer == null)
      _initCalculadoraServerProxy();
    return calculadoraServer;
  }
  
  public float soma(float arg0, float arg1) throws java.rmi.RemoteException{
    if (calculadoraServer == null)
      _initCalculadoraServerProxy();
    return calculadoraServer.soma(arg0, arg1);
  }
  
  public float subtracao(float arg0, float arg1) throws java.rmi.RemoteException{
    if (calculadoraServer == null)
      _initCalculadoraServerProxy();
    return calculadoraServer.subtracao(arg0, arg1);
  }
  
  public float multiplicacao(float arg0, float arg1) throws java.rmi.RemoteException{
    if (calculadoraServer == null)
      _initCalculadoraServerProxy();
    return calculadoraServer.multiplicacao(arg0, arg1);
  }
  
  public float divisao(float arg0, float arg1) throws java.rmi.RemoteException{
    if (calculadoraServer == null)
      _initCalculadoraServerProxy();
    return calculadoraServer.divisao(arg0, arg1);
  }
  
  
}