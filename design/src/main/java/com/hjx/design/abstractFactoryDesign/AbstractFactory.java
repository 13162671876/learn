package com.hjx.design.abstractFactoryDesign;

/**
 * @Desc
 * @Author huangjianxiong
 * @Date 2019/11/28
 **/
public interface AbstractFactory {

    /**
     * 选择cpu
     */
    CpuApi selectCpu();

    /**
     * 选择主板
     */
    MainboardApi selectCpuMainBoard();
}
