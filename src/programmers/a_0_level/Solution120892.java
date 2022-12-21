package programmers.a_0_level;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution120892 {

    public static String solution2(String cipher, int code) {
        StringBuilder result = new StringBuilder();
        String[] splitCiphers = cipher.split("");

        for (int index = 0; index < splitCiphers.length; index++) {
            if ((index + 1) % code == 0) {
                result.append(splitCiphers[index]);
            }
        }

        return result.toString();
    }

    public static String solution(String cipher, int code) {
        return IntStream.range(0, cipher.length())
                .filter(index -> index % code == code - 1)
                .mapToObj(index -> String.valueOf(cipher.charAt(index)))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;
        System.out.println(solution(cipher, code));

        String cipher2 = "pfqallllabwaoclk";
        int code2 = 2;
        System.out.println(solution(cipher2, code2));
    }
}
