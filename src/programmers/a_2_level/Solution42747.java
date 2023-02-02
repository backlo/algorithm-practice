package programmers.a_2_level;

import java.util.Arrays;

public class Solution42747 {

    public static int solution(int[] citations) {
        int max = 0;
        Arrays.sort(citations);

        for (int index = citations.length - 1; index >= 0; index--) {
            int min = Math.min(citations[index], citations.length - index);
            if (max < min)
                max = min;
        }

        return max;
    }

    public int solution2(int[] citations) {
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

        for (int citation : citations) {
            if (citation > number) {
                ++beyondCount;
                continue;
            }
            if (citation == number) {
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
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(solution(citations));
    }
}
