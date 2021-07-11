/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Jul 11 10:39:25 GMT 2021
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
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Connection_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.xmlrpc.serializer.CalendarSerializer",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$IdentityTypeConverter",
      "org.apache.xmlrpc.webserver.ConnectionServer",
      "org.apache.xmlrpc.serializer.ExtSerializer",
      "org.apache.xmlrpc.serializer.NullSerializer",
      "org.apache.xmlrpc.common.ServerStreamConnection",
      "org.apache.xmlrpc.util.ThreadPool$Task",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.xmlrpc.common.XmlRpcWorker",
      "org.apache.xmlrpc.common.XmlRpcWorkerFactory",
      "org.apache.xmlrpc.server.XmlRpcLocalStreamServer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.xmlrpc.webserver.Connection$BadEncodingException",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$ListTypeConverter",
      "org.apache.ws.commons.serialize.XMLWriterImpl",
      "org.apache.xmlrpc.serializer.BigIntegerSerializer",
      "org.apache.xmlrpc.serializer.XmlWriterFactory",
      "org.apache.log4j.Level",
      "org.apache.xmlrpc.common.TypeFactory",
      "org.apache.xmlrpc.serializer.TypeSerializerImpl",
      "org.apache.xmlrpc.serializer.I4Serializer",
      "org.apache.xmlrpc.common.XmlRpcHttpConfig",
      "org.apache.xmlrpc.serializer.BaseXmlWriterFactory",
      "org.apache.xmlrpc.util.LimitedInputStream",
      "org.apache.xmlrpc.common.XmlRpcExtensionException",
      "org.apache.xmlrpc.webserver.Connection",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$PrimitiveTypeConverter",
      "org.apache.xmlrpc.common.XmlRpcController",
      "org.apache.log4j.CategoryKey",
      "org.apache.xmlrpc.serializer.TypeSerializer",
      "org.apache.xmlrpc.XmlRpcConfigImpl",
      "org.apache.xmlrpc.server.XmlRpcErrorLogger",
      "org.apache.commons.httpclient.params.HttpParams",
      "org.apache.xmlrpc.serializer.I2Serializer",
      "org.apache.xmlrpc.common.XmlRpcHttpRequestConfigImpl",
      "org.apache.xmlrpc.webserver.WebServer",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.ProvisionNode",
      "org.apache.log4j.Hierarchy",
      "org.apache.xmlrpc.XmlRpcException",
      "org.apache.xmlrpc.common.XmlRpcHttpRequestConfig",
      "org.apache.log4j.helpers.FileWatchdog",
      "org.apache.xmlrpc.webserver.RequestData",
      "org.apache.xmlrpc.serializer.StringSerializer",
      "org.apache.ws.commons.util.Base64$Encoder",
      "org.apache.xmlrpc.common.XmlRpcStreamRequestConfig",
      "org.apache.commons.httpclient.protocol.DefaultProtocolSocketFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.xmlrpc.serializer.BigDecimalSerializer",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$4",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$3",
      "org.apache.xmlrpc.common.XmlRpcNotAuthorizedException",
      "org.apache.log4j.spi.RendererSupport",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$2",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$1",
      "org.apache.commons.httpclient.protocol.ProtocolSocketFactory",
      "org.apache.xmlrpc.serializer.I8Serializer",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.xmlrpc.serializer.BooleanSerializer",
      "org.apache.ws.commons.serialize.DOMSerializer",
      "org.apache.log4j.or.ObjectRenderer",
      "org.apache.xmlrpc.server.XmlRpcServer",
      "org.apache.xmlrpc.common.TypeConverter",
      "org.apache.xmlrpc.common.TypeFactoryImpl$1",
      "org.apache.ws.commons.util.Base64$SAXIOException",
      "org.apache.xmlrpc.common.XmlRpcStreamConfig",
      "org.apache.log4j.Logger",
      "org.apache.xmlrpc.common.TypeFactoryImpl$2",
      "org.apache.xmlrpc.serializer.DoubleSerializer",
      "org.apache.commons.httpclient.ConnectTimeoutException",
      "org.apache.xmlrpc.serializer.CharSetXmlWriterFactory",
      "org.apache.xmlrpc.common.XmlRpcRequestProcessor",
      "org.apache.xmlrpc.webserver.XmlRpcServletServer",
      "org.apache.xmlrpc.parser.TypeParser",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.Category",
      "org.apache.xmlrpc.webserver.Connection$BadRequestException",
      "org.apache.xmlrpc.server.XmlRpcServerConfigImpl",
      "org.apache.ws.commons.util.Base64$EncoderOutputStream",
      "org.apache.xmlrpc.server.XmlRpcServerWorker",
      "org.apache.log4j.spi.RepositorySelector",
      "org.apache.ws.commons.serialize.XMLWriter",
      "org.apache.xmlrpc.XmlRpcRequest",
      "org.apache.commons.httpclient.params.DefaultHttpParams",
      "org.apache.xmlrpc.serializer.DefaultXMLWriterFactory",
      "org.apache.commons.httpclient.params.HttpConnectionParams",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.xmlrpc.serializer.FloatSerializer",
      "org.apache.xmlrpc.common.TypeConverterFactory",
      "org.apache.log4j.spi.Configurator",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.xmlrpc.server.XmlRpcHttpServerConfig",
      "org.apache.log4j.PropertyWatchdog",
      "org.apache.xmlrpc.server.XmlRpcServerWorkerFactory",
      "org.apache.ws.commons.serialize.CharSetXMLWriter",
      "org.apache.xmlrpc.webserver.Connection$RequestException",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.apache.xmlrpc.common.XmlRpcStreamRequestProcessor",
      "org.apache.xmlrpc.util.ThreadPool$InterruptableTask",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl",
      "org.apache.ws.commons.util.XsDateTimeFormat",
      "org.apache.xmlrpc.webserver.WebServerProduct",
      "org.apache.xmlrpc.server.XmlRpcHttpServer",
      "org.apache.xmlrpc.server.XmlRpcServerConfig",
      "org.apache.ws.commons.util.Base64$SAXEncoder",
      "org.apache.xmlrpc.server.XmlRpcHandlerMapping",
      "org.apache.xmlrpc.XmlRpcRequestConfig",
      "org.apache.xmlrpc.serializer.NodeSerializer",
      "org.apache.xmlrpc.serializer.I1Serializer",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.apache.xmlrpc.util.XmlRpcDateTimeFormat",
      "org.apache.xmlrpc.util.XmlRpcDateTimeDateFormat",
      "org.apache.xmlrpc.common.XmlRpcLoadException",
      "org.apache.log4j.Priority",
      "org.apache.xmlrpc.XmlRpcConfig",
      "org.apache.xmlrpc.serializer.SerializableSerializer",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.xmlrpc.server.XmlRpcStreamServer",
      "org.apache.log4j.LogManager",
      "org.apache.xmlrpc.common.TypeFactoryImpl",
      "org.apache.xmlrpc.webserver.Connection$1"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Connection_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.xmlrpc.webserver.Connection",
      "org.apache.xmlrpc.webserver.Connection$1",
      "org.apache.xmlrpc.webserver.Connection$RequestException",
      "org.apache.xmlrpc.webserver.Connection$BadRequestException",
      "org.apache.xmlrpc.webserver.Connection$BadEncodingException",
      "org.apache.xmlrpc.webserver.WebServer",
      "org.apache.xmlrpc.webserver.WebServerProduct",
      "org.apache.xmlrpc.common.XmlRpcController",
      "org.apache.xmlrpc.server.XmlRpcServer",
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
      "org.apache.xmlrpc.server.XmlRpcErrorLogger",
      "org.apache.xmlrpc.server.XmlRpcStreamServer",
      "org.apache.xmlrpc.server.XmlRpcHttpServer",
      "org.apache.xmlrpc.webserver.ConnectionServer",
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
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$IdentityTypeConverter",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$PrimitiveTypeConverter",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$1",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$2",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$ListTypeConverter",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$3",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$4",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl",
      "org.apache.xmlrpc.XmlRpcConfigImpl",
      "org.apache.xmlrpc.server.XmlRpcServerConfigImpl",
      "org.apache.xmlrpc.serializer.DefaultXMLWriterFactory",
      "org.apache.ws.commons.serialize.XMLWriterImpl",
      "org.apache.ws.commons.serialize.CharSetXMLWriter",
      "org.apache.xmlrpc.serializer.BaseXmlWriterFactory",
      "org.apache.xmlrpc.serializer.CharSetXmlWriterFactory",
      "org.apache.xmlrpc.server.XmlRpcLocalStreamServer",
      "org.apache.xmlrpc.webserver.WebServer$AddressMatcher",
      "org.apache.commons.httpclient.protocol.DefaultProtocolSocketFactory",
      "org.apache.commons.httpclient.MultiThreadedHttpConnectionManager",
      "org.apache.commons.httpclient.params.DefaultHttpParamsFactory",
      "org.apache.commons.httpclient.params.DefaultHttpParams",
      "org.apache.commons.httpclient.params.HttpConnectionParams",
      "org.apache.commons.httpclient.params.HttpConnectionManagerParams",
      "org.apache.commons.httpclient.params.HttpMethodParams",
      "org.apache.commons.httpclient.params.HttpClientParams",
      "org.apache.commons.httpclient.HttpVersion",
      "org.apache.commons.httpclient.SimpleHttpConnectionManager",
      "org.apache.commons.httpclient.DefaultHttpMethodRetryHandler",
      "org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$ConnectionPool",
      "org.apache.commons.httpclient.util.IdleConnectionHandler",
      "org.apache.commons.httpclient.params.HostParams",
      "org.apache.commons.httpclient.HostConfiguration",
      "org.apache.commons.httpclient.util.LangUtils",
      "org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$HostConnectionPool",
      "org.apache.commons.httpclient.HttpConnection",
      "org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$HttpConnectionWithReference",
      "org.apache.commons.httpclient.protocol.Protocol",
      "org.apache.xmlrpc.webserver.XmlRpcServletServer",
      "org.apache.commons.httpclient.protocol.SSLProtocolSocketFactory",
      "org.apache.xmlrpc.util.ThreadPool",
      "org.apache.commons.httpclient.HttpException",
      "org.apache.commons.httpclient.HttpRecoverableException",
      "org.apache.commons.httpclient.protocol.ReflectionSocketFactory",
      "org.apache.commons.httpclient.protocol.ControllerThreadSocketFactory",
      "org.apache.commons.httpclient.protocol.ControllerThreadSocketFactory$SocketTask",
      "org.apache.commons.httpclient.protocol.ControllerThreadSocketFactory$1",
      "org.apache.commons.httpclient.util.TimeoutController",
      "org.apache.xmlrpc.XmlRpcException",
      "org.apache.xmlrpc.common.XmlRpcNotAuthorizedException",
      "org.apache.xmlrpc.common.XmlRpcHttpRequestConfigImpl",
      "org.apache.xmlrpc.util.HttpUtil",
      "org.apache.commons.httpclient.HttpHost",
      "org.apache.commons.httpclient.ProxyHost",
      "org.apache.xmlrpc.client.XmlRpcClient",
      "org.apache.xmlrpc.client.XmlRpcClientWorkerFactory",
      "org.apache.xmlrpc.client.XmlRpcClientWorker",
      "org.apache.xmlrpc.client.XmlRpcClientDefaults",
      "org.apache.xmlrpc.client.XmlRpcTransportFactoryImpl",
      "org.apache.xmlrpc.client.XmlRpcSun14HttpTransportFactory",
      "org.apache.xmlrpc.client.XmlRpcSun15HttpTransportFactory",
      "org.apache.xmlrpc.client.XmlRpcClientConfigImpl",
      "org.apache.xmlrpc.client.XmlRpcCommonsTransportFactory",
      "org.apache.xmlrpc.client.XmlRpcClientRequestImpl",
      "org.apache.xmlrpc.client.TimingOutCallback",
      "org.apache.xmlrpc.client.XmlRpcClientWorker$1",
      "org.apache.xmlrpc.webserver.XmlRpcServletServer$ServletStreamConnection",
      "org.apache.xmlrpc.parser.TypeParserImpl",
      "org.apache.xmlrpc.parser.RecursiveTypeParserImpl",
      "org.apache.xmlrpc.parser.XmlRpcRequestParser",
      "org.apache.ws.commons.util.NamespaceContextImpl",
      "org.apache.xmlrpc.util.SAXParsers",
      "org.apache.xmlrpc.server.AbstractReflectiveHandlerMapping",
      "org.apache.xmlrpc.server.PropertyHandlerMapping",
      "org.apache.xmlrpc.server.RequestProcessorFactoryFactory$RequestSpecificProcessorFactoryFactory",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$CastCheckingTypeConverter",
      "org.apache.xmlrpc.webserver.RequestData",
      "org.apache.xmlrpc.client.XmlRpcTransportImpl",
      "org.apache.xmlrpc.client.XmlRpcStreamTransport",
      "org.apache.xmlrpc.client.XmlRpcHttpTransport",
      "org.apache.xmlrpc.client.XmlRpcSunHttpTransport",
      "org.apache.xmlrpc.client.XmlRpcSun14HttpTransport",
      "org.apache.xmlrpc.client.XmlRpcSun15HttpTransport",
      "org.apache.xmlrpc.client.XmlRpcLocalTransportFactory",
      "org.apache.xmlrpc.client.XmlRpcLocalTransport",
      "org.apache.xmlrpc.serializer.XmlRpcWriter",
      "org.apache.xmlrpc.serializer.MapSerializer",
      "org.apache.xmlrpc.util.LimitedInputStream"
    );
  }
}