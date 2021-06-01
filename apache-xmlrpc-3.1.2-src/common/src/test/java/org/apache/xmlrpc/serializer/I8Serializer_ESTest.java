/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 01 06:36:30 GMT 2021
 */

package org.apache.xmlrpc.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.xmlrpc.serializer.I8Serializer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xml.sax.ContentHandler;
import org.xml.sax.helpers.DefaultHandler;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class I8Serializer_ESTest extends I8Serializer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      I8Serializer i8Serializer0 = new I8Serializer();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        i8Serializer0.write((ContentHandler) null, object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.serializer.TypeSerializerImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      I8Serializer i8Serializer0 = new I8Serializer();
      DefaultHandler defaultHandler0 = new DefaultHandler();
      i8Serializer0.write(defaultHandler0, defaultHandler0);
  }
}