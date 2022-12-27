package programmers.a_1_level;

import java.util.*;

public class Solution12915 {

    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            public int compare(String idx1, String idx2) {
                int compareChar = idx1.charAt(n) - idx2.charAt(n);
                return compareChar == 0 ? idx1.compareTo(idx2) : compareChar;
            }
        });

        return strings;
    }

    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        System.out.println(Arrays.toString(solution(strings, n)));

        String[] strings2 = {"abce", "abcd", "cdx"};
        int n2 = 2;
        System.out.println(Arrays.toString(solution(strings2, n2)));
    }
}
