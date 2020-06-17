package com.lizhao.vip;

import java.io.IOException;
import java.net.Socket;

public class RpcnetTransport {

    private String host;
    private int port;

    public RpcnetTransport(String host,int port) {
        this.host = host;
        this.port = port;
    }

    public Socket newSocket() throws IOException {
        Socket socket = new Socket(host, port);

        return socket;
    }

}
