package com.gm.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyTimeUtils {

    public static String getTime(){
        Date date = new Date();
        long times = date.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = simpleDateFormat.format(times);
        return time;
    }

}
