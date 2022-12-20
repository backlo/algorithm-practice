package programmers.a_0_level;

import java.util.Arrays;

public class Solution120906 {

    public static int solution(int n) {
        return Arrays.stream(String.valueOf(n).split(""))
                .mapToInt(Integer::parseInt)
                .sum();
    }

    public static void main(String[] args) {
        int n = 1234;
        System.out.println(solution(n));

        int n2 = 930211;
        System.out.println(solution(n2));
    }
}
