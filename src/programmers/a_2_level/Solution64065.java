package programmers.a_2_level;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution64065 {

    public static int[] solution(String s) {
        Map<String, Integer> answers = new HashMap<>();

        String[] sSplit = s.replaceAll("[{]", "")
                .replaceAll("[}]", "")
                .trim()
                .split(",");

        for (String number : sSplit) {
            answers.put(number, answers.getOrDefault(number, 0) + 1);
        }

        return answers.entrySet().stream()
                .sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue()))
                .mapToInt(entry -> Integer.parseInt(entry.getKey()))
                .toArray();
    }

    public static void main(String[] args) {
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        System.out.println(Arrays.toString(solution(s)));

        String s2 = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
        System.out.println(Arrays.toString(solution(s2)));

        String s3 = "{{20,111},{111}}";
        System.out.println(Arrays.toString(solution(s3)));

        String s4 = "{{123}}";
        System.out.println(Arrays.toString(solution(s4)));

        String s5 = "{{4,2,3},{3},{2,3,4,1},{2,3}}";
        System.out.println(Arrays.toString(solution(s5)));
    }
}
