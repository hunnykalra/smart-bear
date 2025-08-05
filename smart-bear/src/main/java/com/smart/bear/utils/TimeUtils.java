package com.smart.bear.utils;

import java.util.Optional;

public class TimeUtils {
    public static boolean isNoon(String s) {
        return "12:00".equals(Optional.ofNullable(s).map(String::trim).orElse(""));
    }
}
