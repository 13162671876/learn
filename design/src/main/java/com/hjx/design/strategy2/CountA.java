package com.hjx.design.strategy2;

/**
 * @Desc   原价
 * @Author huangjianxiong
 * @Date 2019/12/16
 **/
public class CountA implements Count {
    @Override
    public void countPrice(Context context) {
        System.out.println("原价，金额："+context.getOriginPrice());
    }
}
