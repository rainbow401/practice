package com.rainbow.other.proxy.jdk;

import com.rainbow.other.proxy.Demo;
import com.rainbow.other.proxy.DemoImpl;

import java.lang.reflect.Proxy;

/**
 * 需要抽象接口
 * @author yanzhihao
 */
public class JdkProxyTest {

    public static void main(String[] args) {
        Demo demo = new DemoImpl();
        DemoImplInvocationHandler<Demo> invocationHandler = new DemoImplInvocationHandler<>(demo);
        Demo proxyDemo = (Demo) Proxy.newProxyInstance(Demo.class.getClassLoader(), new Class[]{Demo.class}, invocationHandler);
        proxyDemo.say();
    }
}
