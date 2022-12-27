package programmers.a_0_level;

import java.util.Arrays;

public class Solution120842 {

    public static int[][] solution(int[] num_list, int n) {
        int[][] result = new int[num_list.length / n][n];

        for (int index = 0; index < num_list.length; index++) {
            result[index / n][index % n] = num_list[index];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 2;
        System.out.println(Arrays.deepToString(solution(num_list, n)));

        int[] num_list2 = {100, 95, 2, 4, 5, 6, 18, 33, 948};
        int n2 = 3;
        System.out.println(Arrays.deepToString(solution(num_list2, n2)));


    }
}
