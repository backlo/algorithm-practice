package programmers.a_0_level;

import java.util.Arrays;

public class Solution120862 {

    public static int solution(int[] numbers) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    continue;
                }
                max = Math.max(numbers[i] * numbers[j], max);
            }
        }

        return max;
    }

    public static int solution2(int[] numbers) {
        numbers = Arrays.stream(numbers).sorted()
                .toArray();

        return Math.max(numbers[0] * numbers[1], numbers[numbers.length - 1] * numbers[numbers.length - 2]);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, -3, 4, -5};
        System.out.println(solution(numbers));

        int[] numbers2 = {0, -31, 24, 10, 1, 9};
        System.out.println(solution(numbers2));

        int[] numbers3 = {10, 20, 30, 5, 5, 20, 5};
        System.out.println(solution(numbers3));

    }
}
