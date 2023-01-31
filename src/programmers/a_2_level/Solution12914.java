package programmers.a_2_level;

public class Solution12914 {

    public static long solution(int n) {
        long[] board = new long[n + 2];
        board[1] = 1;
        board[2] = 2;

        for (int index = 3; index <= n; index++) {
            board[index] = (board[index - 1] + board[index - 2]) % 1234567;
        }

        return board[n];
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(solution(n));

        int n2 = 3;
        System.out.println(solution(n2));
    }
}
