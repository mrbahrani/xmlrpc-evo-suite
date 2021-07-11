/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 11 10:39:24 GMT 2021
 */

package org.apache.xmlrpc.metadata;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;
import javax.imageio.metadata.IIOMetadataNode;
import org.apache.xmlrpc.metadata.Util;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Util_ESTest extends Util_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<Boolean> class0 = Class.class;
      try { 
        Util.newInstance(class0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Illegal access when instantiating class java.lang.Class
         //
         verifyException("org.apache.xmlrpc.metadata.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<IIOMetadataNode> class0 = IIOMetadataNode.class;
      Object object0 = Util.newInstance(class0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        Util.newInstance((Class) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.metadata.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        Util.getSignatureType((Class) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        Util.getSignature((Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.metadata.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        Util.getSignature((Method) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.metadata.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Integer> class0 = Class.class;
      // Undeclared exception!
      try { 
        Util.getMethodHelp(class0, (Method) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.metadata.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) "ex:i2";
      String string0 = Util.getSignature(objectArray0);
      assertEquals("java.lang.String, null, null, null, null, null, null, null", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      String string0 = Util.getSignature(objectArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Calendar> class0 = Class.class;
      Method[] methodArray0 = new Method[2];
      // Undeclared exception!
      try { 
        Util.getMethodHelp(class0, methodArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.metadata.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<IIOMetadataNode> class0 = Class.class;
      Method[] methodArray0 = new Method[0];
      String string0 = Util.getMethodHelp(class0, methodArray0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Method[] methodArray0 = new Method[12];
      // Undeclared exception!
      try { 
        Util.getSignature(methodArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.metadata.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Method[] methodArray0 = new Method[0];
      String[][] stringArray0 = Util.getSignature(methodArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Object> class0 = Class.class;
      String string0 = Util.getSignatureType(class0);
      assertEquals("base64", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<IIOMetadataNode> class0 = IIOMetadataNode.class;
      String string0 = Util.getSignatureType(class0);
      assertEquals("ex:node", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<Float> class0 = Float.class;
      String string0 = Util.getSignatureType(class0);
      assertEquals("ex:float", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<Float> class0 = Float.TYPE;
      String string0 = Util.getSignatureType(class0);
      assertEquals("ex:float", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<Long> class0 = Long.class;
      String string0 = Util.getSignatureType(class0);
      assertEquals("ex:i8", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Object> class0 = Object.class;
      String string0 = Util.getSignatureType(class0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<Short> class0 = Short.class;
      String string0 = Util.getSignatureType(class0);
      assertEquals("ex:i2", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      String string0 = Util.getSignatureType(class0);
      assertEquals("ex:i2", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<Byte> class0 = Byte.class;
      String string0 = Util.getSignatureType(class0);
      assertEquals("ex:i1", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      String string0 = Util.getSignatureType(class0);
      assertNotNull(string0);
      assertEquals("ex:i1", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<Calendar> class0 = Calendar.class;
      String string0 = Util.getSignatureType(class0);
      assertEquals("dateTime.iso8601", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      String string0 = Util.getSignatureType(class0);
      assertEquals("ex:i8", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<String> class0 = String.class;
      String string0 = Util.getSignatureType(class0);
      assertEquals("string", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Class<Boolean> class0 = Boolean.class;
      String string0 = Util.getSignatureType(class0);
      assertEquals("boolean", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<Boolean> class0 = Boolean.TYPE;
      String string0 = Util.getSignatureType(class0);
      assertNotNull(string0);
      assertEquals("boolean", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Class<Double> class0 = Double.class;
      String string0 = Util.getSignatureType(class0);
      assertEquals("double", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Class<Double> class0 = Double.TYPE;
      String string0 = Util.getSignatureType(class0);
      assertNotNull(string0);
      assertEquals("double", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      String string0 = Util.getSignatureType(class0);
      assertEquals("int", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Class<Date> class0 = Date.class;
      String string0 = Util.getSignatureType(class0);
      assertEquals("dateTime.iso8601", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      String string0 = Util.getSignatureType(class0);
      assertEquals("int", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Util util0 = new Util();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Class<Boolean> class0 = Boolean.TYPE;
      try { 
        Util.newInstance(class0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Failed to instantiate class boolean
         //
         verifyException("org.apache.xmlrpc.metadata.Util", e);
      }
  }
}
