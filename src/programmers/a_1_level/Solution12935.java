package programmers.a_1_level;

import java.util.Arrays;

public class Solution12935 {

    public static int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        int minNumber = Arrays.stream(arr)
                .min()
                .orElse(Integer.MIN_VALUE);

        return Arrays.stream(arr)
                .filter(number -> number != minNumber)
                .toArray();
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        System.out.println(Arrays.toString(solution(arr)));

        int[] arr2 = {10};
        System.out.println(Arrays.toString(solution(arr2)));
    }
}
