package programmers.a_1_level;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution64061 {

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> bucket = new Stack<>();
        List<Stack<Integer>> parsingBoard = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            Stack<Integer> row = new Stack<>();
            for (int j = board.length - 1; j >= 0 ; j--) {
                if(board[j][i] != 0) {
                    row.push(board[j][i]);
                }
            }
            parsingBoard.add(row);
        }

        for (int move : moves) {
            Stack<Integer> selectBoard = parsingBoard.get(move - 1);
            if (selectBoard.isEmpty()) {
                continue;
            }
            int selectNumber = selectBoard.pop();

            if (!bucket.isEmpty() && bucket.peek() == selectNumber) {
                bucket.pop();
                answer = answer + 2;
                continue;
            }

            bucket.push(selectNumber);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] move = {1, 5, 3, 5, 1, 2, 1, 4};
        System.out.println(solution(board, move));
    }
}
