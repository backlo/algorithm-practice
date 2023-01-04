package programmers.a_0_level;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution120882 {

    public static int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        List<Integer> sortScoreAverages = Arrays.stream(score)
                .map(scoreList -> scoreList[0] + scoreList[1])
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        for (int index = 0; index < score.length; index++) {
            answer[index] = sortScoreAverages.indexOf(score[index][0] + score[index][1]) + 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
        System.out.println(Arrays.toString(solution(score)));

        int[][] score2 = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
        System.out.println(Arrays.toString(solution(score2)));
    }
}
