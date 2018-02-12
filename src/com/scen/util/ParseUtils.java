package com.scen.util;

import com.scen.entity.Info;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 抓取网页数据类
 * Created by Scen  on 2017/9/17.
 */
public class ParseUtils {

    public ParseUtils() {
    }

    public static List<Info> parseWebData(String url) throws IOException {
        String htmlData = Jsoup.connect(url).get().toString();
        Document doc = Jsoup.parse(htmlData);
        Elements content = doc.getElementsByClass("gl-item");//标签内容
        Info inf = null;
        List<Info> dataList = new ArrayList();
        for (Element element : content) {
            String price = element.getElementsByClass("p-price").text();
            String model = element.getElementsByClass("p-name p-name-type-2").text();
            if (price.equals("")) {
                price = "价格不详";
            }
            inf = new Info();
            inf.setModel(model);
            inf.setPrice(price);
            String currentDate = DateUtils.fornatDate(new Date());
            inf.setCreateDate(currentDate);
            inf.setUpdateDate(currentDate);
            dataList.add(inf);
        }

        return dataList;
    }
}
