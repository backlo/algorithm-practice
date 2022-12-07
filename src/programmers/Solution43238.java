package programmers;

import java.util.Arrays;

public class Solution43238 {

    public long solution(int n, int[] times) {
        Arrays.sort(times);
        long answer = 0;
        long start = 1;
        long end = (long) n * times[times.length - 1];

        while (start <= end) {
            long sum = 0;
            long mid = (start + end) / 2;
            for (int time : times) {
                sum += mid / time;
            }

            if (sum >= n) {
                end = mid - 1;
                answer = mid;
                continue;
            }

            start = mid + 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution43238 solution43238 = new Solution43238();

        int[] times = {7, 10};
        System.out.println(solution43238.solution(6, times));
    }
}
