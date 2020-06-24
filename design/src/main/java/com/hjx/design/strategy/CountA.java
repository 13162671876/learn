package com.hjx.design.strategy;

/**
 * @Desc
 * @Author huangjianxiong
 * @Date 2019/12/16
 **/
public class CountA implements Count {
    @Override
    public void countPrice(Integer originPrice) {
        System.out.println("8折优惠");
    }
}
