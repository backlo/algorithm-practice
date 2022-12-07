package programmers.a_1_level;

import java.util.Arrays;

public class Solution12944 {

    public static double solution(int[] arr) {
        return Arrays.stream(arr)
                .average()
                .orElse(0);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(solution(arr));

        int[] arr2 = {5,5};
        System.out.println(solution(arr2));
    }
}
