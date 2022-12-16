package programmers.a_0_level;

import java.util.Arrays;

public class Solution120811 {

    public static int solution(int[] array) {
        int[] results = Arrays.stream(array)
                .sorted()
                .toArray();

        return results[results.length / 2];
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 7, 10, 11};
        System.out.println(solution(array));

        int[] array2 = {9, -1, 0};
        System.out.println(solution(array2));
    }
}
