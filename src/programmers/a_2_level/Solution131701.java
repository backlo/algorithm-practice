package programmers.a_2_level;

import java.util.*;

public class Solution131701 {

    public static int solution(int[] elements) {
        Set<Integer> answer = new HashSet<>();
        int[] doubleElements = new int[elements.length * 2];

        for (int index = 0; index < elements.length * 2; index++) {
            doubleElements[index] = elements[index % elements.length];
        }

        for (int index = 1; index <= elements.length; index++) {
            for (int jIndex = 0; jIndex < elements.length; jIndex++) {
                answer.add(
                        Arrays.stream(doubleElements, jIndex, jIndex + index)
                                .sum()
                );
            }
        }

        return answer.size();
    }

    public static void main(String[] args) {
        int[] elements = {7, 9, 1, 1, 4};
        System.out.println(solution(elements));
    }
}
