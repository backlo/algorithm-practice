package programmers.a_2_level;

import java.util.*;
import java.util.stream.Collectors;

public class Solution138476 {

    public static int solution(int k, int[] tangerine) {
        Map<Integer, Integer> mandarins = new HashMap<>();

        for (int weight : tangerine) {
            mandarins.put(weight, mandarins.getOrDefault(weight, 0) + 1);
        }

        Map<Integer, Integer> sortMandarins = mandarins.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(
                        Collectors.toMap(
                                Map.Entry::getKey, Map.Entry::getValue,
                                (oldValue, newValue) -> oldValue, LinkedHashMap::new)
                );

        int answer = 0;
        int sum = 0;

        for (Map.Entry<Integer, Integer> entry : sortMandarins.entrySet()) {
            ++answer;
            sum += entry.getValue();
            if (sum >= k)
                break;
        }
        return answer;
    }

    public static void main(String[] args) {
        int k = 6;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
        System.out.println(solution(k, tangerine));

        int k2 = 4;
        int[] tangerine2 = {1, 3, 2, 5, 4, 5, 2, 3};
        System.out.println(solution(k2, tangerine2));

        int k3 = 2;
        int[] tangerine3 = {1, 1, 1, 1, 2, 2, 2, 3};
        System.out.println(solution(k3, tangerine3));
    }
}
