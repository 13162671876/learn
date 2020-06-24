package com.hjx.design.strategy2;

/**
 * @Desc   指定折扣
 * @Author huangjianxiong
 * @Date 2019/12/16
 **/
public class CountC implements Count {
    @Override
    public void countPrice(Context context) {
        ExtendContext extendContext  = (ExtendContext) context;
        System.out.println("指定折扣，金额："+extendContext.getOriginPrice()*extendContext.getZhekou());
    }
}
