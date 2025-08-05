package com.smart.bear.service;

import com.smart.bear.pojo.MinutesPojo;
import com.smart.bear.utils.DateUtis;
import com.smart.bear.utils.NumberUtils;
import com.smart.bear.utils.TimeUtils;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Service
public class BritishTime implements ICountryTime {

    public String getLocalTime(String input){
         if (TimeUtils.isNoon(input)) {
            return "noon";
        }
        LocalTime time = DateUtis.getLocalTime(input);
        MinutesService minutesService = new MinutesService();
        MinutesPojo minutesPojo = minutesService.getMinutes(time.getMinute());
        return getTimeFormat(minutesPojo, time);
    }

    private String getTimeFormat(MinutesPojo minutesPojo, LocalTime time) {
        if(minutesPojo.isPrefix()){
            return minutesPojo.getValue() +" "+ NumberUtils.getNumberValue(time.getHour()+1);
        }else {
            return NumberUtils.getNumberValue(time.getHour())+" "+minutesPojo.getValue();

        }
    }

}
