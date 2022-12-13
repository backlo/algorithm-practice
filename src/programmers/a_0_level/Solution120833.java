package programmers.a_0_level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution120833 {

    public static int[] solution2(int[] numbers, int num1, int num2) {
        List<Integer> answers = new ArrayList<>();
        for (int index = num1; index < num2 + 1; index++) {
            answers.add(numbers[index]);
        }

        return answers.stream()
                .mapToInt(i -> i)
                .toArray();
    }

    public static int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int num1 = 1;
        int num2 = 3;
        System.out.println(Arrays.toString(solution(numbers, num1, num2)));

        int[] numbers2 = {1, 3, 5};
        int num3 = 1;
        int num4 = 2;
        System.out.println(Arrays.toString(solution(numbers2, num3, num4)));
    }
}
