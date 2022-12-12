package programmers.a_1_level;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution12932 {

    public static int[] solution(long n) {
        List<Integer> splitNumbers = Arrays.stream(String.valueOf(n).split(""))
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        Collections.reverse(splitNumbers);

        return splitNumbers.stream()
                .mapToInt(number -> number)
                .toArray();
    }

    public static int[] solution2(long n) {
        return new StringBuilder()
                .append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }

    public static void main(String[] args) {
        long n = 12345;
        System.out.println(Arrays.toString(solution(n)));
    }
}
