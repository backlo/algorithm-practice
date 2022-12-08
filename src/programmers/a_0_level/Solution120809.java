package programmers.a_0_level;

import java.util.Arrays;

public class Solution120809 {

    public static int[] solution(int[] numbers) {
        return Arrays.stream(numbers)
                .map(number -> number * 2)
                .toArray();
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(numbers)));

        int[] numbers2 = {1, 2, 100, -99, 1, 2, 3};
        System.out.println(Arrays.toString(solution(numbers2)));
    }
}
