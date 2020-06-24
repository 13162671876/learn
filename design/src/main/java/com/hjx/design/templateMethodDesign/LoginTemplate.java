package com.hjx.design.templateMethodDesign;

/**
 * @Desc 登录模板
 * @Author huangjianxiong
 * @Date 2019/12/17
 **/
public abstract class LoginTemplate {

    /**
     * 骨干方法  抽出公共方法，具体实现提现在子类   实现登录入口统一
     * @param user
     * @return
     */
    public boolean login(User user) {
        User dbUser = findUserByUserId(user);
        return matchUser(user, dbUser);
    }

    public abstract User findUserByUserId(User user);

    public abstract boolean matchUser(User user, User dbUser);



}
