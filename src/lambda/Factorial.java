package lambda;

import java.util.stream.IntStream;

public class Factorial {
    public static int factorial(int n) {
        return IntStream.rangeClosed(1,n).reduce(1, (a, b) -> a * b);
    }
}
