package programmers.a_0_level;

import java.util.Arrays;

public class Solution120585 {

    public static int solution(int[] array, int height) {
        return (int) Arrays.stream(array)
                .filter(number -> number > height)
                .count();
    }

    public static void main(String[] args) {
        int[] array = {149, 180, 192, 170};
        int height = 167;
        System.out.println(solution(array, height));

        int[] array2 = {180, 120, 140};
        int height2 = 190;
        System.out.println(solution(array2, height2));
    }
}
