package programmers.a_0_level;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution120896 {

    public static String solution(String s) {
        Set<String> containCharacter = new HashSet<>();

        for (String character : s.split("")) {
            if (containCharacter.contains(character)) {
                s = s.replaceAll(character, "");
                continue;
            }
            containCharacter.add(character);
        }

        return Arrays.stream(s.split(""))
                .sorted()
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String s = "abcabcadc";
        System.out.println(solution(s));

        String s2 = "abdc";
        System.out.println(solution(s2));

        String s3 = "hello";
        System.out.println(solution(s3));
    }
}
