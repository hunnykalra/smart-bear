package strategies;

import com.smart.bear.utils.BritishTimeUtil;

import java.time.LocalTime;

public class OClockStrategy implements ITimeExpressionStrategy{

    private static final String[] numbers = BritishTimeUtil.NUMBERS;

    @Override
    public boolean matches(LocalTime time) {
        return time.getMinute() == 0 && !(time.getHour() == 0 || time.getHour() == 12);
    }

    @Override
    public String format(LocalTime time) {
        return numbers[time.getHour()] + " o'clock";
    }
}
