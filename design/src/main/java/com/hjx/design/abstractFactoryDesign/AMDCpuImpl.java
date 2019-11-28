package com.hjx.design.abstractFactoryDesign;

/**
 * @Desc   AMD cpu
 * @Author huangjianxiong
 * @Date 2019/11/28
 **/
public class AMDCpuImpl implements CpuApi {
    @Override
    public void calculate() {
        System.out.println("AMDCupImpl");
    }
}
