package programmers.a_2_level;

import java.util.Arrays;

public class Solution70129 {

    public static int[] solution(String s) {
        int countConvert = 0;
        int countZero = 0;

        while (!s.equals("1")) {
            ++countConvert;

            String temp = s.replaceAll("0", "");
            countZero += s.length() - temp.length();

            s = Integer.toBinaryString(temp.length());
        }

        return new int[]{countConvert, countZero};
    }

    public static void main(String[] args) {
        String s = "110010101001";
        System.out.println(Arrays.toString(solution(s)));

        String s2 = "01110";
        System.out.println(Arrays.toString(solution(s2)));

        String s3 = "1111111";
        System.out.println(Arrays.toString(solution(s3)));
    }
}
