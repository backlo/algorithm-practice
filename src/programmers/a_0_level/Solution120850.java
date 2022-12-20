package programmers.a_0_level;

import java.util.Arrays;

public class Solution120850 {

    public static int[] solution(String my_string) {
        return my_string.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .sorted()
                .toArray();
    }

    public static void main(String[] args) {
        String my_string = "hi12392";
        System.out.println(Arrays.toString(solution(my_string)));

        String my_string2 = "p2o4i8gj2";
        System.out.println(Arrays.toString(solution(my_string2)));

        String my_string3 = "abcde0";
        System.out.println(Arrays.toString(solution(my_string3)));
    }
}
