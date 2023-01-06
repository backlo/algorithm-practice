package programmers.a_0_level;

import java.util.ArrayList;
import java.util.List;

public class Solution120875 {

    public static int solution(int[][] dots) {
        List<Double> slopes = new ArrayList<>();

        for (int index = 0; index < dots.length; index++) {
            for (int jIndex = index + 1; jIndex < dots.length; jIndex++) {
                double slope = (double) (dots[index][1] - dots[jIndex][1]) / (dots[index][0] - dots[jIndex][0]);
                if (slopes.contains(slope)) {
                    return 1;
                }
                slopes.add(slope);
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        System.out.println(solution(dots));

        int[][] dots2 = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};
        System.out.println(solution(dots2));
    }
}
