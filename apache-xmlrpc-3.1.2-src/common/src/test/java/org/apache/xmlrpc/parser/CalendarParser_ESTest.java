/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 01 06:30:33 GMT 2021
 */

package org.apache.xmlrpc.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.xmlrpc.parser.CalendarParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xml.sax.SAXParseException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CalendarParser_ESTest extends CalendarParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CalendarParser calendarParser0 = new CalendarParser();
      // Undeclared exception!
      try { 
        calendarParser0.setResult((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlrpc.parser.CalendarParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CalendarParser calendarParser0 = new CalendarParser();
      try { 
        calendarParser0.setResult("%T");
        fail("Expecting exception: SAXParseException");
      
      } catch(SAXParseException e) {
         //
         // Failed to parse dateTime value %T at position 0
         //
         verifyException("org.apache.xmlrpc.parser.CalendarParser", e);
      }
  }
}
