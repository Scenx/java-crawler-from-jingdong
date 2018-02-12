package com.scen.service;

import com.scen.dao.InfoDao;
import com.scen.entity.Info;

import java.util.List;

/**
 * job类型的业务逻辑处理层代码
 * Created by scen on 2017/4/24.
 */
public class InfoService {
    InfoDao infoDao = new InfoDao();

    /**
     * 插入记录到数据库
     * Created by scen on 2017/4/24.
     */
    public void insertInfo(List<Info> dataList) {
        for (Info info : dataList) {
            infoDao.insert(dataList, info.getModel(), info.getPrice(), info.getCreateDate(), info.getUpdateDate());
        }
        System.out.println(">>>>>>>>>>>>>>恭喜您！数据成功存储到数据库！<<<<<<<<<<<<<<<<<");
    }
}

