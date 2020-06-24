package com.hjx.design.adapterDesign;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Desc  日志
 * @Author huangjianxiong
 * @Date 2019/11/27
 **/
@Data
public class LogModel {

    private String log;

    private String id;


    public static void main(String[] args) {

        HashMap hashMap= new HashMap<String, String>();
        //组织机构代码证有效期开始日期
        hashMap.put("weh", "111");
        //组织机构代码证有效期结束日期
        hashMap.put("zhongzhogh", "222");
        JSONObject extParams = JSONObject.parseObject(JSONObject.toJSONString(hashMap));
        System.out.println(extParams.toJSONString());
    }
}
