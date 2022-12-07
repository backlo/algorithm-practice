package programmers.a_0_level;

public class Solution120830 {

    public static int solution(int n, int k) {
        int freeDrink = n / 10;
        return n * 12000 + (k - freeDrink) * 2000;
    }

    public static void main(String[] args) {
        int n = 10;
        int k = 3;

        System.out.println(solution(n, k));

        int n2 = 64;
        int k2 = 6;

        System.out.println(solution(n2, k2));
    }
}
