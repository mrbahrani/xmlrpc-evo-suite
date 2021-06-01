/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 01 06:49:09 GMT 2021
 */

package org.apache.xmlrpc.client;

import org.junit.Test;
import static org.junit.Assert.*;
import javax.net.ssl.SSLSocketFactory;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcSun14HttpTransportFactory;
import org.apache.xmlrpc.client.XmlRpcTransport;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XmlRpcSun14HttpTransportFactory_ESTest extends XmlRpcSun14HttpTransportFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XmlRpcSun14HttpTransportFactory xmlRpcSun14HttpTransportFactory0 = new XmlRpcSun14HttpTransportFactory((XmlRpcClient) null);
      SSLSocketFactory sSLSocketFactory0 = xmlRpcSun14HttpTransportFactory0.getSSLSocketFactory();
      assertNull(sSLSocketFactory0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XmlRpcSun14HttpTransportFactory xmlRpcSun14HttpTransportFactory0 = new XmlRpcSun14HttpTransportFactory((XmlRpcClient) null);
      XmlRpcTransport xmlRpcTransport0 = xmlRpcSun14HttpTransportFactory0.getTransport();
      assertNotNull(xmlRpcTransport0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XmlRpcSun14HttpTransportFactory xmlRpcSun14HttpTransportFactory0 = new XmlRpcSun14HttpTransportFactory((XmlRpcClient) null);
      xmlRpcSun14HttpTransportFactory0.setSSLSocketFactory((SSLSocketFactory) null);
  }
}
