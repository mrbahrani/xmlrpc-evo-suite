/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Jul 11 10:37:09 GMT 2021
 */

package org.apache.xmlrpc.client;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class XmlRpcLocalTransport_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.xmlrpc.client.XmlRpcLocalTransport"; 
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
    java.lang.System.setProperty("user.dir", "E:\\Uni\\Masters\\Term 4\\Software\\InGit\\xmlrpc-evo-suite\\apache-xmlrpc-3.1.2-src\\client"); 
    java.lang.System.setProperty("user.home", "C:\\Users\\Ali"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "Ali"); 
    java.lang.System.setProperty("user.timezone", "Asia/Tehran"); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(XmlRpcLocalTransport_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.xmlrpc.serializer.CalendarSerializer",
      "org.apache.xmlrpc.serializer.BooleanSerializer",
      "org.apache.xmlrpc.client.XmlRpcClientConfig",
      "org.apache.xmlrpc.serializer.ExtSerializer",
      "org.apache.ws.commons.serialize.DOMSerializer",
      "org.apache.xmlrpc.serializer.NullSerializer",
      "org.apache.xmlrpc.common.XmlRpcWorker",
      "org.apache.xmlrpc.common.XmlRpcWorkerFactory",
      "org.apache.xmlrpc.common.TypeFactoryImpl$1",
      "org.apache.ws.commons.util.Base64$SAXIOException",
      "org.apache.xmlrpc.common.XmlRpcStreamConfig",
      "org.apache.xmlrpc.common.TypeFactoryImpl$2",
      "org.apache.xmlrpc.serializer.DoubleSerializer",
      "org.apache.xmlrpc.serializer.CharSetXmlWriterFactory",
      "org.apache.ws.commons.serialize.XMLWriterImpl",
      "org.apache.xmlrpc.serializer.BigIntegerSerializer",
      "org.apache.xmlrpc.serializer.XmlWriterFactory",
      "org.apache.xmlrpc.common.TypeFactory",
      "org.apache.xmlrpc.common.XmlRpcRequestProcessor",
      "org.apache.xmlrpc.parser.TypeParser",
      "org.apache.xmlrpc.serializer.TypeSerializerImpl",
      "org.apache.xmlrpc.serializer.I4Serializer",
      "org.apache.xmlrpc.common.XmlRpcHttpConfig",
      "org.apache.ws.commons.util.Base64$EncoderOutputStream",
      "org.apache.xmlrpc.serializer.BaseXmlWriterFactory",
      "org.apache.xmlrpc.client.XmlRpcLocalTransport",
      "org.apache.xmlrpc.common.XmlRpcExtensionException",
      "org.apache.ws.commons.serialize.XMLWriter",
      "org.apache.xmlrpc.XmlRpcRequest",
      "org.apache.xmlrpc.serializer.DefaultXMLWriterFactory",
      "org.apache.xmlrpc.common.XmlRpcController",
      "org.apache.xmlrpc.serializer.TypeSerializer",
      "org.apache.xmlrpc.serializer.FloatSerializer",
      "org.apache.xmlrpc.client.XmlRpcClientException",
      "org.apache.xmlrpc.XmlRpcConfigImpl",
      "org.apache.xmlrpc.client.XmlRpcTransportImpl",
      "org.apache.xmlrpc.client.XmlRpcTransportFactory",
      "org.apache.xmlrpc.serializer.I2Serializer",
      "org.apache.xmlrpc.common.XmlRpcHttpRequestConfigImpl",
      "org.apache.ws.commons.serialize.CharSetXMLWriter",
      "org.apache.xmlrpc.client.XmlRpcClientRequestImpl",
      "org.apache.xmlrpc.XmlRpcException",
      "org.apache.xmlrpc.client.XmlRpcLocalClientConfig",
      "org.apache.xmlrpc.client.XmlRpcClientConfigImpl",
      "org.apache.xmlrpc.common.XmlRpcHttpRequestConfig",
      "org.apache.xmlrpc.serializer.StringSerializer",
      "org.apache.ws.commons.util.XsDateTimeFormat",
      "org.apache.ws.commons.util.Base64$Encoder",
      "org.apache.xmlrpc.client.XmlRpcClient",
      "org.apache.xmlrpc.common.XmlRpcStreamRequestConfig",
      "org.apache.ws.commons.util.Base64$SAXEncoder",
      "org.apache.xmlrpc.client.XmlRpcTransportFactoryImpl",
      "org.apache.xmlrpc.client.XmlRpcHttpClientConfig",
      "org.apache.xmlrpc.XmlRpcRequestConfig",
      "org.apache.xmlrpc.client.XmlRpcTransport",
      "org.apache.xmlrpc.serializer.BigDecimalSerializer",
      "org.apache.xmlrpc.serializer.NodeSerializer",
      "org.apache.xmlrpc.client.AsyncCallback",
      "org.apache.xmlrpc.client.XmlRpcClientWorkerFactory",
      "org.apache.xmlrpc.serializer.I1Serializer",
      "org.apache.xmlrpc.util.XmlRpcDateTimeFormat",
      "org.apache.xmlrpc.util.XmlRpcDateTimeDateFormat",
      "org.apache.xmlrpc.common.XmlRpcRequestProcessorFactory",
      "org.apache.xmlrpc.client.XmlRpcClientWorker",
      "org.apache.xmlrpc.client.XmlRpcClientDefaults",
      "org.apache.xmlrpc.client.XmlRpcSun15HttpTransportFactory",
      "org.apache.xmlrpc.common.XmlRpcLoadException",
      "org.apache.xmlrpc.client.XmlRpcSun14HttpTransportFactory",
      "org.apache.xmlrpc.XmlRpcConfig",
      "org.apache.xmlrpc.serializer.I8Serializer",
      "org.apache.xmlrpc.serializer.SerializableSerializer",
      "org.apache.xmlrpc.common.TypeFactoryImpl"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(XmlRpcLocalTransport_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.xmlrpc.client.XmlRpcTransportImpl",
      "org.apache.xmlrpc.client.XmlRpcLocalTransport",
      "org.apache.xmlrpc.common.XmlRpcController",
      "org.apache.xmlrpc.client.XmlRpcClient",
      "org.apache.xmlrpc.common.XmlRpcWorkerFactory",
      "org.apache.xmlrpc.client.XmlRpcClientWorkerFactory",
      "org.apache.xmlrpc.client.XmlRpcClientWorker",
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
      "org.apache.xmlrpc.serializer.DefaultXMLWriterFactory",
      "org.apache.ws.commons.serialize.XMLWriterImpl",
      "org.apache.ws.commons.serialize.CharSetXMLWriter",
      "org.apache.xmlrpc.serializer.BaseXmlWriterFactory",
      "org.apache.xmlrpc.serializer.CharSetXmlWriterFactory",
      "org.apache.xmlrpc.client.XmlRpcClientDefaults",
      "org.apache.xmlrpc.client.XmlRpcTransportFactoryImpl",
      "org.apache.xmlrpc.client.XmlRpcSun14HttpTransportFactory",
      "org.apache.xmlrpc.client.XmlRpcSun15HttpTransportFactory",
      "org.apache.xmlrpc.XmlRpcConfigImpl",
      "org.apache.xmlrpc.common.XmlRpcHttpRequestConfigImpl",
      "org.apache.xmlrpc.client.XmlRpcClientConfigImpl",
      "org.apache.xmlrpc.client.XmlRpcClientRequestImpl",
      "org.apache.xmlrpc.XmlRpcException",
      "org.apache.xmlrpc.client.XmlRpcClientException",
      "org.apache.xmlrpc.common.XmlRpcExtensionException",
      "org.apache.xmlrpc.client.TimingOutCallback",
      "org.apache.xmlrpc.client.XmlRpcClientWorker$1",
      "org.apache.xmlrpc.client.XmlRpcCommonsTransportFactory",
      "org.apache.xmlrpc.client.XmlRpcStreamTransport",
      "org.apache.xmlrpc.client.XmlRpcHttpTransport",
      "org.apache.xmlrpc.client.XmlRpcSunHttpTransport",
      "org.apache.xmlrpc.client.XmlRpcSun14HttpTransport",
      "org.apache.xmlrpc.client.XmlRpcSun15HttpTransport",
      "org.apache.xmlrpc.client.XmlRpcLiteHttpTransportFactory",
      "org.apache.xmlrpc.client.XmlRpcLite14HttpTransportFactory",
      "org.apache.xmlrpc.client.XmlRpcLiteHttpTransport",
      "org.apache.xmlrpc.client.XmlRpcLite14HttpTransport",
      "org.apache.ws.commons.util.NamespaceContextImpl",
      "org.apache.xmlrpc.client.TimingOutCallback$TimeoutException",
      "org.apache.commons.httpclient.HttpException",
      "org.apache.commons.httpclient.HttpRecoverableException",
      "org.apache.xmlrpc.client.XmlRpcLocalTransportFactory",
      "org.apache.commons.httpclient.NameValuePair",
      "org.apache.log4j.Level",
      "org.apache.log4j.Priority",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "org.apache.commons.httpclient.Cookie",
      "org.apache.xmlrpc.client.XmlRpcSunHttpTransportFactory",
      "org.apache.xmlrpc.client.XmlRpcStreamTransportFactory",
      "org.apache.xmlrpc.client.XmlRpcLocalStreamTransportFactory"
    );
  }
}
