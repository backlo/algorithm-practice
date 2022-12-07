package programmers;

import java.util.Arrays;

public class Solution42842 {

    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int totalBlock = brown + yellow;

        for (int i = 1; i <= totalBlock / 2 + 1; i++) {
            if ((totalBlock % i == 0) && ((i + totalBlock / i) * 2 - 4) == brown) {
                answer[0] = i;
                answer[1] = totalBlock / i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution42842 solution = new Solution42842();

        System.out.println(Arrays.toString(solution.solution(8, 1)));

    }
}
