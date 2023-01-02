package programmers.a_1_level;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;

public class Solution147355 {

    public static int solution(String t, String p) {
        int result = 0;
        List<Long> numbers = new ArrayList<>();
        long parsingP = Long.parseLong(p);

        for (int index = 0; index <= t.length() - p.length(); index++) {
            numbers.add(
                    Long.parseLong(t.substring(index, index + p.length()))
            );
        }

        for (Long number : numbers) {
            if (number <= parsingP) ++result;
        }

        return result;
    }

    public int solution2(String t, String p) {
        long targetNumber = Long.parseLong(p);
        int targetNumberLength = p.length();

        return (int) LongStream.range(0L, t.length() - targetNumberLength + 1L)
                .mapToObj(i -> t.substring((int) i, (int) i + targetNumberLength))
                .mapToLong(Long::parseLong)
                .filter(number -> number <= targetNumber)
                .count();
    }

    public static void main(String[] args) {
        String t = "3141592";
        String p = "271";
        System.out.println(solution(t, p));

        String t2 = "500220839878";
        String p2 = "7";
        System.out.println(solution(t2, p2));

        String t3 = "10203";
        String p3 = "15111";
        System.out.println(solution(t3, p3));
    }
}
