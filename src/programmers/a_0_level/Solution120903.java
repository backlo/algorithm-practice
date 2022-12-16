package programmers.a_0_level;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution120903 {

    public static int solution(String[] s1, String[] s2) {
        int count = 0;
        for (String str1 : s1) {
            for (String str2 : s2) {
                if (str1.equals(str2)) {
                    ++count;
                }
            }
        }

        return count;
    }

    public static int solution2(String[] s1, String[] s2) {
        Set<String> s1Strings = new HashSet<>(Arrays.asList(s1));

        return (int) Arrays.stream(s2)
                .filter(s1Strings::contains)
                .count();
    }

    public static void main(String[] args) {
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        System.out.println(solution(s1, s2));

        String[] s3 = {"n", "omg"};
        String[] s4 = {"m", "dot"};
        System.out.println(solution(s3, s4));
    }
}
