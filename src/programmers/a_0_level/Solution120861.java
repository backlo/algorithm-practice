package programmers.a_0_level;

import java.util.Arrays;

public class Solution120861 {

    public static int[] solution(String[] keyInput, int[] board) {
        int widthAbs = board[0] / 2;
        int heightAbs = board[1] / 2;
        int x = 0;
        int y = 0;

        for (String key : keyInput) {
            if (key.equals("left")) {
                if (x <= -widthAbs) {
                    continue;
                }
                x -= 1;
            }

            if (key.equals("right")) {
                if (x >= widthAbs) {
                    continue;
                }
                x += 1;
            }

            if (key.equals("down")) {
                if (y <= -heightAbs) {
                    continue;
                }
                y -= 1;
            }

            if (key.equals("up")) {
                if (y >= heightAbs) {
                    continue;
                }
                y += 1;
            }
        }

        return new int[]{x, y};
    }

    public static void main(String[] args) {
        String[] keyInput = {"left", "right", "up", "right", "right"};
        int[] board = {11, 11};
        System.out.println(Arrays.toString(solution(keyInput, board)));

        String[] keyInput2 = {"down", "down", "down", "down", "down", "left", "left", "left", "left", "left"};
        int[] board2 = {7, 9};
        System.out.println(Arrays.toString(solution(keyInput2, board2)));
    }
}
