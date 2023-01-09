package programmers.a_1_level;

import java.util.Locale;

public class Solution72410 {

    public static String solution(String new_id) {
        new_id = new_id.toLowerCase(Locale.ROOT)
                .replaceAll("[^-_.a-z0-9]", "")
                .replaceAll("[.]{2,}", ".")
                .replaceAll("^[.]|[.]$", "");

        if (new_id.length() == 0) {
            new_id = "a";
        }

        if (new_id.length() > 15) {
            new_id = new_id.substring(0, 15);
            new_id = new_id.replaceAll("^[.]|[.]$", "");
        }

        if (new_id.length() <= 2) {
            while (new_id.length() < 3)
                new_id += new_id.charAt(new_id.length() - 1);
        }

        return new_id;
    }

    public static void main(String[] args) {
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        System.out.println(solution(new_id));

        String new_id2 = "z-+.^.";
        System.out.println(solution(new_id2));

        String new_id3 = "=.=";
        System.out.println(solution(new_id3));

        String new_id4 = "123_.def";
        System.out.println(solution(new_id4));

        String new_id5 = "abcdefghijklmn.p";
        System.out.println(solution(new_id5));
    }
}
