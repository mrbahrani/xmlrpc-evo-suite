/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 01 06:42:46 GMT 2021
 */

package org.apache.xmlrpc.client;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import org.apache.xmlrpc.XmlRpcRequest;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.apache.xmlrpc.client.XmlRpcClientRequestImpl;
import org.apache.xmlrpc.client.XmlRpcHttpClientConfig;
import org.apache.xmlrpc.client.XmlRpcLite14HttpTransport;
import org.apache.xmlrpc.client.XmlRpcLiteHttpTransport;
import org.apache.xmlrpc.client.XmlRpcStreamTransport;
import org.apache.xmlrpc.common.XmlRpcHttpRequestConfigImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XmlRpcLiteHttpTransport_ESTest extends XmlRpcLiteHttpTransport_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcLite14HttpTransport xmlRpcLite14HttpTransport0 = new XmlRpcLite14HttpTransport(xmlRpcClient0);
      xmlRpcLite14HttpTransport0.setRequestHeader("'#~M&i-F%qx5+", "'#~M&i-F%qx5+");
      xmlRpcLite14HttpTransport0.setRequestHeader("'#~M&i-F%qx5+", "4sKsZ/]@EoNY");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcLiteHttpTransport xmlRpcLiteHttpTransport0 = new XmlRpcLiteHttpTransport(xmlRpcClient0);
      xmlRpcLiteHttpTransport0.close();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XmlRpcLiteHttpTransport xmlRpcLiteHttpTransport0 = new XmlRpcLiteHttpTransport((XmlRpcClient) null);
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      boolean boolean0 = xmlRpcLiteHttpTransport0.isUsingByteArrayOutput(xmlRpcClientConfigImpl0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcLiteHttpTransport xmlRpcLiteHttpTransport0 = new XmlRpcLiteHttpTransport(xmlRpcClient0);
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      URI uRI0 = MockURI.aFileURI;
      URL uRL0 = MockURI.toURL(uRI0);
      xmlRpcClientConfigImpl0.setServerURL(uRL0);
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) xmlRpcLiteHttpTransport0;
      XmlRpcClientRequestImpl xmlRpcClientRequestImpl0 = new XmlRpcClientRequestImpl(xmlRpcClientConfigImpl0, "Apache XML RPC 3.0", objectArray0);
      try { 
        xmlRpcLiteHttpTransport0.sendRequest(xmlRpcClientRequestImpl0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Failed to generate request: Unsupported Java type: org.apache.xmlrpc.client.XmlRpcLiteHttpTransport
         //
         verifyException("org.apache.xmlrpc.client.XmlRpcStreamTransport", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcLiteHttpTransport xmlRpcLiteHttpTransport0 = new XmlRpcLiteHttpTransport(xmlRpcClient0);
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      URL uRL0 = MockURL.getHttpExample();
      xmlRpcClientConfigImpl0.setServerURL(uRL0);
      Object[] objectArray0 = new Object[5];
      XmlRpcClientRequestImpl xmlRpcClientRequestImpl0 = new XmlRpcClientRequestImpl(xmlRpcClientConfigImpl0, "Apache XML RPC 3.0", objectArray0);
      try { 
        xmlRpcLiteHttpTransport0.sendRequest(xmlRpcClientRequestImpl0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Null values aren't supported, if isEnabledForExtensions() == false
         //
         verifyException("org.apache.xmlrpc.common.TypeFactoryImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcLiteHttpTransport xmlRpcLiteHttpTransport0 = new XmlRpcLiteHttpTransport(xmlRpcClient0);
      // Undeclared exception!
      try { 
        xmlRpcLiteHttpTransport0.sendRequest((XmlRpcRequest) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.client.XmlRpcLiteHttpTransport", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcLiteHttpTransport xmlRpcLiteHttpTransport0 = new XmlRpcLiteHttpTransport(xmlRpcClient0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      Object[] objectArray0 = new Object[4];
      XmlRpcClientRequestImpl xmlRpcClientRequestImpl0 = new XmlRpcClientRequestImpl(xmlRpcHttpRequestConfigImpl0, ",48X V\"TI:!$laU8", objectArray0);
      // Undeclared exception!
      try { 
        xmlRpcLiteHttpTransport0.sendRequest(xmlRpcClientRequestImpl0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.xmlrpc.common.XmlRpcHttpRequestConfigImpl cannot be cast to org.apache.xmlrpc.client.XmlRpcHttpClientConfig
         //
         verifyException("org.apache.xmlrpc.client.XmlRpcLiteHttpTransport", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcLite14HttpTransport xmlRpcLite14HttpTransport0 = new XmlRpcLite14HttpTransport(xmlRpcClient0);
      // Undeclared exception!
      try { 
        xmlRpcLite14HttpTransport0.newSocket(false, (String) null, (-1152));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-1152
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcLiteHttpTransport xmlRpcLiteHttpTransport0 = new XmlRpcLiteHttpTransport(xmlRpcClient0);
      // Undeclared exception!
      try { 
        xmlRpcLiteHttpTransport0.isUsingByteArrayOutput((XmlRpcHttpClientConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.client.XmlRpcHttpTransport", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcLiteHttpTransport xmlRpcLiteHttpTransport0 = new XmlRpcLiteHttpTransport(xmlRpcClient0);
      // Undeclared exception!
      try { 
        xmlRpcLiteHttpTransport0.getInputStream();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.client.XmlRpcLiteHttpTransport", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcLiteHttpTransport xmlRpcLiteHttpTransport0 = new XmlRpcLiteHttpTransport(xmlRpcClient0);
      try { 
        xmlRpcLiteHttpTransport0.newSocket(true, "Apache XML RPC 3.0", (-1694));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unable to create SSL connections, use the XmlRpcLite14HttpTransportFactory.
         //
         verifyException("org.apache.xmlrpc.client.XmlRpcLiteHttpTransport", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcLite14HttpTransport xmlRpcLite14HttpTransport0 = new XmlRpcLite14HttpTransport(xmlRpcClient0);
      xmlRpcLite14HttpTransport0.setRequestHeader("Apache XML RPC 3.0", "Apache XML RPC 3.0");
      xmlRpcLite14HttpTransport0.setRequestHeader("Apache XML RPC 3.0", "Apache XML RPC 3.0");
      xmlRpcLite14HttpTransport0.setRequestHeader("Apache XML RPC 3.0", "Apache XML RPC 3.0");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XmlRpcLiteHttpTransport xmlRpcLiteHttpTransport0 = new XmlRpcLiteHttpTransport((XmlRpcClient) null);
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      URL uRL0 = MockURL.getHttpExample();
      xmlRpcClientConfigImpl0.setServerURL(uRL0);
      Object[] objectArray0 = new Object[5];
      XmlRpcClientRequestImpl xmlRpcClientRequestImpl0 = new XmlRpcClientRequestImpl(xmlRpcClientConfigImpl0, "Apache XML RPC 3.0", objectArray0);
      // Undeclared exception!
      try { 
        xmlRpcLiteHttpTransport0.sendRequest(xmlRpcClientRequestImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.client.XmlRpcStreamTransport$ReqWriterImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcLite14HttpTransport xmlRpcLite14HttpTransport0 = new XmlRpcLite14HttpTransport(xmlRpcClient0);
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      Object[] objectArray0 = new Object[1];
      XmlRpcClientRequestImpl xmlRpcClientRequestImpl0 = new XmlRpcClientRequestImpl(xmlRpcClientConfigImpl0, "Apache XML RPC 3.0", objectArray0);
      XmlRpcStreamTransport.ReqWriterImpl xmlRpcStreamTransport_ReqWriterImpl0 = xmlRpcLite14HttpTransport0.new ReqWriterImpl(xmlRpcClientRequestImpl0);
      try { 
        xmlRpcLite14HttpTransport0.writeRequest(xmlRpcStreamTransport_ReqWriterImpl0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Failed to open connection to null:0: Remote address/port is not opened: org.evosuite.runtime.vnet.EndPointInfo@69a41bb4
         //
         verifyException("org.apache.xmlrpc.client.XmlRpcLiteHttpTransport", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XmlRpcLiteHttpTransport xmlRpcLiteHttpTransport0 = new XmlRpcLiteHttpTransport((XmlRpcClient) null);
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      boolean boolean0 = xmlRpcLiteHttpTransport0.isResponseGzipCompressed(xmlRpcClientConfigImpl0);
      assertFalse(boolean0);
  }
}
