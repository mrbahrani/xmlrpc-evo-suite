/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 11 08:11:54 GMT 2021
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
import org.apache.xmlrpc.common.XmlRpcStreamConfig;
import org.apache.xmlrpc.parser.MapParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xml.sax.SAXParseException;
import org.xml.sax.ext.Attributes2Impl;
import org.xml.sax.helpers.AttributesImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MapParser_ESTest extends MapParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      MapParser mapParser0 = new MapParser(xmlRpcHttpRequestConfigImpl0, namespaceContextImpl0, typeFactoryImpl0);
      AttributesImpl attributesImpl0 = new AttributesImpl();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl(attributesImpl0);
      // Undeclared exception!
      try { 
        mapParser0.startElement("", (String) null, "g)rs", attributes2Impl0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // local part cannot be \"null\" when creating a QName
         //
         verifyException("javax.xml.namespace.QName", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      MapParser mapParser0 = new MapParser(xmlRpcHttpRequestConfigImpl0, namespaceContextImpl0, (TypeFactory) null);
      mapParser0.startValueTag();
      // Undeclared exception!
      try { 
        mapParser0.ignorableWhitespace((char[]) null, (-1), (-2098677199));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      MapParser mapParser0 = new MapParser(xmlRpcHttpRequestConfigImpl0, namespaceContextImpl0, typeFactoryImpl0);
      char[] charArray0 = new char[2];
      mapParser0.startValueTag();
      // Undeclared exception!
      try { 
        mapParser0.ignorableWhitespace(charArray0, 13, 276);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      MapParser mapParser0 = new MapParser(xmlRpcHttpRequestConfigImpl0, namespaceContextImpl0, typeFactoryImpl0);
      // Undeclared exception!
      try { 
        mapParser0.characters((char[]) null, (-1166), 58);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.parser.TypeParserImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      MapParser mapParser0 = new MapParser(xmlRpcHttpRequestConfigImpl0, namespaceContextImpl0, typeFactoryImpl0);
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        mapParser0.characters(charArray0, 5, 5);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.apache.xmlrpc.parser.TypeParserImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      MapParser mapParser0 = new MapParser(xmlRpcHttpRequestConfigImpl0, namespaceContextImpl0, (TypeFactory) null);
      try { 
        mapParser0.endElement("6S9", "6S9", "6S9");
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
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      MapParser mapParser0 = new MapParser(xmlRpcHttpRequestConfigImpl0, namespaceContextImpl0, (TypeFactory) null);
      AttributesImpl attributesImpl0 = new AttributesImpl();
      try { 
        mapParser0.startElement("x", "x", "x", attributesImpl0);
        fail("Expecting exception: SAXParseException");
      
      } catch(SAXParseException e) {
         //
         // Expected struct, got {x}x
         //
         verifyException("org.apache.xmlrpc.parser.MapParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      MapParser mapParser0 = new MapParser(xmlRpcHttpRequestConfigImpl0, namespaceContextImpl0, typeFactoryImpl0);
      char[] charArray0 = new char[4];
      mapParser0.ignorableWhitespace(charArray0, (-1575), 5);
      assertEquals(4, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      MapParser mapParser0 = new MapParser(xmlRpcHttpRequestConfigImpl0, namespaceContextImpl0, typeFactoryImpl0);
      mapParser0.characters((char[]) null, 5, (-361));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      MapParser mapParser0 = new MapParser(xmlRpcHttpRequestConfigImpl0, namespaceContextImpl0, typeFactoryImpl0);
      try { 
        mapParser0.addResult(typeFactoryImpl0);
        fail("Expecting exception: SAXParseException");
      
      } catch(SAXParseException e) {
         //
         // Invalid state: Expected name
         //
         verifyException("org.apache.xmlrpc.parser.MapParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      MapParser mapParser0 = new MapParser(xmlRpcHttpRequestConfigImpl0, namespaceContextImpl0, typeFactoryImpl0);
      mapParser0.startDocument();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      MapParser mapParser0 = new MapParser((XmlRpcStreamConfig) null, namespaceContextImpl0, typeFactoryImpl0);
      char[] charArray0 = new char[9];
      try { 
        mapParser0.characters(charArray0, 4, 4);
        fail("Expecting exception: SAXParseException");
      
      } catch(SAXParseException e) {
         //
         // Unexpected non-whitespace character data
         //
         verifyException("org.apache.xmlrpc.parser.TypeParserImpl", e);
      }
  }
}
