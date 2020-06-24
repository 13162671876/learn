package com.hjx.design.templateMethodDesign;

/**
 * @Desc
 * @Author huangjianxiong
 * @Date 2019/12/17
 **/
public class AbnormalLoginTemplateI extends LoginTemplate {
    @Override
    public User findUserByUserId(User user) {
        return user;
    }

    @Override
    public boolean matchUser(User user, User dbUser) {
        return user.getLoginId().equals(dbUser.getLoginId())&& encryptPwd(user.getPwd()).equals(dbUser.getPwd());
    }

    private static String encryptPwd(String pwd){
        System.out.println("加密MD5");
        return pwd;
    }
}
