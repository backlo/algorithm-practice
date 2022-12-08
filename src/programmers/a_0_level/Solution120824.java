package programmers.a_0_level;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution120824 {

    public static int[] solution(int[] num_list) {
        return IntStream.of(
                (int) Arrays.stream(num_list)
                        .filter(num -> num % 2 == 0)
                        .count(),
                (int) Arrays.stream(num_list)
                        .filter(num -> num % 2 == 1)
                        .count()
        ).toArray();
    }

    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(num_list)));

        int[] num_list2 = {1, 3, 5, 7};
        System.out.println(Arrays.toString(solution(num_list2)));
    }
}
