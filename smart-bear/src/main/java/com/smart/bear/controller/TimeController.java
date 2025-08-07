package com.smart.bear.controller;

import com.smart.bear.service.BritishTimeFormatter;
import com.smart.bear.utils.DateUtis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController()
public class TimeController {

    @Autowired
    private BritishTimeFormatter britishTimeFormatter;

    @GetMapping("/localTime/{country}")
    public String getLocalTime(@PathVariable String country, @RequestParam String time) {
        LocalTime localTime = DateUtis.getLocalTime(time);
        return britishTimeFormatter.format(localTime);
    }
}
