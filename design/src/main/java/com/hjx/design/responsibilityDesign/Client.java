package com.hjx.design.responsibilityDesign;

/**
 * @Desc 责任链设计模式
 * @Author huangjianxiong
 * @Date 2019/10/23
 **/
public class Client {

    public static void main(String[] args) {


        AHandler aHandler = new AHandler();
        BHandler bHandler = new BHandler();
        CHandler cHandler = new CHandler();
        aHandler.setNextHandler(bHandler);
        bHandler.setNextHandler(cHandler);
        /*
        业务单一的情况
        aHandler.handlRequest(1);
        aHandler.handlRequest(5);
        aHandler.handlRequest(11);
        aHandler.handlRequest(22);*/


        /* 业务复杂
         FeeRequestModel feeRequestModel = new FeeRequestModel();
        feeRequestModel.setY(20);
        aHandler.handlRequest(feeRequestModel);*/

        RequestModel requestModel = new RequestModel("aaa");
        aHandler.handlRequest(requestModel);
    }
}
