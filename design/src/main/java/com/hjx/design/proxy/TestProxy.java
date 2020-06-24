package com.hjx.design.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Desc
 * @Author huangjianxiong
 * @Date 2020/6/10
 **/
public class TestProxy {

    public static void main(String[] args) throws Throwable {
        SService sService = new SService();
        CglibProxy cglibProxy = new CglibProxy(sService);
        //创建加强器，用来创建动态代理类
        Enhancer enhancer = new Enhancer();
        //为加强器指定要代理的业务类（即：为下面生成的代理类指定父类）
        enhancer.setSuperclass(sService.getClass());

        //设置回调：对于代理类上所有方法的调用，都会调用CallBack，而Callback则需要实现intercept()方法进行拦
        enhancer.setCallback(cglibProxy);
        SService proxy = (SService) enhancer.create();
        proxy.doSomething("shopping");


    }
}
