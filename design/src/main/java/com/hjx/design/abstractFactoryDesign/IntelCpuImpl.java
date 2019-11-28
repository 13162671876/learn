package com.hjx.design.abstractFactoryDesign;

/**
 * @Desc    英特尔cpu
 * @Author huangjianxiong
 * @Date 2019/11/28
 **/
public class IntelCpuImpl implements CpuApi {
    @Override
    public void calculate() {
        System.out.println("IntelCpuImpl");
    }
}
