package programmers.a_0_level;

import java.util.stream.IntStream;

public class Solution120910 {

    public static int solution(int n, int t) {
        for (int index = 0; index < t; index++) {
            n *= 2;
        }

        return n;
    }

    public static void main(String[] args) {
        int n = 2;
        int t = 10;
        System.out.println(solution(n, t));

        int n2 = 7;
        int t2 =15;
        System.out.println(solution(n2, t2));
    }
}
