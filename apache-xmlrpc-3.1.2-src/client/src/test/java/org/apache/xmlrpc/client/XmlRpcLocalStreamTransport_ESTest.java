/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 01 06:49:52 GMT 2021
 */

package org.apache.xmlrpc.client;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.xmlrpc.XmlRpcRequest;
import org.apache.xmlrpc.XmlRpcRequestConfig;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcLocalStreamTransport;
import org.apache.xmlrpc.client.XmlRpcStreamTransport;
import org.apache.xmlrpc.common.XmlRpcHttpRequestConfigImpl;
import org.apache.xmlrpc.common.XmlRpcStreamRequestConfig;
import org.apache.xmlrpc.common.XmlRpcStreamRequestProcessor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xml.sax.SAXException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XmlRpcLocalStreamTransport_ESTest extends XmlRpcLocalStreamTransport_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcStreamRequestProcessor xmlRpcStreamRequestProcessor0 = mock(XmlRpcStreamRequestProcessor.class, new ViolatedAssumptionAnswer());
      XmlRpcLocalStreamTransport xmlRpcLocalStreamTransport0 = new XmlRpcLocalStreamTransport(xmlRpcClient0, xmlRpcStreamRequestProcessor0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      XmlRpcRequest xmlRpcRequest0 = mock(XmlRpcRequest.class, new ViolatedAssumptionAnswer());
      doReturn(xmlRpcHttpRequestConfigImpl0, xmlRpcHttpRequestConfigImpl0, xmlRpcHttpRequestConfigImpl0, (XmlRpcRequestConfig) null).when(xmlRpcRequest0).getConfig();
      doReturn("").when(xmlRpcRequest0).getMethodName();
      doReturn(0).when(xmlRpcRequest0).getParameterCount();
      XmlRpcStreamTransport.ReqWriter xmlRpcStreamTransport_ReqWriter0 = xmlRpcLocalStreamTransport0.newReqWriter(xmlRpcRequest0);
      xmlRpcLocalStreamTransport0.writeRequest(xmlRpcStreamTransport_ReqWriter0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcStreamRequestProcessor xmlRpcStreamRequestProcessor0 = mock(XmlRpcStreamRequestProcessor.class, new ViolatedAssumptionAnswer());
      XmlRpcLocalStreamTransport xmlRpcLocalStreamTransport0 = new XmlRpcLocalStreamTransport(xmlRpcClient0, xmlRpcStreamRequestProcessor0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      xmlRpcHttpRequestConfigImpl0.setGzipRequesting(true);
      boolean boolean0 = xmlRpcLocalStreamTransport0.isResponseGzipCompressed(xmlRpcHttpRequestConfigImpl0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcStreamRequestProcessor xmlRpcStreamRequestProcessor0 = mock(XmlRpcStreamRequestProcessor.class, new ViolatedAssumptionAnswer());
      XmlRpcLocalStreamTransport xmlRpcLocalStreamTransport0 = new XmlRpcLocalStreamTransport(xmlRpcClient0, xmlRpcStreamRequestProcessor0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      boolean boolean0 = xmlRpcLocalStreamTransport0.isResponseGzipCompressed(xmlRpcHttpRequestConfigImpl0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcStreamRequestProcessor xmlRpcStreamRequestProcessor0 = mock(XmlRpcStreamRequestProcessor.class, new ViolatedAssumptionAnswer());
      XmlRpcLocalStreamTransport xmlRpcLocalStreamTransport0 = new XmlRpcLocalStreamTransport(xmlRpcClient0, xmlRpcStreamRequestProcessor0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      XmlRpcRequest xmlRpcRequest0 = mock(XmlRpcRequest.class, new ViolatedAssumptionAnswer());
      doReturn(xmlRpcHttpRequestConfigImpl0, xmlRpcHttpRequestConfigImpl0, xmlRpcHttpRequestConfigImpl0).when(xmlRpcRequest0).getConfig();
      doReturn("").when(xmlRpcRequest0).getMethodName();
      doReturn((Object) null).when(xmlRpcRequest0).getParameter(anyInt());
      doReturn(1).when(xmlRpcRequest0).getParameterCount();
      XmlRpcStreamTransport.ReqWriter xmlRpcStreamTransport_ReqWriter0 = xmlRpcLocalStreamTransport0.newReqWriter(xmlRpcRequest0);
      try { 
        xmlRpcLocalStreamTransport0.writeRequest(xmlRpcStreamTransport_ReqWriter0);
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Null values aren't supported, if isEnabledForExtensions() == false
         //
         verifyException("org.apache.xmlrpc.common.TypeFactoryImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcStreamRequestProcessor xmlRpcStreamRequestProcessor0 = mock(XmlRpcStreamRequestProcessor.class, new ViolatedAssumptionAnswer());
      XmlRpcLocalStreamTransport xmlRpcLocalStreamTransport0 = new XmlRpcLocalStreamTransport(xmlRpcClient0, xmlRpcStreamRequestProcessor0);
      // Undeclared exception!
      try { 
        xmlRpcLocalStreamTransport0.writeRequest((XmlRpcStreamTransport.ReqWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.client.XmlRpcLocalStreamTransport", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcStreamRequestProcessor xmlRpcStreamRequestProcessor0 = mock(XmlRpcStreamRequestProcessor.class, new ViolatedAssumptionAnswer());
      XmlRpcLocalStreamTransport xmlRpcLocalStreamTransport0 = new XmlRpcLocalStreamTransport(xmlRpcClient0, xmlRpcStreamRequestProcessor0);
      XmlRpcRequest xmlRpcRequest0 = mock(XmlRpcRequest.class, new ViolatedAssumptionAnswer());
      doReturn((XmlRpcRequestConfig) null).when(xmlRpcRequest0).getConfig();
      // Undeclared exception!
      try { 
        xmlRpcLocalStreamTransport0.newReqWriter(xmlRpcRequest0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.client.XmlRpcStreamTransport", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcStreamRequestProcessor xmlRpcStreamRequestProcessor0 = mock(XmlRpcStreamRequestProcessor.class, new ViolatedAssumptionAnswer());
      XmlRpcLocalStreamTransport xmlRpcLocalStreamTransport0 = new XmlRpcLocalStreamTransport(xmlRpcClient0, xmlRpcStreamRequestProcessor0);
      XmlRpcRequestConfig xmlRpcRequestConfig0 = mock(XmlRpcRequestConfig.class, new ViolatedAssumptionAnswer());
      XmlRpcRequest xmlRpcRequest0 = mock(XmlRpcRequest.class, new ViolatedAssumptionAnswer());
      doReturn(xmlRpcRequestConfig0).when(xmlRpcRequest0).getConfig();
      // Undeclared exception!
      try { 
        xmlRpcLocalStreamTransport0.newReqWriter(xmlRpcRequest0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.xmlrpc.XmlRpcRequestConfig$MockitoMock$1939147861 cannot be cast to org.apache.xmlrpc.common.XmlRpcStreamRequestConfig
         //
         verifyException("org.apache.xmlrpc.client.XmlRpcStreamTransport", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcStreamRequestProcessor xmlRpcStreamRequestProcessor0 = mock(XmlRpcStreamRequestProcessor.class, new ViolatedAssumptionAnswer());
      XmlRpcLocalStreamTransport xmlRpcLocalStreamTransport0 = new XmlRpcLocalStreamTransport(xmlRpcClient0, xmlRpcStreamRequestProcessor0);
      // Undeclared exception!
      try { 
        xmlRpcLocalStreamTransport0.getInputStream();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.client.XmlRpcLocalStreamTransport", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcStreamRequestProcessor xmlRpcStreamRequestProcessor0 = mock(XmlRpcStreamRequestProcessor.class, new ViolatedAssumptionAnswer());
      XmlRpcLocalStreamTransport xmlRpcLocalStreamTransport0 = new XmlRpcLocalStreamTransport(xmlRpcClient0, xmlRpcStreamRequestProcessor0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      XmlRpcRequest xmlRpcRequest0 = mock(XmlRpcRequest.class, new ViolatedAssumptionAnswer());
      doReturn(xmlRpcHttpRequestConfigImpl0, (XmlRpcRequestConfig) null).when(xmlRpcRequest0).getConfig();
      XmlRpcStreamTransport.ReqWriter xmlRpcStreamTransport_ReqWriter0 = xmlRpcLocalStreamTransport0.newReqWriter(xmlRpcRequest0);
      // Undeclared exception!
      try { 
        xmlRpcLocalStreamTransport0.writeRequest(xmlRpcStreamTransport_ReqWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.serializer.BaseXmlWriterFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XmlRpcStreamRequestProcessor xmlRpcStreamRequestProcessor0 = mock(XmlRpcStreamRequestProcessor.class, new ViolatedAssumptionAnswer());
      XmlRpcLocalStreamTransport xmlRpcLocalStreamTransport0 = new XmlRpcLocalStreamTransport((XmlRpcClient) null, xmlRpcStreamRequestProcessor0);
      xmlRpcLocalStreamTransport0.close();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = new XmlRpcClient();
      XmlRpcStreamRequestProcessor xmlRpcStreamRequestProcessor0 = mock(XmlRpcStreamRequestProcessor.class, new ViolatedAssumptionAnswer());
      XmlRpcLocalStreamTransport xmlRpcLocalStreamTransport0 = new XmlRpcLocalStreamTransport(xmlRpcClient0, xmlRpcStreamRequestProcessor0);
      // Undeclared exception!
      try { 
        xmlRpcLocalStreamTransport0.isResponseGzipCompressed((XmlRpcStreamRequestConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.client.XmlRpcLocalStreamTransport", e);
      }
  }
}
