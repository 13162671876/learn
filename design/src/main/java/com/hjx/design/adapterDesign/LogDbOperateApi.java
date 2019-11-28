package com.hjx.design.adapterDesign;

import java.util.List;

/**
 * @Desc
 * @Author huangjianxiong
 * @Date 2019/11/27
 **/
public interface LogDbOperateApi {

    void createLog(LogModel logModel);

    void delLog(LogModel logModel);

    void updateLog(LogModel logModel);

    void getLog(LogModel logModel);

    List<LogModel> getAllLog();

}
