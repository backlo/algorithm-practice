package programmers.a_0_level;

import java.util.stream.IntStream;

public class Solution120836 {

    public static int solution(int n) {
        return (int) IntStream.rangeClosed(1, n)
                .filter(index -> n % index == 0)
                .count();
    }

    public static void main(String[] args) {
        int n = 20;
        System.out.println(solution(n));

        int n2 = 100;
        System.out.println(solution(n2));
    }
}
