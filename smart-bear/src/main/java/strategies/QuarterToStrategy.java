package strategies;

import com.smart.bear.utils.BritishTimeUtil;

import java.time.LocalTime;

public class QuarterToStrategy implements ITimeExpressionStrategy{
    private static final String[] numbers = BritishTimeUtil.NUMBERS;

    @Override
    public boolean matches(LocalTime time) {
        return time.getMinute() == 15;
    }

    @Override
    public String format(LocalTime time) {
        return "quarter past " + numbers[time.getHour()];
    }
}
