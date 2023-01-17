package programmers.a_1_level;

import java.util.Arrays;

public class Solution12982 {

    public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for (int num : d) {
            if (budget - num < 0) {
                return answer;
            }
            ++answer;
            budget -= num;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
        int budget = 9;
        System.out.println(solution(d, budget));

        int[] d2 = {2,2,3,3};
        int budget2 = 10;
        System.out.println(solution(d2, budget2));
    }
}
