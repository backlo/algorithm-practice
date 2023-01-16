package programmers.a_1_level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution12906 {

    public static int[] solution(int[] arr) {
        List<Integer> answers = new ArrayList<>();
        int temp = -1;
        for (int number : arr) {
            if (temp == number) {
                continue;
            }
            answers.add(number);
            temp = number;
        }

        return answers.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        System.out.println(Arrays.toString(solution(arr)));

        int[] arr2 = {4, 4, 4, 3, 3};
        System.out.println(Arrays.toString(solution(arr2)));
    }
}
