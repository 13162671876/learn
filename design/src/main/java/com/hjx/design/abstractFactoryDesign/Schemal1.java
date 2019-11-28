package com.hjx.design.abstractFactoryDesign;

/**
 * @Desc
 * @Author huangjianxiong
 * @Date 2019/11/28
 **/
public class Schemal1 implements AbstractFactory {

    @Override
    public CpuApi selectCpu() {
        return new AMDCpuImpl();
    }

    @Override
    public MainboardApi selectCpuMainBoard() {
        return new MsiMainboardImpl();
    }
}
