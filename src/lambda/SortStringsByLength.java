package lambda;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringsByLength {
    public static List<String> sortStringByLength(List<String> str){
        return str.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
    }
}
