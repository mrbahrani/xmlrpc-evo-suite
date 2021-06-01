/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 01 06:40:23 GMT 2021
 */

package org.apache.xmlrpc.client;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.net.URL;
import java.util.LinkedList;
import org.apache.xmlrpc.XmlRpcRequest;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.apache.xmlrpc.client.XmlRpcClientRequestImpl;
import org.apache.xmlrpc.client.XmlRpcCommonsTransport;
import org.apache.xmlrpc.client.XmlRpcCommonsTransportFactory;
import org.apache.xmlrpc.client.XmlRpcLite14HttpTransport;
import org.apache.xmlrpc.client.XmlRpcLiteHttpTransport;
import org.apache.xmlrpc.client.XmlRpcLocalStreamTransport;
import org.apache.xmlrpc.client.XmlRpcStreamTransport;
import org.apache.xmlrpc.client.XmlRpcSun14HttpTransport;
import org.apache.xmlrpc.client.XmlRpcSun15HttpTransport;
import org.apache.xmlrpc.client.XmlRpcSunHttpTransport;
import org.apache.xmlrpc.common.XmlRpcHttpRequestConfigImpl;
import org.apache.xmlrpc.common.XmlRpcStreamRequestConfig;
import org.apache.xmlrpc.common.XmlRpcStreamRequestProcessor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XmlRpcStreamTransport_ESTest extends XmlRpcStreamTransport_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcLiteHttpTransport xmlRpcLiteHttpTransport0 = new XmlRpcLiteHttpTransport(xmlRpcClient0);
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      LinkedList<RuntimeException> linkedList0 = new LinkedList<RuntimeException>();
      XmlRpcClientRequestImpl xmlRpcClientRequestImpl0 = new XmlRpcClientRequestImpl(xmlRpcClientConfigImpl0, "pMuck%M", linkedList0);
      XmlRpcStreamTransport.ReqWriterImpl xmlRpcStreamTransport_ReqWriterImpl0 = xmlRpcLiteHttpTransport0.new ReqWriterImpl(xmlRpcClientRequestImpl0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("pMuck%M");
      xmlRpcStreamTransport_ReqWriterImpl0.write(mockPrintStream0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcLite14HttpTransport xmlRpcLite14HttpTransport0 = new XmlRpcLite14HttpTransport(xmlRpcClient0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      XmlRpcClientRequestImpl xmlRpcClientRequestImpl0 = new XmlRpcClientRequestImpl(xmlRpcHttpRequestConfigImpl0, "Da{;+YN?$[=cXqhxHx", linkedList0);
      XmlRpcStreamTransport.ReqWriterImpl xmlRpcStreamTransport_ReqWriterImpl0 = xmlRpcLite14HttpTransport0.new ReqWriterImpl(xmlRpcClientRequestImpl0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      xmlRpcStreamTransport_ReqWriterImpl0.write(pipedOutputStream0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcLite14HttpTransport xmlRpcLite14HttpTransport0 = new XmlRpcLite14HttpTransport(xmlRpcClient0);
      XMLReader xMLReader0 = xmlRpcLite14HttpTransport0.newXMLReader();
      assertNotNull(xMLReader0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcLite14HttpTransport xmlRpcLite14HttpTransport0 = new XmlRpcLite14HttpTransport(xmlRpcClient0);
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      XmlRpcClientRequestImpl xmlRpcClientRequestImpl0 = new XmlRpcClientRequestImpl(xmlRpcClientConfigImpl0, "Apache XML RPC 3.0", linkedList0);
      XmlRpcStreamTransport.ReqWriter xmlRpcStreamTransport_ReqWriter0 = xmlRpcLite14HttpTransport0.newReqWriter(xmlRpcClientRequestImpl0);
      assertNotNull(xmlRpcStreamTransport_ReqWriter0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcSunHttpTransport xmlRpcSunHttpTransport0 = new XmlRpcSunHttpTransport(xmlRpcClient0);
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      boolean boolean0 = xmlRpcSunHttpTransport0.isCompressingRequest(xmlRpcClientConfigImpl0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcSun14HttpTransport xmlRpcSun14HttpTransport0 = new XmlRpcSun14HttpTransport(xmlRpcClient0);
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      LinkedList<XmlRpcHttpRequestConfigImpl> linkedList0 = new LinkedList<XmlRpcHttpRequestConfigImpl>();
      XmlRpcClientRequestImpl xmlRpcClientRequestImpl0 = new XmlRpcClientRequestImpl(xmlRpcClientConfigImpl0, "", linkedList0);
      // Undeclared exception!
      try { 
        xmlRpcSun14HttpTransport0.sendRequest(xmlRpcClientRequestImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      XmlRpcStreamRequestProcessor xmlRpcStreamRequestProcessor0 = mock(XmlRpcStreamRequestProcessor.class, new ViolatedAssumptionAnswer());
      XmlRpcLocalStreamTransport xmlRpcLocalStreamTransport0 = new XmlRpcLocalStreamTransport((XmlRpcClient) null, xmlRpcStreamRequestProcessor0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      XmlRpcClientRequestImpl xmlRpcClientRequestImpl0 = new XmlRpcClientRequestImpl(xmlRpcHttpRequestConfigImpl0, "", linkedList0);
      // Undeclared exception!
      try { 
        xmlRpcLocalStreamTransport0.sendRequest(xmlRpcClientRequestImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.client.XmlRpcStreamTransport$ReqWriterImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcCommonsTransportFactory xmlRpcCommonsTransportFactory0 = new XmlRpcCommonsTransportFactory(xmlRpcClient0);
      XmlRpcCommonsTransport xmlRpcCommonsTransport0 = new XmlRpcCommonsTransport(xmlRpcCommonsTransportFactory0);
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      URL uRL0 = MockURL.getFileExample();
      xmlRpcClientConfigImpl0.setServerURL(uRL0);
      LinkedList<XmlRpcHttpRequestConfigImpl> linkedList0 = new LinkedList<XmlRpcHttpRequestConfigImpl>();
      XmlRpcClientRequestImpl xmlRpcClientRequestImpl0 = new XmlRpcClientRequestImpl(xmlRpcClientConfigImpl0, "Apache XML RPC 3.0", linkedList0);
      // Undeclared exception!
      try { 
        xmlRpcCommonsTransport0.sendRequest(xmlRpcClientRequestImpl0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unsupported protocol: 'file'
         //
         verifyException("org.apache.commons.httpclient.protocol.Protocol", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcLiteHttpTransport xmlRpcLiteHttpTransport0 = new XmlRpcLiteHttpTransport(xmlRpcClient0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      XmlRpcClientRequestImpl xmlRpcClientRequestImpl0 = new XmlRpcClientRequestImpl(xmlRpcHttpRequestConfigImpl0, "Failed to read server's response: ", linkedList0);
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
  public void test09()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcLiteHttpTransport xmlRpcLiteHttpTransport0 = new XmlRpcLiteHttpTransport(xmlRpcClient0);
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      PipedInputStream pipedInputStream0 = new PipedInputStream(841);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0);
      try { 
        xmlRpcLiteHttpTransport0.readResponse(xmlRpcClientConfigImpl0, pushbackInputStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Failed to read server's response: Pipe not connected
         //
         verifyException("org.apache.xmlrpc.client.XmlRpcStreamTransport", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XmlRpcSun14HttpTransport xmlRpcSun14HttpTransport0 = new XmlRpcSun14HttpTransport((XmlRpcClient) null);
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      PipedInputStream pipedInputStream0 = new PipedInputStream(1295);
      // Undeclared exception!
      try { 
        xmlRpcSun14HttpTransport0.readResponse(xmlRpcClientConfigImpl0, pipedInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.client.XmlRpcStreamTransport", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcStreamRequestProcessor xmlRpcStreamRequestProcessor0 = mock(XmlRpcStreamRequestProcessor.class, new ViolatedAssumptionAnswer());
      XmlRpcLocalStreamTransport xmlRpcLocalStreamTransport0 = new XmlRpcLocalStreamTransport(xmlRpcClient0, xmlRpcStreamRequestProcessor0);
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1587), 46);
      // Undeclared exception!
      try { 
        xmlRpcLocalStreamTransport0.readResponse(xmlRpcClientConfigImpl0, byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcSunHttpTransport xmlRpcSunHttpTransport0 = new XmlRpcSunHttpTransport(xmlRpcClient0);
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      Object[] objectArray0 = new Object[1];
      XmlRpcClientRequestImpl xmlRpcClientRequestImpl0 = new XmlRpcClientRequestImpl(xmlRpcClientConfigImpl0, "", objectArray0);
      try { 
        xmlRpcSunHttpTransport0.newReqWriter(xmlRpcClientRequestImpl0);
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Null values aren't supported, if isEnabledForExtensions() == false
         //
         verifyException("org.apache.xmlrpc.common.TypeFactoryImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcLite14HttpTransport xmlRpcLite14HttpTransport0 = new XmlRpcLite14HttpTransport(xmlRpcClient0);
      // Undeclared exception!
      try { 
        xmlRpcLite14HttpTransport0.newReqWriter((XmlRpcRequest) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.client.XmlRpcHttpTransport", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XmlRpcSun15HttpTransport xmlRpcSun15HttpTransport0 = new XmlRpcSun15HttpTransport((XmlRpcClient) null);
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      Object[] objectArray0 = new Object[7];
      XmlRpcClientRequestImpl xmlRpcClientRequestImpl0 = new XmlRpcClientRequestImpl(xmlRpcClientConfigImpl0, "Apache XML RPC 3.0", objectArray0);
      // Undeclared exception!
      try { 
        xmlRpcSun15HttpTransport0.newReqWriter(xmlRpcClientRequestImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.client.XmlRpcStreamTransport$ReqWriterImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcSun14HttpTransport xmlRpcSun14HttpTransport0 = new XmlRpcSun14HttpTransport(xmlRpcClient0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      Object[] objectArray0 = new Object[8];
      XmlRpcClientRequestImpl xmlRpcClientRequestImpl0 = new XmlRpcClientRequestImpl(xmlRpcHttpRequestConfigImpl0, "Apache XML RPC 3.0", objectArray0);
      // Undeclared exception!
      try { 
        xmlRpcSun14HttpTransport0.newReqWriter(xmlRpcClientRequestImpl0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.xmlrpc.common.XmlRpcHttpRequestConfigImpl cannot be cast to org.apache.xmlrpc.client.XmlRpcHttpClientConfig
         //
         verifyException("org.apache.xmlrpc.client.XmlRpcHttpTransport", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcStreamRequestProcessor xmlRpcStreamRequestProcessor0 = mock(XmlRpcStreamRequestProcessor.class, new ViolatedAssumptionAnswer());
      XmlRpcLocalStreamTransport xmlRpcLocalStreamTransport0 = new XmlRpcLocalStreamTransport(xmlRpcClient0, xmlRpcStreamRequestProcessor0);
      // Undeclared exception!
      try { 
        xmlRpcLocalStreamTransport0.isCompressingRequest((XmlRpcStreamRequestConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.client.XmlRpcStreamTransport", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcStreamRequestProcessor xmlRpcStreamRequestProcessor0 = mock(XmlRpcStreamRequestProcessor.class, new ViolatedAssumptionAnswer());
      XmlRpcLocalStreamTransport xmlRpcLocalStreamTransport0 = new XmlRpcLocalStreamTransport(xmlRpcClient0, xmlRpcStreamRequestProcessor0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      Object[] objectArray0 = new Object[3];
      XmlRpcClientRequestImpl xmlRpcClientRequestImpl0 = new XmlRpcClientRequestImpl(xmlRpcHttpRequestConfigImpl0, "S3^)wWw", objectArray0);
      try { 
        xmlRpcLocalStreamTransport0.sendRequest(xmlRpcClientRequestImpl0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Null values aren't supported, if isEnabledForExtensions() == false
         //
         verifyException("org.apache.xmlrpc.common.TypeFactoryImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcStreamRequestProcessor xmlRpcStreamRequestProcessor0 = mock(XmlRpcStreamRequestProcessor.class, new ViolatedAssumptionAnswer());
      XmlRpcLocalStreamTransport xmlRpcLocalStreamTransport0 = new XmlRpcLocalStreamTransport(xmlRpcClient0, xmlRpcStreamRequestProcessor0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      xmlRpcHttpRequestConfigImpl0.setEnabledForExtensions(true);
      Object[] objectArray0 = new Object[5];
      objectArray0[4] = (Object) xmlRpcClient0;
      XmlRpcClientRequestImpl xmlRpcClientRequestImpl0 = new XmlRpcClientRequestImpl(xmlRpcHttpRequestConfigImpl0, "|(>:t:", objectArray0);
      try { 
        xmlRpcLocalStreamTransport0.sendRequest(xmlRpcClientRequestImpl0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Failed to generate request: Unsupported Java type: org.apache.xmlrpc.client.XmlRpcClient
         //
         verifyException("org.apache.xmlrpc.client.XmlRpcStreamTransport", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      XmlRpcStreamRequestProcessor xmlRpcStreamRequestProcessor0 = mock(XmlRpcStreamRequestProcessor.class, new ViolatedAssumptionAnswer());
      XmlRpcLocalStreamTransport xmlRpcLocalStreamTransport0 = new XmlRpcLocalStreamTransport(xmlRpcClient0, xmlRpcStreamRequestProcessor0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      XmlRpcClientRequestImpl xmlRpcClientRequestImpl0 = new XmlRpcClientRequestImpl(xmlRpcHttpRequestConfigImpl0, "", linkedList0);
      xmlRpcHttpRequestConfigImpl0.setEnabledForExtensions(true);
      try { 
        xmlRpcLocalStreamTransport0.sendRequest(xmlRpcClientRequestImpl0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Failed to parse server's response: Premature end of file.
         //
         verifyException("org.apache.xmlrpc.client.XmlRpcStreamTransport", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      XmlRpcStreamRequestProcessor xmlRpcStreamRequestProcessor0 = mock(XmlRpcStreamRequestProcessor.class, new ViolatedAssumptionAnswer());
      XmlRpcLocalStreamTransport xmlRpcLocalStreamTransport0 = new XmlRpcLocalStreamTransport(xmlRpcClient0, xmlRpcStreamRequestProcessor0);
      LinkedList<InputStream> linkedList0 = new LinkedList<InputStream>();
      XmlRpcClientRequestImpl xmlRpcClientRequestImpl0 = new XmlRpcClientRequestImpl(xmlRpcClientConfigImpl0, "Apache XML RPC 3.0", linkedList0);
      XmlRpcStreamTransport.ReqWriter xmlRpcStreamTransport_ReqWriter0 = xmlRpcLocalStreamTransport0.newReqWriter(xmlRpcClientRequestImpl0);
      XmlRpcStreamTransport.GzipReqWriter xmlRpcStreamTransport_GzipReqWriter0 = xmlRpcLocalStreamTransport0.new GzipReqWriter(xmlRpcStreamTransport_ReqWriter0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Apache XML RPC 3.0");
      xmlRpcStreamTransport_GzipReqWriter0.write(mockFileOutputStream0);
      try { 
        xmlRpcStreamTransport_GzipReqWriter0.write(mockFileOutputStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Failed to write request: null
         //
         verifyException("org.apache.xmlrpc.client.XmlRpcStreamTransport$GzipReqWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcLiteHttpTransport xmlRpcLiteHttpTransport0 = new XmlRpcLiteHttpTransport(xmlRpcClient0);
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      Object[] objectArray0 = new Object[7];
      XmlRpcClientRequestImpl xmlRpcClientRequestImpl0 = new XmlRpcClientRequestImpl(xmlRpcClientConfigImpl0, "org.apache.xmlrpc.common.XmlRpcExtensionException", objectArray0);
      XmlRpcStreamTransport.ReqWriterImpl xmlRpcStreamTransport_ReqWriterImpl0 = xmlRpcLiteHttpTransport0.new ReqWriterImpl(xmlRpcClientRequestImpl0);
      // Undeclared exception!
      try { 
        xmlRpcStreamTransport_ReqWriterImpl0.write((OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Writer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcLite14HttpTransport xmlRpcLite14HttpTransport0 = new XmlRpcLite14HttpTransport(xmlRpcClient0);
      XmlRpcStreamRequestProcessor xmlRpcStreamRequestProcessor0 = mock(XmlRpcStreamRequestProcessor.class, new ViolatedAssumptionAnswer());
      XmlRpcLocalStreamTransport xmlRpcLocalStreamTransport0 = new XmlRpcLocalStreamTransport(xmlRpcClient0, xmlRpcStreamRequestProcessor0);
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      Object[] objectArray0 = new Object[9];
      XmlRpcClientRequestImpl xmlRpcClientRequestImpl0 = new XmlRpcClientRequestImpl(xmlRpcClientConfigImpl0, "o#,P|e{{4", objectArray0);
      XmlRpcStreamTransport.ReqWriter xmlRpcStreamTransport_ReqWriter0 = xmlRpcLocalStreamTransport0.newReqWriter(xmlRpcClientRequestImpl0);
      XmlRpcStreamTransport.GzipReqWriter xmlRpcStreamTransport_GzipReqWriter0 = xmlRpcLite14HttpTransport0.new GzipReqWriter(xmlRpcStreamTransport_ReqWriter0);
      // Undeclared exception!
      try { 
        xmlRpcStreamTransport_GzipReqWriter0.write((OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.DeflaterOutputStream", e);
      }
  }
}