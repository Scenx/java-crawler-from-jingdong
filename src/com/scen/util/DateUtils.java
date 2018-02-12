package com.scen.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 格式化输出时间类
 * Created by scen on 2017/4/24.
 */
public final class DateUtils {


    private DateUtils() {
    }

    public static String fornatDate(Date date) {
        String pattern = "yyyy-MM-dd HH：mm：ss";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String currentDate = sdf.format(date);
        return currentDate;
    }

}
