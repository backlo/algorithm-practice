package programmers.a_2_level;

import java.util.Arrays;

public class Solution87390 {

    public static int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right - left) + 1];

        for (int index = 0; index < answer.length; index++) {
            int row = (int) ((index + left) / n) + 1;
            int col = (int) ((index + left) % n) + 1;
            answer[index] = Math.max(row, col);
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 3;
        long left = 2;
        long right = 5;
        System.out.println(Arrays.toString(solution(n, left, right)));

        int n2 = 4;
        long left2 = 7;
        long right2 = 14;
        System.out.println(Arrays.toString(solution(n2, left2, right2)));

    }
}
