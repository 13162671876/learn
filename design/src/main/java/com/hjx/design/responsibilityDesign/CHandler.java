package com.hjx.design.responsibilityDesign;

/**
 * @Desc
 * @Author huangjianxiong
 * @Date 2019/10/23
 **/
public class CHandler extends Handler {
    @Override
    public void handlRequest(int y) {
        System.out.println("入参："+y);
        System.out.println("handler by c");
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
        System.out.println("handler by C; y ="+y);

    }

}
