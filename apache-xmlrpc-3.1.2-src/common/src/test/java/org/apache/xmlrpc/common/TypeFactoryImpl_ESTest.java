/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 01 06:18:46 GMT 2021
 */

package org.apache.xmlrpc.common;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.chrono.HijrahDate;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import javax.imageio.metadata.IIOMetadataNode;
import org.apache.ws.commons.util.NamespaceContextImpl;
import org.apache.xmlrpc.common.TypeFactoryImpl;
import org.apache.xmlrpc.common.XmlRpcController;
import org.apache.xmlrpc.common.XmlRpcHttpRequestConfigImpl;
import org.apache.xmlrpc.common.XmlRpcStreamConfig;
import org.apache.xmlrpc.parser.TypeParser;
import org.apache.xmlrpc.serializer.TypeSerializer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;
import org.xml.sax.SAXException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TypeFactoryImpl_ESTest extends TypeFactoryImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl((XmlRpcController) null);
      XmlRpcController xmlRpcController0 = typeFactoryImpl0.getController();
      assertNull(xmlRpcController0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      // Undeclared exception!
      try { 
        typeFactoryImpl0.getSerializer((XmlRpcStreamConfig) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.common.TypeFactoryImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      TypeParser typeParser0 = typeFactoryImpl0.getParser(xmlRpcHttpRequestConfigImpl0, namespaceContextImpl0, "", "lulN/;%w<De");
      assertNull(typeParser0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      TypeParser typeParser0 = typeFactoryImpl0.getParser(xmlRpcHttpRequestConfigImpl0, namespaceContextImpl0, "", "base64");
      assertNotNull(typeParser0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      TypeParser typeParser0 = typeFactoryImpl0.getParser(xmlRpcHttpRequestConfigImpl0, namespaceContextImpl0, "", "array");
      assertNotNull(typeParser0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      TypeParser typeParser0 = typeFactoryImpl0.getParser(xmlRpcHttpRequestConfigImpl0, namespaceContextImpl0, "", "string");
      assertNotNull(typeParser0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      TypeParser typeParser0 = typeFactoryImpl0.getParser(xmlRpcHttpRequestConfigImpl0, namespaceContextImpl0, "", "double");
      assertNotNull(typeParser0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      TypeParser typeParser0 = typeFactoryImpl0.getParser(xmlRpcHttpRequestConfigImpl0, namespaceContextImpl0, "", "boolean");
      assertNotNull(typeParser0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl((XmlRpcController) null);
      TypeParser typeParser0 = typeFactoryImpl0.getParser(xmlRpcHttpRequestConfigImpl0, namespaceContextImpl0, "", "i4");
      assertNotNull(typeParser0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      TypeParser typeParser0 = typeFactoryImpl0.getParser(xmlRpcHttpRequestConfigImpl0, namespaceContextImpl0, "", "int");
      assertNotNull(typeParser0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      TypeParser typeParser0 = typeFactoryImpl0.getParser(xmlRpcHttpRequestConfigImpl0, namespaceContextImpl0, "-d=kObul w", "http://ws.apache.org/xmlrpc/namespaces/extensions");
      assertNull(typeParser0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      xmlRpcHttpRequestConfigImpl0.setEnabledForExtensions(true);
      TypeParser typeParser0 = typeFactoryImpl0.getParser(xmlRpcHttpRequestConfigImpl0, namespaceContextImpl0, "http://ws.apache.org/xmlrpc/namespaces/extensions", "value");
      assertNull(typeParser0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      TypeParser typeParser0 = typeFactoryImpl0.getParser(xmlRpcHttpRequestConfigImpl0, namespaceContextImpl0, "http://ws.apache.org/xmlrpc/namespaces/extensions", "value");
      assertNull(typeParser0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      xmlRpcHttpRequestConfigImpl0.setEnabledForExtensions(true);
      Instant instant0 = MockInstant.ofEpochMilli((byte) (-54));
      ZoneId zoneId0 = ZoneId.systemDefault();
      Clock clock0 = MockClock.fixed(instant0, zoneId0);
      HijrahDate hijrahDate0 = MockHijrahDate.now(clock0);
      TypeSerializer typeSerializer0 = typeFactoryImpl0.getSerializer(xmlRpcHttpRequestConfigImpl0, hijrahDate0);
      assertNotNull(typeSerializer0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      Instant instant0 = MockInstant.ofEpochMilli((byte) (-54));
      ZoneId zoneId0 = ZoneId.systemDefault();
      Clock clock0 = MockClock.fixed(instant0, zoneId0);
      HijrahDate hijrahDate0 = MockHijrahDate.now(clock0);
      try { 
        typeFactoryImpl0.getSerializer(xmlRpcHttpRequestConfigImpl0, hijrahDate0);
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Serializable objects aren't supported, if isEnabledForExtensions() == false
         //
         verifyException("org.apache.xmlrpc.common.TypeFactoryImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      xmlRpcHttpRequestConfigImpl0.setEnabledForExtensions(true);
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl((XmlRpcController) null);
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      TypeSerializer typeSerializer0 = typeFactoryImpl0.getSerializer(xmlRpcHttpRequestConfigImpl0, bigDecimal0);
      assertNotNull(typeSerializer0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl((XmlRpcController) null);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      try { 
        typeFactoryImpl0.getSerializer(xmlRpcHttpRequestConfigImpl0, bigDecimal0);
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // BigDecimal values aren't supported, if isEnabledForExtensions() == false
         //
         verifyException("org.apache.xmlrpc.common.TypeFactoryImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      xmlRpcHttpRequestConfigImpl0.setEnabledForExtensions(true);
      byte[] byteArray0 = new byte[22];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      TypeSerializer typeSerializer0 = typeFactoryImpl0.getSerializer(xmlRpcHttpRequestConfigImpl0, bigInteger0);
      assertNotNull(typeSerializer0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      byte[] byteArray0 = new byte[22];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      try { 
        typeFactoryImpl0.getSerializer(xmlRpcHttpRequestConfigImpl0, bigInteger0);
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // BigInteger values aren't supported, if isEnabledForExtensions() == false
         //
         verifyException("org.apache.xmlrpc.common.TypeFactoryImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      xmlRpcHttpRequestConfigImpl0.setEnabledForExtensions(true);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      TypeSerializer typeSerializer0 = typeFactoryImpl0.getSerializer(xmlRpcHttpRequestConfigImpl0, iIOMetadataNode0);
      assertNotNull(typeSerializer0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      try { 
        typeFactoryImpl0.getSerializer(xmlRpcHttpRequestConfigImpl0, iIOMetadataNode0);
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // DOM nodes aren't supported, if isEnabledForExtensions() == false
         //
         verifyException("org.apache.xmlrpc.common.TypeFactoryImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      List list0 = namespaceContextImpl0.getPrefixes();
      TypeSerializer typeSerializer0 = typeFactoryImpl0.getSerializer(xmlRpcHttpRequestConfigImpl0, list0);
      assertNotNull(typeSerializer0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      doReturn("xmlns").when(xmlRpcController0).toString();
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcController xmlRpcController1 = typeFactoryImpl0.getController();
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      TypeSerializer typeSerializer0 = typeFactoryImpl0.getSerializer(xmlRpcHttpRequestConfigImpl0, xmlRpcController1);
      assertNull(typeSerializer0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      xmlRpcHttpRequestConfigImpl0.setEnabledForExtensions(true);
      TimeZone timeZone0 = xmlRpcHttpRequestConfigImpl0.getTimeZone();
      Calendar calendar0 = MockCalendar.getInstance(timeZone0);
      TypeSerializer typeSerializer0 = typeFactoryImpl0.getSerializer(xmlRpcHttpRequestConfigImpl0, calendar0);
      assertNotNull(typeSerializer0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      TimeZone timeZone0 = xmlRpcHttpRequestConfigImpl0.getTimeZone();
      Calendar calendar0 = MockCalendar.getInstance(timeZone0);
      try { 
        typeFactoryImpl0.getSerializer(xmlRpcHttpRequestConfigImpl0, calendar0);
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Calendar values aren't supported, if isEnabledForExtensions() == false
         //
         verifyException("org.apache.xmlrpc.common.TypeFactoryImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      Double double0 = new Double((-1247.22425752));
      TypeSerializer typeSerializer0 = typeFactoryImpl0.getSerializer(xmlRpcHttpRequestConfigImpl0, double0);
      assertNotNull(typeSerializer0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      xmlRpcHttpRequestConfigImpl0.setEnabledForExtensions(true);
      Float float0 = new Float((double) (byte) (-54));
      TypeSerializer typeSerializer0 = typeFactoryImpl0.getSerializer(xmlRpcHttpRequestConfigImpl0, float0);
      assertNotNull(typeSerializer0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      Float float0 = new Float((double) (byte) (-54));
      try { 
        typeFactoryImpl0.getSerializer(xmlRpcHttpRequestConfigImpl0, float0);
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Float values aren't supported, if isEnabledForExtensions() == false
         //
         verifyException("org.apache.xmlrpc.common.TypeFactoryImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      Boolean boolean0 = new Boolean(false);
      TypeSerializer typeSerializer0 = typeFactoryImpl0.getSerializer(xmlRpcHttpRequestConfigImpl0, boolean0);
      assertNotNull(typeSerializer0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      xmlRpcHttpRequestConfigImpl0.setEnabledForExtensions(true);
      Long long0 = new Long((-483));
      TypeSerializer typeSerializer0 = typeFactoryImpl0.getSerializer(xmlRpcHttpRequestConfigImpl0, long0);
      assertNotNull(typeSerializer0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      Long long0 = new Long((-1921L));
      try { 
        typeFactoryImpl0.getSerializer(xmlRpcHttpRequestConfigImpl0, long0);
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Long values aren't supported, if isEnabledForExtensions() == false
         //
         verifyException("org.apache.xmlrpc.common.TypeFactoryImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      Integer integer0 = new Integer((-4269));
      TypeSerializer typeSerializer0 = typeFactoryImpl0.getSerializer(xmlRpcHttpRequestConfigImpl0, integer0);
      assertNotNull(typeSerializer0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      xmlRpcHttpRequestConfigImpl0.setEnabledForExtensions(true);
      Short short0 = new Short((short) (-896));
      TypeSerializer typeSerializer0 = typeFactoryImpl0.getSerializer(xmlRpcHttpRequestConfigImpl0, short0);
      assertNotNull(typeSerializer0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      Short short0 = new Short((short) (-896));
      try { 
        typeFactoryImpl0.getSerializer(xmlRpcHttpRequestConfigImpl0, short0);
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Short values aren't supported, if isEnabledForExtensions() == false
         //
         verifyException("org.apache.xmlrpc.common.TypeFactoryImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      xmlRpcHttpRequestConfigImpl0.setEnabledForExtensions(true);
      Byte byte0 = Byte.valueOf((byte)6);
      TypeSerializer typeSerializer0 = typeFactoryImpl0.getSerializer(xmlRpcHttpRequestConfigImpl0, byte0);
      assertNotNull(typeSerializer0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      Byte byte0 = new Byte((byte) (-39));
      try { 
        typeFactoryImpl0.getSerializer(xmlRpcHttpRequestConfigImpl0, byte0);
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Byte values aren't supported, if isEnabledForExtensions() == false
         //
         verifyException("org.apache.xmlrpc.common.TypeFactoryImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl((XmlRpcController) null);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      TypeSerializer typeSerializer0 = typeFactoryImpl0.getSerializer(xmlRpcHttpRequestConfigImpl0, "A/");
      assertNotNull(typeSerializer0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      xmlRpcHttpRequestConfigImpl0.setEnabledForExtensions(true);
      TypeSerializer typeSerializer0 = typeFactoryImpl0.getSerializer(xmlRpcHttpRequestConfigImpl0, (Object) null);
      assertNotNull(typeSerializer0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      try { 
        typeFactoryImpl0.getSerializer(xmlRpcHttpRequestConfigImpl0, (Object) null);
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Null values aren't supported, if isEnabledForExtensions() == false
         //
         verifyException("org.apache.xmlrpc.common.TypeFactoryImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      NamespaceContextImpl namespaceContextImpl0 = new NamespaceContextImpl();
      TypeParser typeParser0 = typeFactoryImpl0.getParser(xmlRpcHttpRequestConfigImpl0, namespaceContextImpl0, "", "dateTime.iso8601");
      assertNotNull(typeParser0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      XmlRpcController xmlRpcController0 = mock(XmlRpcController.class, new ViolatedAssumptionAnswer());
      TypeFactoryImpl typeFactoryImpl0 = new TypeFactoryImpl(xmlRpcController0);
      XmlRpcHttpRequestConfigImpl xmlRpcHttpRequestConfigImpl0 = new XmlRpcHttpRequestConfigImpl();
      MockDate mockDate0 = new MockDate();
      TypeSerializer typeSerializer0 = typeFactoryImpl0.getSerializer(xmlRpcHttpRequestConfigImpl0, mockDate0);
      TypeSerializer typeSerializer1 = typeFactoryImpl0.getSerializer(xmlRpcHttpRequestConfigImpl0, mockDate0);
      assertSame(typeSerializer1, typeSerializer0);
  }
}
