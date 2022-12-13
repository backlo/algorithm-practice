package programmers.a_1_level;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution12954 {

    public static long[] solution(int x, int n) {
        return IntStream.rangeClosed(1, n)
                .mapToLong(i -> (long) x * i)
                .toArray();
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(Arrays.toString(solution(x, n)));

        int x2 = 4;
        int n2 = 3;
        System.out.println(Arrays.toString(solution(x2, n2)));

        int x3 = -4;
        int n3 = 2;
        System.out.println(Arrays.toString(solution(x3, n3)));
    }
}
