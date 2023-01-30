package programmers.a_2_level;

import java.util.Arrays;

public class Solution42842 {

    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int totalBlock = brown + yellow;

        for (int index = 3; index <= Math.sqrt(totalBlock); index++) {
            if (totalBlock % index != 0) {
                continue;
            }

            answer[0] = totalBlock / index;
            answer[1] = index;

            if (answer[0] * 2 + answer[1] * 2 - 4 == brown &&
                    (answer[0] - 2) * (answer[1] - 2) == yellow) {
                break;
            }
        }

        return answer;
    }

    public static int[] solution2(int brown, int yellow) {
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
        int brown = 10;
        int yellow = 2;
        System.out.println(Arrays.toString(solution(brown, yellow)));

        int brown2 = 8;
        int yellow2 = 1;
        System.out.println(Arrays.toString(solution(brown2, yellow2)));

        int brown3 = 24;
        int yellow3 = 24;
        System.out.println(Arrays.toString(solution(brown3, yellow3)));

    }
}
