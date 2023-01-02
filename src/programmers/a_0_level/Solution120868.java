package programmers.a_0_level;

public class Solution120868 {

    public static int solution(int[] sides) {
        int maxSide = Math.max(sides[0], sides[1]);
        int minSide = Math.min(sides[0], sides[1]);

        return (maxSide + minSide) - (maxSide - minSide) - 1;
    }

    public static void main(String[] args) {
        int[] sides = {1, 2};
        System.out.println(solution(sides));

        int[] sides2 = {3, 6};
        System.out.println(solution(sides2));

        int[] sides3 = {11, 7};
        System.out.println(solution(sides3));
    }
}
