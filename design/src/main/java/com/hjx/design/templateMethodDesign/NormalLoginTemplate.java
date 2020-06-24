package com.hjx.design.templateMethodDesign;

/**
 * @Desc    普调用户登录模板
 * @Author huangjianxiong
 * @Date 2019/12/17
 **/
public class NormalLoginTemplate extends LoginTemplate {
    @Override
    public User findUserByUserId(User user) {
        return user;
    }

    @Override
    public boolean matchUser(User user, User dbUser) {
        return user.getLoginId().equals(dbUser.getLoginId())&& user.getPwd().equals(dbUser.getPwd());
    }
}
