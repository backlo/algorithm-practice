package programmers.a_1_level;

import java.util.Stack;

public class Solution133502 {

    public static int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> ingredients = new Stack<>();

        for (int index : ingredient) {
            ingredients.push(index);

            if (ingredients.size() < 4) continue;
            int ingredientsIndex = ingredients.size() - 1;

            if (ingredients.get(ingredientsIndex) == 1 &&
                    ingredients.get(ingredientsIndex - 1) == 3 &&
                    ingredients.get(ingredientsIndex - 2) == 2 &&
                    ingredients.get(ingredientsIndex - 3) == 1) {
                ++answer;
                ingredients.pop();
                ingredients.pop();
                ingredients.pop();
                ingredients.pop();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        System.out.println(solution(ingredient));

        int[] ingredient2 = {1, 3, 2, 1, 2, 1, 3, 1, 2};
        System.out.println(solution(ingredient2));
    }
}
