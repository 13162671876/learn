package com.hjx.design.responsibilityDesign;

/**
 * @Desc
 * @Author huangjianxiong
 * @Date 2019/10/24
 **/
public class RequestModel {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        type = type;
    }

    public RequestModel(String type) {
        this.type = type;
    }
}
