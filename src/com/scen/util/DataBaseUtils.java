package com.scen.util;


import com.mysql.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 数据库工具类
 * Created by admin on 2017/4/24.
 */
public class DataBaseUtils {
    private DataBaseUtils() {
    }

    public static Connection getConn() {
        /**
         * JDBC四大参数
         * Created by admin on 2017/4/24.
         */
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/jdinfo";
        String username = "root";
        String password = "root";
        Connection conn = null;
        try {
            Class.forName(driver); //classLoader,加载对应驱动
            conn = (Connection) DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

}

