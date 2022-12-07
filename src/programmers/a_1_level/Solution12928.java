package programmers.a_1_level;

public class Solution12928 {

    public static String solution(int num) {
        if (num % 2 == 0) {
            return "Even";
        }

        return "Odd";
    }

    public static void main(String[] args) {
        int num = 3;
        System.out.println(solution(num));

        int num2 = 4;
        System.out.println(solution(num2));
    }
}
