/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Jun 01 06:48:02 GMT 2021
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
public class XmlRpcCommonsTransportFactory_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.xmlrpc.client.XmlRpcCommonsTransportFactory"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(XmlRpcCommonsTransportFactory_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.httpclient.params.HostParams",
      "org.apache.xmlrpc.client.XmlRpcStreamTransport$ReqWriter",
      "org.apache.commons.httpclient.params.HttpMethodParams",
      "org.apache.log4j.or.ObjectRenderer",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.commons.httpclient.URIException",
      "org.apache.log4j.or.RendererMap",
      "org.apache.xmlrpc.common.XmlRpcStreamConfig",
      "org.apache.log4j.Logger",
      "org.apache.commons.httpclient.HttpState",
      "org.apache.xmlrpc.client.XmlRpcStreamTransport$ReqWriterImpl",
      "org.apache.log4j.Level",
      "org.apache.xmlrpc.client.XmlRpcStreamTransport",
      "org.apache.xmlrpc.client.XmlRpcCommonsTransport",
      "org.apache.xmlrpc.util.XmlRpcIOException",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.Category",
      "org.apache.xmlrpc.client.XmlRpcStreamTransport$GzipReqWriter",
      "org.apache.xmlrpc.client.XmlRpcHttpTransportException",
      "org.apache.commons.httpclient.params.HttpConnectionManagerParams",
      "org.apache.commons.httpclient.params.HttpClientParams",
      "org.apache.log4j.spi.RepositorySelector",
      "org.apache.xmlrpc.XmlRpcRequest",
      "org.apache.commons.httpclient.params.DefaultHttpParams",
      "org.apache.xmlrpc.common.XmlRpcController",
      "org.apache.commons.httpclient.params.HttpConnectionParams",
      "org.apache.commons.httpclient.HttpClient",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.spi.Configurator",
      "org.apache.xmlrpc.client.XmlRpcClientException",
      "org.apache.commons.httpclient.methods.RequestEntity",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.commons.httpclient.HttpMethodRetryHandler",
      "org.apache.commons.httpclient.HttpHost",
      "org.apache.commons.httpclient.params.HttpParams",
      "org.apache.commons.httpclient.params.DefaultHttpParamsFactory",
      "org.apache.xmlrpc.client.XmlRpcTransportFactory",
      "org.apache.xmlrpc.client.XmlRpcTransportImpl",
      "org.apache.log4j.PropertyWatchdog",
      "org.apache.commons.httpclient.HttpVersion",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.helpers.Loader",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.apache.log4j.ProvisionNode",
      "org.apache.log4j.Hierarchy",
      "org.apache.xmlrpc.XmlRpcException",
      "org.apache.commons.httpclient.HostConfiguration",
      "org.apache.log4j.helpers.FileWatchdog",
      "org.apache.commons.httpclient.HttpConnectionManager",
      "org.apache.xmlrpc.client.XmlRpcClient",
      "org.apache.commons.httpclient.HttpException",
      "org.apache.xmlrpc.common.XmlRpcStreamRequestConfig",
      "org.apache.xmlrpc.client.XmlRpcTransportFactoryImpl",
      "org.apache.commons.httpclient.params.HttpParamsFactory",
      "org.apache.xmlrpc.XmlRpcRequestConfig",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.xmlrpc.client.XmlRpcTransport",
      "org.apache.commons.httpclient.SimpleHttpConnectionManager",
      "org.apache.commons.httpclient.DefaultHttpMethodRetryHandler",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.xmlrpc.client.XmlRpcCommonsTransportFactory",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.apache.log4j.spi.RendererSupport",
      "org.apache.commons.httpclient.Credentials",
      "org.apache.commons.httpclient.HttpMethod",
      "org.apache.log4j.Priority",
      "org.apache.commons.httpclient.ProtocolException",
      "org.apache.xmlrpc.XmlRpcConfig",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.xmlrpc.client.XmlRpcHttpTransport",
      "org.apache.commons.httpclient.ProxyHost"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(XmlRpcCommonsTransportFactory_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.xmlrpc.client.XmlRpcTransportFactoryImpl",
      "org.apache.xmlrpc.client.XmlRpcCommonsTransportFactory",
      "org.apache.xmlrpc.common.XmlRpcController",
      "org.apache.xmlrpc.client.XmlRpcClient",
      "org.apache.xmlrpc.client.XmlRpcTransportImpl",
      "org.apache.xmlrpc.client.XmlRpcStreamTransport",
      "org.apache.xmlrpc.client.XmlRpcHttpTransport",
      "org.apache.xmlrpc.client.XmlRpcCommonsTransport",
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
      "org.apache.commons.httpclient.HttpClient",
      "org.apache.commons.httpclient.params.DefaultHttpParamsFactory",
      "org.apache.commons.httpclient.params.DefaultHttpParams",
      "org.apache.commons.httpclient.params.HttpMethodParams",
      "org.apache.commons.httpclient.params.HttpClientParams",
      "org.apache.commons.httpclient.HttpVersion",
      "org.apache.commons.httpclient.SimpleHttpConnectionManager",
      "org.apache.commons.httpclient.DefaultHttpMethodRetryHandler",
      "org.apache.commons.httpclient.HttpState",
      "org.apache.commons.httpclient.params.HostParams",
      "org.apache.commons.httpclient.HostConfiguration",
      "org.apache.commons.httpclient.params.HttpConnectionParams",
      "org.apache.commons.httpclient.params.HttpConnectionManagerParams"
    );
  }
}
