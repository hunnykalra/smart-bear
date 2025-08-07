package strategies;

import com.smart.bear.utils.BritishTimeUtil;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.LocalTime;

public class QuarterPastStrategy implements ITimeExpressionStrategy {

    private static final String[] numbers = BritishTimeUtil.NUMBERS;

    @Override
    public boolean matches(LocalTime time) {
        return time.getMinute() == 45;
    }

    @Override
    public String format(LocalTime time) {
        return "quarter to " + numbers[time.getHour() + 1];
    }
}
