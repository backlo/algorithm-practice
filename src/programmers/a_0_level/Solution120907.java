package programmers.a_0_level;

import java.util.Arrays;
import java.util.function.BiFunction;

public class Solution120907 {

    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int index = 0;

        for (String formula : quiz) {
            String[] formulaSplit = formula.split(" ");
            int result = Operator.doFormula(formulaSplit[1], Integer.parseInt(formulaSplit[0]), Integer.parseInt(formulaSplit[2]));
            if (result == Integer.parseInt(formulaSplit[4])) {
                answer[index++] = "O";
                continue;
            }
            answer[index++] = "X";
        }

        return answer;
    }

    enum Operator {
        PLUS("+", Integer::sum),
        MINUS("-", (x, y) -> x - y);

        private final String operator;
        private final BiFunction<Integer, Integer, Integer> formula;

        Operator(String operator, BiFunction<Integer, Integer, Integer> formula) {
            this.operator = operator;
            this.formula = formula;
        }

        public static Integer doFormula(String operator, int x, int y) {
            return Arrays.stream(values())
                    .filter(value -> value.operator.equals(operator))
                    .map(value -> value.formula.apply(x, y))
                    .findFirst()
                    .orElse(-1);
        }
    }

    public static void main(String[] args) {
        String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
        System.out.println(Arrays.toString(solution(quiz)));

        String[] quiz2 = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
        System.out.println(Arrays.toString(solution(quiz2)));
    }
}
