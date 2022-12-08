package programmers.a_0_level;

import java.util.Arrays;

public class Solution120854 {

    public static int[] solution(String[] strlist) {
        return Arrays.stream(strlist)
                .mapToInt(String::length)
                .toArray();
    }

    public static void main(String[] args) {
        String[] strlist = {"We", "are", "the", "world!"};
        System.out.println(Arrays.toString(solution(strlist)));

        String[] strlist2 = {"I", "Love", "Programmers."};
        System.out.println(Arrays.toString(solution(strlist2)));
    }
}
