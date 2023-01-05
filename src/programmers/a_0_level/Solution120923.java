package programmers.a_0_level;

import java.util.Arrays;

public class Solution120923 {

    public static int[] solution(int num, int total) {
        int[] answer = new int[num];

        for (int index = 1000; index >= -1000; index--) {
            int result = 0;
            for (int jIndex = 0; jIndex < num; jIndex++) {
                result += index - jIndex;
            }
            if (result == total) {
                for (int jIndex = 0; jIndex < num; jIndex++) {
                    answer[jIndex] = index - jIndex;
                }
            }
        }

        return Arrays.stream(answer)
                .sorted()
                .toArray();
    }

    public int[] solution2(int num, int total) {
        int[] answer = new int[num];

        int nSum = num * (1 + num) / 2;
        int start = (total - nSum) / num; // ?

        for (int i = 1; i < num + 1; i++) {
            answer[i - 1] = i + start;
        }

        return answer;

    }

    public static void main(String[] args) {
        int num = 3;
        int total = 12;
        System.out.println(Arrays.toString(solution(num, total)));

        int num2 = 5;
        int total2 = 15;
        System.out.println(Arrays.toString(solution(num2, total2)));

        int num3 = 4;
        int total3 = 14;
        System.out.println(Arrays.toString(solution(num3, total3)));

        int num4 = 5;
        int total4 = 5;
        System.out.println(Arrays.toString(solution(num4, total4)));
    }

}
