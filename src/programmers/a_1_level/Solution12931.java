package programmers.a_1_level;

import java.util.Arrays;

public class Solution12931 {

    public static int solution(int n) {
        return Arrays.stream(String.valueOf(n).split(""))
                .mapToInt(Integer::valueOf)
                .sum();
    }

    public static void main(String[] args) {
        int n = 123;
        System.out.println(solution(n));

        int n2 = 987;
        System.out.println(solution(n2));
    }
}
