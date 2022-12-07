package programmers;

import java.util.*;

public class Solution42586 {

    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Job> tasks = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            tasks.add(new Job(progresses[i], speeds[i]));
        }

        while (!tasks.isEmpty()) {
            int result = tasks.poll().takeDate();
            int count = 1;
            while (!tasks.isEmpty() && tasks.peek().takeDate() <= result) {
                tasks.poll();
                ++count;
            }
            answer.add(count);
        }

        return answer.stream()
                .mapToInt(i -> i)
                .toArray();
    }

    static class Job {
        private final int progress;
        private final int speed;

        public Job(int progress, int speed) {
            this.progress = progress;
            this.speed = speed;
        }

        public int takeDate() {
            return  (100 - progress) % speed == 0 ? (100 - progress) / speed : (100 - progress) / speed + 1;
        }
    }

    public static void main(String[] args) {
        Solution42586 solution = new Solution42586();

        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        System.out.println(Arrays.toString(solution.solution(progresses, speeds)));

        int[] progresses1 = {95, 90, 99, 99, 80, 99};
        int[] speeds1 = {1, 1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(solution.solution(progresses1, speeds1)));
    }
}
