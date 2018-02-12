package com.scen.util;

import com.scen.entity.Info;

import java.util.List;

/**
 * 遍历输出集合的类
 * Created by Scen  on 2017/9/17.
 */
public class PrintListUtils {
    public PrintListUtils() {
    }

    public static void printData(List<Info> dataList) {
        for (Info info : dataList) {
            System.out.println(info);
        }
    }
}

