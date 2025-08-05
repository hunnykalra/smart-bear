package com.smart.bear.service;

import com.smart.bear.pojo.MinutesPojo;
import com.smart.bear.utils.NumberUtils;

public class MinutesService {

    public MinutesPojo getMinutes(int minutes) {
        MinutesPojo pojo = new MinutesPojo();
        pojo.setMinutes(minutes);
        String res = getMintueString(minutes);
        switch (res){
            case "past":
                  pojo.setValue(res+" "+NumberUtils.getNumberValue(minutes));
                  pojo.setPrefix(false);
                 break;
            case "to":
                pojo.setValue(NumberUtils.getNumberValue(60-minutes)+" "+res);
                pojo.setPrefix(true);
                break;
            default:
                pojo.setValue(res);
        }
        return pojo;
    }

    public  String getMintueString(int minutes) {
        return switch (minutes) {
            case 30 -> "half past";
            case 15 -> "quarter past";
            case 0  -> "o'clock";
            case 45 -> "quarter to";
            default -> {
                if (minutes >= 1 && minutes < 35) {
                    yield "past";
                } else if (minutes >= 35 && minutes <= 60) {
                    yield "to";
                }
                throw new IllegalArgumentException("Minutes are not supported: " + minutes);
            }
        };
    }

}
