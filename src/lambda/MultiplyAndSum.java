package lambda;

import java.util.List;

public class MultiplyAndSum {
    public static int[] multiplyAndSum(List<Integer> numbers) {
        int multiply = numbers.stream().reduce(1, (a, b) -> a * b );
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        return new int[]{multiply, sum}; 
    }
}
