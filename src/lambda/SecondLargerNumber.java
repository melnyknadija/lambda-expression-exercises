package lambda;

import java.util.List;

public class SecondLargerNumber {
    public static Integer secondLarger(List<Integer> num) {
        if (num == null || num.size() < 2) {
            return null;
        }
        return num.stream().distinct().sorted((a, b) -> b - a).skip(1).findFirst().orElse(null);
    }
}