/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Jun 01 07:47:58 GMT 2021
 */

package org.apache.xmlrpc.webserver;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Connection_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.xmlrpc.webserver.Connection"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "Cp1252"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "C:\\Users\\Ali\\AppData\\Local\\Temp\\"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "E:\\Uni\\Masters\\Term 4\\Software\\InGit\\xmlrpc-evo-suite\\apache-xmlrpc-3.1.2-src\\server"); 
    java.lang.System.setProperty("user.home", "C:\\Users\\Ali"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "Ali"); 
    java.lang.System.setProperty("user.timezone", "Asia/Tehran"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Connection_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.xmlrpc.server.XmlRpcHttpServerConfig",
      "org.apache.xmlrpc.webserver.ConnectionServer",
      "org.apache.xmlrpc.common.XmlRpcHttpRequestConfigImpl",
      "org.apache.xmlrpc.server.XmlRpcServerWorkerFactory",
      "org.apache.xmlrpc.common.ServerStreamConnection",
      "org.apache.xmlrpc.webserver.Connection$RequestException",
      "org.apache.xmlrpc.webserver.WebServer",
      "org.apache.xmlrpc.serializer.XmlRpcWriter",
      "org.apache.xmlrpc.util.ThreadPool$Task",
      "org.apache.xmlrpc.server.XmlRpcServer",
      "org.apache.xmlrpc.common.XmlRpcWorkerFactory",
      "org.apache.xmlrpc.server.XmlRpcLocalStreamServer",
      "org.apache.xmlrpc.webserver.Connection$BadEncodingException",
      "org.apache.xmlrpc.common.XmlRpcStreamRequestProcessor",
      "org.apache.xmlrpc.util.ThreadPool$InterruptableTask",
      "org.apache.xmlrpc.XmlRpcException",
      "org.apache.xmlrpc.common.XmlRpcStreamConfig",
      "org.apache.xmlrpc.common.XmlRpcHttpRequestConfig",
      "org.apache.xmlrpc.webserver.RequestData",
      "org.apache.xmlrpc.serializer.XmlWriterFactory",
      "org.apache.xmlrpc.common.XmlRpcRequestProcessor",
      "org.apache.xmlrpc.common.TypeFactory",
      "org.apache.xmlrpc.common.XmlRpcStreamRequestConfig",
      "org.apache.xmlrpc.server.XmlRpcServerConfig",
      "org.apache.xmlrpc.server.XmlRpcHttpServer",
      "org.apache.xmlrpc.server.XmlRpcHandlerMapping",
      "org.apache.xmlrpc.webserver.Connection$BadRequestException",
      "org.apache.xmlrpc.common.XmlRpcHttpConfig",
      "org.apache.xmlrpc.server.XmlRpcServerConfigImpl",
      "org.apache.xmlrpc.XmlRpcRequestConfig",
      "org.apache.xmlrpc.util.LimitedInputStream",
      "org.apache.xmlrpc.webserver.Connection",
      "org.apache.xmlrpc.common.XmlRpcNotAuthorizedException",
      "org.apache.xmlrpc.util.ThreadPool",
      "org.apache.xmlrpc.XmlRpcRequest",
      "org.apache.xmlrpc.common.XmlRpcController",
      "org.apache.xmlrpc.XmlRpcConfig",
      "org.apache.xmlrpc.common.TypeConverterFactory",
      "org.apache.xmlrpc.server.XmlRpcStreamServer",
      "org.apache.xmlrpc.XmlRpcConfigImpl",
      "org.apache.xmlrpc.webserver.Connection$1",
      "org.apache.xmlrpc.server.XmlRpcErrorLogger"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Connection_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.xmlrpc.webserver.Connection",
      "org.apache.xmlrpc.webserver.Connection$1",
      "org.apache.xmlrpc.webserver.Connection$RequestException",
      "org.apache.xmlrpc.webserver.Connection$BadRequestException",
      "org.apache.xmlrpc.webserver.Connection$BadEncodingException"
    );
  }
}