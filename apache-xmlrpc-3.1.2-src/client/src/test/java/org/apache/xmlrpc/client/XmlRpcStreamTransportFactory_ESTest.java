/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 01 06:44:52 GMT 2021
 */

package org.apache.xmlrpc.client;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcLocalStreamTransportFactory;
import org.apache.xmlrpc.common.XmlRpcStreamRequestProcessor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XmlRpcStreamTransportFactory_ESTest extends XmlRpcStreamTransportFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XmlRpcClient xmlRpcClient0 = mock(XmlRpcClient.class, new ViolatedAssumptionAnswer());
      XmlRpcStreamRequestProcessor xmlRpcStreamRequestProcessor0 = mock(XmlRpcStreamRequestProcessor.class, new ViolatedAssumptionAnswer());
      XmlRpcLocalStreamTransportFactory xmlRpcLocalStreamTransportFactory0 = new XmlRpcLocalStreamTransportFactory(xmlRpcClient0, xmlRpcStreamRequestProcessor0);
  }
}
