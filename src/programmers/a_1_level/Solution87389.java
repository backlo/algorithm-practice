package programmers.a_1_level;

public class Solution87389 {

    public static int solution(int n) {
        for (int i = 1; i < n; i++) {
            int temp;
            if (n % i == 1) {
                return i;
            }
        }

        return n;
    }

    public static void main(String[] args) {
        int i = 10;
        System.out.println(solution(i));

        i = 12;
        System.out.println(solution(i));
    }
}
