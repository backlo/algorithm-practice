package programmers.a_0_level;

import java.util.stream.Collectors;

public class Solution120893 {

    public static String solution(String my_string) {
        return my_string.chars()
                .map(ch -> Character.isUpperCase(ch) ? Character.toLowerCase(ch) : Character.toUpperCase(ch))
                .mapToObj(ch -> String.valueOf((char) ch))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String my_string = "cccCCC";
        System.out.println(solution(my_string));

        String my_string2 = "abCdEfghIJ";
        System.out.println(solution(my_string2));
    }
}
