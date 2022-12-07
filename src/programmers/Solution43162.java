package programmers;


import java.util.*;

public class Solution43162 {

    public int solutionBFS(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                ++answer;
                bfs(computers, visited, i);
            }
        }

        return answer;
    }

    private void bfs(int[][] computers, boolean[] visited, int index) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < computers.length; i++) {
            if (!visited[i] && computers[index][i] == 1) {
                visited[i] = true;
                queue.add(i);
            }
        }

        while(!queue.isEmpty()) {
            int[] connectComputerInfo = computers[queue.poll()];
            for (int i = 0; i < computers.length; i++) {
                if (!visited[i] && connectComputerInfo[i] == 1) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    public int solutionDFS(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < computers.length; i++) {
            if(!visited[i]) {
                answer++;
                dfs(i, visited, computers);
            }
        }

        return answer;
    }

    public void dfs(int index, boolean[] visited, int[][] computers) {
        visited[index] = true;

        for (int i = 0; i < computers.length; i++) {
            if(!visited[i] && computers[index][i] == 1) {
                dfs(i, visited, computers);
            }
        }
    }

    public static void main(String[] args) {
        Solution43162 solution = new Solution43162();

        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
//        System.out.println(solution.solutionBFS(3, computers));

        int[][] computers1 = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
//        System.out.println(solution.solutionBFS(3, computers1));

        int[][] computers2 = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        System.out.println(solution.solutionBFS(3, computers2));
    }
}
