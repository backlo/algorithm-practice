package programmers.a_1_level;

import java.util.Arrays;

public class Solution42862 {

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int index = 0; index < lost.length; index++) {
            for (int jIndex = 0; jIndex < reserve.length; jIndex++) {
                if (lost[index] == reserve[jIndex]) {
                    answer++;
                    lost[index] = Integer.MIN_VALUE;
                    reserve[jIndex] = Integer.MIN_VALUE;
                    break;
                }
            }
        }

        for (int lostPerson : lost) {
            for (int index = 0; index < reserve.length; index++) {
                if (reserve[index] == lostPerson + 1 || reserve[index] == lostPerson - 1) {
                    answer++;
                    reserve[index] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        System.out.println(solution(n, lost, reserve));

        int n2 = 5;
        int[] lost2 = {2, 4};
        int[] reserve2 = {3};
        System.out.println(solution(n2, lost2, reserve2));

        int n3 = 3;
        int[] lost3 = {3};
        int[] reserve3 = {1};
        System.out.println(solution(n3, lost3, reserve3));
    }
}
