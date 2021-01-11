package com.hjx.stack;


import static org.apache.logging.log4j.message.MapMessage.MapFormat.JSON;

/**
 * @Desc
 * @Author jianxiong.huang
 * @Date 2020/12/28 10:37
 * @Version 1.0.0
 */
public class Car {
    protected String color =  "black";

    public String getColor(){
        return color;
    }

/*
    public static void main(String[] args) {
        RedCar redCar = new RedCar();
        System.out.println(redCar.getColor());
    }
*/

    public static void main(String[] args) {
        System.out.println(Integer.valueOf("1.6"));
    }
}
