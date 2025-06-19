package lambda;

import java.util.List;

public class SumOfAllEvenNumbers {
    public static int sumOfAllEvenNumbers(List<Integer> numbers) {
        return numbers.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
    }
}
