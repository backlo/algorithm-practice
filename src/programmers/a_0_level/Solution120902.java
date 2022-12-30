package programmers.a_0_level;

import java.util.ArrayList;
import java.util.List;

public class Solution120902 {

    public static int solution(String my_string) {
        String[] calculationFormulas = my_string.split(" ");
        List<Integer> numbers = new ArrayList<>();
        List<String> operators = new ArrayList<>();
        int answer = Integer.parseInt(calculationFormulas[0]);

        for (int index = 1; index < calculationFormulas.length; index++) {
            if (index % 2 == 0) {
                numbers.add(Integer.parseInt(calculationFormulas[index]));
                continue;
            }
            operators.add(calculationFormulas[index]);
        }

        for (int index = 0; index < numbers.size(); index++) {
            if (operators.get(index).equals("+")) {
                answer += numbers.get(index);
                continue;
            }
            answer -= numbers.get(index);
        }

        return answer;
    }

    public static void main(String[] args) {
        String my_string = "3 + 4";
        System.out.println(solution(my_string));
    }
}
