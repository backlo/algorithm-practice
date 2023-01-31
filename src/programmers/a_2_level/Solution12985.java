package programmers.a_2_level;

public class Solution12985 {

    public static int solution(int n, int a, int b) {
        return gameCount(Math.min(a, b), Math.max(a, b), 0);
    }

    private static int gameCount(int a, int b, int count) {
        if (a == b) {
            return count;
        }

        a = a / 2 + a % 2;
        b = b / 2 + b % 2;

        return gameCount(a, b, ++count);
    }

    public static void main(String[] args) {
        int n = 8;
        int a = 4;
        int b = 7;
        System.out.println(solution(n, a, b));
    }
}
