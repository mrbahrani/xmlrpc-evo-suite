/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 01 07:47:58 GMT 2021
 */

package org.apache.xmlrpc.webserver;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.Socket;
import org.apache.xmlrpc.server.XmlRpcStreamServer;
import org.apache.xmlrpc.webserver.Connection;
import org.apache.xmlrpc.webserver.WebServer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Connection_ESTest extends Connection_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Connection connection0 = new Connection((WebServer) null, (XmlRpcStreamServer) null, (Socket) null);
      connection0.close();
  }
}
