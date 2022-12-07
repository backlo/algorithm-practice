package programmers.a_1_level;

import java.util.HashSet;
import java.util.Set;

public class Solution12937 {

    public static int solution(int n) {
        int answer = 0;

        for (int index = 1; index <= n; index++) {
            if (n % index == 0) {
                answer += index;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 12;
        System.out.println(solution(n));

        int n2 = 5;
        System.out.println(solution(n2));
    }


    public static int solution2(int n) {
        Set<Integer> aliquots = new HashSet<>();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i * j == n) {
                    aliquots.add(i);
                    aliquots.add(j);
                }
            }
        }

        return aliquots.stream()
                .mapToInt(index -> index)
                .sum();
    }
}
