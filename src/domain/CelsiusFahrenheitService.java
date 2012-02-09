/**
 * CelsiusFahrenheitService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package domain;

public interface CelsiusFahrenheitService extends java.rmi.Remote {
    public java.lang.String convertCtoF(java.lang.String degrees_celsius) throws java.rmi.RemoteException;
    public java.lang.String convertFtoC(java.lang.String degrees_fahrenheit) throws java.rmi.RemoteException;
}
