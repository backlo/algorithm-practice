package programmers.a_1_level;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution42840 {

    public static int[] solution(int[] answers) {
        int[] tester1 = {1, 2, 3, 4, 5};
        int[] tester2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] tester3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] answerCount = new int[3];
        for (int index = 0; index < answers.length; index++) {
            if (answers[index] == tester1[index % 5]) {
                answerCount[0]++;
            }
            if (answers[index] == tester2[index % 8]) {
                answerCount[1]++;
            }
            if (answers[index] == tester3[index % 10]) {
                answerCount[2]++;
            }
        }

        int maxAnswer = Math.max(answerCount[0], Math.max(answerCount[1], answerCount[2]));

        return IntStream.range(0, answerCount.length)
                .filter(index -> answerCount[index] == maxAnswer)
                .map(index -> index + 1)
                .toArray();
    }

    public static void main(String[] args) {
        int[] answers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(answers)));

        int[] answers2 = {1, 3, 2, 4, 2};
        System.out.println(Arrays.toString(solution(answers2)));
    }
}
