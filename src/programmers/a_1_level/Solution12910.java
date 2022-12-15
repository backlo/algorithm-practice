package programmers.a_1_level;

import java.util.Arrays;

public class Solution12910 {

    public static int[] solution(int[] arr, int divisor) {
        int[] results = Arrays.stream(arr)
                .filter(number -> number % divisor == 0)
                .sorted()
                .toArray();

        return results.length == 0 ? new int[]{-1} : results;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        System.out.println(Arrays.toString(solution(arr, divisor)));

        int[] arr2 = {2, 36, 1, 3};
        int divisor2 = 1;
        System.out.println(Arrays.toString(solution(arr2, divisor2)));

        int[] arr3 = {3, 2, 6};
        int divisor3 = 10;
        System.out.println(Arrays.toString(solution(arr3, divisor3)));
    }
}
