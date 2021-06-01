/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 01 06:29:19 GMT 2021
 */

package org.apache.xmlrpc.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.xmlrpc.parser.NullParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xml.sax.SAXParseException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NullParser_ESTest extends NullParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NullParser nullParser0 = new NullParser();
      try { 
        nullParser0.setResult("4");
        fail("Expecting exception: SAXParseException");
      
      } catch(SAXParseException e) {
         //
         // Unexpected characters in nil element.
         //
         verifyException("org.apache.xmlrpc.parser.NullParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NullParser nullParser0 = new NullParser();
      nullParser0.setResult("");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NullParser nullParser0 = new NullParser();
      nullParser0.setResult((String) null);
  }
}
