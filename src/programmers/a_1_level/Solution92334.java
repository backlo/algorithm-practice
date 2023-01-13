package programmers.a_1_level;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution92334 {

    public static int[] solution(String[] id_list, String[] report, int k) {
        List<String> reportContents = Arrays.stream(report)
                .distinct()
                .collect(Collectors.toList());
        Map<String, Integer> targetCount = new HashMap<>();

        for (String reportContent : reportContents) {
            String target = reportContent.split(" ")[1];
            targetCount.put(target, targetCount.getOrDefault(target, 0) + 1);
        }

        return Arrays.stream(id_list)
                .map(id -> {
                    List<String> reportList = reportContents.stream()
                            .filter(s -> s.startsWith(id + " "))
                            .collect(Collectors.toList());
                    return reportList.stream()
                            .filter(s -> targetCount.getOrDefault(s.split(" ")[1], 0) >= k)
                            .count();
                })
                .mapToInt(Long::intValue)
                .toArray();
    }

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        System.out.println(Arrays.toString(solution(id_list, report, k)));

        String[] id_list2 = {"con", "ryan"};
        String[] report2 = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k2 = 3;
        System.out.println(Arrays.toString(solution(id_list2, report2, k2)));
    }
}
