package programmers;

import java.util.HashSet;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;

public class Solution42626 {

    public int solution(int[] scoville, int K) {
        int count = 0;
        PriorityQueue<Integer> scovilles = new PriorityQueue<>();

        for (int scov : scoville) {
            scovilles.offer(scov);
        }

        while (scovilles.size() >= 2) {
            int firstScoville = scovilles.poll();
            int secondScoville = Objects.requireNonNull(scovilles.poll());

            if (firstScoville > K && secondScoville > K) {
                break;
            }

            ++count;
            scovilles.offer(firstScoville + secondScoville * 2);
        }

        for (Integer scov : scovilles) {
            if (scov < K) {
                count = -1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution42626 solution42626 = new Solution42626();

        int[] scoville = {1, 2};
        System.out.println(solution42626.solution(scoville, 7));
    }
}
