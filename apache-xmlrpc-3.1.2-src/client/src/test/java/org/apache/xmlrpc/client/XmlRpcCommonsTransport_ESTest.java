/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 01 06:42:01 GMT 2021
 */

package org.apache.xmlrpc.client;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.URL;
import java.util.LinkedList;
import java.util.Locale;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.apache.xmlrpc.client.XmlRpcClientRequestImpl;
import org.apache.xmlrpc.client.XmlRpcCommonsTransport;
import org.apache.xmlrpc.client.XmlRpcCommonsTransportFactory;
import org.apache.xmlrpc.client.XmlRpcHttpClientConfig;
import org.apache.xmlrpc.client.XmlRpcStreamTransport;
import org.apache.xmlrpc.common.XmlRpcHttpRequestConfigImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XmlRpcCommonsTransport_ESTest extends XmlRpcCommonsTransport_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcCommonsTransportFactory xmlRpcCommonsTransportFactory0 = new XmlRpcCommonsTransportFactory(xmlRpcClient0);
      XmlRpcCommonsTransport xmlRpcCommonsTransport0 = new XmlRpcCommonsTransport(xmlRpcCommonsTransportFactory0);
      PostMethod postMethod0 = new PostMethod();
      xmlRpcCommonsTransport0.method = postMethod0;
      xmlRpcCommonsTransport0.setRequestHeader(")c&", (String) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XmlRpcCommonsTransportFactory xmlRpcCommonsTransportFactory0 = new XmlRpcCommonsTransportFactory((XmlRpcClient) null);
      XmlRpcCommonsTransport xmlRpcCommonsTransport0 = new XmlRpcCommonsTransport(xmlRpcCommonsTransportFactory0);
      PostMethod postMethod0 = new PostMethod();
      xmlRpcCommonsTransport0.method = postMethod0;
      xmlRpcCommonsTransport0.close();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcCommonsTransportFactory xmlRpcCommonsTransportFactory0 = new XmlRpcCommonsTransportFactory(xmlRpcClient0);
      XmlRpcCommonsTransport xmlRpcCommonsTransport0 = new XmlRpcCommonsTransport(xmlRpcCommonsTransportFactory0);
      HttpClient httpClient0 = xmlRpcCommonsTransport0.newHttpClient();
      assertFalse(httpClient0.isStrictMode());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcCommonsTransportFactory xmlRpcCommonsTransportFactory0 = new XmlRpcCommonsTransportFactory(xmlRpcClient0);
      XmlRpcCommonsTransport xmlRpcCommonsTransport0 = new XmlRpcCommonsTransport(xmlRpcCommonsTransportFactory0);
      PostMethod postMethod0 = new PostMethod("Os2R");
      xmlRpcCommonsTransport0.method = postMethod0;
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      XmlRpcClientRequestImpl xmlRpcClientRequestImpl0 = new XmlRpcClientRequestImpl(xmlRpcHttpRequestConfigImpl0, "+?[K[x,", linkedList0);
      XmlRpcStreamTransport.ReqWriterImpl xmlRpcStreamTransport_ReqWriterImpl0 = xmlRpcCommonsTransport0.new ReqWriterImpl(xmlRpcClientRequestImpl0);
      // Undeclared exception!
      try { 
        xmlRpcCommonsTransport0.writeRequest(xmlRpcStreamTransport_ReqWriterImpl0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // host parameter is null
         //
         verifyException("org.apache.commons.httpclient.HttpConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcCommonsTransportFactory xmlRpcCommonsTransportFactory0 = new XmlRpcCommonsTransportFactory(xmlRpcClient0);
      XmlRpcCommonsTransport xmlRpcCommonsTransport0 = new XmlRpcCommonsTransport(xmlRpcCommonsTransportFactory0);
      // Undeclared exception!
      try { 
        xmlRpcCommonsTransport0.setCredentials((XmlRpcHttpClientConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.client.XmlRpcCommonsTransport", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcCommonsTransportFactory xmlRpcCommonsTransportFactory0 = new XmlRpcCommonsTransportFactory(xmlRpcClient0);
      XmlRpcCommonsTransport xmlRpcCommonsTransport0 = new XmlRpcCommonsTransport(xmlRpcCommonsTransportFactory0);
      // Undeclared exception!
      try { 
        xmlRpcCommonsTransport0.resetClientForRedirect();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.client.XmlRpcCommonsTransport", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcCommonsTransportFactory xmlRpcCommonsTransportFactory0 = new XmlRpcCommonsTransportFactory(xmlRpcClient0);
      XmlRpcCommonsTransport xmlRpcCommonsTransport0 = new XmlRpcCommonsTransport(xmlRpcCommonsTransportFactory0);
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      URL uRL0 = MockURL.getFileExample();
      xmlRpcClientConfigImpl0.setServerURL(uRL0);
      // Undeclared exception!
      try { 
        xmlRpcCommonsTransport0.newPostMethod(xmlRpcClientConfigImpl0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unsupported protocol: 'file'
         //
         verifyException("org.apache.commons.httpclient.protocol.Protocol", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcCommonsTransportFactory xmlRpcCommonsTransportFactory0 = new XmlRpcCommonsTransportFactory(xmlRpcClient0);
      XmlRpcCommonsTransport xmlRpcCommonsTransport0 = new XmlRpcCommonsTransport(xmlRpcCommonsTransportFactory0);
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      MockFile mockFile0 = new MockFile("Apache XML RPC 3.0");
      URL uRL0 = mockFile0.toURL();
      xmlRpcClientConfigImpl0.setServerURL(uRL0);
      // Undeclared exception!
      try { 
        xmlRpcCommonsTransport0.newPostMethod(xmlRpcClientConfigImpl0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid uri 'file:/E:/Uni/Masters/Term 4/Software/InGit/xmlrpc-evo-suite/apache-xmlrpc-3.1.2-src/client/Apache XML RPC 3.0': escaped absolute path not valid
         //
         verifyException("org.apache.commons.httpclient.HttpMethodBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcCommonsTransportFactory xmlRpcCommonsTransportFactory0 = new XmlRpcCommonsTransportFactory(xmlRpcClient0);
      XmlRpcCommonsTransport xmlRpcCommonsTransport0 = new XmlRpcCommonsTransport(xmlRpcCommonsTransportFactory0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      // Undeclared exception!
      try { 
        xmlRpcCommonsTransport0.isResponseGzipCompressed(xmlRpcHttpRequestConfigImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.client.XmlRpcCommonsTransport", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcCommonsTransportFactory xmlRpcCommonsTransportFactory0 = new XmlRpcCommonsTransportFactory(xmlRpcClient0);
      XmlRpcCommonsTransport xmlRpcCommonsTransport0 = new XmlRpcCommonsTransport(xmlRpcCommonsTransportFactory0);
      // Undeclared exception!
      try { 
        xmlRpcCommonsTransport0.isResponseGzipCompressed();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.client.XmlRpcCommonsTransport", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MultiThreadedHttpConnectionManager multiThreadedHttpConnectionManager0 = new MultiThreadedHttpConnectionManager();
      HttpClient httpClient0 = new HttpClient(multiThreadedHttpConnectionManager0);
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcCommonsTransportFactory xmlRpcCommonsTransportFactory0 = mock(XmlRpcCommonsTransportFactory.class, new ViolatedAssumptionAnswer());
      doReturn(httpClient0).when(xmlRpcCommonsTransportFactory0).getHttpClient();
      doReturn(xmlRpcClient0).when(xmlRpcCommonsTransportFactory0).getClient();
      XmlRpcCommonsTransport xmlRpcCommonsTransport0 = new XmlRpcCommonsTransport(xmlRpcCommonsTransportFactory0);
      // Undeclared exception!
      try { 
        xmlRpcCommonsTransport0.isRedirectRequired();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.client.XmlRpcCommonsTransport", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcCommonsTransportFactory xmlRpcCommonsTransportFactory0 = new XmlRpcCommonsTransportFactory(xmlRpcClient0);
      XmlRpcCommonsTransport xmlRpcCommonsTransport0 = new XmlRpcCommonsTransport(xmlRpcCommonsTransportFactory0);
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      LinkedList<XmlRpcException> linkedList0 = new LinkedList<XmlRpcException>();
      XmlRpcClientRequestImpl xmlRpcClientRequestImpl0 = new XmlRpcClientRequestImpl(xmlRpcClientConfigImpl0, "Apache XML RPC 3.0", linkedList0);
      // Undeclared exception!
      try { 
        xmlRpcCommonsTransport0.initHttpHeaders(xmlRpcClientRequestImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcCommonsTransportFactory xmlRpcCommonsTransportFactory0 = new XmlRpcCommonsTransportFactory(xmlRpcClient0);
      XmlRpcCommonsTransport xmlRpcCommonsTransport0 = new XmlRpcCommonsTransport(xmlRpcCommonsTransportFactory0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      Object[] objectArray0 = new Object[2];
      XmlRpcClientRequestImpl xmlRpcClientRequestImpl0 = new XmlRpcClientRequestImpl(xmlRpcHttpRequestConfigImpl0, "", objectArray0);
      // Undeclared exception!
      try { 
        xmlRpcCommonsTransport0.initHttpHeaders(xmlRpcClientRequestImpl0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.xmlrpc.common.XmlRpcHttpRequestConfigImpl cannot be cast to org.apache.xmlrpc.client.XmlRpcHttpClientConfig
         //
         verifyException("org.apache.xmlrpc.client.XmlRpcCommonsTransport", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XmlRpcCommonsTransport xmlRpcCommonsTransport0 = null;
      try {
        xmlRpcCommonsTransport0 = new XmlRpcCommonsTransport((XmlRpcCommonsTransportFactory) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.client.XmlRpcCommonsTransport", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcCommonsTransportFactory xmlRpcCommonsTransportFactory0 = new XmlRpcCommonsTransportFactory(xmlRpcClient0);
      XmlRpcCommonsTransport xmlRpcCommonsTransport0 = new XmlRpcCommonsTransport(xmlRpcCommonsTransportFactory0);
      PostMethod postMethod0 = new PostMethod("Os2R");
      xmlRpcCommonsTransport0.method = postMethod0;
      try { 
        xmlRpcCommonsTransport0.resetClientForRedirect();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid redirect: Missing location header
         //
         verifyException("org.apache.xmlrpc.client.XmlRpcCommonsTransport", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcCommonsTransportFactory xmlRpcCommonsTransportFactory0 = new XmlRpcCommonsTransportFactory(xmlRpcClient0);
      XmlRpcCommonsTransport xmlRpcCommonsTransport0 = new XmlRpcCommonsTransport(xmlRpcCommonsTransportFactory0);
      PostMethod postMethod0 = new PostMethod("Os2R");
      xmlRpcCommonsTransport0.method = postMethod0;
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      boolean boolean0 = xmlRpcCommonsTransport0.isResponseGzipCompressed(xmlRpcHttpRequestConfigImpl0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcCommonsTransportFactory xmlRpcCommonsTransportFactory0 = new XmlRpcCommonsTransportFactory(xmlRpcClient0);
      XmlRpcCommonsTransport xmlRpcCommonsTransport0 = new XmlRpcCommonsTransport(xmlRpcCommonsTransportFactory0);
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      xmlRpcClientConfigImpl0.setBasicUserName("Apache XML RPC 3.0");
      xmlRpcClientConfigImpl0.setBasicEncoding("Apache XML RPC 3.0");
      xmlRpcCommonsTransport0.setCredentials(xmlRpcClientConfigImpl0);
      assertEquals("Apache XML RPC 3.0", xmlRpcClientConfigImpl0.getBasicUserName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcCommonsTransportFactory xmlRpcCommonsTransportFactory0 = new XmlRpcCommonsTransportFactory(xmlRpcClient0);
      XmlRpcCommonsTransport xmlRpcCommonsTransport0 = new XmlRpcCommonsTransport(xmlRpcCommonsTransportFactory0);
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      xmlRpcClientConfigImpl0.setBasicUserName("Apache XML RPC 3.0");
      xmlRpcCommonsTransport0.setCredentials(xmlRpcClientConfigImpl0);
      assertNull(xmlRpcClientConfigImpl0.getEncoding());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcCommonsTransportFactory xmlRpcCommonsTransportFactory0 = new XmlRpcCommonsTransportFactory(xmlRpcClient0);
      XmlRpcCommonsTransport xmlRpcCommonsTransport0 = new XmlRpcCommonsTransport(xmlRpcCommonsTransportFactory0);
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      xmlRpcCommonsTransport0.setCredentials(xmlRpcClientConfigImpl0);
      assertNull(xmlRpcClientConfigImpl0.getBasicPassword());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcCommonsTransportFactory xmlRpcCommonsTransportFactory0 = new XmlRpcCommonsTransportFactory(xmlRpcClient0);
      XmlRpcCommonsTransport xmlRpcCommonsTransport0 = new XmlRpcCommonsTransport(xmlRpcCommonsTransportFactory0);
      PostMethod postMethod0 = new PostMethod("Os2R");
      xmlRpcCommonsTransport0.method = postMethod0;
      boolean boolean0 = xmlRpcCommonsTransport0.isResponseGzipCompressed();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XmlRpcCommonsTransportFactory xmlRpcCommonsTransportFactory0 = new XmlRpcCommonsTransportFactory((XmlRpcClient) null);
      XmlRpcCommonsTransport xmlRpcCommonsTransport0 = new XmlRpcCommonsTransport(xmlRpcCommonsTransportFactory0);
      // Undeclared exception!
      try { 
        xmlRpcCommonsTransport0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.client.XmlRpcCommonsTransport", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcCommonsTransportFactory xmlRpcCommonsTransportFactory0 = new XmlRpcCommonsTransportFactory(xmlRpcClient0);
      XmlRpcCommonsTransport xmlRpcCommonsTransport0 = new XmlRpcCommonsTransport(xmlRpcCommonsTransportFactory0);
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      // Undeclared exception!
      try { 
        xmlRpcCommonsTransport0.newPostMethod(xmlRpcClientConfigImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcCommonsTransportFactory xmlRpcCommonsTransportFactory0 = new XmlRpcCommonsTransportFactory(xmlRpcClient0);
      XmlRpcCommonsTransport xmlRpcCommonsTransport0 = new XmlRpcCommonsTransport(xmlRpcCommonsTransportFactory0);
      // Undeclared exception!
      try { 
        xmlRpcCommonsTransport0.getInputStream();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.client.XmlRpcCommonsTransport", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcCommonsTransportFactory xmlRpcCommonsTransportFactory0 = new XmlRpcCommonsTransportFactory(xmlRpcClient0);
      XmlRpcCommonsTransport xmlRpcCommonsTransport0 = new XmlRpcCommonsTransport(xmlRpcCommonsTransportFactory0);
      xmlRpcCommonsTransport0.setContentLength((-895));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcCommonsTransportFactory xmlRpcCommonsTransportFactory0 = new XmlRpcCommonsTransportFactory(xmlRpcClient0);
      XmlRpcCommonsTransport xmlRpcCommonsTransport0 = new XmlRpcCommonsTransport(xmlRpcCommonsTransportFactory0);
      // Undeclared exception!
      try { 
        xmlRpcCommonsTransport0.setRequestHeader("-R}%l/6", "-R}%l/6");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.client.XmlRpcCommonsTransport", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcCommonsTransportFactory xmlRpcCommonsTransportFactory0 = new XmlRpcCommonsTransportFactory(xmlRpcClient0);
      XmlRpcCommonsTransport xmlRpcCommonsTransport0 = new XmlRpcCommonsTransport(xmlRpcCommonsTransportFactory0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      XmlRpcClientRequestImpl xmlRpcClientRequestImpl0 = new XmlRpcClientRequestImpl(xmlRpcHttpRequestConfigImpl0, "application/x-www-form-urlencoded", linkedList0);
      XmlRpcStreamTransport.ReqWriterImpl xmlRpcStreamTransport_ReqWriterImpl0 = xmlRpcCommonsTransport0.new ReqWriterImpl(xmlRpcClientRequestImpl0);
      // Undeclared exception!
      try { 
        xmlRpcCommonsTransport0.writeRequest(xmlRpcStreamTransport_ReqWriterImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.client.XmlRpcCommonsTransport", e);
      }
  }
}