package com.hjx.design.strategy2;


/**
 * @Desc   9这优惠
 * @Author huangjianxiong
 * @Date 2019/12/16
 **/
public class CountB implements Count {

    @Override
    public void countPrice(Context context) {
        System.out.println("9折优惠，金额："+context.getOriginPrice()*0.9);
    }
}
