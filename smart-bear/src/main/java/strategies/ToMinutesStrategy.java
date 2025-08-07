package strategies;

import com.smart.bear.utils.BritishTimeUtil;

import java.time.LocalTime;

public class ToMinutesStrategy  implements ITimeExpressionStrategy {
    private static final String[] numbers = BritishTimeUtil.NUMBERS;

    @Override
    public boolean matches(LocalTime time) {
        int minute = time.getMinute();
        return minute > 30 && minute < 60 && minute != 45;
    }

    @Override
    public String format(LocalTime time) {
        int minutesTo = 60 - time.getMinute();
        return minutesTo + " " + (minutesTo == 1 ? "minute" : "minutes") + " to " + numbers[time.getHour() + 1];
    }
}
