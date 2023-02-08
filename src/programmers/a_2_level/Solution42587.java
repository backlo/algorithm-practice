package programmers.a_2_level;

import java.util.Collections;
import java.util.Objects;
import java.util.PriorityQueue;

public class Solution42587 {

    public static int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> priorityOrders = new PriorityQueue<>(Collections.reverseOrder());

        for (int priority : priorities) {
            priorityOrders.add(priority);
        }

        while (!priorityOrders.isEmpty()) {
            for (int index = 0; index < priorities.length; index++) {
                if (priorities[index] == Objects.requireNonNull(priorityOrders.peek())) {
                    if (index == location) {
                        return ++answer;
                    }
                    priorityOrders.poll();
                    ++answer;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        System.out.println(solution(priorities, location));

        int[] priorities2 = {1, 1, 9, 1, 1, 1};
        int location2 = 0;
        System.out.println(solution(priorities2, location2));
    }
}
