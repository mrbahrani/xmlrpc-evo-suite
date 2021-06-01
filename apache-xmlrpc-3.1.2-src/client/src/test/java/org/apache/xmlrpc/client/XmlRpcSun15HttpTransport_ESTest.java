/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 01 06:44:29 GMT 2021
 */

package org.apache.xmlrpc.client;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcSun15HttpTransport;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XmlRpcSun15HttpTransport_ESTest extends XmlRpcSun15HttpTransport_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcSun15HttpTransport xmlRpcSun15HttpTransport0 = new XmlRpcSun15HttpTransport(xmlRpcClient0);
      Proxy proxy0 = Proxy.NO_PROXY;
      xmlRpcSun15HttpTransport0.setProxy(proxy0);
      Proxy proxy1 = xmlRpcSun15HttpTransport0.getProxy();
      assertEquals("DIRECT", proxy1.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcSun15HttpTransport xmlRpcSun15HttpTransport0 = new XmlRpcSun15HttpTransport(xmlRpcClient0);
      // Undeclared exception!
      try { 
        xmlRpcSun15HttpTransport0.newURLConnection((URL) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcSun15HttpTransport xmlRpcSun15HttpTransport0 = new XmlRpcSun15HttpTransport(xmlRpcClient0);
      Proxy proxy0 = xmlRpcSun15HttpTransport0.getProxy();
      assertNull(proxy0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcSun15HttpTransport xmlRpcSun15HttpTransport0 = new XmlRpcSun15HttpTransport(xmlRpcClient0);
      Proxy proxy0 = Proxy.NO_PROXY;
      xmlRpcSun15HttpTransport0.setProxy(proxy0);
      URL uRL0 = MockURL.getFileExample();
      try { 
        xmlRpcSun15HttpTransport0.newURLConnection(uRL0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // java.lang.UnsupportedOperationException: Method not implemented.
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcSun15HttpTransport xmlRpcSun15HttpTransport0 = new XmlRpcSun15HttpTransport(xmlRpcClient0);
      URL uRL0 = MockURL.getFileExample();
      URLConnection uRLConnection0 = xmlRpcSun15HttpTransport0.newURLConnection(uRL0);
      assertNull(uRLConnection0);
  }
}
