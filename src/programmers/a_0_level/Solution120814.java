package programmers.a_0_level;

public class Solution120814 {

    public static int solution(int n) {
        return (n % 7 > 0) ? n / 7 + 1 : n / 7;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(solution(n));

        int n2 = 1;
        System.out.println(solution(n2));

        int n3 = 15;
        System.out.println(solution(n3));
    }
}
