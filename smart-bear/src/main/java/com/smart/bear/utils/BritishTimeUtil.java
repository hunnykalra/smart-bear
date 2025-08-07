package com.smart.bear.utils;


public class BritishTimeUtil {

    public static final String[] NUMBERS = {
            "twelve", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten", "eleven",
            "twelve", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten", "eleven"
    };

    public static String numberToWord(int hour) {
        return NUMBERS[hour];
    }

    public static String minuteToWord(int minute) {
        String[] words = {
                "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
                "seventeen", "eighteen", "nineteen", "twenty", "twenty one", "twenty two",
                "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven",
                "twenty eight", "twenty nine"
        };
        return words[minute];
    }
}
