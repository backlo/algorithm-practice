package programmers.a_0_level;

public class Solution120806 {

    public static int solution(int num1, int num2) {
        return (int) ((double) num1 / (double) num2 * 1000);
    }

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 2;
        System.out.println(solution(num1, num2));

        int num3 = 7;
        int num4 = 3;
        System.out.println(solution(num3, num4));

        int num5 = 1;
        int num6 = 16;
        System.out.println(solution(num5, num6));
    }
}
