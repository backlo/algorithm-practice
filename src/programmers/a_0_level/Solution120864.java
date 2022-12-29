package programmers.a_0_level;

import java.util.Arrays;

public class Solution120864 {

    public static int solution(String my_string) {
        String replaceString = my_string.replaceAll("[a-zA-Z]", " ");

        return Arrays.stream(replaceString.split(" "))
                .filter(str -> !str.equals(""))
                .mapToInt(Integer::parseInt)
                .sum();
    }

    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        System.out.println(solution(my_string));

        String my_string2 = "1a2b3c4d123Z";
        System.out.println(solution(my_string2));
    }
}
