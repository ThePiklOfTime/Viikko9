package com.example.myapplication;

import java.util.Calendar;

public class Note {

    static int Id = 0;
    String title;
    String content;
    String timeAndDate;

    public Note(String title, String content){
        this.title = title;
        this.content = content;
        Id++;
        Calendar cal = Calendar.getInstance();
        String hr = String.valueOf(cal.get(Calendar.HOUR_OF_DAY));
        String mn = String.valueOf(cal.get(Calendar.MINUTE));
        String Day = String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
        String MM = String.valueOf(cal.get(Calendar.MONTH));
        String yy = String.valueOf(cal.get(Calendar.YEAR));
        timeAndDate = hr + ": " + mn + " " + Day + "." + MM + "." + yy;



    }

    public static int getId() {
        return Id;
    }
}
