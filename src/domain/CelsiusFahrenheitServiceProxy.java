package domain;

public class CelsiusFahrenheitServiceProxy implements domain.CelsiusFahrenheitService {
  private String _endpoint = null;
  private domain.CelsiusFahrenheitService celsiusFahrenheitService = null;
  
  public CelsiusFahrenheitServiceProxy() {
    _initCelsiusFahrenheitServiceProxy();
  }
  
  public CelsiusFahrenheitServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCelsiusFahrenheitServiceProxy();
  }
  
  private void _initCelsiusFahrenheitServiceProxy() {
    try {
      celsiusFahrenheitService = (new domain.CelsiusFahrenheitServiceServiceLocator()).getCelsiusFahrenheitService();
      if (celsiusFahrenheitService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)celsiusFahrenheitService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)celsiusFahrenheitService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (celsiusFahrenheitService != null)
      ((javax.xml.rpc.Stub)celsiusFahrenheitService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public domain.CelsiusFahrenheitService getCelsiusFahrenheitService() {
    if (celsiusFahrenheitService == null)
      _initCelsiusFahrenheitServiceProxy();
    return celsiusFahrenheitService;
  }
  
  public java.lang.String convertCtoF(java.lang.String degrees_celsius) throws java.rmi.RemoteException{
    if (celsiusFahrenheitService == null)
      _initCelsiusFahrenheitServiceProxy();
    return celsiusFahrenheitService.convertCtoF(degrees_celsius);
  }
  
  public java.lang.String convertFtoC(java.lang.String degrees_fahrenheit) throws java.rmi.RemoteException{
    if (celsiusFahrenheitService == null)
      _initCelsiusFahrenheitServiceProxy();
    return celsiusFahrenheitService.convertFtoC(degrees_fahrenheit);
  }
  
  
}