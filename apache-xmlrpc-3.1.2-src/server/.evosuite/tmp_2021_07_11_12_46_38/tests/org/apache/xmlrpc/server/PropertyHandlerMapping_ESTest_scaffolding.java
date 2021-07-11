/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Jul 11 08:20:57 GMT 2021
 */

package org.apache.xmlrpc.server;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class PropertyHandlerMapping_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.xmlrpc.server.PropertyHandlerMapping"; 
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
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PropertyHandlerMapping_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$IdentityTypeConverter",
      "org.apache.commons.httpclient.HttpVersion",
      "org.apache.xmlrpc.common.TypeConverter",
      "org.apache.xmlrpc.server.AbstractReflectiveHandlerMapping",
      "org.apache.xmlrpc.XmlRpcException",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$ListTypeConverter",
      "org.apache.xmlrpc.metadata.XmlRpcMetaDataHandler",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$CastCheckingTypeConverter",
      "org.apache.xmlrpc.metadata.XmlRpcListableHandlerMapping",
      "org.apache.commons.httpclient.HttpException",
      "org.apache.xmlrpc.server.XmlRpcHandlerMapping",
      "org.apache.xmlrpc.server.ReflectiveXmlRpcHandler",
      "org.apache.xmlrpc.XmlRpcHandler",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$4",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$3",
      "org.apache.xmlrpc.metadata.ReflectiveXmlRpcMetaDataHandler",
      "org.apache.xmlrpc.server.AbstractReflectiveHandlerMapping$AuthenticationHandler",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$PrimitiveTypeConverter",
      "org.apache.xmlrpc.common.XmlRpcNotAuthorizedException",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$2",
      "org.apache.xmlrpc.server.RequestProcessorFactoryFactory",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$1",
      "org.apache.commons.httpclient.ProtocolException",
      "org.apache.xmlrpc.server.ReflectiveXmlRpcHandler$MethodData",
      "org.apache.xmlrpc.common.TypeConverterFactory",
      "org.apache.xmlrpc.common.XmlRpcInvocationException",
      "org.apache.xmlrpc.server.RequestProcessorFactoryFactory$RequestSpecificProcessorFactoryFactory",
      "org.apache.xmlrpc.server.RequestProcessorFactoryFactory$RequestProcessorFactory",
      "org.apache.xmlrpc.server.XmlRpcNoSuchHandlerException",
      "org.apache.xmlrpc.server.RequestProcessorFactoryFactory$RequestSpecificProcessorFactoryFactory$1",
      "org.apache.xmlrpc.metadata.Util",
      "org.apache.xmlrpc.server.PropertyHandlerMapping"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(PropertyHandlerMapping_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.xmlrpc.server.AbstractReflectiveHandlerMapping",
      "org.apache.xmlrpc.server.PropertyHandlerMapping",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$IdentityTypeConverter",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$PrimitiveTypeConverter",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$1",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$2",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$ListTypeConverter",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$3",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$4",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl",
      "org.apache.xmlrpc.server.RequestProcessorFactoryFactory$RequestSpecificProcessorFactoryFactory",
      "org.apache.commons.httpclient.HttpVersion",
      "org.apache.xmlrpc.metadata.Util",
      "org.apache.xmlrpc.server.RequestProcessorFactoryFactory$RequestSpecificProcessorFactoryFactory$1",
      "org.apache.xmlrpc.server.ReflectiveXmlRpcHandler",
      "org.apache.xmlrpc.metadata.ReflectiveXmlRpcMetaDataHandler",
      "org.apache.xmlrpc.server.ReflectiveXmlRpcHandler$MethodData",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$CastCheckingTypeConverter",
      "org.apache.xmlrpc.XmlRpcException",
      "org.apache.xmlrpc.server.XmlRpcNoSuchHandlerException",
      "org.apache.xmlrpc.XmlRpcConfigImpl",
      "org.apache.xmlrpc.common.XmlRpcHttpRequestConfigImpl",
      "org.apache.xmlrpc.client.XmlRpcClientConfigImpl",
      "org.apache.xmlrpc.server.RequestProcessorFactoryFactory$StatelessProcessorFactoryFactory",
      "org.apache.commons.httpclient.URI$LocaleToCharsetMap",
      "org.apache.commons.httpclient.URI",
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
      "org.apache.commons.httpclient.util.EncodingUtil",
      "org.apache.commons.codec.net.URLCodec",
      "org.apache.xmlrpc.common.XmlRpcController",
      "org.apache.xmlrpc.server.XmlRpcServer",
      "org.apache.xmlrpc.server.XmlRpcErrorLogger",
      "org.apache.xmlrpc.server.XmlRpcStreamServer",
      "org.apache.xmlrpc.server.XmlRpcLocalStreamServer",
      "org.apache.xmlrpc.common.XmlRpcWorkerFactory",
      "org.apache.xmlrpc.server.XmlRpcServerWorkerFactory",
      "org.apache.xmlrpc.server.XmlRpcServerWorker",
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
      "org.apache.xmlrpc.server.XmlRpcServerConfigImpl",
      "org.apache.xmlrpc.serializer.DefaultXMLWriterFactory",
      "org.apache.ws.commons.serialize.XMLWriterImpl",
      "org.apache.ws.commons.serialize.CharSetXMLWriter",
      "org.apache.xmlrpc.serializer.BaseXmlWriterFactory",
      "org.apache.xmlrpc.serializer.CharSetXmlWriterFactory",
      "org.apache.xmlrpc.webserver.WebServer",
      "org.apache.xmlrpc.webserver.WebServerProduct",
      "org.apache.xmlrpc.server.XmlRpcHttpServer",
      "org.apache.xmlrpc.webserver.ConnectionServer",
      "org.apache.xmlrpc.client.XmlRpcClientRequestImpl",
      "org.apache.commons.httpclient.HttpException",
      "org.apache.commons.httpclient.URIException",
      "org.apache.commons.httpclient.HttpMethodBase",
      "org.apache.commons.httpclient.ConnectMethod",
      "org.apache.commons.httpclient.HeaderGroup",
      "org.apache.commons.httpclient.params.DefaultHttpParamsFactory",
      "org.apache.commons.httpclient.params.DefaultHttpParams",
      "org.apache.commons.httpclient.params.HttpMethodParams",
      "org.apache.commons.httpclient.params.HttpClientParams",
      "org.apache.commons.httpclient.SimpleHttpConnectionManager",
      "org.apache.commons.httpclient.DefaultHttpMethodRetryHandler",
      "org.apache.commons.httpclient.auth.AuthState",
      "org.apache.commons.httpclient.NameValuePair",
      "org.apache.commons.httpclient.Cookie",
      "org.apache.xmlrpc.client.XmlRpcClient",
      "org.apache.xmlrpc.client.XmlRpcClientWorkerFactory",
      "org.apache.xmlrpc.client.XmlRpcClientWorker",
      "org.apache.xmlrpc.client.XmlRpcClientDefaults",
      "org.apache.xmlrpc.client.XmlRpcTransportFactoryImpl",
      "org.apache.xmlrpc.client.XmlRpcSun14HttpTransportFactory",
      "org.apache.xmlrpc.client.XmlRpcSun15HttpTransportFactory",
      "org.apache.xmlrpc.client.XmlRpcCommonsTransportFactory",
      "org.apache.xmlrpc.webserver.XmlRpcServletServer",
      "org.apache.commons.httpclient.ProtocolException",
      "org.apache.commons.httpclient.HttpClient",
      "org.apache.commons.httpclient.HttpState",
      "org.apache.commons.httpclient.params.HostParams",
      "org.apache.commons.httpclient.HostConfiguration",
      "org.apache.commons.httpclient.params.HttpConnectionParams",
      "org.apache.commons.httpclient.params.HttpConnectionManagerParams",
      "org.apache.xmlrpc.server.RequestProcessorFactoryFactory$StatelessProcessorFactoryFactory$1"
    );
  }
}
