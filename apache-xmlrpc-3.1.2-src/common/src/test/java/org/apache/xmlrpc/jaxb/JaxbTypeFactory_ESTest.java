/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 01 06:25:32 GMT 2021
 */

package org.apache.xmlrpc.jaxb;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.JAXBContext;
import org.apache.ws.commons.util.NamespaceContextImpl;
import org.apache.xmlrpc.common.XmlRpcController;
import org.apache.xmlrpc.common.XmlRpcHttpRequestConfigImpl;
import org.apache.xmlrpc.common.XmlRpcStreamConfig;
import org.apache.xmlrpc.jaxb.JaxbTypeFactory;
import org.apache.xmlrpc.parser.TypeParser;
import org.apache.xmlrpc.serializer.TypeSerializer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xml.sax.SAXException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JaxbTypeFactory_ESTest extends JaxbTypeFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      JaxbTypeFactory jaxbTypeFactory0 = new JaxbTypeFactory(xmlRpcController0, (JAXBContext) null);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      try { 
        jaxbTypeFactory0.getSerializer(xmlRpcHttpRequestConfigImpl0, (Object) null);
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Null values aren't supported, if isEnabledForExtensions() == false
         //
         verifyException("org.apache.xmlrpc.common.TypeFactoryImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 4);
      Class<String> class0 = String.class;
      classArray0[0] = class0;
      classArray0[1] = classArray0[0];
      classArray0[2] = class0;
      classArray0[3] = classArray0[1];
      JAXBContext jAXBContext0 = JAXBContext.newInstance(classArray0);
      JaxbTypeFactory jaxbTypeFactory0 = new JaxbTypeFactory(xmlRpcController0, jAXBContext0);
      // Undeclared exception!
      try { 
        jaxbTypeFactory0.getSerializer((XmlRpcStreamConfig) null, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.common.TypeFactoryImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      JAXBContext jAXBContext0 = JAXBContext.newInstance((Class[]) classArray0, (Map<String, ?>) hashMap0);
      JaxbTypeFactory jaxbTypeFactory0 = new JaxbTypeFactory(xmlRpcController0, jAXBContext0);
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      // Undeclared exception!
      try { 
        jaxbTypeFactory0.getParser((XmlRpcStreamConfig) null, namespaceContextImpl0, "http://ws.apache.org/xmlrpc/namespaces/extensions", "org.apache.xmlrpc.common.XmlRpcWorkerFactory");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.common.TypeFactoryImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      Class<String> class0 = String.class;
      classArray0[0] = class0;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      JAXBContext jAXBContext0 = JAXBContext.newInstance((Class[]) classArray0, (Map<String, ?>) hashMap0);
      JaxbTypeFactory jaxbTypeFactory0 = new JaxbTypeFactory(xmlRpcController0, jAXBContext0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      Object object0 = new Object();
      TypeSerializer typeSerializer0 = jaxbTypeFactory0.getSerializer(xmlRpcHttpRequestConfigImpl0, object0);
      assertNull(typeSerializer0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      JAXBContext jAXBContext0 = JAXBContext.newInstance((Class[]) classArray0, (Map<String, ?>) hashMap0);
      JaxbTypeFactory jaxbTypeFactory0 = new JaxbTypeFactory(xmlRpcController0, jAXBContext0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      TypeSerializer typeSerializer0 = jaxbTypeFactory0.getSerializer(xmlRpcHttpRequestConfigImpl0, "");
      assertNotNull(typeSerializer0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      Class<String> class0 = String.class;
      classArray0[0] = class0;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      JAXBContext jAXBContext0 = JAXBContext.newInstance((Class[]) classArray0, (Map<String, ?>) hashMap0);
      JaxbTypeFactory jaxbTypeFactory0 = new JaxbTypeFactory(xmlRpcController0, jAXBContext0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      TypeParser typeParser0 = jaxbTypeFactory0.getParser(xmlRpcHttpRequestConfigImpl0, namespaceContextImpl0, "http://ws.apache.org/xmlrpc/namespaces/extensions", "#~f|mvA");
      assertNull(typeParser0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      Class<String> class0 = String.class;
      classArray0[0] = class0;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      JAXBContext jAXBContext0 = JAXBContext.newInstance((Class[]) classArray0, (Map<String, ?>) hashMap0);
      JaxbTypeFactory jaxbTypeFactory0 = new JaxbTypeFactory(xmlRpcController0, jAXBContext0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      TypeParser typeParser0 = jaxbTypeFactory0.getParser(xmlRpcHttpRequestConfigImpl0, namespaceContextImpl0, "http://ws.apache.org/xmlrp_/namespaces/extensions", "");
      assertNull(typeParser0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      Class<String> class0 = String.class;
      classArray0[0] = class0;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      JAXBContext jAXBContext0 = JAXBContext.newInstance((Class[]) classArray0, (Map<String, ?>) hashMap0);
      JaxbTypeFactory jaxbTypeFactory0 = new JaxbTypeFactory(xmlRpcController0, jAXBContext0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      TypeParser typeParser0 = jaxbTypeFactory0.getParser(xmlRpcHttpRequestConfigImpl0, namespaceContextImpl0, "", "string");
      assertNotNull(typeParser0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      JAXBContext jAXBContext0 = JAXBContext.newInstance((Class[]) classArray0, (Map<String, ?>) hashMap0);
      JaxbTypeFactory jaxbTypeFactory0 = new JaxbTypeFactory(xmlRpcController0, jAXBContext0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      TypeParser typeParser0 = jaxbTypeFactory0.getParser(xmlRpcHttpRequestConfigImpl0, namespaceContextImpl0, "http://ws.apache.org/xmlrpc/namespaces/extensions", "jaxb");
      assertNotNull(typeParser0);
  }
}
