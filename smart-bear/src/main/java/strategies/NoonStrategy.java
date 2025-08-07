package strategies;

import java.time.LocalTime;

public class NoonStrategy implements ITimeExpressionStrategy {
    @Override
    public boolean matches(LocalTime time) {
        return time.getHour() == 12 && time.getMinute() == 0;
    }

    @Override
    public String format(LocalTime time) {
        return "noon";
    }
}
