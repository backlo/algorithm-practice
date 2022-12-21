package programmers.a_0_level;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution120897 {

    public static int[] solution(int n) {
        return IntStream.rangeClosed(1, n)
                .filter(number -> n % number == 0)
                .sorted()
                .toArray();
    }

    public static void main(String[] args) {
        int n = 24;
        System.out.println(Arrays.toString(solution(n)));

        int n2 = 29;
        System.out.println(Arrays.toString(solution(n2)));
    }

}
