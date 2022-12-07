package programmers.a_0_level;

public class Solution120807 {

    public static int solution(int num1, int num2) {
        return num1 == num2 ? 1 : -1;
    }

    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;

        System.out.println(solution(num1, num2));

        int num3 = 11;
        int num4 = 11;

        System.out.println(solution(num3, num4));

        int num5 = 7;
        int num6 = 99;

        System.out.println(solution(num5, num6));
    }
}
