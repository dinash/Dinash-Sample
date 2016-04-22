package com.example.datelibrary;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by dinash on 22/04/16.
 */
public class MyDateConvertor {

    public static String convertDate(){
        java.util.Date date = new Date("Sat Dec 01 00:00:00 GMT 2012");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String format = formatter.format(date);
        System.out.println(format);
        return format;
    }
}
