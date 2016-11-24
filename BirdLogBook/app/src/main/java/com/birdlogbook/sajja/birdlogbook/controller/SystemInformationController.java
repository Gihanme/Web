package com.birdlogbook.sajja.birdlogbook.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by sajja on 11/10/2016.
 */

public class SystemInformationController {
    private String date="-";
    private String time="-";

    public SystemInformationController(){
        //get system date and time

        Calendar c = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat tf = new SimpleDateFormat("HH:mm:ss");
        date = df.format(c.getTime());
        time = tf.format(c.getTime());
    }


    public String getCurrentDate(){
        return date;
    }
    public String getCurrentTime(){
        return time;
    }
}
