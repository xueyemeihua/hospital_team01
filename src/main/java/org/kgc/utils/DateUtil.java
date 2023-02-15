package org.kgc.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static String NowTime(){
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");
//        System.out.println(dateFormat.format(date));
        return dateFormat.format(date);
    }
}
