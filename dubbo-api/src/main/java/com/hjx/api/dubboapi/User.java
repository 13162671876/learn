package com.hjx.api.dubboapi;

import lombok.Data;

/**
 * @Desc
 * @Author huangjianxiong
 * @Date 2019/9/27
 **/

@Data
public class User {

    private String name;

    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
