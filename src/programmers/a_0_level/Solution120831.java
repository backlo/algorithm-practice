package programmers.a_0_level;

import java.util.stream.IntStream;

public class Solution120831 {

    public static int solution(int n) {
        return IntStream.rangeClosed(1, n)
                .filter(number -> number % 2 == 0)
                .sum();
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));

        int n2 = 4;
        System.out.println(solution(n2));
    }
}
