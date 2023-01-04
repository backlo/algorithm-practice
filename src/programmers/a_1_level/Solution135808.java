package programmers.a_1_level;

import java.util.*;

public class Solution135808 {

    public static int solution(int k, int m, int[] score) {
        int[] sortScores = Arrays.stream(score).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
        Map<AppleBox, Integer> appleBoxes = new HashMap<>();

        for (int index = 0; index < sortScores.length; index += m) {
            int[] scoreSplit = new int[m];
            for (int jIndex = 0; jIndex < scoreSplit.length; jIndex++) {
                if (index + jIndex == sortScores.length) {
                    break;
                }
                scoreSplit[jIndex] = sortScores[index + jIndex];
            }

            AppleBox appleBox = new AppleBox(m, scoreSplit);
            appleBoxes.put(appleBox, appleBoxes.getOrDefault(appleBox, 0) + 1);
        }

        return appleBoxes.entrySet().stream()
                .mapToInt(appleBoxIntegerEntry -> appleBoxIntegerEntry.getKey().price * appleBoxIntegerEntry.getValue())
                .sum();
    }

    private static class AppleBox {
        private final int[] score;
        private final int price;

        public AppleBox(int m, int... score) {
            this.score = score;
            this.price = Arrays.stream(score)
                    .min()
                    .orElse(0) * m;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof AppleBox)) return false;
            AppleBox appleBox = (AppleBox) o;
            return price == appleBox.price;
        }

        @Override
        public int hashCode() {
            return Objects.hash(price);
        }
    }

    public int solution2(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);

        for(int index = score.length; index >= m; index -= m){
            answer += score[index - m] * m;
        }

        return answer;
    }

    public static void main(String[] args) {
        int k = 3;
        int m = 4;
        int[] score = {1, 2, 3, 1, 2, 3, 1};
        System.out.println(solution(k, m, score));

        int k2 = 4;
        int m2 = 3;
        int[] score2 = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        System.out.println(solution(k2, m2, score2));
    }
}
