package programmers.a_1_level;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution142086 {

    public static int[] solution2(String s) {
        int[] answer = new int[s.length()];
        String[] sSplit = s.split("");

        for (int index = 0; index < sSplit.length; index++) {
            int count = 0;
            for (int jIndex = index - 1; jIndex >= 0 ; jIndex--) {
                ++count;
                if (sSplit[index].equals(sSplit[jIndex])) {
                    answer[index] = count;
                    break;
                }
            }
            if (answer[index] == 0) {
                answer[index] = -1;
            }
        }

        return answer;
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> alphabets = new HashMap<>();

        for (int index = 0; index < s.length(); index++) {
            char alphabet = s.charAt(index);
            answer[index] = index - alphabets.getOrDefault(alphabet, index + 1);
            alphabets.put(alphabet, index);
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "banana";
        System.out.println(Arrays.toString(solution(s)));

        String s2 = "foobar";
        System.out.println(Arrays.toString(solution(s2)));
    }
}
