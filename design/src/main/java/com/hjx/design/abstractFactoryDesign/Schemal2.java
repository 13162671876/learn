package com.hjx.design.abstractFactoryDesign;

/**
 * @Desc
 * @Author huangjianxiong
 * @Date 2019/11/28
 **/
public class Schemal2 implements AbstractFactory {
    @Override
    public CpuApi selectCpu() {
        return new IntelCpuImpl();
    }

    @Override
    public MainboardApi selectCpuMainBoard() {
        return new GAMainboardImpl();
    }
}
