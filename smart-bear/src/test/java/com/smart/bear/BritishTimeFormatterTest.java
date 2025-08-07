package com.smart.bear;

import com.smart.bear.service.BritishTimeFormatter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class BritishTimeFormatterTest {
    private BritishTimeFormatter formatter;

    @BeforeEach
    void setUp() {
        formatter = new BritishTimeFormatter();
    }

    @Test
    void testMidnight() {
        String result = formatter.format(LocalTime.MIDNIGHT);
        assertEquals("midnight", result.toLowerCase()); // Adjust expected as per actual output
    }

    @Test
    void testNoon() {
        String result = formatter.format(LocalTime.NOON);
        assertEquals("noon", result.toLowerCase()); // Adjust expected as per actual output
    }

    @Test
    void testOClock() {
        String result = formatter.format(LocalTime.of(3, 0));
        assertTrue(result.toLowerCase().contains("o'clock"));
    }

    @Test
    void testQuarterPast() {
        String result = formatter.format(LocalTime.of(4, 15));
        assertTrue(result.toLowerCase().contains("quarter past"));
    }

    @Test
    void testHalfPast() {
        String result = formatter.format(LocalTime.of(5, 30));
        assertTrue(result.toLowerCase().contains("half past"));
    }

    @Test
    void testQuarterTo() {
        String result = formatter.format(LocalTime.of(6, 45));
        assertTrue(result.toLowerCase().contains("quarter to"));
    }

    @Test
    void testPastMinutes() {
        String result = formatter.format(LocalTime.of(7, 10));
        assertTrue(result.toLowerCase().contains("past"));
    }

    @Test
    void testToMinutes() {
        String result = formatter.format(LocalTime.of(8, 50));
        assertTrue(result.toLowerCase().contains("to"));
    }
}