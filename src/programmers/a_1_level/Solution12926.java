package programmers.a_1_level;

import java.util.stream.Collectors;

public class Solution12926 {

    public static String solution(String s, int n) {
        return s.chars()
                .mapToObj(ch -> {
                    if(Character.isLowerCase(ch)) {
                        return  String.valueOf((char) ((ch - 'a' + n) % 26 + 'a'));
                    }
                    if(Character.isUpperCase(ch)) {
                        return  String.valueOf((char) ((ch - 'A' + n) % 26 + 'A'));
                    }
                    return String.valueOf((char) ch);
                })
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String s = "AB";
        int n = 1;
        System.out.println(solution(s, n));

        String s2 = "z";
        int n2 = 1;
        System.out.println(solution(s2, n2));

        String s3 = "a B z";
        int n3 = 4;
        System.out.println(solution(s3, n3));

    }
}
