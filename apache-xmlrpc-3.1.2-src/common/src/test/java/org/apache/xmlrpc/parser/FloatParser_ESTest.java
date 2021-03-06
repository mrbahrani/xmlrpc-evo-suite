/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 01 06:35:56 GMT 2021
 */

package org.apache.xmlrpc.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.xmlrpc.parser.FloatParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xml.sax.SAXParseException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FloatParser_ESTest extends FloatParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FloatParser floatParser0 = new FloatParser();
      floatParser0.setResult("7");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FloatParser floatParser0 = new FloatParser();
      // Undeclared exception!
      try { 
        floatParser0.setResult((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FloatParser floatParser0 = new FloatParser();
      try { 
        floatParser0.setResult("[p0%tD7<LQ.yY1^Y}Sj");
        fail("Expecting exception: SAXParseException");
      
      } catch(SAXParseException e) {
         //
         // Failed to parse float value: [p0%tD7<LQ.yY1^Y}Sj
         //
         verifyException("org.apache.xmlrpc.parser.FloatParser", e);
      }
  }
}
