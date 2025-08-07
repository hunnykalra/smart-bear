package com.smart.bear.service;

import org.springframework.stereotype.Service;
import strategies.*;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

@Service
public class BritishTimeFormatter {

    private final List<ITimeExpressionStrategy> strategies;

    public BritishTimeFormatter() {
        this.strategies = Arrays.asList(
                new MidnightStrategy(),
                new NoonStrategy(),
                new OClockStrategy(),
                new QuarterPastStrategy(),
                new HalfPastStrategy(),
                new QuarterToStrategy(),
                new PastMinutesStrategy(),
                new ToMinutesStrategy()
        );
    }

    public String format(LocalTime time) {
        return strategies.stream()
                .filter(s -> s.matches(time))
                .findFirst()
                .map(s -> s.format(time))
                .orElseThrow(() -> new IllegalArgumentException("No strategy found"));
    }
}
