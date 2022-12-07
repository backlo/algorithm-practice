package programmers;

import java.util.Arrays;

public class Solution42748 {

    public int[] solution(int[] array, int[][] commands) {
        CommandInfo[] commandInfos = new CommandInfo[commands.length];
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] command = commands[i];
            commandInfos[i] = new CommandInfo(array, command[0], command[1], command[2]);
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = commandInfos[i].getNumber();
        }
        return answer;
    }

    static class CommandInfo {
        private final int[] array;
        private final int i;
        private final int j;
        private final int k;

        public CommandInfo(int[] array, int i, int j, int k) {
            this.array = array;
            this.i = i - 1;
            this.j = j - 1;
            this.k = k - 1;
        }

        public int getNumber() {
            int[] getArrayNumbers = new int[j - i + 1];
            for (int l = 0; l < getArrayNumbers.length; l++) {
                getArrayNumbers[l] = array[l + i];
            }
            Arrays.sort(getArrayNumbers);
            return getArrayNumbers[k];
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        Solution42748 solution = new Solution42748();
        System.out.println(Arrays.toString(solution.solution(array, commands)));
    }
}
