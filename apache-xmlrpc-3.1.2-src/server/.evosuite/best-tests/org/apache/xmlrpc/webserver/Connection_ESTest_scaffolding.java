/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Jul 11 08:18:44 GMT 2021
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
      "org.apache.xmlrpc.serializer.ExtSerializer",
      "org.apache.xmlrpc.util.ThreadPool$Task",
      "org.apache.xmlrpc.common.XmlRpcWorker",
      "org.apache.xmlrpc.common.XmlRpcWorkerFactory",
      "org.apache.commons.httpclient.Header",
      "org.apache.ws.commons.serialize.XMLWriterImpl",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$CastCheckingTypeConverter",
      "org.apache.log4j.Level",
      "org.apache.commons.httpclient.WireLogOutputStream",
      "org.apache.xmlrpc.serializer.I4Serializer",
      "org.apache.commons.httpclient.HttpMethodBase",
      "org.apache.commons.httpclient.params.HttpConnectionManagerParams",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$PrimitiveTypeConverter",
      "org.apache.commons.httpclient.ResponseConsumedWatcher",
      "org.apache.commons.httpclient.auth.AuthScheme",
      "org.apache.xmlrpc.XmlRpcConfigImpl",
      "org.apache.xmlrpc.serializer.I2Serializer",
      "org.apache.xmlrpc.client.XmlRpcTransportFactory",
      "org.apache.commons.httpclient.HttpVersion",
      "org.apache.log4j.Hierarchy",
      "org.apache.commons.httpclient.HostConfiguration",
      "org.apache.xmlrpc.util.HttpUtil",
      "org.apache.xmlrpc.webserver.RequestData",
      "org.apache.xmlrpc.serializer.StringSerializer",
      "org.apache.commons.httpclient.HttpConnectionManager",
      "org.apache.xmlrpc.common.XmlRpcStreamRequestConfig",
      "org.apache.commons.httpclient.protocol.SecureProtocolSocketFactory",
      "org.apache.xmlrpc.client.XmlRpcTransportFactoryImpl",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.xmlrpc.serializer.BigDecimalSerializer",
      "org.apache.commons.httpclient.DefaultHttpMethodRetryHandler",
      "org.apache.commons.httpclient.HeaderGroup",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$4",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$3",
      "org.apache.xmlrpc.serializer.MapSerializer",
      "org.apache.xmlrpc.common.XmlRpcNotAuthorizedException",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$2",
      "org.apache.commons.httpclient.Cookie",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$1",
      "org.apache.xmlrpc.client.XmlRpcSun14HttpTransportFactory",
      "org.apache.commons.httpclient.protocol.Protocol",
      "org.apache.xmlrpc.server.RequestProcessorFactoryFactory$RequestProcessorFactory",
      "org.apache.commons.httpclient.AutoCloseInputStream",
      "org.apache.commons.httpclient.ConnectionPoolTimeoutException",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.commons.httpclient.auth.AuthState",
      "org.apache.commons.httpclient.ProxyHost",
      "org.apache.xmlrpc.parser.XmlRpcRequestParser",
      "org.apache.xmlrpc.client.XmlRpcClientConfig",
      "org.apache.commons.httpclient.HttpRecoverableException",
      "org.apache.ws.commons.serialize.DOMSerializer",
      "org.apache.log4j.or.ObjectRenderer",
      "org.apache.xmlrpc.common.TypeConverter",
      "org.apache.commons.httpclient.NoHttpResponseException",
      "org.apache.xmlrpc.common.TypeFactoryImpl$1",
      "org.apache.ws.commons.util.Base64$SAXIOException",
      "org.apache.xmlrpc.common.TypeFactoryImpl$2",
      "org.apache.commons.httpclient.ConnectTimeoutException",
      "org.apache.xmlrpc.serializer.CharSetXmlWriterFactory",
      "org.apache.xmlrpc.metadata.XmlRpcListableHandlerMapping",
      "org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$HttpConnectionWithReference",
      "org.apache.commons.httpclient.util.IdleConnectionHandler",
      "org.apache.xmlrpc.common.XmlRpcRequestProcessor",
      "org.apache.xmlrpc.parser.TypeParser",
      "org.apache.log4j.Category",
      "org.apache.xmlrpc.webserver.Connection$BadRequestException",
      "org.apache.ws.commons.util.Base64$EncoderOutputStream",
      "org.apache.commons.httpclient.protocol.SSLProtocolSocketFactory",
      "org.apache.xmlrpc.util.ThreadPool",
      "org.apache.commons.httpclient.params.HttpClientParams",
      "org.apache.xmlrpc.server.RequestProcessorFactoryFactory",
      "org.apache.commons.httpclient.params.DefaultHttpParams",
      "org.apache.xmlrpc.serializer.DefaultXMLWriterFactory",
      "org.apache.commons.httpclient.auth.AuthScope",
      "org.apache.commons.httpclient.params.HttpConnectionParams",
      "org.apache.commons.httpclient.HttpClient",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "org.apache.xmlrpc.server.XmlRpcNoSuchHandlerException",
      "org.apache.commons.httpclient.HttpHost",
      "org.apache.xmlrpc.server.XmlRpcHttpServerConfig",
      "org.apache.commons.httpclient.params.DefaultHttpParamsFactory",
      "org.apache.commons.httpclient.ContentLengthInputStream",
      "org.apache.log4j.PropertyWatchdog",
      "org.apache.xmlrpc.server.XmlRpcServerWorkerFactory",
      "org.apache.xmlrpc.webserver.Connection$RequestException",
      "org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$WaitingThread",
      "org.apache.xmlrpc.client.XmlRpcClient",
      "org.apache.commons.httpclient.HttpException",
      "org.apache.xmlrpc.server.XmlRpcHttpServer",
      "org.apache.xmlrpc.server.XmlRpcHandlerMapping",
      "org.apache.xmlrpc.parser.RecursiveTypeParserImpl",
      "org.apache.xmlrpc.client.XmlRpcTransport",
      "org.apache.xmlrpc.XmlRpcHandler",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.apache.xmlrpc.util.XmlRpcDateTimeFormat",
      "org.apache.xmlrpc.util.XmlRpcDateTimeDateFormat",
      "org.apache.xmlrpc.client.XmlRpcClientWorker",
      "org.apache.commons.httpclient.util.LangUtils",
      "org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$1",
      "org.apache.commons.httpclient.ChunkedInputStream",
      "org.apache.log4j.Priority",
      "org.apache.commons.httpclient.ProtocolException",
      "org.apache.xmlrpc.XmlRpcConfig",
      "org.apache.log4j.LogManager",
      "org.apache.xmlrpc.webserver.Connection$1",
      "org.apache.xmlrpc.webserver.WebServer$AddressMatcher",
      "org.apache.xmlrpc.webserver.ConnectionServer",
      "org.apache.xmlrpc.serializer.NullSerializer",
      "org.apache.commons.httpclient.params.HttpMethodParams",
      "org.apache.xmlrpc.common.ServerStreamConnection",
      "org.apache.xmlrpc.serializer.XmlRpcWriter",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.commons.httpclient.URIException",
      "org.apache.log4j.or.RendererMap",
      "org.apache.xmlrpc.server.XmlRpcLocalStreamServer",
      "org.apache.xmlrpc.webserver.Connection$BadEncodingException",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl$ListTypeConverter",
      "org.apache.xmlrpc.server.RequestProcessorFactoryFactory$StatelessProcessorFactoryFactory",
      "org.apache.xmlrpc.serializer.BigIntegerSerializer",
      "org.apache.commons.httpclient.HttpState",
      "org.apache.xmlrpc.serializer.XmlWriterFactory",
      "org.apache.xmlrpc.common.TypeFactory",
      "org.apache.xmlrpc.serializer.TypeSerializerImpl",
      "org.apache.xmlrpc.webserver.XmlRpcServletServer$ServletStreamConnection",
      "org.apache.xmlrpc.common.XmlRpcHttpConfig",
      "org.apache.xmlrpc.serializer.BaseXmlWriterFactory",
      "org.apache.xmlrpc.util.LimitedInputStream",
      "org.apache.xmlrpc.common.XmlRpcExtensionException",
      "org.apache.xmlrpc.webserver.Connection",
      "org.apache.xmlrpc.util.ThreadPool$Poolable",
      "org.apache.xmlrpc.util.SAXParsers",
      "org.apache.xmlrpc.common.XmlRpcController",
      "org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$ConnectionSource",
      "org.apache.log4j.CategoryKey",
      "org.apache.xmlrpc.serializer.TypeSerializer",
      "org.apache.xmlrpc.server.XmlRpcErrorLogger",
      "org.apache.commons.httpclient.MultiThreadedHttpConnectionManager",
      "org.apache.commons.httpclient.HttpMethodRetryHandler",
      "org.apache.commons.httpclient.params.HttpParams",
      "org.apache.xmlrpc.common.XmlRpcHttpRequestConfigImpl",
      "org.apache.xmlrpc.client.XmlRpcClientRequestImpl",
      "org.apache.xmlrpc.webserver.WebServer",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.ProvisionNode",
      "org.apache.xmlrpc.XmlRpcException",
      "org.apache.xmlrpc.client.XmlRpcLocalClientConfig",
      "org.apache.xmlrpc.common.XmlRpcHttpRequestConfig",
      "org.apache.log4j.helpers.FileWatchdog",
      "org.apache.ws.commons.util.Base64$Encoder",
      "org.apache.commons.httpclient.NameValuePair",
      "org.apache.commons.httpclient.protocol.DefaultProtocolSocketFactory",
      "org.apache.commons.httpclient.WireLogInputStream",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.commons.httpclient.ConnectMethod",
      "org.apache.xmlrpc.client.AsyncCallback",
      "org.apache.xmlrpc.server.AbstractReflectiveHandlerMapping$AuthenticationHandler",
      "org.apache.xmlrpc.client.XmlRpcClientDefaults",
      "org.apache.xmlrpc.client.XmlRpcSun15HttpTransportFactory",
      "org.apache.log4j.spi.RendererSupport",
      "org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$HttpConnectionAdapter",
      "org.apache.commons.httpclient.protocol.ProtocolSocketFactory",
      "org.apache.commons.httpclient.Credentials",
      "org.apache.commons.httpclient.HttpMethod",
      "org.apache.xmlrpc.serializer.I8Serializer",
      "org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$ConnectionPool",
      "org.apache.commons.httpclient.params.HostParams",
      "org.apache.xmlrpc.serializer.BooleanSerializer",
      "org.apache.xmlrpc.server.XmlRpcServer",
      "org.apache.commons.httpclient.HeaderElement",
      "org.apache.xmlrpc.server.AbstractReflectiveHandlerMapping",
      "org.apache.xmlrpc.common.XmlRpcStreamConfig",
      "org.apache.log4j.Logger",
      "org.apache.xmlrpc.serializer.DoubleSerializer",
      "org.apache.xmlrpc.webserver.XmlRpcServletServer",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.xmlrpc.server.XmlRpcServerConfigImpl",
      "org.apache.xmlrpc.server.XmlRpcServerWorker",
      "org.apache.commons.httpclient.cookie.MalformedCookieException",
      "org.apache.log4j.spi.RepositorySelector",
      "org.apache.ws.commons.serialize.XMLWriter",
      "org.apache.xmlrpc.XmlRpcRequest",
      "org.apache.xmlrpc.parser.TypeParserImpl",
      "org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$ReferenceQueueThread",
      "org.apache.xmlrpc.serializer.FloatSerializer",
      "org.apache.xmlrpc.common.TypeConverterFactory",
      "org.apache.xmlrpc.server.RequestProcessorFactoryFactory$RequestSpecificProcessorFactoryFactory",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.commons.httpclient.URI",
      "org.apache.commons.httpclient.MethodRetryHandler",
      "org.apache.commons.httpclient.HttpConnection",
      "org.apache.ws.commons.serialize.CharSetXMLWriter",
      "org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$HostConnectionPool",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.apache.xmlrpc.common.XmlRpcStreamRequestProcessor",
      "org.apache.ws.commons.util.NamespaceContextImpl",
      "org.apache.xmlrpc.util.ThreadPool$InterruptableTask",
      "org.apache.xmlrpc.common.TypeConverterFactoryImpl",
      "org.apache.xmlrpc.client.XmlRpcClientConfigImpl",
      "org.apache.log4j.Appender",
      "org.apache.ws.commons.util.XsDateTimeFormat",
      "org.apache.xmlrpc.webserver.WebServerProduct",
      "org.apache.xmlrpc.server.XmlRpcServerConfig",
      "org.apache.ws.commons.util.Base64$SAXEncoder",
      "org.apache.xmlrpc.client.XmlRpcHttpClientConfig",
      "org.apache.commons.httpclient.params.HttpParamsFactory",
      "org.apache.xmlrpc.XmlRpcRequestConfig",
      "org.apache.log4j.spi.HierarchyEventListener",
      "org.apache.commons.httpclient.SimpleHttpConnectionManager",
      "org.apache.xmlrpc.serializer.NodeSerializer",
      "org.apache.commons.httpclient.cookie.CookieSpec",
      "org.apache.xmlrpc.serializer.I1Serializer",
      "org.apache.xmlrpc.client.XmlRpcClientWorkerFactory",
      "org.apache.log4j.spi.LoggingEvent",
      "org.apache.xmlrpc.common.XmlRpcRequestProcessorFactory",
      "org.apache.xmlrpc.common.XmlRpcLoadException",
      "org.apache.xmlrpc.serializer.SerializableSerializer",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.xmlrpc.server.XmlRpcStreamServer",
      "org.apache.commons.httpclient.StatusLine",
      "org.apache.xmlrpc.common.TypeFactoryImpl",
      "org.apache.xmlrpc.server.PropertyHandlerMapping"
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
      "org.apache.xmlrpc.webserver.XmlRpcServletServer",
      "org.apache.commons.httpclient.protocol.SSLProtocolSocketFactory",
      "org.apache.commons.httpclient.params.DefaultHttpParamsFactory",
      "org.apache.commons.httpclient.params.DefaultHttpParams",
      "org.apache.commons.httpclient.params.HostParams",
      "org.apache.commons.httpclient.params.HttpMethodParams",
      "org.apache.commons.httpclient.params.HttpClientParams",
      "org.apache.commons.httpclient.HttpVersion",
      "org.apache.commons.httpclient.SimpleHttpConnectionManager",
      "org.apache.commons.httpclient.DefaultHttpMethodRetryHandler",
      "org.apache.commons.httpclient.HostConfiguration",
      "org.apache.xmlrpc.util.ThreadPool",
      "org.apache.xmlrpc.server.XmlRpcLocalStreamServer",
      "org.apache.commons.httpclient.protocol.Protocol",
      "org.apache.commons.httpclient.HttpConnection",
      "org.apache.commons.httpclient.params.HttpConnectionParams",
      "org.apache.commons.httpclient.MultiThreadedHttpConnectionManager",
      "org.apache.commons.httpclient.params.HttpConnectionManagerParams",
      "org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$ConnectionPool",
      "org.apache.commons.httpclient.util.IdleConnectionHandler",
      "org.apache.commons.httpclient.protocol.DefaultProtocolSocketFactory",
      "org.apache.xmlrpc.common.XmlRpcHttpRequestConfigImpl",
      "org.apache.xmlrpc.client.XmlRpcClientConfigImpl",
      "org.apache.xmlrpc.server.AbstractReflectiveHandlerMapping",
      "org.apache.xmlrpc.server.PropertyHandlerMapping",
      "org.apache.xmlrpc.server.RequestProcessorFactoryFactory$RequestSpecificProcessorFactoryFactory",
      "org.apache.commons.httpclient.HttpException",
      "org.apache.commons.httpclient.HttpRecoverableException",
      "org.apache.xmlrpc.XmlRpcException",
      "org.apache.xmlrpc.common.XmlRpcNotAuthorizedException",
      "org.apache.xmlrpc.webserver.XmlRpcServletServer$ServletStreamConnection",
      "org.apache.xmlrpc.parser.TypeParserImpl",
      "org.apache.xmlrpc.parser.RecursiveTypeParserImpl",
      "org.apache.xmlrpc.parser.XmlRpcRequestParser",
      "org.apache.ws.commons.util.NamespaceContextImpl",
      "org.apache.xmlrpc.util.SAXParsers",
      "org.apache.xmlrpc.serializer.XmlRpcWriter",
      "org.apache.xmlrpc.serializer.MapSerializer",
      "org.apache.xmlrpc.webserver.WebServer$AddressMatcher",
      "org.apache.xmlrpc.util.HttpUtil",
      "org.apache.xmlrpc.client.XmlRpcClientRequestImpl",
      "org.apache.commons.httpclient.HttpHost",
      "org.apache.commons.httpclient.HttpMethodBase",
      "org.apache.commons.httpclient.ConnectMethod",
      "org.apache.commons.httpclient.HeaderGroup",
      "org.apache.commons.httpclient.auth.AuthState",
      "org.apache.xmlrpc.webserver.RequestData",
      "org.apache.commons.httpclient.ProxyHost",
      "org.apache.commons.httpclient.HttpClient",
      "org.apache.commons.httpclient.HttpState",
      "org.apache.xmlrpc.client.XmlRpcClient",
      "org.apache.xmlrpc.client.XmlRpcClientWorkerFactory",
      "org.apache.xmlrpc.client.XmlRpcClientWorker",
      "org.apache.xmlrpc.client.XmlRpcClientDefaults",
      "org.apache.xmlrpc.client.XmlRpcTransportFactoryImpl",
      "org.apache.xmlrpc.client.XmlRpcSun14HttpTransportFactory",
      "org.apache.xmlrpc.client.XmlRpcSun15HttpTransportFactory",
      "org.apache.commons.httpclient.util.LangUtils",
      "org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$HostConnectionPool",
      "org.apache.commons.httpclient.MultiThreadedHttpConnectionManager$HttpConnectionWithReference",
      "org.apache.commons.httpclient.NameValuePair",
      "org.apache.commons.httpclient.Header",
      "org.apache.xmlrpc.util.LimitedInputStream"
    );
  }
}
