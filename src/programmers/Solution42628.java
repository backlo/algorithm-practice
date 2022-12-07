package programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Solution42628 {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        PriorityQueue<Integer> reverseNumbers = new PriorityQueue<>(Collections.reverseOrder());

        for (String operation : operations) {
            String[] splitOperations = operation.split(" ");
            if ((numbers.isEmpty() || reverseNumbers.isEmpty()) && splitOperations[0].equals("D")) {
                continue;
            }

            if (splitOperations[0].equals("I")) {
                int number = Integer.parseInt(splitOperations[1]);
                numbers.add(number);
                reverseNumbers.add(number);
            }

            if (splitOperations[0].equals("D") && splitOperations[1].equals("1")) {
                numbers.remove(reverseNumbers.poll());
            }

            if (splitOperations[0].equals("D") && splitOperations[1].equals("-1")) {
                reverseNumbers.remove(numbers.poll());
            }
        }

        int[] answer = new int[2];
        answer[0] = reverseNumbers.peek() == null ? 0 : reverseNumbers.peek();
        answer[1] = numbers.peek() == null ? 0 : numbers.peek();

        return answer;
    }

    public static void main(String[] args) {
        Solution42628 solution42628 = new Solution42628();

        String[] operations = {"I 16", "D 1"};
        System.out.println(Arrays.toString(solution42628.solution(operations)));

        String[] operations1=  {"I 7","I 5","I -5","D -1"};
        System.out.println(Arrays.toString(solution42628.solution(operations1)));
    }
}
