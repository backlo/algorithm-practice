package programmers.a_0_level;

import java.util.Arrays;

public class Solution120905 {

    public static int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist)
                .filter(num -> num % n == 0)
                .toArray();
    }

    public static void main(String[] args) {
        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(Arrays.toString(solution(n, numlist)));

        int n2 = 5;
        int[] numlist2 = {1, 9, 3, 10, 13, 5};
        System.out.println(Arrays.toString(solution(n2, numlist2)));

        int n3 = 12;
        int[] numlist3 = {2, 100, 120, 600, 12, 12};
        System.out.println(Arrays.toString(solution(n3, numlist3)));
    }
}
