package programmers.a_1_level;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution12948 {

    public static String solution(String phone_number) {
        char[] numbers = phone_number.toCharArray();

        for(int index = 0; index < numbers.length - 4; index ++){
            numbers[index] = '*';
        }

        return String.valueOf(numbers);
    }

    public static void main(String[] args) {
        String phone_number = "01033334444";
        System.out.println(solution(phone_number));

        String phone_number2 = "027778888";
        System.out.println(solution(phone_number2));
    }
}
