package programmers.a_1_level;

import java.util.*;

public class Solution131128 {

    public static String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        PriorityQueue<String> answers = new PriorityQueue<>(Comparator.reverseOrder());
        Map<String, Integer> numbers = new HashMap<>();

        String[] splitX = X.split("");
        String[] splitY = Y.split("");
        for (String y : splitY) {
            numbers.put(y, numbers.getOrDefault(y, 0) + 1);
        }

        for (String x : splitX) {
            if (numbers.containsKey(x) && numbers.get(x) > 0) {
                answers.add(x);
                numbers.put(x , numbers.get(x) - 1);
            }
        }

        if (answers.size() == 0) {
            return "-1";
        }
        if (answers.peek().equals("0")) {
            return "0";
        }

        while(!answers.isEmpty()) {
            answer.append(answers.poll());
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        String X = "100";
        String Y = "2345";
        System.out.println(solution(X, Y));

        String X2 = "100";
        String Y2 = "203045";
        System.out.println(solution(X2, Y2));

        String X3 = "100";
        String Y3 = "123450";
        System.out.println(solution(X3, Y3));

        String X4 = "12321";
        String Y4 = "42531";
        System.out.println(solution(X4, Y4));

        String X5 = "5525";
        String Y5 = "1255";
        System.out.println(solution(X5, Y5));
    }
}
