/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 01 06:27:57 GMT 2021
 */

package org.apache.xmlrpc.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.xmlrpc.parser.BooleanParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xml.sax.SAXParseException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BooleanParser_ESTest extends BooleanParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BooleanParser booleanParser0 = new BooleanParser();
      try { 
        booleanParser0.setResult("Don't know how to handle entity ");
        fail("Expecting exception: SAXParseException");
      
      } catch(SAXParseException e) {
         //
         // Failed to parse boolean value: Don't know how to handle entity 
         //
         verifyException("org.apache.xmlrpc.parser.BooleanParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BooleanParser booleanParser0 = new BooleanParser();
      // Undeclared exception!
      try { 
        booleanParser0.setResult((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.parser.BooleanParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BooleanParser booleanParser0 = new BooleanParser();
      booleanParser0.setResult("1");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BooleanParser booleanParser0 = new BooleanParser();
      booleanParser0.setResult("0");
  }
}
