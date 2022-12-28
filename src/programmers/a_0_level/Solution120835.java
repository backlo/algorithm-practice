package programmers.a_0_level;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution120835 {

    public static int[] solution(int[] emergency) {
        List<Integer> sortEmergencies = Arrays.stream(emergency).boxed()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        int[] result = new int[emergency.length];

        for (int index = 0; index < sortEmergencies.size(); index++) {
            for (int jIndex = 0; jIndex < emergency.length; jIndex++) {
                if(sortEmergencies.get(index) == emergency[jIndex]) {
                    result[jIndex] = index + 1;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] emergency = {3, 76, 24};
        System.out.println(Arrays.toString(solution(emergency)));

        int[] emergency2 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(solution(emergency2)));

        int[] emergency3 = {30, 10, 23, 6, 100};
        System.out.println(Arrays.toString(solution(emergency3)));
    }
}
