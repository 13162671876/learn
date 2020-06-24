package com.hjx.design.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Desc
 * @Author huangjianxiong
 * @Date 2020/6/10
 **/
public class CglibProxy implements MethodInterceptor {

    private Object targetObject;


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("intercept start");
        Object result = methodProxy.invokeSuper(o,objects);
        System.out.println("intercept end");

        return result;
    }

    public CglibProxy(Object targetObject) {
        this.targetObject = targetObject;
    }

    public CglibProxy() {
    }



}
