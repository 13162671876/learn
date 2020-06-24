package com.hjx.design.strategy;

/**
 * @Desc
 * @Author huangjianxiong
 * @Date 2019/12/16
 **/
public class Context {
    private Count count;

    public Context(Count count) {
        this.count = count;
    }

    public void getPrice(Integer price){
        this.count.countPrice(price);
    }
}
