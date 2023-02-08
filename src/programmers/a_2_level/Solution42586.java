package programmers.a_2_level;

import java.util.*;

public class Solution42586 {

    public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> days = new ArrayList<>();

        for (int index = 0; index < progresses.length; index++) {
            int day = 0;

            while (progresses[index] + day * speeds[index] < 100) {
                ++day;
            }

            days.add(day);
        }

        int maxDays = days.get(0);
        int count = 1;

        for (int index = 1; index < days.size(); index++) {
            if (maxDays >= days.get(index)) {
                ++count;
                continue;
            }
            answer.add(count);
            count = 1;
            maxDays = days.get(index);
        }

        answer.add(count);

        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public int[] solution2(int[] progresses, int[] speeds) {
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
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        System.out.println(Arrays.toString(solution(progresses, speeds)));

        int[] progresses2 = {95, 90, 99, 99, 80, 99};
        int[] speeds2 = {1, 1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(solution(progresses2, speeds2)));
    }
}
