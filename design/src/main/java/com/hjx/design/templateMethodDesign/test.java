package com.hjx.design.templateMethodDesign;

import com.alibaba.fastjson.JSONObject;

/**
 * @Desc
 * @Author jianxiong.huang
 * @Date 2020/10/23 15:18
 * @Version 1.0.0
 */
public class test {
    public static void main(String[] args) {
        JSONObject extParam = new JSONObject();
        extParam.put("supplier_amount", 111);// 微信单号
        extParam.put("settlement_amount", 222);// 微信单号
        System.out.println(extParam.toJSONString());
    }
}
