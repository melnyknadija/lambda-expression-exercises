package lambda;

import java.util.Arrays;

public class CountWords {
    public static long countWords(String str) {
        return Arrays.stream(str.split("\\s+")).filter(w -> !w.isEmpty()).count();
    }
}
