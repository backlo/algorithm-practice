package programmers.a_1_level;

import java.util.*;
import java.util.stream.Collectors;

public class Solution42889 {

    public static int[] solution(int N, int[] stages) {
        Map<Integer, Double> results = new HashMap<>();
        List<Integer> stageList = Arrays.stream(stages)
                .boxed()
                .collect(Collectors.toList());

        for (int stage = 1; stage <= N; stage++) {
            double stageFailCount = 0;
            for (int index = 0; index < stageList.size(); index++) {
                if (stageList.get(index) <= stage) {
                    ++stageFailCount;
                    stageList.set(index, -1);
                }
            }

            results.put(stage, stageFailCount / stageList.size());

            stageList.removeIf(stageValue -> stageValue == -1);
        }

        return results.entrySet().stream()
                .sorted((o1, o2) -> {
                    if (o1.getValue() < o2.getValue()) return 1;
                    if (o1.getValue() > o2.getValue()) return -1;
                    return o1.getKey() > o2.getKey() ? 1 : -1;
                })
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }

    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        System.out.println(Arrays.toString(solution(N, stages)));

        int N2 = 4;
        int[] stages2 = {4, 4, 4, 4, 4};
        System.out.println(Arrays.toString(solution(N2, stages2)));
    }
}
