package programmers.a_0_level;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution120852 {

    public static int[] solution(int n) {
        Set<Integer> results = new HashSet<>();

        List<Integer> primes = IntStream.rangeClosed(2, n)
                .filter(num -> isPrime(num))
                .boxed()
                .collect(Collectors.toList());

        while(n != 1) {
            for (Integer prime : primes) {
                if (n % prime == 0) {
                    results.add(prime);
                    n /= prime;
                    break;
                }
            }
        }

        return results.stream()
                .mapToInt(Integer::intValue)
                .sorted()
                .toArray();
    }

    private static boolean isPrime(int n) {
        for (int index = 2; index <= Math.sqrt(n); index++) {
            if (n % index == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 12;
        System.out.println(Arrays.toString(solution(n)));

        int n2 = 17;
        System.out.println(Arrays.toString(solution(n2)));

        int n3 = 420;
        System.out.println(Arrays.toString(solution(n3)));
    }
}
