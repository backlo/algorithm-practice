package programmers.a_1_level;

import java.util.Arrays;

public class Solution12919 {

    public static String solution(String[] seoul) {
        return "김서방은 "+ Arrays.asList(seoul).indexOf("Kim") + "에 있다";
    }

    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        System.out.println(solution(seoul));
    }
}
