package example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public int solution(int[] numbers) {
        Arrays.sort(numbers);

        if (numbers.length == 1 || numbers[0] != numbers[1]) {
            return numbers[0];
        }

        for (int i = 1; i < numbers.length - 1; i++) {
            if (numbers[i] != numbers[i - 1] && numbers[i] != numbers[i + 1]) {
                return numbers[i];
            }
        }

        if (numbers[numbers.length - 1] != numbers[numbers.length - 2]) {
            return numbers[numbers.length - 1];
        }

        throw new IllegalArgumentException("유일한 숫자가 없습니다.");
    }

    public int solution3(int[] numbers) {
        Map<Integer, Integer> maps = new HashMap<>();

        for (int number : numbers) {
            if (!maps.containsKey(number)) {
                maps.put(number, 1);
                continue;
            }

            int count = maps.get(number);
            maps.put(number, ++count);
        }

        return maps.entrySet().stream()
                .filter(index -> index.getValue() == 1)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElseThrow(() -> new IllegalArgumentException("유일한 숫자가 없습니다."));
    }

    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        int[] numbers = {2, 2, 2, 3, 4, 4, 4};
        int[] numbers2 = {2, 2, 2, 3, 4, 4, 3};

        System.out.println(singleNumber.solution(numbers));
        try {
            System.out.println(singleNumber.solution(numbers2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(singleNumber.solution3(numbers));
        try {
            System.out.println(singleNumber.solution3(numbers2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
