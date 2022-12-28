package programmers.a_1_level;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution68644 {

    public static int[] solution(int[] numbers) {
        Set<Integer> results = new HashSet<>();

        for (int iIndex = 0; iIndex < numbers.length; iIndex++) {
            for (int jIndex = iIndex + 1; jIndex < numbers.length; jIndex++) {
                   results.add(numbers[iIndex] + numbers[jIndex]);
            }
        }

        return results.stream()
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        System.out.println(Arrays.toString(solution(numbers)));

        int[] numbers2 = {5,0,2,7};
        System.out.println(Arrays.toString(solution(numbers2)));
    }
}
