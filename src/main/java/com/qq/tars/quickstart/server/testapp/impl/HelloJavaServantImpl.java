package com.qq.tars.quickstart.server.testapp.impl;

import com.qq.tars.quickstart.server.testapp.HelloJavaServant;

public class HelloJavaServantImpl implements HelloJavaServant {
    @Override
    public String hello(int no, String name) {
        return String.format("hello no=%s, name=%s, time=%s", no, name, System.currentTimeMillis());
    }
}
