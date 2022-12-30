package programmers.a_0_level;

public class Solution120922 {

    public static int solution(int M, int N) {
        return M - 1 + (N - 1) * M;
    }

    public static void main(String[] args) {
        int M = 2;
        int N = 2;
        System.out.println(solution(M, N));

        int M2 = 2;
        int N2 = 5;
        System.out.println(solution(M2, N2));

        int M3 = 1;
        int N3 = 1;
        System.out.println(solution(M3, N3));
    }
}
