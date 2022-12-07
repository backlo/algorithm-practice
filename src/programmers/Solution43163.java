package programmers;

public class Solution43163 {

    public int solution(String begin, String target, String[] words) {
        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < words.length; i++) {
            boolean[] visited = new boolean[words.length];
            if (isChange(begin, words[i])) {
                answer = Math.min(answer, dfs(words, visited, words[i], target, 0, i));
            }
        }

        return answer == words.length + 1 ? 0 : answer;
    }

    private int dfs(String[] words, boolean[] visited, String begin, String target, int count, int index) {
        if (begin.equals(target)) {
            return count;
        }

        if (visited[index]) {
            return count;
        }

        visited[index] = true;
        int answer = 0;

        for (int i = 0; i < words.length; i++) {
            if (index != i && !visited[i] && isChange(begin, words[i])) {
                answer = dfs(words, visited, words[i], target, ++count, i);
            }
        }

        return answer;
    }

    private boolean isChange(String s1, String s2) {
        int count = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                ++count;
            }
        }

        return count == 1;
    }

    public static void main(String[] args) {
        Solution43163 solution = new Solution43163();
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};

        System.out.println(solution.solution("hit", "cog", words));
    }
}
