package org.apache.xmlrpc.webserver;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.common.TypeConverterFactory;
import org.apache.xmlrpc.server.AbstractReflectiveHandlerMapping;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.server.RequestProcessorFactoryFactory;
import org.apache.xmlrpc.server.XmlRpcHandlerMapping;

import java.io.IOException;
import java.io.Serializable;
import java.net.URL;

public class XmlRpcServletProduct implements Serializable {
    private AbstractReflectiveHandlerMapping.AuthenticationHandler authenticationHandler;
    private RequestProcessorFactoryFactory requestProcessorFactoryFactory;
    private TypeConverterFactory typeConverterFactory;

    public AbstractReflectiveHandlerMapping.AuthenticationHandler getAuthenticationHandler() {
        return authenticationHandler;
    }

    public void setAuthenticationHandler(AbstractReflectiveHandlerMapping.AuthenticationHandler authenticationHandler) {
        this.authenticationHandler = authenticationHandler;
    }

    public RequestProcessorFactoryFactory getRequestProcessorFactoryFactory() {
        return requestProcessorFactoryFactory;
    }

    public void setRequestProcessorFactoryFactory(RequestProcessorFactoryFactory requestProcessorFactoryFactory) {
        this.requestProcessorFactoryFactory = requestProcessorFactoryFactory;
    }

    public TypeConverterFactory getTypeConverterFactory() {
        return typeConverterFactory;
    }

    public void setTypeConverterFactory(TypeConverterFactory typeConverterFactory) {
        this.typeConverterFactory = typeConverterFactory;
    }

    /**
     * Creates a new instance of {@link PropertyHandlerMapping} by
     * loading the property file from the given URL. Called from
     * {@link #newXmlRpcHandlerMapping()}.
     */
    public PropertyHandlerMapping newPropertyHandlerMapping(URL url, XmlRpcServletServer thisServer) throws IOException, XmlRpcException {
        PropertyHandlerMapping mapping = new PropertyHandlerMapping();
        mapping.setAuthenticationHandler(authenticationHandler);
        if (requestProcessorFactoryFactory != null) {
            mapping.setRequestProcessorFactoryFactory(requestProcessorFactoryFactory);
        }
        if (typeConverterFactory != null) {
            mapping.setTypeConverterFactory(typeConverterFactory);
        } else {
            mapping.setTypeConverterFactory(thisServer.getTypeConverterFactory());
        }
        mapping.setVoidMethodEnabled(thisServer.getConfig().isEnabledForExtensions());
        mapping.load(Thread.currentThread().getContextClassLoader(), url);
        return mapping;
    }

    /**
     * Creates a new handler mapping. The default implementation loads
     * a property file from the resource
     * <code>org/apache/xmlrpc/webserver/XmlRpcServlet.properties</code>
     */
    public XmlRpcHandlerMapping newXmlRpcHandlerMapping(XmlRpcServletServer thisServer) throws XmlRpcException {
        URL url = XmlRpcServlet.class.getResource("XmlRpcServlet.properties");
        if (url == null) {
            throw new XmlRpcException("Failed to locate resource XmlRpcServlet.properties");
        }
        try {
            return newPropertyHandlerMapping(url, thisServer);
        } catch (IOException e) {
            throw new XmlRpcException("Failed to load resource " + url + ": " + e.getMessage(), e);
        }
    }
}