package strategies;

import java.time.LocalTime;

public interface ITimeExpressionStrategy {

    boolean matches(LocalTime time);

    String format(LocalTime time);
}
