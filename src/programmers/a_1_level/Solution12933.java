package programmers.a_1_level;

import java.util.Arrays;
import java.util.Comparator;

public class Solution12933 {

    public static long solution2(long n) {
        StringBuilder sb = new StringBuilder();

        Arrays.stream(String.valueOf(n).split(""))
                .sorted(Comparator.reverseOrder())
                .forEach(sb::append);

        return Long.parseLong(sb.toString());
    }

    public static long solution(long n) {
        return Long.parseLong(
                        String.valueOf(n).chars()
                                .mapToObj(ch -> (char) ch)
                                .sorted(Comparator.reverseOrder())
                                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                                .toString()
                );
    }

    public static void main(String[] args) {
        long n = 118372;
        System.out.println(solution(n));
    }
}
