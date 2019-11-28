package com.hjx.design.adapterDesign;

import java.util.List;

/**
 * @Desc
 * @Author huangjianxiong
 * @Date 2019/11/2714:16
 **/
public interface LogFileOperateApi {


    List<LogModel> readLogFile();

    void writeLogFile(List<LogModel> logModelList);
}
