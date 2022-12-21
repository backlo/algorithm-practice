package programmers.a_1_level;

import java.util.stream.IntStream;

public class Solution82612 {

    public static long solution(int price, int money, int count) {
        long totalPrice = IntStream.range(0, count)
                .mapToLong(num -> (long) price * (num + 1))
                .sum();

        return (totalPrice >= money) ? totalPrice - money : 0;
    }

    public static void main(String[] args) {
        int price = 3;
        int money = 20;
        int count = 4;

        System.out.println(solution(price, money, count));
    }
}
