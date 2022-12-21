package programmers.a_1_level;

import java.util.stream.IntStream;

public class Solution77884 {

    public static int solution(int left, int right) {
        return IntStream.rangeClosed(left, right)
                .map(number -> getAliquotCount(number) % 2 == 0 ? number : -number)
                .sum();
    }

    private static int getAliquotCount(int number) {
        return (int) IntStream.rangeClosed(1, number)
                .filter(num -> number % num == 0)
                .count();
    }

    public static void main(String[] args) {
        int left = 13;
        int right = 17;
        System.out.println(solution(left, right));

        int left2 = 24;
        int right2 = 27;
        System.out.println(solution(left2, right2));
    }
}
