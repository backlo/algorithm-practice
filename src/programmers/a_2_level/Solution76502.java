package programmers.a_2_level;

import java.util.Stack;

public class Solution76502 {

    public static int solution(String s) {
        int answer = 0;

        for (int index = 0; index < s.length(); index++) {
            if (isRightBracket(s)) {
                ++answer;
            }
            s = s.substring(1) + s.charAt(0);
        }

        return answer;
    }

    private static boolean isRightBracket(String s) {
        Stack<String> brackets = new Stack<>();
        String[] sSplits = s.split("");

        for (String bracket : sSplits) {
            if (brackets.isEmpty() && (bracket.equals(")") || bracket.equals("}") || bracket.equals("]"))) {
                return Boolean.FALSE;
            }

            if (bracket.equals("(") || bracket.equals("{") || bracket.equals("[")) {
                brackets.push(bracket);
                continue;
            }

            String getBracket = brackets.pop();
            if (getBracket.equals("(") && bracket.equals(")")) {
                continue;
            }
            if (getBracket.equals("{") && bracket.equals("}")) {
                continue;
            }
            if (getBracket.equals("[") && bracket.equals("]")) {
                continue;
            }

            return Boolean.FALSE;
        }

        if (!brackets.isEmpty()) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public static void main(String[] args) {
        String s = "[](){}";
        System.out.println(solution(s));

        String s2 = "}]()[{";
        System.out.println(solution(s2));

        String s3 = "[)(]";
        System.out.println(solution(s3));

        String s4 = "}}}";
        System.out.println(solution(s4));
    }
}
