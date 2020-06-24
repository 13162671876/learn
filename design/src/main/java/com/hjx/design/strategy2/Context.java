package com.hjx.design.strategy2;


/**
 * @Desc
 * @Author huangjianxiong
 * @Date 2019/12/16
 **/
public class Context {

    private Integer originPrice;

    private Count count;

    public Context(Integer originPrice, Count count) {
        this.originPrice = originPrice;
        this.count = count;
    }

    public Integer getOriginPrice() {
        return originPrice;
    }

    public void getPrice(){
        this.count.countPrice(this);
    }
}
