package programmers.a_0_level;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution120911 {

    public static String solution(String my_string) {
        return Arrays.stream(my_string.split(""))
                .map(String::toLowerCase)
                .sorted()
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String my_string = "Bcad";
        System.out.println(solution(my_string));

        String my_string2 = "heLLo";
        System.out.println(solution(my_string2));

        String my_string3 = "Python";
        System.out.println(solution(my_string3));
    }
}
