/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 11 10:42:03 GMT 2021
 */

package org.apache.xmlrpc.webserver;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLStreamHandler;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import org.apache.xmlrpc.common.TypeConverterFactory;
import org.apache.xmlrpc.common.TypeConverterFactoryImpl;
import org.apache.xmlrpc.server.AbstractReflectiveHandlerMapping;
import org.apache.xmlrpc.server.RequestProcessorFactoryFactory;
import org.apache.xmlrpc.test.ClientIpTest;
import org.apache.xmlrpc.webserver.XmlRpcServlet;
import org.apache.xmlrpc.webserver.XmlRpcServletServer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XmlRpcServlet_ESTest extends XmlRpcServlet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XmlRpcServlet xmlRpcServlet0 = new XmlRpcServlet();
      xmlRpcServlet0.getRequestProcessorFactoryFactory();
      xmlRpcServlet0.setRequestProcessorFactoryFactory((RequestProcessorFactoryFactory) null);
      xmlRpcServlet0.getRequestProcessorFactoryFactory();
      ClientIpTest.ClientInfoServlet clientIpTest_ClientInfoServlet0 = new ClientIpTest.ClientInfoServlet();
      XmlRpcServletServer xmlRpcServletServer0 = xmlRpcServlet0.newXmlRpcServer(clientIpTest_ClientInfoServlet0);
      assertEquals(0, xmlRpcServletServer0.getMaxThreads());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XmlRpcServlet xmlRpcServlet0 = new XmlRpcServlet();
      xmlRpcServlet0.setTypeConverterFactory((TypeConverterFactory) null);
      xmlRpcServlet0.getAuthenticationHandler();
      xmlRpcServlet0.setAuthenticationHandler((AbstractReflectiveHandlerMapping.AuthenticationHandler) null);
      xmlRpcServlet0.log("org.apache.xmlrpc.server.XmlRpcServerWorkerFactory");
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, new ViolatedAssumptionAnswer());
      HttpServletResponseWrapper httpServletResponseWrapper0 = new HttpServletResponseWrapper(httpServletResponse0);
      // Undeclared exception!
      try { 
        xmlRpcServlet0.doPost((HttpServletRequest) null, httpServletResponseWrapper0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.webserver.XmlRpcServlet", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClientIpTest.ClientInfoServlet clientIpTest_ClientInfoServlet0 = new ClientIpTest.ClientInfoServlet();
      TypeConverterFactory typeConverterFactory0 = clientIpTest_ClientInfoServlet0.getTypeConverterFactory();
      assertNull(typeConverterFactory0);
      
      clientIpTest_ClientInfoServlet0.log("");
      clientIpTest_ClientInfoServlet0.getRequestProcessorFactoryFactory();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(httpServletRequest0).getRemoteAddr();
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, new ViolatedAssumptionAnswer());
      HttpServletResponseWrapper httpServletResponseWrapper0 = new HttpServletResponseWrapper(httpServletResponse0);
      // Undeclared exception!
      try { 
        clientIpTest_ClientInfoServlet0.doPost(httpServletRequestWrapper0, httpServletResponseWrapper0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.webserver.XmlRpcServlet", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XmlRpcServlet xmlRpcServlet0 = new XmlRpcServlet();
      xmlRpcServlet0.getServletConfig();
      xmlRpcServlet0.getAuthenticationHandler();
      URL uRL0 = MockURL.getFtpExample();
      // Undeclared exception!
      try { 
        xmlRpcServlet0.newPropertyHandlerMapping(uRL0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.webserver.XmlRpcServletProduct", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XmlRpcServlet xmlRpcServlet0 = new XmlRpcServlet();
      URL uRL0 = MockURL.getHttpExample();
      // Undeclared exception!
      try { 
        xmlRpcServlet0.newPropertyHandlerMapping(uRL0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.webserver.XmlRpcServletProduct", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XmlRpcServlet xmlRpcServlet0 = new XmlRpcServlet();
      MockThrowable mockThrowable0 = new MockThrowable();
      MockThrowable mockThrowable1 = new MockThrowable(mockThrowable0);
      Throwable throwable0 = mockThrowable0.initCause(mockThrowable1);
      MockThrowable mockThrowable2 = new MockThrowable((String) null, throwable0);
      // Undeclared exception!
      try { 
        xmlRpcServlet0.log("{yf0Zt", (Throwable) mockThrowable2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.webserver.XmlRpcServlet", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClientIpTest.ClientInfoServlet clientIpTest_ClientInfoServlet0 = new ClientIpTest.ClientInfoServlet();
      clientIpTest_ClientInfoServlet0.getServletConfig();
      // Undeclared exception!
      try { 
        clientIpTest_ClientInfoServlet0.init((ServletConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.webserver.XmlRpcServlet", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XmlRpcServlet xmlRpcServlet0 = new XmlRpcServlet();
      // Undeclared exception!
      try { 
        xmlRpcServlet0.newXmlRpcHandlerMapping();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.webserver.XmlRpcServletProduct", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XmlRpcServlet xmlRpcServlet0 = new XmlRpcServlet();
      XmlRpcServletServer xmlRpcServletServer0 = xmlRpcServlet0.getXmlRpcServletServer();
      assertNull(xmlRpcServletServer0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClientIpTest.ClientInfoServlet clientIpTest_ClientInfoServlet0 = new ClientIpTest.ClientInfoServlet();
      clientIpTest_ClientInfoServlet0.getRequestProcessorFactoryFactory();
      clientIpTest_ClientInfoServlet0.setRequestProcessorFactoryFactory((RequestProcessorFactoryFactory) null);
      RequestProcessorFactoryFactory.RequestSpecificProcessorFactoryFactory requestProcessorFactoryFactory_RequestSpecificProcessorFactoryFactory0 = new RequestProcessorFactoryFactory.RequestSpecificProcessorFactoryFactory();
      Class<Object> class0 = Class.class;
      requestProcessorFactoryFactory_RequestSpecificProcessorFactoryFactory0.getRequestProcessorFactory(class0);
      Class<Object> class1 = Class.class;
      requestProcessorFactoryFactory_RequestSpecificProcessorFactoryFactory0.getRequestProcessorFactory(class1);
      clientIpTest_ClientInfoServlet0.setRequestProcessorFactoryFactory(requestProcessorFactoryFactory_RequestSpecificProcessorFactoryFactory0);
      clientIpTest_ClientInfoServlet0.log("5E}h>w=*L~v?w1inhtf");
      clientIpTest_ClientInfoServlet0.getRequestProcessorFactoryFactory();
      AbstractReflectiveHandlerMapping.AuthenticationHandler abstractReflectiveHandlerMapping_AuthenticationHandler0 = clientIpTest_ClientInfoServlet0.getAuthenticationHandler();
      assertNull(abstractReflectiveHandlerMapping_AuthenticationHandler0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClientIpTest.ClientInfoServlet clientIpTest_ClientInfoServlet0 = new ClientIpTest.ClientInfoServlet();
      clientIpTest_ClientInfoServlet0.getAuthenticationHandler();
      clientIpTest_ClientInfoServlet0.getTypeConverterFactory();
      TypeConverterFactoryImpl typeConverterFactoryImpl0 = new TypeConverterFactoryImpl();
      Class<Object> class0 = Class.class;
      typeConverterFactoryImpl0.getTypeConverter(class0);
      clientIpTest_ClientInfoServlet0.setTypeConverterFactory(typeConverterFactoryImpl0);
      clientIpTest_ClientInfoServlet0.log("t-B>Y6Qn=Ks;P\u0004%2z");
      clientIpTest_ClientInfoServlet0.getTypeConverterFactory();
      clientIpTest_ClientInfoServlet0.log("Unknown init parameter ");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XmlRpcServlet xmlRpcServlet0 = new XmlRpcServlet();
      xmlRpcServlet0.getAuthenticationHandler();
      xmlRpcServlet0.setAuthenticationHandler((AbstractReflectiveHandlerMapping.AuthenticationHandler) null);
      // Undeclared exception!
      try { 
        xmlRpcServlet0.init((ServletConfig) xmlRpcServlet0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XmlRpcServlet xmlRpcServlet0 = new XmlRpcServlet();
      xmlRpcServlet0.log(";j~H9D ~");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XmlRpcServlet xmlRpcServlet0 = new XmlRpcServlet();
      TypeConverterFactoryImpl typeConverterFactoryImpl0 = new TypeConverterFactoryImpl();
      xmlRpcServlet0.setTypeConverterFactory(typeConverterFactoryImpl0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClientIpTest.ClientInfoServlet clientIpTest_ClientInfoServlet0 = new ClientIpTest.ClientInfoServlet();
      clientIpTest_ClientInfoServlet0.getAuthenticationHandler();
      clientIpTest_ClientInfoServlet0.setAuthenticationHandler((AbstractReflectiveHandlerMapping.AuthenticationHandler) null);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XmlRpcServlet xmlRpcServlet0 = new XmlRpcServlet();
      ClientIpTest.ClientInfoServlet clientIpTest_ClientInfoServlet0 = new ClientIpTest.ClientInfoServlet();
      // Undeclared exception!
      try { 
        xmlRpcServlet0.init((ServletConfig) clientIpTest_ClientInfoServlet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClientIpTest.ClientInfoServlet clientIpTest_ClientInfoServlet0 = new ClientIpTest.ClientInfoServlet();
      MockThrowable mockThrowable0 = new MockThrowable("8Js_){F%xK<:'BeK");
      // Undeclared exception!
      try { 
        clientIpTest_ClientInfoServlet0.log("8Js_){F%xK<:'BeK", (Throwable) mockThrowable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.webserver.XmlRpcServlet", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClientIpTest.ClientInfoServlet clientIpTest_ClientInfoServlet0 = new ClientIpTest.ClientInfoServlet();
      clientIpTest_ClientInfoServlet0.getRequestProcessorFactoryFactory();
      clientIpTest_ClientInfoServlet0.setRequestProcessorFactoryFactory((RequestProcessorFactoryFactory) null);
      clientIpTest_ClientInfoServlet0.getAuthenticationHandler();
      clientIpTest_ClientInfoServlet0.setAuthenticationHandler((AbstractReflectiveHandlerMapping.AuthenticationHandler) null);
      clientIpTest_ClientInfoServlet0.getXmlRpcServletServer();
      clientIpTest_ClientInfoServlet0.getTypeConverterFactory();
      String string0 = "qNh-@u'.t0Q-D[;";
      clientIpTest_ClientInfoServlet0.getServletConfig();
      // Undeclared exception!
      try { 
        clientIpTest_ClientInfoServlet0.init((ServletConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.webserver.XmlRpcServlet", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XmlRpcServlet xmlRpcServlet0 = new XmlRpcServlet();
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, new ViolatedAssumptionAnswer());
      HttpServletResponseWrapper httpServletResponseWrapper0 = new HttpServletResponseWrapper(httpServletResponse0);
      // Undeclared exception!
      try { 
        xmlRpcServlet0.doPost((HttpServletRequest) null, httpServletResponseWrapper0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.webserver.XmlRpcServlet", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClientIpTest.ClientInfoServlet clientIpTest_ClientInfoServlet0 = new ClientIpTest.ClientInfoServlet();
      // Undeclared exception!
      try { 
        ((XmlRpcServlet)clientIpTest_ClientInfoServlet0).newPropertyHandlerMapping((URL) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.webserver.XmlRpcServletProduct", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XmlRpcServlet xmlRpcServlet0 = new XmlRpcServlet();
      xmlRpcServlet0.getTypeConverterFactory();
      xmlRpcServlet0.setTypeConverterFactory((TypeConverterFactory) null);
      xmlRpcServlet0.getRequestProcessorFactoryFactory();
      xmlRpcServlet0.log("WARN");
      // Undeclared exception!
      try { 
        xmlRpcServlet0.newXmlRpcHandlerMapping();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.webserver.XmlRpcServletProduct", e);
      }
  }
}
