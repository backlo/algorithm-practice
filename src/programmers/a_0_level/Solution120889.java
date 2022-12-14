package programmers.a_0_level;

import java.util.Arrays;

public class Solution120889 {

    public static int solution(int[] sides) {
        int[] sortSides = Arrays.stream(sides)
                .sorted()
                .toArray();

        return (sortSides[2] >= sortSides[1] + sortSides[0]) ? 2 : 1;
    }

    public static void main(String[] args) {
        int[] sides = {1, 2, 3};
        System.out.println(solution(sides));

        int[] sides2 = {3, 6, 2};
        System.out.println(solution(sides2));

        int[] sides3 = {199, 72, 222};
        System.out.println(solution(sides3));
    }
}
