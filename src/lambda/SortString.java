package lambda;

import java.util.List;
import java.util.stream.Collectors;

public class SortString {
    public static List<String> sortString(List<String> str) {
        return str.stream().sorted().collect(Collectors.toList());
    }
}
