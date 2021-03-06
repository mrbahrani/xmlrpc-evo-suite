/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 01 06:28:57 GMT 2021
 */

package org.apache.xmlrpc.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.xmlrpc.serializer.BigDecimalSerializer;
import org.apache.xmlrpc.serializer.BigIntegerSerializer;
import org.apache.xmlrpc.serializer.BooleanSerializer;
import org.apache.xmlrpc.serializer.DoubleSerializer;
import org.apache.xmlrpc.serializer.FloatSerializer;
import org.apache.xmlrpc.serializer.NullSerializer;
import org.apache.xmlrpc.serializer.StringSerializer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xml.sax.ContentHandler;
import org.xml.sax.ext.DefaultHandler2;
import org.xml.sax.helpers.XMLFilterImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TypeSerializerImpl_ESTest extends TypeSerializerImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FloatSerializer floatSerializer0 = new FloatSerializer();
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      char[] charArray0 = new char[5];
      floatSerializer0.write((ContentHandler) xMLFilterImpl0, "-{%W+mdf++", charArray0);
      assertEquals(5, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BigIntegerSerializer bigIntegerSerializer0 = new BigIntegerSerializer();
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      bigIntegerSerializer0.write((ContentHandler) xMLFilterImpl0, (String) null, "", "value");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BooleanSerializer booleanSerializer0 = new BooleanSerializer();
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        booleanSerializer0.write((ContentHandler) null, ":@PO", charArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.serializer.TypeSerializerImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NullSerializer nullSerializer0 = new NullSerializer();
      // Undeclared exception!
      try { 
        nullSerializer0.write((ContentHandler) null, "", "", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.serializer.TypeSerializerImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DoubleSerializer doubleSerializer0 = new DoubleSerializer();
      // Undeclared exception!
      try { 
        doubleSerializer0.write((ContentHandler) null, "", "dozP!3M{W<~");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.serializer.TypeSerializerImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BigDecimalSerializer bigDecimalSerializer0 = new BigDecimalSerializer();
      StringSerializer stringSerializer0 = new StringSerializer();
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      stringSerializer0.write(defaultHandler2_0, bigDecimalSerializer0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StringSerializer stringSerializer0 = new StringSerializer();
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      stringSerializer0.write((ContentHandler) defaultHandler2_0, "value", "value");
  }
}
