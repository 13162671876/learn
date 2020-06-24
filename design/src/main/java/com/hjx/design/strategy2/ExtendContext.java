package com.hjx.design.strategy2;

/**
 * @Desc   特殊客户 指定折扣
 * @Author huangjianxiong
 * @Date 2019/12/16
 **/
public class ExtendContext extends Context {
    /**折扣**/
    private Integer zhekou;

    public ExtendContext(Integer originPrice,Count count,Integer zhekou) {
        super(originPrice,count);
        this.zhekou =zhekou;
    }

    public Integer getZhekou() {
        return zhekou;
    }
}
