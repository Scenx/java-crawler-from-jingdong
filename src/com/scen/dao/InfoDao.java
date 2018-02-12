package com.scen.dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import java.sql.SQLException;
import java.util.List;

import com.scen.entity.Info;
import com.scen.util.DataBaseUtils;

/**
 * 数据处理
 * Created by scen on 2017/4/21.
 */
public class InfoDao {
    public InfoDao() {
    }

    public int insert(List<Info> dataList,
                      String model,
                      String price,
                      String creatDate,
                      String updateDate
    ) {  //带有5个参数的数据库插入方法
        Connection conn = DataBaseUtils.getConn();
        int p = 0;
        String sql = "insert into info (model,price,createdate,updatedate) values(?,?,?,?)";
        PreparedStatement pstmt;
        try { //向表里添加数据
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, model);
            pstmt.setString(2, price);
            pstmt.setString(3, creatDate);
            pstmt.setString(4, updateDate);
            p = pstmt.executeUpdate();
            pstmt.close();
            conn.close();

        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        return p;
    }

}