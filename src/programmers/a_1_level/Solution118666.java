package programmers.a_1_level;

import java.util.HashMap;
import java.util.Map;

public class Solution118666 {

    public static String solution(String[] survey, int[] choices) {
        Map<String, Integer> testResults = new HashMap<>();
        testResults.put("A", 0);
        testResults.put("N", 0);
        testResults.put("C", 0);
        testResults.put("F", 0);
        testResults.put("M", 0);
        testResults.put("J", 0);
        testResults.put("R", 0);
        testResults.put("T", 0);

        StringBuilder results = new StringBuilder();

        for (int index = 0; index < survey.length; index++) {
            String[] type = survey[index].split("");
            int choice = choices[index];
            if (choice > 4) {
                testResults.put(type[1], testResults.get(type[1]) + choice - 4);
                continue;
            }
            if (choice < 4) {
                testResults.put(type[0], testResults.get(type[0]) + 4 - choice);
            }
        }

        if (testResults.get("R") >= testResults.get("T")) {
            results.append("R");
        } else {
            results.append("T");
        }

        if (testResults.get("C") >= testResults.get("F")) {
            results.append("C");
        } else {
            results.append("F");
        }

        if (testResults.get("J") >= testResults.get("M")) {
            results.append("J");
        } else {
            results.append("M");
        }

        if (testResults.get("A") >= testResults.get("N")) {
            results.append("A");
        } else {
            results.append("N");
        }

        return results.toString();
    }

    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        System.out.println(solution(survey, choices));

        String[] survey2 = {"TR", "RT", "TR"};
        int[] choices2 = {7, 1, 3};
        System.out.println(solution(survey2, choices2));
    }
}
