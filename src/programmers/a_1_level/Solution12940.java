package programmers.a_1_level;

import java.util.Arrays;

public class Solution12940 {

    public static int[] solution(int n, int m) {
        int[] results = new int[2];

        for (int index = Math.max(n, m); index >= 1; index--) {
            if (n % index == 0 && m % index == 0) {
                results[0] = index;
                results[1] = n * m / results[0];
                break;
            }
        }

        return results;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 12;
        System.out.println(Arrays.toString(solution(n, m)));

        int n2 = 2;
        int m2 = 5;
        System.out.println(Arrays.toString(solution(n2, m2)));
    }
}
