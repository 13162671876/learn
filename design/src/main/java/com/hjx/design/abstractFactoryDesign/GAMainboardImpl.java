package com.hjx.design.abstractFactoryDesign;

/**
 * @Desc  技嘉主板
 * @Author huangjianxiong
 * @Date 2019/11/28
 **/
public class GAMainboardImpl implements MainboardApi {
    @Override
    public void installCPU() {
        System.out.println("ga install cpu");
    }
}
