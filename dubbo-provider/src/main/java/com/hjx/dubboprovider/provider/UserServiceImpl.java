package com.hjx.dubboprovider.provider;

import com.hjx.api.dubboapi.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @Desc
 * @Author huangjianxiong
 * @Date 2019/9/27
 **/
@Component
public class UserServiceImpl implements UserService {

    @Override
    public void sayUser() {
        System.out.println("I am user");
    }
}
