/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 11 08:18:44 GMT 2021
 */

package org.apache.xmlrpc.webserver;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import org.apache.commons.httpclient.protocol.DefaultProtocolSocketFactory;
import org.apache.xmlrpc.common.XmlRpcNotAuthorizedException;
import org.apache.xmlrpc.server.XmlRpcStreamServer;
import org.apache.xmlrpc.webserver.Connection;
import org.apache.xmlrpc.webserver.RequestData;
import org.apache.xmlrpc.webserver.WebServer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Connection_ESTest extends Connection_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 1303);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      DefaultProtocolSocketFactory defaultProtocolSocketFactory0 = new DefaultProtocolSocketFactory();
      Socket socket0 = defaultProtocolSocketFactory0.createSocket("%.^|pu|iSr@O[m", 1303, (InetAddress) null, 1303);
      Connection connection0 = new Connection((WebServer) null, (XmlRpcStreamServer) null, socket0);
      // Undeclared exception!
      try { 
        connection0.setResponseHeader("", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.webserver.Connection", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 1303);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      DefaultProtocolSocketFactory defaultProtocolSocketFactory0 = new DefaultProtocolSocketFactory();
      Socket socket0 = defaultProtocolSocketFactory0.createSocket("%.^|pu|iSr@O[m", 1303, (InetAddress) null, 1303);
      Connection connection0 = new Connection((WebServer) null, (XmlRpcStreamServer) null, socket0);
      RequestData requestData0 = new RequestData(connection0);
      requestData0.setHttpVersion("%.^|pu|iSr@O[m");
      MockThrowable mockThrowable0 = new MockThrowable((Throwable) null);
      connection0.writeErrorHeader(requestData0, mockThrowable0, 1303);
      assertEquals("org.evosuite.runtime.mock.java.lang.MockThrowable", mockThrowable0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 1303);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      DefaultProtocolSocketFactory defaultProtocolSocketFactory0 = new DefaultProtocolSocketFactory();
      Socket socket0 = defaultProtocolSocketFactory0.createSocket("%.^|pu|iSr@O[m", 1303, (InetAddress) null, 1303);
      Connection connection0 = new Connection((WebServer) null, (XmlRpcStreamServer) null, socket0);
      RequestData requestData0 = new RequestData(connection0);
      requestData0.setHttpVersion("%.^|pu|iSr@O[m");
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      connection0.writeResponse(requestData0, byteArrayOutputStream0);
      assertNull(requestData0.getEncoding());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 1303);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      DefaultProtocolSocketFactory defaultProtocolSocketFactory0 = new DefaultProtocolSocketFactory();
      Socket socket0 = defaultProtocolSocketFactory0.createSocket("%.^|pu|iSr@O[m", 1303, (InetAddress) null, 1303);
      Connection connection0 = new Connection((WebServer) null, (XmlRpcStreamServer) null, socket0);
      RequestData requestData0 = new RequestData(connection0);
      // Undeclared exception!
      try { 
        connection0.writeResponseHeader(requestData0, 1303);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.webserver.Connection", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 1303);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      DefaultProtocolSocketFactory defaultProtocolSocketFactory0 = new DefaultProtocolSocketFactory();
      Socket socket0 = defaultProtocolSocketFactory0.createSocket("%.^|pu|iSr@O[m", 1303, (InetAddress) null, 1303);
      WebServer webServer0 = new WebServer((-2468), (InetAddress) null);
      XmlRpcStreamServer xmlRpcStreamServer0 = webServer0.newXmlRpcStreamServer();
      Connection connection0 = new Connection(webServer0, xmlRpcStreamServer0, socket0);
      connection0.run();
      OutputStream outputStream0 = connection0.newOutputStream();
      RequestData requestData0 = new RequestData(connection0);
      // Undeclared exception!
      try { 
        connection0.writeResponse(requestData0, outputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.webserver.Connection", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 1303);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      DefaultProtocolSocketFactory defaultProtocolSocketFactory0 = new DefaultProtocolSocketFactory();
      Socket socket0 = defaultProtocolSocketFactory0.createSocket("%.^|pu|iSr@O[m", 1303, (InetAddress) null, 1303);
      Connection connection0 = new Connection((WebServer) null, (XmlRpcStreamServer) null, socket0);
      // Undeclared exception!
      try { 
        connection0.newOutputStream();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.webserver.Connection", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 1303);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      DefaultProtocolSocketFactory defaultProtocolSocketFactory0 = new DefaultProtocolSocketFactory();
      Socket socket0 = defaultProtocolSocketFactory0.createSocket("%.^|pu|iSr@O[m", 1303, (InetAddress) null, 1303);
      WebServer webServer0 = new WebServer((-2468), (InetAddress) null);
      XmlRpcStreamServer xmlRpcStreamServer0 = webServer0.newXmlRpcStreamServer();
      Connection connection0 = new Connection((WebServer) null, xmlRpcStreamServer0, socket0);
      // Undeclared exception!
      try { 
        connection0.newInputStream();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.webserver.Connection", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      WebServer webServer0 = new WebServer(0, inetAddress0);
      XmlRpcStreamServer xmlRpcStreamServer0 = webServer0.getXmlRpcServer();
      MockSocket mockSocket0 = new MockSocket();
      Connection connection0 = null;
      try {
        connection0 = new Connection(webServer0, xmlRpcStreamServer0, mockSocket0);
        fail("Expecting exception: SocketException");
      
      } catch(Throwable e) {
         //
         // Socket is not connected
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockSocket", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Connection connection0 = null;
      try {
        connection0 = new Connection((WebServer) null, (XmlRpcStreamServer) null, (Socket) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.webserver.Connection", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 1303);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      DefaultProtocolSocketFactory defaultProtocolSocketFactory0 = new DefaultProtocolSocketFactory();
      Socket socket0 = defaultProtocolSocketFactory0.createSocket("%.^|pu|iSr@O[m", 1303, (InetAddress) null, 1303);
      WebServer webServer0 = new WebServer((-2468), (InetAddress) null);
      XmlRpcStreamServer xmlRpcStreamServer0 = webServer0.newXmlRpcStreamServer();
      Connection connection0 = new Connection((WebServer) null, xmlRpcStreamServer0, socket0);
      RequestData requestData0 = new RequestData(connection0);
      XmlRpcNotAuthorizedException xmlRpcNotAuthorizedException0 = new XmlRpcNotAuthorizedException("transfer-encoding:");
      // Undeclared exception!
      try { 
        connection0.writeErrorHeader(requestData0, xmlRpcNotAuthorizedException0, (-1285));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.webserver.Connection", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 1303);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      DefaultProtocolSocketFactory defaultProtocolSocketFactory0 = new DefaultProtocolSocketFactory();
      Socket socket0 = defaultProtocolSocketFactory0.createSocket("%.^|pu|iSr@O[m", 1303, (InetAddress) null, 1303);
      WebServer webServer0 = new WebServer((-2468), (InetAddress) null);
      XmlRpcStreamServer xmlRpcStreamServer0 = webServer0.newXmlRpcStreamServer();
      Connection connection0 = new Connection(webServer0, xmlRpcStreamServer0, socket0);
      connection0.run();
      InputStream inputStream0 = connection0.newInputStream();
      assertNotNull(inputStream0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 1303);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      DefaultProtocolSocketFactory defaultProtocolSocketFactory0 = new DefaultProtocolSocketFactory();
      Socket socket0 = defaultProtocolSocketFactory0.createSocket("%.^|pu|iSr@O[m", 1303, (InetAddress) null, 1303);
      Connection connection0 = new Connection((WebServer) null, (XmlRpcStreamServer) null, socket0);
      RequestData requestData0 = new RequestData(connection0);
      requestData0.setHttpVersion("%.^|pu|iSr@O[m");
      MockThrowable mockThrowable0 = new MockThrowable((Throwable) null);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      connection0.writeError(requestData0, mockThrowable0, byteArrayOutputStream0);
      assertEquals(0, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 1303);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      DefaultProtocolSocketFactory defaultProtocolSocketFactory0 = new DefaultProtocolSocketFactory();
      Socket socket0 = defaultProtocolSocketFactory0.createSocket("%.^|pu|iSr@O[m", 1303, (InetAddress) null, 1303);
      WebServer webServer0 = new WebServer((-2468), (InetAddress) null);
      XmlRpcStreamServer xmlRpcStreamServer0 = webServer0.newXmlRpcStreamServer();
      XmlRpcNotAuthorizedException xmlRpcNotAuthorizedException0 = new XmlRpcNotAuthorizedException("transfer-encoding:");
      Connection connection0 = new Connection(webServer0, xmlRpcStreamServer0, socket0);
      connection0.run();
      ByteArrayOutputStream byteArrayOutputStream0 = (ByteArrayOutputStream)connection0.newOutputStream();
      RequestData requestData0 = new RequestData(connection0);
      // Undeclared exception!
      try { 
        connection0.writeError(requestData0, xmlRpcNotAuthorizedException0, byteArrayOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.webserver.Connection", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 1303);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      DefaultProtocolSocketFactory defaultProtocolSocketFactory0 = new DefaultProtocolSocketFactory();
      Socket socket0 = defaultProtocolSocketFactory0.createSocket("%.^|pu|iSr@O[m", 1303, (InetAddress) null, 1303);
      Connection connection0 = new Connection((WebServer) null, (XmlRpcStreamServer) null, socket0);
      RequestData requestData0 = new RequestData(connection0);
      requestData0.setHttpVersion("%.^|pu|iSr@O[m");
      connection0.writeResponseHeader(requestData0, 1303);
      assertEquals("%.^|pu|iSr@O[m", requestData0.getHttpVersion());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 1303);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      DefaultProtocolSocketFactory defaultProtocolSocketFactory0 = new DefaultProtocolSocketFactory();
      Socket socket0 = defaultProtocolSocketFactory0.createSocket("%.^|pu|iSr@O[m", 1303, (InetAddress) null, 1303);
      Connection connection0 = new Connection((WebServer) null, (XmlRpcStreamServer) null, socket0);
      // Undeclared exception!
      try { 
        connection0.run();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.webserver.Connection", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 1303);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      DefaultProtocolSocketFactory defaultProtocolSocketFactory0 = new DefaultProtocolSocketFactory();
      Socket socket0 = defaultProtocolSocketFactory0.createSocket("%.^|pu|iSr@O[m", 1303, (InetAddress) null, 1303);
      Connection connection0 = new Connection((WebServer) null, (XmlRpcStreamServer) null, socket0);
      connection0.close();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 1303);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      DefaultProtocolSocketFactory defaultProtocolSocketFactory0 = new DefaultProtocolSocketFactory();
      Socket socket0 = defaultProtocolSocketFactory0.createSocket("%.^|pu|iSr@O[m", 1303, (InetAddress) null, 1303);
      Connection connection0 = new Connection((WebServer) null, (XmlRpcStreamServer) null, socket0);
      connection0.shutdown();
      connection0.run();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 1303);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      DefaultProtocolSocketFactory defaultProtocolSocketFactory0 = new DefaultProtocolSocketFactory();
      Socket socket0 = defaultProtocolSocketFactory0.createSocket("%.^|pu|iSr@O[m", 1303, (InetAddress) null, 1303);
      WebServer webServer0 = new WebServer((-2468), (InetAddress) null);
      XmlRpcStreamServer xmlRpcStreamServer0 = webServer0.newXmlRpcStreamServer();
      Connection connection0 = new Connection((WebServer) null, xmlRpcStreamServer0, socket0);
      RequestData requestData0 = new RequestData(connection0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(bufferedOutputStream0);
      // Undeclared exception!
      try { 
        connection0.writeResponse(requestData0, objectOutputStream0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.io.ObjectOutputStream cannot be cast to java.io.ByteArrayOutputStream
         //
         verifyException("org.apache.xmlrpc.webserver.Connection", e);
      }
  }
}
