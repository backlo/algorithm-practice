package programmers.a_1_level;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Solution12917 {

    public static String solution(String s) {
        return Arrays.stream(s.split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String s = "Zbcdefg";
        System.out.println(solution(s));
    }
}
