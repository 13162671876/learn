package com.hjx.design.templateMethodDesign;

/**
 * @Desc
 * @Author huangjianxiong
 * @Date 2019/12/17
 **/
public class Client {
    public static void main(String[] args) {
        User user = new User("123","name");

        LoginTemplate normalLoginTemp = new NormalLoginTemplate();
        normalLoginTemp.login(user);

        LoginTemplate abnormalLoginTemplateI = new AbnormalLoginTemplateI();
        abnormalLoginTemplateI.login(user);

    }

}
