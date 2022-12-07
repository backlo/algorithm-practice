package programmers;

import java.util.ArrayList;
import java.util.List;

public class Solution42746 {

    public String solution(int[] numbers) {
        List<String> stringNumbers = new ArrayList<>();

        for (int number : numbers) {
            stringNumbers.add(String.valueOf(number));
        }

        stringNumbers.sort((s1, s2) -> Integer.parseInt(s2 + s1) - Integer.parseInt(s1 + s2));

        if (stringNumbers.get(1).equals("0")) {
            return "0";
        }

        return String.join("", stringNumbers);
    }

    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};
        Solution42746 solution42746 = new Solution42746();
        System.out.println(solution42746.solution(numbers));
    }
}
