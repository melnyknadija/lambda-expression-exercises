package lambda;

import java.util.List;
import java.util.stream.Collectors;

public class FilterOddNumbers {
    public static List<Integer> filterOddNumbers (List<Integer> numbers) {
        return numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
    }
}
