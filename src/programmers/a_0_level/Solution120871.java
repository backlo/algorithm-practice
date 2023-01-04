package programmers.a_0_level;

public class Solution120871 {

    public static int solution(int n) {
        int answer = 0;

        for (int index = 1; index <= n; index++) {
            answer = checkThree(++answer);
        }

        return answer;
    }

    private static int checkThree(int n) {
        if (n % 3 != 0 && !String.valueOf(n).contains("3")) {
            return n;
        }

        return checkThree(++n);
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println(solution(n));

        int n2 = 40;
        System.out.println(solution(n2));
    }
}
