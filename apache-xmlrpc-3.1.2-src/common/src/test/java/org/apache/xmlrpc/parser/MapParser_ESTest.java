/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 11 09:02:30 GMT 2021
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MapParser_ESTest extends MapParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      MapParser mapParser0 = new MapParser(xmlRpcHttpRequestConfigImpl0, namespaceContextImpl0, (TypeFactory) null);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      try { 
        mapParser0.startElement("", "", "org.apache.ws.commons.util.NamespaceContextImpl", attributes2Impl0);
        fail("Expecting exception: SAXParseException");
      
      } catch(SAXParseException e) {
         //
         // Expected struct, got 
         //
         verifyException("org.apache.xmlrpc.parser.MapParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl((XmlRpcController) null);
      MapParser mapParser0 = new MapParser(xmlRpcHttpRequestConfigImpl0, namespaceContextImpl0, typeFactoryImpl0);
      char[] charArray0 = new char[3];
      mapParser0.characters(charArray0, 0, 0);
      assertEquals(3, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl((XmlRpcController) null);
      MapParser mapParser0 = new MapParser(xmlRpcHttpRequestConfigImpl0, namespaceContextImpl0, typeFactoryImpl0);
      char[] charArray0 = new char[9];
      mapParser0.startValueTag();
      // Undeclared exception!
      try { 
        mapParser0.ignorableWhitespace(charArray0, 1, 3076);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      MapParser mapParser0 = new MapParser(xmlRpcHttpRequestConfigImpl0, namespaceContextImpl0, typeFactoryImpl0);
      char[] charArray0 = new char[2];
      try { 
        mapParser0.characters(charArray0, 0, 2);
        fail("Expecting exception: SAXParseException");
      
      } catch(SAXParseException e) {
         //
         // Unexpected non-whitespace character data
         //
         verifyException("org.apache.xmlrpc.parser.TypeParserImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl((XmlRpcController) null);
      MapParser mapParser0 = new MapParser(xmlRpcHttpRequestConfigImpl0, namespaceContextImpl0, typeFactoryImpl0);
      // Undeclared exception!
      try { 
        mapParser0.characters((char[]) null, 0, 2488);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.parser.TypeParserImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      MapParser mapParser0 = new MapParser(xmlRpcHttpRequestConfigImpl0, (NamespaceContextImpl) null, typeFactoryImpl0);
      try { 
        mapParser0.endElement("a9[`", "a9[`", "a9[`");
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
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      // Undeclared exception!
      try { 
        mapParser0.startElement("+$#xp=U", (String) null, "+$#xp=U", attributes2Impl0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // local part cannot be \"null\" when creating a QName
         //
         verifyException("javax.xml.namespace.QName", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      MapParser mapParser0 = new MapParser(xmlRpcHttpRequestConfigImpl0, namespaceContextImpl0, typeFactoryImpl0);
      char[] charArray0 = new char[0];
      mapParser0.ignorableWhitespace(charArray0, 20, 20);
      assertEquals(0, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      MapParser mapParser0 = new MapParser((XmlRpcStreamConfig) null, namespaceContextImpl0, typeFactoryImpl0);
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        mapParser0.characters(charArray0, (-1), 2296);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.xmlrpc.parser.TypeParserImpl", e);
      }
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
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      MapParser mapParser0 = new MapParser((XmlRpcStreamConfig) null, namespaceContextImpl0, typeFactoryImpl0);
      mapParser0.startDocument();
  }
}
