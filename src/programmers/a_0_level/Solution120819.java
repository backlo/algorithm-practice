package programmers.a_0_level;

import java.util.Arrays;

public class Solution120819 {

    public static int[] solution(int money) {
        return new int[]{money / 5500, money % 5500};
    }

    public static void main(String[] args) {
        int money = 5500;
        System.out.println(Arrays.toString(solution(money)));

        int money2 = 15000;
        System.out.println(Arrays.toString(solution(money2)));
    }
}
