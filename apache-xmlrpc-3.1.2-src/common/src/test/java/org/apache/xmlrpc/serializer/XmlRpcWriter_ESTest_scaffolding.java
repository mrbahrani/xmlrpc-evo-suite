/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Jun 01 12:05:08 GMT 2021
 */

package org.apache.xmlrpc.serializer;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class XmlRpcWriter_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.xmlrpc.serializer.XmlRpcWriter"; 
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    java.lang.System.setProperty("user.dir", "E:\\Uni\\Masters\\Term 4\\Software\\InGit\\xmlrpc-evo-suite\\apache-xmlrpc-3.1.2-src\\common"); 
    java.lang.System.setProperty("user.home", "C:\\Users\\Ali"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "Ali"); 
    java.lang.System.setProperty("user.timezone", "Asia/Tehran"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(XmlRpcWriter_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.xmlrpc.serializer.CalendarSerializer",
      "org.apache.xmlrpc.serializer.BooleanSerializer",
      "org.apache.xmlrpc.serializer.ExtSerializer",
      "org.apache.ws.commons.serialize.DOMSerializer",
      "org.apache.xmlrpc.serializer.NullSerializer",
      "org.apache.xmlrpc.serializer.XmlRpcWriter",
      "org.apache.xmlrpc.serializer.ByteArraySerializer",
      "org.apache.xmlrpc.common.XmlRpcWorkerFactory",
      "org.apache.xmlrpc.common.TypeFactoryImpl$1",
      "org.apache.ws.commons.util.Base64$SAXIOException",
      "org.apache.ws.commons.util.Base64$2",
      "org.apache.xmlrpc.common.TypeFactoryImpl$2",
      "org.apache.xmlrpc.common.XmlRpcStreamConfig",
      "org.apache.xmlrpc.serializer.DoubleSerializer",
      "org.apache.ws.commons.util.Base64$1",
      "org.apache.xmlrpc.parser.DateParser",
      "org.apache.xmlrpc.serializer.BigIntegerSerializer",
      "org.apache.xmlrpc.common.TypeFactory",
      "org.apache.xmlrpc.parser.TypeParser",
      "org.apache.xmlrpc.serializer.TypeSerializerImpl",
      "org.apache.xmlrpc.serializer.I4Serializer",
      "org.apache.ws.commons.util.Base64$3",
      "org.apache.xmlrpc.common.XmlRpcHttpConfig",
      "org.apache.ws.commons.util.Base64$EncoderOutputStream",
      "org.apache.xmlrpc.common.XmlRpcExtensionException",
      "org.apache.ws.commons.util.Base64$DecodingException",
      "org.apache.xmlrpc.XmlRpcRequest",
      "org.apache.xmlrpc.parser.TypeParserImpl",
      "org.apache.xmlrpc.common.XmlRpcController",
      "org.apache.xmlrpc.serializer.TypeSerializer",
      "org.apache.xmlrpc.serializer.FloatSerializer",
      "org.apache.xmlrpc.XmlRpcConfigImpl",
      "org.apache.xmlrpc.serializer.I2Serializer",
      "org.apache.xmlrpc.common.XmlRpcHttpRequestConfigImpl",
      "org.apache.ws.commons.util.NamespaceContextImpl",
      "org.apache.xmlrpc.XmlRpcException",
      "org.apache.xmlrpc.common.XmlRpcHttpRequestConfig",
      "org.apache.xmlrpc.parser.AtomicParser",
      "org.apache.xmlrpc.serializer.StringSerializer",
      "org.apache.ws.commons.util.XsDateTimeFormat",
      "org.apache.ws.commons.util.Base64$Encoder",
      "org.apache.ws.commons.util.Base64",
      "org.apache.xmlrpc.common.XmlRpcStreamRequestConfig",
      "org.apache.ws.commons.util.Base64$SAXEncoder",
      "org.apache.xmlrpc.XmlRpcRequestConfig",
      "org.apache.xmlrpc.serializer.BigDecimalSerializer",
      "org.apache.xmlrpc.serializer.NodeSerializer",
      "org.apache.xmlrpc.serializer.I1Serializer",
      "org.apache.xmlrpc.util.XmlRpcDateTimeFormat",
      "org.apache.xmlrpc.util.XmlRpcDateTimeDateFormat",
      "org.apache.xmlrpc.serializer.MapSerializer",
      "org.apache.xmlrpc.XmlRpcConfig",
      "org.apache.xmlrpc.serializer.I8Serializer",
      "org.apache.xmlrpc.serializer.SerializableSerializer",
      "org.apache.xmlrpc.common.TypeFactoryImpl",
      "org.apache.ws.commons.util.Base64$Decoder"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.apache.xmlrpc.XmlRpcRequest", false, XmlRpcWriter_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.apache.xmlrpc.common.XmlRpcController", false, XmlRpcWriter_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(XmlRpcWriter_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.xmlrpc.serializer.XmlRpcWriter",
      "org.apache.xmlrpc.XmlRpcConfigImpl",
      "org.apache.xmlrpc.common.XmlRpcHttpRequestConfigImpl",
      "org.apache.xmlrpc.serializer.TypeSerializerImpl",
      "org.apache.xmlrpc.serializer.NullSerializer",
      "org.apache.xmlrpc.serializer.StringSerializer",
      "org.apache.xmlrpc.serializer.I4Serializer",
      "org.apache.xmlrpc.serializer.BooleanSerializer",
      "org.apache.xmlrpc.serializer.DoubleSerializer",
      "org.apache.xmlrpc.serializer.I1Serializer",
      "org.apache.xmlrpc.serializer.I2Serializer",
      "org.apache.xmlrpc.serializer.I8Serializer",
      "org.apache.xmlrpc.serializer.FloatSerializer",
      "org.apache.xmlrpc.serializer.ExtSerializer",
      "org.apache.ws.commons.serialize.DOMSerializer",
      "org.apache.xmlrpc.serializer.NodeSerializer",
      "org.apache.xmlrpc.serializer.SerializableSerializer",
      "org.apache.xmlrpc.serializer.BigDecimalSerializer",
      "org.apache.xmlrpc.serializer.BigIntegerSerializer",
      "org.apache.ws.commons.util.XsDateTimeFormat",
      "org.apache.xmlrpc.serializer.CalendarSerializer",
      "org.apache.xmlrpc.common.TypeFactoryImpl",
      "org.apache.xmlrpc.serializer.MapSerializer",
      "org.apache.xmlrpc.common.XmlRpcController",
      "org.apache.ws.commons.util.NamespaceContextImpl",
      "org.apache.xmlrpc.XmlRpcException",
      "org.apache.xmlrpc.common.XmlRpcExtensionException",
      "org.apache.xmlrpc.serializer.ByteArraySerializer",
      "org.apache.ws.commons.util.Base64$Encoder",
      "org.apache.ws.commons.util.Base64$SAXEncoder",
      "org.apache.ws.commons.util.Base64",
      "org.apache.xmlrpc.parser.TypeParserImpl",
      "org.apache.xmlrpc.parser.AtomicParser",
      "org.apache.xmlrpc.parser.DateParser",
      "org.apache.xmlrpc.util.XmlRpcDateTimeFormat",
      "org.apache.xmlrpc.util.XmlRpcDateTimeDateFormat",
      "org.apache.xmlrpc.common.TypeFactoryImpl$2",
      "org.apache.ws.commons.util.Base64$EncoderOutputStream"
    );
  }
}
