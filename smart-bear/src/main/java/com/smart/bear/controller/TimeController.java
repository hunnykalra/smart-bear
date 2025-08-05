package com.smart.bear.controller;

import com.smart.bear.service.BritishTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class TimeController {

    @Autowired
    private BritishTime britishTime;

    @GetMapping("/localTime/{country}")
    public String getLocalTime(@PathVariable String country, @RequestParam String time) {
        return britishTime.getLocalTime(time);
    }
}
