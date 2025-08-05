package com.smart.bear.utils;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateUtis {

    public static LocalTime getLocalTime(String input){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm");
        LocalTime time = LocalTime.parse(input, formatter);
        return time;
    }



}
