package com.smart.bear.utils;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateUtis {

    public static LocalTime getLocalTime(String input){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm");
        try {
            return LocalTime.parse(input, formatter);
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid time format: " + input, e);
        }
    }



}
