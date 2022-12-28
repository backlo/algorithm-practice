package programmers.a_0_level;

import java.util.Arrays;

public class Solution120912 {

    public static int solution(int[] array) {
        int count = 0;

        for (int arr : array) {
            count += Arrays.stream(String.valueOf(arr).split(""))
                    .filter(value -> value.equals("7"))
                    .count();
        }

        return count;
    }

    public static void main(String[] args) {
        int[] array = {7, 77, 17};
        System.out.println(solution(array));

        int[] array2 = {10, 29};
        System.out.println(solution(array2));
    }
}
