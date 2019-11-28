package com.hjx.design.adapterDesign;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc  新版日志插入数据库操作  即适配器
 * @Author huangjianxiong
 * @Date 2019/11/27
 **/
public class Adapter implements LogDbOperateApi {

    private LogFileOperateApi logFileOperateApi;

    public Adapter(LogFileOperateApi logFileOperateApi) {
        this.logFileOperateApi = logFileOperateApi;
    }
    @Override
    public void createLog(LogModel logModel) {

        System.out.println("createLog");
        List<LogModel> list = new ArrayList<>();
        list.add(logModel);
        logFileOperateApi.writeLogFile(list);
    }

    @Override
    public void delLog(LogModel logModel) {
        System.out.println("createLog");
        List<LogModel> list = new ArrayList<>();
        list.add(logModel);
        logFileOperateApi.writeLogFile(list);
    }

    @Override
    public void updateLog(LogModel logModel) {
        System.out.println("createLog");
        List<LogModel> list = new ArrayList<>();
        list.add(logModel);
        logFileOperateApi.writeLogFile(list);
    }

    @Override
    public void getLog(LogModel logModel) {
        System.out.println("createLog");
        List<LogModel> list = new ArrayList<>();
        list.add(logModel);
        logFileOperateApi.readLogFile();
    }

    @Override
    public List<LogModel> getAllLog() {
        System.out.println("查询数据库日志");
        return null;
    }
}
