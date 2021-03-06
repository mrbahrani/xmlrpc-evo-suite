/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 01 06:27:39 GMT 2021
 */

package org.apache.xmlrpc.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.ws.commons.util.NamespaceContextImpl;
import org.apache.xmlrpc.common.TypeFactory;
import org.apache.xmlrpc.common.TypeFactoryImpl;
import org.apache.xmlrpc.common.XmlRpcController;
import org.apache.xmlrpc.common.XmlRpcHttpRequestConfigImpl;
import org.apache.xmlrpc.parser.BigDecimalParser;
import org.apache.xmlrpc.parser.BigIntegerParser;
import org.apache.xmlrpc.parser.CalendarParser;
import org.apache.xmlrpc.parser.FloatParser;
import org.apache.xmlrpc.parser.I1Parser;
import org.apache.xmlrpc.parser.MapParser;
import org.apache.xmlrpc.parser.NullParser;
import org.apache.xmlrpc.parser.ObjectArrayParser;
import org.apache.xmlrpc.parser.SerializableParser;
import org.apache.xmlrpc.parser.StringParser;
import org.apache.xmlrpc.parser.TypeParserImpl;
import org.apache.xmlrpc.parser.XmlRpcRequestParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xml.sax.Locator;
import org.xml.sax.SAXParseException;
import org.xml.sax.ext.Locator2Impl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TypeParserImpl_ESTest extends TypeParserImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl((XmlRpcController) null);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      MapParser mapParser0 = new MapParser(xmlRpcHttpRequestConfigImpl0, namespaceContextImpl0, typeFactoryImpl0);
      char[] charArray0 = new char[0];
      mapParser0.characters(charArray0, (-1632), 0);
      assertArrayEquals(new char[] {}, charArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CalendarParser calendarParser0 = new CalendarParser();
      calendarParser0.startDocument();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[4];
      boolean boolean0 = TypeParserImpl.isEmpty(charArray0, (-3439), (-3439));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        TypeParserImpl.isEmpty(charArray0, (-1), 436);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.xmlrpc.parser.TypeParserImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SerializableParser serializableParser0 = new SerializableParser();
      // Undeclared exception!
      try { 
        serializableParser0.getResult();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[3];
      I1Parser i1Parser0 = new I1Parser();
      try { 
        i1Parser0.characters(charArray0, 0, 436);
        fail("Expecting exception: SAXParseException");
      
      } catch(SAXParseException e) {
         //
         // Unexpected non-whitespace characters
         //
         verifyException("org.apache.xmlrpc.parser.AtomicParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      ObjectArrayParser objectArrayParser0 = new ObjectArrayParser(xmlRpcHttpRequestConfigImpl0, namespaceContextImpl0, typeFactoryImpl0);
      // Undeclared exception!
      try { 
        objectArrayParser0.characters((char[]) null, (-464), 746);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.parser.TypeParserImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringParser stringParser0 = new StringParser();
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        stringParser0.characters(charArray0, 3015, 3015);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3015
         //
         verifyException("org.apache.xmlrpc.parser.TypeParserImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NullParser nullParser0 = new NullParser();
      nullParser0.startPrefixMapping("org.apache.xmlrpc.parser.TypeParserImpl", "");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BigDecimalParser bigDecimalParser0 = new BigDecimalParser();
      SerializableParser serializableParser0 = new SerializableParser();
      serializableParser0.setResult(bigDecimalParser0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FloatParser floatParser0 = new FloatParser();
      Locator locator0 = floatParser0.getDocumentLocator();
      assertNull(locator0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SerializableParser serializableParser0 = new SerializableParser();
      serializableParser0.processingInstruction("bg", "bg");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CalendarParser calendarParser0 = new CalendarParser();
      calendarParser0.ignorableWhitespace((char[]) null, 1, 1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      char[] charArray0 = new char[19];
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcRequestParser xmlRpcRequestParser0 = new XmlRpcRequestParser(xmlRpcHttpRequestConfigImpl0, typeFactoryImpl0);
      try { 
        xmlRpcRequestParser0.characters(charArray0, 0, 'a');
        fail("Expecting exception: SAXParseException");
      
      } catch(SAXParseException e) {
         //
         // Unexpected non-whitespace character data
         //
         verifyException("org.apache.xmlrpc.parser.TypeParserImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[19];
      boolean boolean0 = TypeParserImpl.isEmpty(charArray0, 0, 'p');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeParserImpl.isEmpty((char[]) null, 208, 208);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.parser.TypeParserImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SerializableParser serializableParser0 = new SerializableParser();
      serializableParser0.endPrefixMapping((String) null);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      XmlRpcRequestParser xmlRpcRequestParser0 = new XmlRpcRequestParser(xmlRpcHttpRequestConfigImpl0, (TypeFactory) null);
      Locator2Impl locator2Impl0 = new Locator2Impl();
      xmlRpcRequestParser0.setDocumentLocator(locator2Impl0);
      Locator locator0 = xmlRpcRequestParser0.getDocumentLocator();
      assertSame(locator0, locator2Impl0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringParser stringParser0 = new StringParser();
      stringParser0.setResult("");
      Object object0 = stringParser0.getResult();
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringParser stringParser0 = new StringParser();
      Object object0 = stringParser0.getResult();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CalendarParser calendarParser0 = new CalendarParser();
      calendarParser0.endDocument();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BigIntegerParser bigIntegerParser0 = new BigIntegerParser();
      try { 
        bigIntegerParser0.skippedEntity("");
        fail("Expecting exception: SAXParseException");
      
      } catch(SAXParseException e) {
         //
         // Don't know how to handle entity 
         //
         verifyException("org.apache.xmlrpc.parser.TypeParserImpl", e);
      }
  }
}
