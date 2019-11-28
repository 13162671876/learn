package com.hjx.design.adapterDesign;

import java.util.List;

/**
 * @Desc
 * @Author huangjianxiong
 * @Date 2019/11/27
 **/
public class LogFileOperateImpl implements LogFileOperateApi {


    @Override
    public List<LogModel> readLogFile() {
        System.out.println("读磁盘日志");
        return null;
    }

    @Override
    public void writeLogFile(List<LogModel> logModelList) {
        System.out.println("写磁盘日志");
    }
}
