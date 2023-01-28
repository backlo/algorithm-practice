package programmers.a_1_level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution17682 {

    public static int solution(String dartResult) {
        List<String> dartScores = Arrays.stream(dartResult.split("[SDT*#]"))
                .filter(value -> !value.isEmpty())
                .collect(Collectors.toList());
        List<String> dartBonusOptions = Arrays.stream(dartResult.split("[0-9]"))
                .filter(value -> !value.isEmpty())
                .collect(Collectors.toList());
        List<Integer> scores = new ArrayList<>();

        for (int index = 0; index < dartBonusOptions.size(); index++) {
            int score = Integer.parseInt(dartScores.get(index));
            String[] bonusOptions = dartBonusOptions.get(index).split("");
            scores.add(calculateBonus(score, bonusOptions[0]));
            if (bonusOptions.length == 2) {
                calculateOption(scores, bonusOptions[1], index);
            }
        }

        return scores.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    private static int calculateBonus(int score, String bonus) {
        if (bonus.equals("S")) {
            return score;
        }
        if (bonus.equals("D")) {
            return score * score;
        }
        return score * score * score;
    }

    private static void calculateOption(List<Integer> scores, String option, int index) {
        if (option.equals("*") && index == 0) {
            scores.set(index, scores.get(index) * 2);
            return;
        }

        if (option.equals("*")) {
            scores.set(index - 1, scores.get(index - 1) * 2);
            scores.set(index, scores.get(index) * 2);
            return;
        }

        scores.set(index, scores.get(index) * -1);
    }

    public static void main(String[] args) {
        String dartResult = "1S2D*3T";
        System.out.println(solution(dartResult));

        String dartResult2 = "1D2S#10S";
        System.out.println(solution(dartResult2));

        String dartResult3 = "1D2S0T";
        System.out.println(solution(dartResult3));

        String dartResult4 = "1S*2T*3S";
        System.out.println(solution(dartResult4));

        String dartResult5 = "1D#2S*3S";
        System.out.println(solution(dartResult5));

        String dartResult6 = "1T2D3D#";
        System.out.println(solution(dartResult6));

        String dartResult7 = "1D2S3T*";
        System.out.println(solution(dartResult7));
    }
}
