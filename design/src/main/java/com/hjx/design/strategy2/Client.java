package com.hjx.design.strategy2;

/**
 * @Desc 策略模式
 * @Author huangjianxiong
 * @Date 2019/12/16
 **/
public class Client {

    public static void main(String[] args) {
        //1 根据优惠客户选择折扣
       Count countA = new  CountA();
       Context context = new Context(100,countA);
       context.getPrice();


        Count countB = new  CountB();
        Context context2 = new Context(100,countB);
        context2.getPrice();


        /**
         * 2 特殊客户 指定折扣  根据维持原先的代码保持不动
         * 之前上下文保持不变，新增上下文子类 ，拓展新参数,实现新需求
         */
        Count countC = new CountC();
        Context extendContext = new ExtendContext(100,countC,8);
        extendContext.getPrice();
    }
}
