package programmers.a_2_level;

import java.util.Arrays;

public class Solution12949 {

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int index = 0; index < arr1.length; index++) {
            for (int jIndex = 0; jIndex < arr2[0].length; jIndex++) {
                for (int kIndex = 0; kIndex < arr1[0].length; kIndex++) {
                    answer[index][jIndex] += arr1[index][kIndex] * arr2[kIndex][jIndex];
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};
        System.out.println(Arrays.deepToString(solution(arr1, arr2)));

        int[][] arr3 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
        int[][] arr4 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};
        System.out.println(Arrays.deepToString(solution(arr3, arr4)));
    }
}
