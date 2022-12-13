package programmers.a_0_level;

import java.util.Arrays;
import java.util.Comparator;

public class Solution120847 {

    public static int solution(int[] numbers) {
        int[] sortNumbers = Arrays.stream(numbers).boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(i -> i)
                .toArray();

        int maxNumber = sortNumbers[0];
        int secondMaxNumber = sortNumbers[1];

        return maxNumber * secondMaxNumber;
    }

    public int solution2(int[] numbers) {
        int[] sortNumbers = Arrays.stream(numbers).sorted()
                .toArray();
        int maxNumber = sortNumbers[numbers.length - 1];
        int secondMaxNumber = sortNumbers[numbers.length - 2];

        return maxNumber * secondMaxNumber;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(solution(numbers));

        int[] numbers2 = {0, 31, 24, 10, 1, 9};
        System.out.println(solution(numbers2));
    }
}
