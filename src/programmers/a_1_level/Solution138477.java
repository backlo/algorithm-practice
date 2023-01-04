package programmers.a_1_level;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution138477 {

    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> ranks = new PriorityQueue<>((o1, o2) -> o1 - o2);

        for (int index = 0; index < score.length; index++) {
            ranks.add(score[index]);

            while(ranks.size() > k) {
                ranks.poll();
            }

            answer[index] = ranks.peek();
        }

        return answer;
    }

    public static void main(String[] args) {
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        System.out.println(Arrays.toString(solution(k, score)));

        int k2 = 4;
        int[] score2 = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        System.out.println(Arrays.toString(solution(k2, score2)));
    }
}
