package com.scen.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 从键盘获取四个关键字的工具类
 * Created by scen on 2017/4/24.
 */
public class ScannerUtils {
    public static String[] sc() throws IOException {
        System.out.println("请输入商品名称以回车键结束：");
        BufferedReader bufrGoods = new BufferedReader(new InputStreamReader(System.in));
        String goods = bufrGoods.readLine();
        System.out.println("请输入商品起始价格以回车键结束：");
        BufferedReader bufrGoodsPrince0 = new BufferedReader(new InputStreamReader(System.in));
        String goodsPrice0 = bufrGoodsPrince0.readLine();
        System.out.println("请输入商品结束价格以回车键结束：");
        BufferedReader bufrGoodsPrince1 = new BufferedReader(new InputStreamReader(System.in));
        String goodsPrice1 = bufrGoodsPrince1.readLine();
        System.out.println("请输入商品的页数以回车键结束（奇数）：");
        BufferedReader bufrPage = new BufferedReader(new InputStreamReader(System.in));
        String page = bufrPage.readLine();
        String[] keyWords = new String[4];
        keyWords[0] = goods;
        keyWords[1] = goodsPrice0;
        keyWords[2] = goodsPrice1;
        keyWords[3] = page;
        return keyWords;
    }
}
