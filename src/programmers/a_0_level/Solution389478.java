package programmers.a_0_level;

public class Solution389478 {

    public static void main(String[] args) {
        Solution389478 solution = new Solution389478();
        System.out.println(solution.solution(22, 6, 8));
        System.out.println(solution.solution(13, 3, 6));
    }

    public int solution(int n, int w, int num) {
        int answer = 0;
        int row = (num - 1) / w;
        int col = (row % 2 == 0) ? (num - 1) % w : (w - 1 - (num - 1) % w);

        for (; row < (n + w - 1) / w; row++) {
            int aboveBox = (row % 2 == 0) ? col + row * w : (w - 1 - col) + row * w;
            if (aboveBox < n) answer++;
        }

        return answer;
    }
}
