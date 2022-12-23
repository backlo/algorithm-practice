package programmers.a_1_level;

public class Solution68935 {

    public static int solution(int n) {
        StringBuilder ternaryStr = new StringBuilder();

        while (n > 0) {
            ternaryStr.append(n % 3);
            n /= 3;
        }
        String result = ternaryStr.toString();

        return Integer.parseInt(result, 3);
    }

    public static void main(String[] args) {
        int n = 45;
        System.out.println(solution(n));

        int n2 = 125;
        System.out.println(solution(n2));
    }
}
