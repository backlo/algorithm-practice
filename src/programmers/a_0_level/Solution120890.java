package programmers.a_0_level;

import java.util.Arrays;

public class Solution120890 {

    public static int solution(int[] array, int n) {
        Arrays.sort(array);

        int minDistance = Integer.MAX_VALUE;
        int result = 0;

        for (int number : array) {
            if (minDistance > Math.abs(number - n)) {
                result = number;
                minDistance = Math.abs(number - n);
            }

        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {3, 10, 28};
        int n = 20;
        System.out.println(solution(array, n));

        int[] array2 = {10, 11, 12};
        int n2 = 13;
        System.out.println(solution(array2, n2));
    }
}
