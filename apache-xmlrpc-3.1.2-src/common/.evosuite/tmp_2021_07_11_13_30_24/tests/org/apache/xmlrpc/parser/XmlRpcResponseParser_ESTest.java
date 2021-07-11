/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 11 09:02:25 GMT 2021
 */

package org.apache.xmlrpc.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.xmlrpc.common.TypeFactory;
import org.apache.xmlrpc.common.TypeFactoryImpl;
import org.apache.xmlrpc.common.XmlRpcController;
import org.apache.xmlrpc.common.XmlRpcHttpRequestConfigImpl;
import org.apache.xmlrpc.parser.XmlRpcResponseParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xml.sax.SAXParseException;
import org.xml.sax.ext.Attributes2Impl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XmlRpcResponseParser_ESTest extends XmlRpcResponseParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl((XmlRpcController) null);
      XmlRpcResponseParser xmlRpcResponseParser0 = new XmlRpcResponseParser(xmlRpcHttpRequestConfigImpl0, typeFactoryImpl0);
      assertEquals(0, xmlRpcResponseParser0.getErrorCode());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcResponseParser xmlRpcResponseParser0 = new XmlRpcResponseParser(xmlRpcHttpRequestConfigImpl0, typeFactoryImpl0);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      // Undeclared exception!
      try { 
        xmlRpcResponseParser0.startElement("Expected value element, got ", (String) null, "Expected value element, got ", attributes2Impl0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // local part cannot be \"null\" when creating a QName
         //
         verifyException("javax.xml.namespace.QName", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      XmlRpcResponseParser xmlRpcResponseParser0 = new XmlRpcResponseParser(xmlRpcHttpRequestConfigImpl0, typeFactoryImpl0);
      xmlRpcResponseParser0.startElement("", "methodResponse", "", attributes2Impl0);
      // Undeclared exception!
      try { 
        xmlRpcResponseParser0.endElement((String) null, (String) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // local part cannot be \"null\" when creating a QName
         //
         verifyException("javax.xml.namespace.QName", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcResponseParser xmlRpcResponseParser0 = new XmlRpcResponseParser(xmlRpcHttpRequestConfigImpl0, typeFactoryImpl0);
      // Undeclared exception!
      try { 
        xmlRpcResponseParser0.addResult("|sDi#@1D]_*");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.util.Map
         //
         verifyException("org.apache.xmlrpc.parser.XmlRpcResponseParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      XmlRpcResponseParser xmlRpcResponseParser0 = new XmlRpcResponseParser(xmlRpcHttpRequestConfigImpl0, typeFactoryImpl0);
      xmlRpcResponseParser0.startElement("", "methodResponse", "", attributes2Impl0);
      try { 
        xmlRpcResponseParser0.endElement("", "*R\"h%.UPEm/n,2", "2lxA|");
        fail("Expecting exception: SAXParseException");
      
      } catch(SAXParseException e) {
         //
         // Expected /methodResponse element, got *R\"h%.UPEm/n,2
         //
         verifyException("org.apache.xmlrpc.parser.XmlRpcResponseParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      XmlRpcResponseParser xmlRpcResponseParser0 = new XmlRpcResponseParser(xmlRpcHttpRequestConfigImpl0, typeFactoryImpl0);
      try { 
        xmlRpcResponseParser0.endElement("methodResponse", "VO", "VO");
        fail("Expecting exception: SAXParseException");
      
      } catch(SAXParseException e) {
         //
         // Invalid state: Not inside value tag.
         //
         verifyException("org.apache.xmlrpc.parser.RecursiveTypeParserImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      XmlRpcResponseParser xmlRpcResponseParser0 = new XmlRpcResponseParser(xmlRpcHttpRequestConfigImpl0, typeFactoryImpl0);
      xmlRpcResponseParser0.startElement("", "methodResponse", "", attributes2Impl0);
      xmlRpcResponseParser0.endElement("", "methodResponse", (String) null);
      assertEquals(0, xmlRpcResponseParser0.getErrorCode());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      XmlRpcResponseParser xmlRpcResponseParser0 = new XmlRpcResponseParser(xmlRpcHttpRequestConfigImpl0, typeFactoryImpl0);
      xmlRpcResponseParser0.startElement("", "methodResponse", "", attributes2Impl0);
      try { 
        xmlRpcResponseParser0.startElement("B;L3K~L*", "Expected value element, got ", "B;L3K~L*", attributes2Impl0);
        fail("Expecting exception: SAXParseException");
      
      } catch(SAXParseException e) {
         //
         // Expected params or fault element, got {B;L3K~L*}Expected value element, got 
         //
         verifyException("org.apache.xmlrpc.parser.XmlRpcResponseParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      XmlRpcResponseParser xmlRpcResponseParser0 = new XmlRpcResponseParser(xmlRpcHttpRequestConfigImpl0, typeFactoryImpl0);
      try { 
        xmlRpcResponseParser0.startElement("", "methdR[sponse", "", attributes2Impl0);
        fail("Expecting exception: SAXParseException");
      
      } catch(SAXParseException e) {
         //
         // Expected methodResponse element, got methdR[sponse
         //
         verifyException("org.apache.xmlrpc.parser.XmlRpcResponseParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      XmlRpcResponseParser xmlRpcResponseParser0 = new XmlRpcResponseParser(xmlRpcHttpRequestConfigImpl0, (TypeFactory) null);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      try { 
        xmlRpcResponseParser0.startElement("Expected /methodResponse element, got ", "fault", "value", attributes2Impl0);
        fail("Expecting exception: SAXParseException");
      
      } catch(SAXParseException e) {
         //
         // Expected methodResponse element, got {Expected /methodResponse element, got }fault
         //
         verifyException("org.apache.xmlrpc.parser.XmlRpcResponseParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      XmlRpcResponseParser xmlRpcResponseParser0 = new XmlRpcResponseParser(xmlRpcHttpRequestConfigImpl0, typeFactoryImpl0);
      xmlRpcResponseParser0.startElement("", "methodResponse", "", attributes2Impl0);
      try { 
        xmlRpcResponseParser0.startElement("", "", "methodResponse", attributes2Impl0);
        fail("Expecting exception: SAXParseException");
      
      } catch(SAXParseException e) {
         //
         // Expected params or fault element, got 
         //
         verifyException("org.apache.xmlrpc.parser.XmlRpcResponseParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      XmlRpcResponseParser xmlRpcResponseParser0 = new XmlRpcResponseParser(xmlRpcHttpRequestConfigImpl0, typeFactoryImpl0);
      // Undeclared exception!
      try { 
        xmlRpcResponseParser0.addResult((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.parser.XmlRpcResponseParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      XmlRpcResponseParser xmlRpcResponseParser0 = new XmlRpcResponseParser(xmlRpcHttpRequestConfigImpl0, (TypeFactory) null);
      int int0 = xmlRpcResponseParser0.getErrorCode();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      XmlRpcResponseParser xmlRpcResponseParser0 = new XmlRpcResponseParser(xmlRpcHttpRequestConfigImpl0, (TypeFactory) null);
      String string0 = xmlRpcResponseParser0.getErrorMessage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      XmlRpcResponseParser xmlRpcResponseParser0 = new XmlRpcResponseParser(xmlRpcHttpRequestConfigImpl0, (TypeFactory) null);
      boolean boolean0 = xmlRpcResponseParser0.isSuccess();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      XmlRpcResponseParser xmlRpcResponseParser0 = new XmlRpcResponseParser(xmlRpcHttpRequestConfigImpl0, (TypeFactory) null);
      Throwable throwable0 = xmlRpcResponseParser0.getErrorCause();
      assertNull(throwable0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      XmlRpcResponseParser xmlRpcResponseParser0 = new XmlRpcResponseParser(xmlRpcHttpRequestConfigImpl0, (TypeFactory) null);
      xmlRpcResponseParser0.startDocument();
      assertEquals(0, xmlRpcResponseParser0.getErrorCode());
      assertFalse(xmlRpcResponseParser0.isSuccess());
  }
}