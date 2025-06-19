package lambda;

import java.util.List;

public class AvgValue {
    public static double AvgValue(List<Double> numbers) {
        return numbers.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }
}
