package programmers.a_2_level;

public class Solution12945 {
    public static int solution(int n) {
        int beforeNum = 0;
        int afterNum = 1;

        for (int index = 2; index <= n; index++) {
            int temp = afterNum;
            afterNum = (beforeNum % 1234567 + afterNum  % 1234567) % 1234567;
            beforeNum = temp;
        }

        return afterNum;
    }

    public static void main(String[] args) {
        int n = 123;
        System.out.println(solution(n));

        int n2 = 5;
        System.out.println(solution(n2));
    }
}
