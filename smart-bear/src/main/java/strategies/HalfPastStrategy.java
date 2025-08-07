package strategies;

import com.smart.bear.utils.BritishTimeUtil;

import java.time.LocalTime;

public class HalfPastStrategy implements ITimeExpressionStrategy{

    private static final String[] numbers = BritishTimeUtil.NUMBERS;

    @Override
    public boolean matches(LocalTime time) {
        return time.getMinute() == 30;
    }

    @Override
    public String format(LocalTime time) {
        return "half past " + numbers[time.getHour()];
    }
}
