package programmers.a_1_level;

import java.util.Arrays;

public class Solution12950 {

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        for (int iIndex = 0; iIndex < arr1.length; iIndex++) {
            for (int jIndex = 0; jIndex < arr1[iIndex].length; jIndex++) {
                arr1[iIndex][jIndex] = arr1[iIndex][jIndex] + arr2[iIndex][jIndex];
            }
        }

        return arr1;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};
        System.out.println(Arrays.deepToString(solution(arr1, arr2)));

        int[][] arr3 = {{1}, {2}};
        int[][] arr4 = {{3}, {4}};
        System.out.println(Arrays.deepToString(solution(arr3, arr4)));
    }
}
