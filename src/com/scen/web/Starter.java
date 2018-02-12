package com.scen.web;

import com.scen.entity.Info;
import com.scen.service.InfoService;
import com.scen.util.ParseUtils;
import com.scen.util.PrintListUtils;
import com.scen.util.ScannerUtils;

import java.io.IOException;
import java.util.List;

/**
 * 该项目的入口类
 * Created by Scen  on 2017/9/17.
 */
public class Starter {
    public static void main(String[] args) throws IOException {
        /**
         * startup
         * 从键盘获取两个关键字的值
         */
        System.out.println(">>>>>>>>>>>>>>欢迎使用京东商城商品价格及信息采集项目<<<<<<<<<<<<<<<<<");
        String[] keyWords = ScannerUtils.sc();
        String goods = keyWords[0];
        String goodsPrice0 = keyWords[1];
        String goodsPrice1 = keyWords[2];
        String page = keyWords[3];
        String url = "http://search.jd.com/search?keyword=" + goods + "&enc=utf-8&ev=exprice_" + goodsPrice0 + "-" + goodsPrice1 + "&page=" + page;
        //keyword参数 page参数奇数增加规律 1 3 5 7 9.......ev价格范围参数
        System.out.println(">>>>>>>>>>>>>>正在采集请稍等<<<<<<<<<<<<<<<<<");

        /**
         * 第一步：将网页中的数据，提取出来，并将对象封装到集合中
         */
        List<Info> dataList = ParseUtils.parseWebData(url);
        PrintListUtils.printData(dataList);
        /**
         * 第二步：将集合的数据传递给业务逻辑层处理（遍历集合中的对象并且把对象中的属性insert进mysql）
         */
        InfoService infoService = new InfoService();
        infoService.insertInfo(dataList);
        /**
         * 第三步：采集完毕
         */
        System.out.println(">>>>>>>>>>>>>>信息采集完毕，感谢您的使用！<<<<<<<<<<<<<<<<<");
    }


}
