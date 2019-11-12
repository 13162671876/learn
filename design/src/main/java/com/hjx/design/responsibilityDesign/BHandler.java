package com.hjx.design.responsibilityDesign;

/**
 * @Desc
 * @Author huangjianxiong
 * @Date 2019/10/23
 **/
public class BHandler extends Handler {

    @Override
    public void handlRequest(int y) {
        System.out.println("入参："+y);
        if(y<20)
            System.out.println("handler by b");
        else {
            System.out.println("b do nothing");
            if(this.getNextHandler()!=null){
                this.getNextHandler().handlRequest(y);
            }
        }
    }

    @Override
    public void handlRequest(RequestModel requestModel) {
        if(FeeRequestModel.FeeType.equals(requestModel.getType())){
            handlRequestA(requestModel);
        }else{
            super.handlRequest(requestModel);
        }
    }

    private void handlRequestA(RequestModel requestModel) {
        FeeRequestModel feeRequestModel = (FeeRequestModel)requestModel;
        int y = feeRequestModel.getY();
        if(y<20)
            System.out.println("handler by b");
        else {
            System.out.println("b do nothing,sent nextHandler");
            if(this.getNextHandler()!=null){
                this.getNextHandler().handlRequest(requestModel);
            }
        }

    }


}
