package programmers.a_1_level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution150370 {

    public static int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answers = new ArrayList<>();
        int todayYear = Integer.parseInt(today.split("\\.")[0]);
        int todayMonth = Integer.parseInt(today.split("\\.")[1]);
        int todayDay = Integer.parseInt(today.split("\\.")[2]);

        for (String term : terms) {
            String[] termInfo = term.split(" ");
            String clause = termInfo[0];
            int validMonth = Integer.parseInt(termInfo[1]);

            for (int index = 0; index < privacies.length; index++) {
                String privacyDate = privacies[index].split(" ")[0];
                String privacyClause = privacies[index].split(" ")[1];

                if (privacyClause.equals(clause)) {
                    int privacyYear = Integer.parseInt(privacyDate.split("\\.")[0]);
                    int privacyMonth = Integer.parseInt(privacyDate.split("\\.")[1]) + validMonth;
                    int privacyDay = Integer.parseInt(privacyDate.split("\\.")[2]);

                    while (privacyMonth > 12) {
                        ++privacyYear;
                        privacyMonth -= 12;
                    }

                    if (todayYear > privacyYear) {
                        answers.add(index + 1);
                        continue;
                    }
                    if (todayYear == privacyYear && todayMonth > privacyMonth) {
                        answers.add(index + 1);
                        continue;
                    }
                    if (todayYear == privacyYear && todayMonth == privacyMonth && todayDay >= privacyDay) {
                        answers.add(index + 1);
                    }
                }
            }
        }

        return answers.stream()
                .mapToInt(Integer::intValue)
                .sorted()
                .toArray();
    }

    public static void main(String[] args) {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        System.out.println(Arrays.toString(solution(today, terms, privacies)));

        String today2 = "2020.01.01";
        String[] terms2 = {"Z 3", "D 5"};
        String[] privacies2 = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
        System.out.println(Arrays.toString(solution(today2, terms2, privacies2)));
    }
}
