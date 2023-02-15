package programmers.a_2_level;

import java.util.Arrays;

public class Solution92335 {

    public static int solution(int n, int k) {
        return (int) Arrays.stream(
                        Integer.toString(n, k).split("0")
                )
                .filter(value -> !value.isEmpty())
                .filter(value -> !value.equals("1"))
                .map(Long::parseLong)
                .filter(num -> isPrime(num))
                .count();
    }

    private static boolean isPrime(long num) {
        for (int index = 2; index <= Math.sqrt(num); index++) {
            if (num % index == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 437674;
        int k = 3;
        System.out.println(solution(n, k));

        int n2 = 110011;
        int k2 = 10;
        System.out.println(solution(n2, k2));
    }
}
