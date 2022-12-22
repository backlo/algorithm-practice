package programmers.a_0_level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution120844 {

    public static int[] solution(int[] numbers, String direction) {
        List<Integer> numberLists = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.toList());

        if ("right".equals(direction)) {
            numberLists.add(0, numberLists.get(numberLists.size() - 1));
            numberLists.remove(numberLists.size() - 1);
        }
        if ("left".equals(direction)) {
            numberLists.add(numberLists.size(), numberLists.get(0));
            numberLists.remove(0);
        }

        return numberLists.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public  static int[] solution2(int[] numbers, String direction) {
        List<Integer> numberLists = new ArrayList<>();

        if ("right".equals(direction)) {
            numberLists.add(numbers[numbers.length - 1]);
            for (int index = 0; index < numbers.length - 1; index++) {
                numberLists.add(numbers[index]);
            }
        }
        if ("left".equals(direction)) {
            for (int index = 1; index < numbers.length; index++) {
                numberLists.add(numbers[index]);
            }
            numberLists.add(numbers[0]);
        }

        return numberLists.stream()
                .mapToInt(i -> i)
                .toArray();
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        String direction = "right";
        System.out.println(Arrays.toString(solution(numbers, direction)));

        int[] numbers2 = {4, 455, 6, 4, -1, 45, 6};
        String direction2 = "left";
        System.out.println(Arrays.toString(solution(numbers2, direction2)));
    }
}
