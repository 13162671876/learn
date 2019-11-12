package com.hjx.design.responsibilityDesign;

/**
 * @Desc
 * @Author huangjianxiong
 * @Date 2019/10/24
 **/
public class FeeRequestModel extends  RequestModel {

    public final static String FeeType = "FEE";

    public FeeRequestModel() {
        super(FeeType);
    }

    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
