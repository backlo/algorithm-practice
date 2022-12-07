package programmers.a_1_level;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution86051 {

    public static int solution(int[] numbers) {
        return IntStream.range(0, 9)
                .filter(index ->
                        Arrays.stream(numbers)
                                .noneMatch(num -> index == num)
                )
                .sum();
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
        System.out.println(solution(numbers));

        int[] numbers2 = {5, 8, 4, 0, 6, 7, 9};
        System.out.println(solution(numbers2));
    }
}
