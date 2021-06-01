/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 01 06:46:12 GMT 2021
 */

package org.apache.xmlrpc.client;

import org.junit.Test;
import static org.junit.Assert.*;
import java.net.URL;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.apache.xmlrpc.common.XmlRpcRequestProcessor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XmlRpcClientConfigImpl_ESTest extends XmlRpcClientConfigImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      xmlRpcClientConfigImpl0.setUserAgent("<~");
      String string0 = xmlRpcClientConfigImpl0.getUserAgent();
      assertEquals("<~", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      xmlRpcClientConfigImpl0.setUserAgent("");
      String string0 = xmlRpcClientConfigImpl0.getUserAgent();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      xmlRpcClientConfigImpl0.setGzipRequesting(true);
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl1 = xmlRpcClientConfigImpl0.cloneMe();
      assertFalse(xmlRpcClientConfigImpl1.isGzipCompressing());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      xmlRpcClientConfigImpl0.setGzipCompressing(true);
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl1 = xmlRpcClientConfigImpl0.cloneMe();
      assertEquals(0, xmlRpcClientConfigImpl1.getConnectionTimeout());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      xmlRpcClientConfigImpl0.setEnabledForExtensions(true);
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl1 = xmlRpcClientConfigImpl0.cloneMe();
      assertNull(xmlRpcClientConfigImpl1.getUserAgent());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      xmlRpcClientConfigImpl0.setEnabledForExceptions(true);
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl1 = xmlRpcClientConfigImpl0.cloneMe();
      assertNull(xmlRpcClientConfigImpl1.getEncoding());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      xmlRpcClientConfigImpl0.setContentLengthOptional(true);
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl1 = xmlRpcClientConfigImpl0.cloneMe();
      assertTrue(xmlRpcClientConfigImpl1.isContentLengthOptional());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      xmlRpcClientConfigImpl0.setReplyTimeout(1953);
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl1 = xmlRpcClientConfigImpl0.cloneMe();
      assertFalse(xmlRpcClientConfigImpl1.isGzipRequesting());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      xmlRpcClientConfigImpl0.setReplyTimeout((-5230));
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl1 = xmlRpcClientConfigImpl0.cloneMe();
      assertFalse(xmlRpcClientConfigImpl1.isGzipCompressing());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      xmlRpcClientConfigImpl0.setConnectionTimeout(1860);
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl1 = xmlRpcClientConfigImpl0.cloneMe();
      assertNull(xmlRpcClientConfigImpl1.getBasicEncoding());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      xmlRpcClientConfigImpl0.setConnectionTimeout((-1818));
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl1 = xmlRpcClientConfigImpl0.cloneMe();
      assertNull(xmlRpcClientConfigImpl1.getBasicUserName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      String string0 = xmlRpcClientConfigImpl0.getUserAgent();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      xmlRpcClientConfigImpl0.setXmlRpcServer((XmlRpcRequestProcessor) null);
      assertNull(xmlRpcClientConfigImpl0.getBasicEncoding());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      xmlRpcClientConfigImpl0.setServerURL((URL) null);
      assertNull(xmlRpcClientConfigImpl0.getBasicPassword());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      URL uRL0 = xmlRpcClientConfigImpl0.getServerURL();
      assertNull(uRL0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XmlRpcClientConfigImpl xmlRpcClientConfigImpl0 = new XmlRpcClientConfigImpl();
      XmlRpcRequestProcessor xmlRpcRequestProcessor0 = xmlRpcClientConfigImpl0.getXmlRpcServer();
      assertNull(xmlRpcRequestProcessor0);
  }
}
