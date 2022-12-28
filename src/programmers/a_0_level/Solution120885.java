package programmers.a_0_level;

import java.math.BigInteger;

public class Solution120885 {

    public static String solution(String bin1, String bin2) {
        return Integer.toString(
                Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2), 2
        );
    }

    public static String solution2(String bin1, String bin2) {
        BigInteger binaryNumber1 = new BigInteger(bin1, 2);
        BigInteger binaryNumber2 = new BigInteger(bin2, 2);

        BigInteger sum = binaryNumber1.add(binaryNumber2);

        return sum.toString(2);
    }

    public static void main(String[] args) {
        String bin1 = "10";
        String bin2 = "11";
        System.out.println(solution(bin1, bin2));

        String bin3 = "1001";
        String bin4 = "1111";
        System.out.println(solution(bin3, bin4));
    }
}
