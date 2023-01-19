package programmers.a_1_level;

import java.util.stream.IntStream;

public class Solution12921 {

    public static int solution(int n) {
        return (int) IntStream.rangeClosed(2, n)
                .filter(num -> isPrime(num))
                .count();
    }

    private static boolean isPrime(int num) {
        for (int index = 2; index <= Math.sqrt(num); index++) {
            if (num % index == 0) {
                return Boolean.FALSE;
            }
        }

        return Boolean.TRUE;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));

        int n2 = 5;
        System.out.println(solution(n2));
    }
}
