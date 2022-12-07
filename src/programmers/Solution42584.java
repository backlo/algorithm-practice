package programmers;

import java.util.Arrays;

public class Solution42584 {

    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length ; i++) {
            int price = prices[i];
            int count = 0;
            for (int j = i + 1; j < prices.length; j++) {
                ++count;
                if (price > prices[j]) {
                    break;
                }
            }
            answer[i] = count;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution42584 solution = new Solution42584();
        int[] prices = {1, 2, 3, 2, 3};
        System.out.println(Arrays.toString(solution.solution(prices)));
    }
}
