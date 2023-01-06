package programmers.a_0_level;

import java.util.Map;
import java.util.TreeMap;

public class Solution120876 {

    public static int solution(int[][] lines) {
        int answer = 0;
        Map<Integer, Integer> linePoints = new TreeMap<>();
        int minStart = Math.min(Math.min(lines[0][0], lines[1][0]), lines[2][0]);
        int maxEnd = Math.max(Math.max(lines[0][1], lines[1][1]), lines[2][1]);

        for (int index = minStart; index <= maxEnd; index++) {
            if (lines[0][0] < index && lines[0][1] >= index) {
                linePoints.put(index, linePoints.getOrDefault(index, 0) + 1);
            }
            if (lines[1][0] < index && lines[1][1] >= index) {
                linePoints.put(index, linePoints.getOrDefault(index, 0) + 1);
            }
            if (lines[2][0] < index && lines[2][1] >= index) {
                linePoints.put(index, linePoints.getOrDefault(index, 0) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> points : linePoints.entrySet()) {
            if (points.getValue() >= 2) {
                ++answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] lines = {{0, 1}, {2, 5}, {3, 9}};
        System.out.println(solution(lines));

        int[][] lines2 = {{-1, 1}, {1, 3}, {3, 9}};
        System.out.println(solution(lines2));

        int[][] lines3 = {{0, 5}, {3, 9}, {1, 10}};
        System.out.println(solution(lines3));
    }
}
