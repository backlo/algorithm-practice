package programmers.a_1_level;

import java.util.Arrays;

public class Solution42748 {

    public static int[] solution(int[] array, int[][] commands) {
        int[] results = new int[commands.length];
        int resultIndex = 0;

        for (int[] command : commands) {
            int[] tempArray = Arrays.copyOfRange(array, command[0] - 1, command[1]);
            Arrays.sort(tempArray);
            results[resultIndex++] = tempArray[command[2] - 1];
        }

        return results;
    }

    public static int[] solution2(int[] array, int[][] commands) {
        int[] results = new int[commands.length];
        int resultIndex = 0;

        for (int[] command : commands) {
            int i = command[0];
            int j = command[1];
            int k = command[2];
            int[] rebuildArray = new int[j - i + 1];

            for (int index = i - 1; index <= j - 1; index++) {
                rebuildArray[index - i + 1] = array[index];
            }
            Arrays.sort(rebuildArray);

            results[resultIndex++] = rebuildArray[k - 1];
        }

        return results;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(solution(array, commands)));
    }

    public int[] solution3(int[] array, int[][] commands) {
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
}
