package programmers.a_1_level;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Solution12912 {

    public static long solution(int a, int b) {
        return (a <= b) ?
                LongStream.rangeClosed(a, b)
                        .sum() :
                LongStream.rangeClosed(b, a)
                        .sum();
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println(solution(a, b));

        int a2 = 3;
        int b2 = 3;
        System.out.println(solution(a2, b2));

        int a3 = 5;
        int b3 = 3;
        System.out.println(solution(a3, b3));
    }
}
