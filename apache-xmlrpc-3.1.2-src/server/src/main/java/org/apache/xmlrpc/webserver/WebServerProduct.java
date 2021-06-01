package org.apache.xmlrpc.webserver;

import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class WebServerProduct {
    private final List accept = new ArrayList();
    private final List deny = new ArrayList();
    private boolean paranoid;

    public List getAccept() {
        return accept;
    }

    public List getDeny() {
        return deny;
    }

    public boolean getParanoid() {
        return paranoid;
    }

    public void setParanoid(boolean paranoid) {
        this.paranoid = paranoid;
    }

    /**
     * Checks incoming connections to see if they should be allowed.
     * If not in paranoid mode, always returns true.
     *
     * @param s The socket to inspect.
     * @return Whether the connection should be allowed.
     */
    public boolean allowConnection(Socket s) {
        if (!paranoid) {
            return true;
        }

        int l = deny.size();
        byte addr[] = s.getInetAddress().getAddress();
        for (int i = 0; i < l; i++) {
            WebServer.AddressMatcher match = (WebServer.AddressMatcher) deny.get(i);
            if (match.matches(addr)) {
                return false;
            }
        }
        l = accept.size();
        for (int i = 0; i < l; i++) {
            WebServer.AddressMatcher match = (WebServer.AddressMatcher) accept.get(i);
            if (match.matches(addr)) {
                return true;
            }
        }
        return false;
    }
}