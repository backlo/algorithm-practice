package programmers.a_0_level;

import java.util.Arrays;

public class Solution120583 {

    public static int solution(int[] array, int n) {
        return (int) Arrays.stream(array)
                .filter(number -> number == n)
                .count();
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 4, 5};
        int n = 1;
        System.out.println(solution(array, n));

        int[] array2 = {0, 2, 3, 4};
        int n2 = 1;
        System.out.println(solution(array2, n2));
    }
}
