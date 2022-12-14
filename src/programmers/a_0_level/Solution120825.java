package programmers.a_0_level;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution120825 {

    public static String solution(String my_string, int n) {
        return Arrays.stream(my_string.split(""))
                .map(ch -> ch.repeat(n))
                .collect(Collectors.joining(""));
    }

    public static void main(String[] args) {
        String my_string = "hello";
        int n = 3;

        System.out.println(solution(my_string, n));
    }
}
