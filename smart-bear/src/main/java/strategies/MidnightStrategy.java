package strategies;

import java.time.LocalTime;

public class MidnightStrategy implements ITimeExpressionStrategy {
    @Override
    public boolean matches(LocalTime time) {
        return time.getHour() == 0 && time.getMinute() == 0;
    }

    @Override
    public String format(LocalTime time) {
        return "midnight";
    }
}