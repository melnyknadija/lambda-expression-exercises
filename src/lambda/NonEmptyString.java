package lambda;

import java.util.List;

public class NonEmptyString {
    public static String nonEmptyString(List<String> str){
        return str.stream().filter(s -> !s.isEmpty()).findFirst().orElse(null);
    }
}