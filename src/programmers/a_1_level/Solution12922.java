package programmers.a_1_level;

import java.util.stream.IntStream;

public class Solution12922 {

    public static String solution(int n) {
        int nDivide = n / 2;
        int nRest = n % 2;
        StringBuilder result = new StringBuilder();

        IntStream.range(0, nDivide)
                .forEach(index -> result.append("수박"));

        return (nRest == 1) ? result.append("수").toString() : result.toString();
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(solution(n));

        int n2 = 4;
        System.out.println(solution(n2));
    }
}
