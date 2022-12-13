package programmers.a_1_level;

import java.util.Arrays;

public class Solution12947 {

    public static boolean solution(int x) {
        int sumNumber = Arrays.stream(Arrays.stream(String.valueOf(x).split(""))
                .mapToInt(Integer::parseInt)
                .toArray())
                .sum();

        return x % sumNumber == 0;
    }

    public static void main(String[] args) {
        int arr = 10;
        System.out.println(solution(arr));

        int arr2 = 12;
        System.out.println(solution(arr2));

        int arr3 = 11;
        System.out.println(solution(arr3));

        int arr4 = 13;
        System.out.println(solution(arr4));
    }
}
