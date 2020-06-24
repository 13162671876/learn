package com.hjx.design.strategy;

/**
 * @Desc  根据不同的场景，选择性对应的策略
 * @Author huangjianxiong
 * @Date 2019/12/16
 **/
public class Client {
    public static void main(String[] args) {
        Count countA = new CountA();
        Context context = new Context(countA);
        context.getPrice(100);

        Count countB = new CountB();
        Context context2 = new Context(countB);
        context2.getPrice(100);
    }




}
