package programmers.a_0_level;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution120895 {

    public static String solution(String my_string, int num1, int num2) {
        String[] myStringSplits = my_string.split("");
        String changeString = myStringSplits[num1];

        myStringSplits[num1] = myStringSplits[num2];
        myStringSplits[num2] = changeString;

        return String.join("", myStringSplits);
    }

    public static String solution2(String my_string, int num1, int num2) {
        List<String> list = Arrays.stream(my_string.split("")).collect(Collectors.toList());

        Collections.swap(list, num1, num2);

        return String.join("", list);
    }

    public static void main(String[] args) {
        String my_string = "hello";
        int num1 = 1;
        int num2 = 2;
        System.out.println(solution(my_string, num1, num2));

        String my_string2 = "I love you";
        int num3 = 3;
        int num4 = 6;
        System.out.println(solution(my_string2, num3, num4));
    }
}
