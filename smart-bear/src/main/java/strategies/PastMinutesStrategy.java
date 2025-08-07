package strategies;


import com.smart.bear.utils.BritishTimeUtil;

import java.time.LocalTime;

public class PastMinutesStrategy implements ITimeExpressionStrategy {
    private static final String[] numbers = BritishTimeUtil.NUMBERS;

    @Override
    public boolean matches(LocalTime time) {
        int minute = time.getMinute();
        return minute > 0 && minute < 30 && minute != 15;
    }

    @Override
    public String format(LocalTime time) {
        int minute = time.getMinute();
        return minute + " " + (minute == 1 ? "minute" : "minutes") + " past " + numbers[time.getHour()];
    }
}
