package programmers.a_2_level;

import java.util.Arrays;

public class Solution12939 {

    public static String solution(String s) {
        int min = Arrays.stream(s.split(" "))
                .mapToInt(Integer::parseInt)
                .min()
                .orElse(0);
        int max = Arrays.stream(s.split(" "))
                .mapToInt(Integer::parseInt)
                .max()
                .orElse(0);

        return min + " " + max;
    }

    public static void main(String[] args) {
        String s = "1 2 3 4";
        System.out.println(solution(s));

        String s2 = "-1 -2 -3 -4";
        System.out.println(solution(s2));

        String s3 = "-1 -1";
        System.out.println(solution(s3));
    }
}
