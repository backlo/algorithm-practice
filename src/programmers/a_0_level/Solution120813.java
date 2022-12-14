package programmers.a_0_level;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution120813 {
    public static int[] solution(int n) {
        return IntStream.rangeClosed(1, n)
                .filter(number -> number % 2 == 1)
                .toArray();
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(Arrays.toString(solution(n)));

        int n2 = 15;
        System.out.println(Arrays.toString(solution(n2)));
    }
}
