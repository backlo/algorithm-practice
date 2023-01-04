package programmers.a_0_level;

import java.util.Map;
import java.util.TreeMap;

public class Solution120812 {

    public static int solution(int[] array) {
        Map<Integer, Integer> arrayMaps = new TreeMap<>((o1, o2) -> o2 - o1);

        for (Integer number : array) {
            arrayMaps.put(number, arrayMaps.getOrDefault(number, 0) + 1);
        }

        int maxCount = arrayMaps.values().stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(-1);

        return arrayMaps.values().stream().filter(value -> value == maxCount).count() > 1 ?
                -1 :  arrayMaps.entrySet().stream()
                .filter(entry -> entry.getValue() == maxCount)
                .mapToInt(Map.Entry::getKey)
                .findFirst()
                .orElse(0);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 3, 4};
        System.out.println(solution(array));

        int[] array2 = {1, 1, 2, 2};
        System.out.println(solution(array2));

        int[] array3 = {1};
        System.out.println(solution(array3));
    }
}
