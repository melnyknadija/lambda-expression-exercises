package lambda;

import java.util.List;

public class LargestEvenNumber {
    public static int largestEvenNumber(List<Integer> numbers) {
        return numbers.stream().filter(n -> n % 2 == 0).max(Integer::compareTo).orElse(null);
    }
}
