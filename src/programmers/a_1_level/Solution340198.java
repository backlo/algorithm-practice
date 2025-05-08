package programmers.a_1_level;

import java.util.*;

public class Solution340198 {

    public static void main(String[] args) {
        Solution340198 solution = new Solution340198();

        int[] mats = {5, 3, 2};
        String[][] park = {
                {"A", "A", "-1", "B", "B", "B", "B", "-1"},
                {"A", "A", "-1", "B", "B", "B", "B", "-1"},
                {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"},
                {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"},
                {"D", "D", "-1", "-1", "-1", "-1", "-1", "F"},
                {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}
        };

        System.out.println(solution.solution(mats, park));
    }

    public int solution(int[] mats, String[][] park) {
        int width = park.length;
        int height = park[0].length;

        Arrays.sort(mats);

        for (int index = mats.length - 1; index >= 0; index--) {
            int size = mats[index];
            if (canPlaceMat(size, park, width, height)) {
                return size;
            }
        }

        return -1;
    }

    public boolean canPlaceMat(int size, String[][] park, int width, int height) {
        for (int x = 0; x <= width - size; x++) {
            for (int y = 0; y <= height - size; y++) {
                if (checkArea(x, y, size, park)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean checkArea(int startX, int startY, int size, String[][] park) {
        for (int x = startX; x < startX + size; x++) {
            for (int y = startY; y < startY + size; y++) {
                if (!park[x][y].equals("-1")) {
                    return false;
                }
            }
        }

        return true;
    }
}
