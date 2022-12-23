package programmers.a_0_level;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Solution120888 {

    public static String solution(String my_string) {
        Set<String> duplicateStrings = new LinkedHashSet<>(
                Arrays.asList(my_string.split(""))
        );

        return String.join("", duplicateStrings);
    }

    public static void main(String[] args) {
        String my_string = "people";
        System.out.println(solution(my_string));

        String my_string2 = "We are the world";
        System.out.println(solution(my_string2));
    }
}
