package com.hjx.design.responsibilityDesign;

/**
 * @Desc
 * @Author huangjianxiong
 * @Date 2019/10/23
 **/

public abstract class Handler {

    private Handler nextHandler;

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

     public abstract void handlRequest(int y);


    public void handlRequest(RequestModel requestModel){
        if(nextHandler != null){
            nextHandler.handlRequest(requestModel);
        }else {
            System.out.println("没有后续处理");
        }
    }


}
