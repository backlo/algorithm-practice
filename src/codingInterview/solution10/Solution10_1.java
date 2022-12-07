package codingInterview.solution10;

import java.util.Arrays;

public class Solution10_1 {

    public int[] solution(int[] a, int[] b) {
        int[] answer = new int[a.length + b.length];
        int indexA = a.length - 1;
        int indexB = b.length - 1;
        int indexMerged = a.length + b.length - 1;

        while (indexB >= 0) {
            if(indexA >= 0 && a[indexA] > b[indexB]) {
                answer[indexMerged] = a[indexA];
                indexA--;
            } else {
                answer[indexMerged] = b[indexB];
                indexB--;
            }
            indexMerged--;
        }

        while (indexA >= 0) {
            answer[indexMerged] = a[indexA];
            indexMerged--;
            indexA--;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution10_1 solution10_1 = new Solution10_1();
        int[] a = {1, 1, 2, 3, 4, 5, 6, 7};
        int[] b = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(solution10_1.solution(a, b)));
    }
}
