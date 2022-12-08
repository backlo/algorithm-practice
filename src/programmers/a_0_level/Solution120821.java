package programmers.a_0_level;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution120821 {

    public static int[] solution(int[] num_list) {
        List<Integer> results = Arrays.stream(num_list)
                .boxed()
                .collect(Collectors.toList());

        Collections.reverse(results);

        return results.stream()
                .mapToInt(result -> result)
                .toArray();
    }

    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(num_list)));

        int[] num_list2 = {1, 1, 1, 1, 1, 2};
        System.out.println(Arrays.toString(solution(num_list2)));

        int[] num_list3 = {1, 0, 1, 1, 1, 3, 5};
        System.out.println(Arrays.toString(solution(num_list3)));
    }
}
