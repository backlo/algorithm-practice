package programmers.a_1_level;

import java.util.Arrays;

public class Solution17681 {

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answers = new String[arr1.length];

        for (int index = 0; index < arr1.length; index++) {
            StringBuilder lines = new StringBuilder();
            String binaryNumber1 = checkSize(getBinaryNumber(arr1[index]), n);
            String binaryNumber2 = checkSize(getBinaryNumber(arr2[index]), n);

            for (int jIndex = 0; jIndex < n; jIndex++) {
                if (binaryNumber1.charAt(jIndex) == '1' || binaryNumber2.charAt(jIndex) == '1') {
                    lines.append("#");
                    continue;
                }
                lines.append(" ");
            }
            answers[index] = lines.toString();
        }

        return answers;
    }

    private static String getBinaryNumber(int num) {
        return Integer.toBinaryString(num);
    }

    private static String checkSize(String binaryNum, int n) {
        StringBuilder binaryNumBuilder = new StringBuilder(binaryNum);

        while (binaryNumBuilder.length() != n) {
            binaryNumBuilder.insert(0, "0");
        }

        return binaryNumBuilder.toString();
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        System.out.println(Arrays.toString(solution(n, arr1, arr2)));

        int n2 = 6;
        int[] arr3 = {46, 33, 33, 22, 31, 50};
        int[] arr4 = {27, 56, 19, 14, 14, 10};
        System.out.println(Arrays.toString(solution(n2, arr3, arr4)));
    }
}
