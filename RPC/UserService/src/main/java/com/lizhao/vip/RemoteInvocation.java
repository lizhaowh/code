package com.lizhao.vip;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RemoteInvocation implements InvocationHandler {

    private String host;

    private String port;


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        RpcnetTransport rpcnetTransport = new RpcnetTransport();


        return null;
    }
}
