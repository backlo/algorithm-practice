package programmers.a_0_level;

import java.util.Arrays;

public class Solution120851 {

    public static int solution(String my_string) {
        return my_string.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .sum();
    }

    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        System.out.println(solution(my_string));

        String my_string2 = "1a2b3c4d123";
        System.out.println(solution(my_string2));
    }
}
