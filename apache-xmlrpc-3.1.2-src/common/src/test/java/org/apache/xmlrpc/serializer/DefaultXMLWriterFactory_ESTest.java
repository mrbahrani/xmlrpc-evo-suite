/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 01 06:34:09 GMT 2021
 */

package org.apache.xmlrpc.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.OutputStream;
import org.apache.ws.commons.serialize.CharSetXMLWriter;
import org.apache.xmlrpc.common.XmlRpcHttpRequestConfigImpl;
import org.apache.xmlrpc.serializer.DefaultXMLWriterFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultXMLWriterFactory_ESTest extends DefaultXMLWriterFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultXMLWriterFactory defaultXMLWriterFactory0 = new DefaultXMLWriterFactory();
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("D9?b !4CxR0#'?G45?");
      CharSetXMLWriter charSetXMLWriter0 = (CharSetXMLWriter)defaultXMLWriterFactory0.getXmlWriter(xmlRpcHttpRequestConfigImpl0, mockFileOutputStream0);
      assertTrue(charSetXMLWriter0.isDeclarating());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultXMLWriterFactory defaultXMLWriterFactory0 = new DefaultXMLWriterFactory();
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      xmlRpcHttpRequestConfigImpl0.setEncoding("f4ln)eQHq");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("f4ln)eQHq");
      try { 
        defaultXMLWriterFactory0.getXmlWriter(xmlRpcHttpRequestConfigImpl0, mockFileOutputStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unsupported encoding: f4ln)eQHq
         //
         verifyException("org.apache.xmlrpc.serializer.BaseXmlWriterFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultXMLWriterFactory defaultXMLWriterFactory0 = new DefaultXMLWriterFactory();
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      // Undeclared exception!
      try { 
        defaultXMLWriterFactory0.getXmlWriter(xmlRpcHttpRequestConfigImpl0, (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Writer", e);
      }
  }
}
