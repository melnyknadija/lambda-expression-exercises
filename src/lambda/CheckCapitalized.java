package lambda;

import java.util.List;

public class CheckCapitalized {
    public static boolean CheckCapitalized(List<String> str) {
        return str.stream().allMatch(s -> !s.isEmpty() && Character.isUpperCase(s.charAt(0)));
    }
}
