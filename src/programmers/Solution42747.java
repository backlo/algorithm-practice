package programmers;

import java.util.Arrays;

public class Solution42747 {

    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);

        for (int i = 0; i < citations[citations.length - 1]; i++) {
            answer = getMaxCitation(i, citations, answer);
        }

        return answer;
    }

    private int getMaxCitation(int number, int[] citations, int max) {
        int beyondCount = 0;
        int belowCount = 0;

        for (int i = 0; i < citations.length; i++) {
            if (citations[i] > number) {
                ++beyondCount;
                continue;
            }
            if (citations[i] == number) {
                ++belowCount;
                ++beyondCount;
                continue;
            }
            ++belowCount;
        }

        if (number <= belowCount && number >= beyondCount) {
            return Math.max(max, number);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution42747 solution = new Solution42747();
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(solution.solution(citations));
    }
}
