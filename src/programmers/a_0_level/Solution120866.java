package programmers.a_0_level;

import java.util.Arrays;

public class Solution120866 {

    public static int solution(int[][] board) {
        for (int index = 0; index < board.length; index++) {
            for (int jIndex = 0; jIndex < board[index].length; jIndex++) {
                if (board[index][jIndex] == 1) {
                    checkMineBoard(index, jIndex, board);
                }
            }
        }

        return Arrays.stream(board)
                .mapToInt(boardLine -> (int) Arrays.stream(boardLine)
                        .filter(boardInfo -> boardInfo == 0)
                        .count()
                )
                .sum();
    }

    private static void checkMineBoard(int row, int col, int[][] board) {
        for (int index = row - 1; index <= row + 1; index++) {
            if (index < 0 || index >= board.length) continue;

            for (int jIndex = col - 1; jIndex <= col + 1; jIndex++) {
                if (jIndex < 0 || jIndex >= board[index].length) continue;
                if (board[index][jIndex] == 1) continue;

                board[index][jIndex] = 2;
            }
        }
    }

    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
        System.out.println(solution(board));

        int[][] board2 = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}};
        System.out.println(solution(board2));

        int[][] board3 = {{1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}};
        System.out.println(solution(board3));

        int[][] board4 = {{0}};
        System.out.println(solution(board4));
    }
}
