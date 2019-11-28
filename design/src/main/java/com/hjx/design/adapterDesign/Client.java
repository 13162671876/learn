package com.hjx.design.adapterDesign;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc
 * @Author huangjianxiong
 * @Date 2019/11/27
 **/
public class Client {

    public static void main(String[] args) {

        //第一版日志  写入磁盘
        List<LogModel> list = new ArrayList<>();
        LogModel logModel = new LogModel();
        logModel.setId("1");
        logModel.setLog("log");
        list.add(logModel);
        LogFileOperateApi logFileOperateApi = new LogFileOperateImpl();
        logFileOperateApi.writeLogFile(list);
        logFileOperateApi.readLogFile();

        /**
         * 第二版  写入磁盘的同时 需要插入数据库
         * 老应用可以继续不修改的调用老日志系统  写入磁盘
         */
        List<LogModel> newlist = new ArrayList<>();
        LogModel newlogModel = new LogModel();
        newlogModel.setId("1");
        newlogModel.setLog("log");
        newlist.add(newlogModel);
        LogFileOperateApi oldlogFileOperateApi= new LogFileOperateImpl();
        //应用可以继续不修改的调用老日志系统  写入磁盘
        oldlogFileOperateApi.writeLogFile(newlist);
        oldlogFileOperateApi.readLogFile();
        LogDbOperateApi logDbOperateApi = new Adapter(oldlogFileOperateApi);
        logDbOperateApi.createLog(newlogModel);
        logDbOperateApi.delLog(newlogModel);
        logDbOperateApi.updateLog(newlogModel);
        logDbOperateApi.getLog(newlogModel);


        /**
         *双向适配
         */
        System.out.println("==========双向配置开始=======");
        LogModel lm1 = new LogModel();
        lm1.setId("001");
        lm1.setLog("admin");
        List logs = new ArrayList<>();
        logs.add(lm1);
        LogFileOperateApi fileLogApi = new LogFileOperateImpl();
        LogDbOperateApi dbLogApi = new Adapter(fileLogApi);
        LogFileOperateApi fileOperateApi = new TwoDirectAdapter(fileLogApi,dbLogApi);
        fileOperateApi.readLogFile();
        fileOperateApi.writeLogFile(logs);
        LogDbOperateApi dbOperateApi = new TwoDirectAdapter(fileLogApi,dbLogApi);
        dbOperateApi.createLog(lm1);
        System.out.println("==========双向配置 end=======");
    }
}
