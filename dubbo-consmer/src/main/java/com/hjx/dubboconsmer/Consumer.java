package com.hjx.dubboconsmer;

import com.hjx.api.dubboapi.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Desc
 * @Author huangjianxiong
 * @Date 2019/9/27
 **/
@Component
public class Consumer {

    @Autowired
    private UserService userService;

    public void testDubbo(){
        userService.sayUser();
    }
}
