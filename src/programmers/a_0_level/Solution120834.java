package programmers.a_0_level;

import java.util.stream.Collectors;

public class Solution120834 {

    public static String solution(int age) {
        return String.valueOf(age).chars()
                .mapToObj(chr -> Character.toString(chr + 49))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        int age = 23;
        System.out.println(solution(age));

        int age2 = 51;
        System.out.println(solution(age2));

        int age3 = 100;
        System.out.println(solution(age3));
    }
}
