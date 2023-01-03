package programmers.a_1_level;

public class Solution134240 {

    public static String solution(int[] food) {
        StringBuilder firstUser = new StringBuilder();
        StringBuilder secondUser = new StringBuilder();

        for (int index = 1; index < food.length; index++) {
            int numberOfFood = food[index];
            for (int jIndex = 0; jIndex < numberOfFood / 2; jIndex++) {
                firstUser.append(index);
                secondUser.append(index);
            }
        }

        return firstUser
                .append("0")
                .append(secondUser.reverse())
                .toString();
    }

    public static void main(String[] args) {
        int[] food = {1, 3, 4, 6};
        System.out.println(solution(food));

        int[] food2 = {1, 7, 1, 2};
        System.out.println(solution(food2));
    }
}
