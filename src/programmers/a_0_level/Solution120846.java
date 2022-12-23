package programmers.a_0_level;

import java.util.stream.IntStream;

public class Solution120846 {

    public static int solution(int n) {
        return (int) IntStream.rangeClosed(1, n)
                .filter(value ->
                        (int) IntStream.rangeClosed(1, value)
                                .filter(value2 -> value % value2 == 0)
                                .count() > 2
                )
                .count();
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));

        int n2 = 15;
        System.out.println(solution(n2));
    }
}
