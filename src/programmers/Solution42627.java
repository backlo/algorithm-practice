package programmers;

import java.util.*;
import java.util.stream.Collectors;

public class Solution42627 {

    public int solution(int[][] jobs) {
        PriorityQueue<Job> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.jobTime));

        LinkedList<Job> list = Arrays.stream(jobs)
                .map(job -> new Job(job[0], job[1]))
                .sorted(Comparator.comparingInt(o -> o.requestTime))
                .collect(Collectors.toCollection(LinkedList::new));

        int answer = 0;
        int count = 0;
        int time = Objects.requireNonNull(list.peek()).requestTime;

        while (count < jobs.length) {
            while (!list.isEmpty() && list.peek().requestTime <= time) {
                queue.offer(list.pollFirst());
            }

            if (!queue.isEmpty()) {
                Job job = queue.poll();
                time += job.jobTime;
                answer += time - job.requestTime;
                count++;
            } else {
                time++;
            }
        }

        return answer / count;
    }

    static class Job {
        private final int requestTime;
        private final int jobTime;

        public Job(int requestTime, int jobTime) {
            this.requestTime = requestTime;
            this.jobTime = jobTime;
        }
    }

    public static void main(String[] args) {
        Solution42627 solution42627 = new Solution42627();

        int[][] job = {{0, 3}, {1, 9}, {2, 6}};
        System.out.println(solution42627.solution(job));
    }
}
