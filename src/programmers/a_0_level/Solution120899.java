package programmers.a_0_level;

import java.util.Arrays;

public class Solution120899 {

    public static int[] solution(int[] array) {
        int maxIndex = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

        for (int index = 0; index < array.length; index++) {
            if (max < array[index]) {
                maxIndex = index;
                max = array[index];
            }
        }

        return new int[]{max, maxIndex};
    }

    public static void main(String[] args) {
        int[] array = {1, 8, 3};
        System.out.println(Arrays.toString(solution(array)));

        int[] array2 = {9, 10, 11, 8};
        System.out.println(Arrays.toString(solution(array2)));
    }
}
