package com.hjx.design.abstractFactoryDesign;

/**
 * @Desc   微星主板
 * @Author huangjianxiong
 * @Date 2019/11/28
 **/
public class MsiMainboardImpl implements MainboardApi {
    @Override
    public void installCPU() {
        System.out.println("msi install cpu");
    }
}
