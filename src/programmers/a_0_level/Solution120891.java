package programmers.a_0_level;

import java.util.Arrays;

public class Solution120891 {

    public static int solution(int order) {
        return (int) Arrays.stream(String.valueOf(order).split(""))
                .filter(value -> value.equals("3") || value.equals("6") || value.equals("9"))
                .count();
    }

    public static void main(String[] args) {
        int order = 3;
        System.out.println(solution(order));

        int order2 = 29423;
        System.out.println(solution(order2));
    }
}
