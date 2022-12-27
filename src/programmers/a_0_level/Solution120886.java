package programmers.a_0_level;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution120886 {

    public static int solution(String before, String after) {
        String sortBefore = Arrays.stream(before.split(""))
                .sorted()
                .collect(Collectors.joining());

        String sortAfter = Arrays.stream(after.split(""))
                .sorted()
                .collect(Collectors.joining());

        return sortAfter.equals(sortBefore) ? 1 : 0;
    }

    public static void main(String[] args) {
        String before = "olleh";
        String after = "hello";
        System.out.println(solution(before, after));

        String before2 = "allpe";
        String after2 = "apple";
        System.out.println(solution(before2, after2));
    }
}
