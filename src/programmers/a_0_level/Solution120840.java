package programmers.a_0_level;

import java.math.BigInteger;

public class Solution120840 {

    public static int solution(int balls, int share) {
        return calculateFactory(balls).divide(calculateFactory(balls - share).multiply(calculateFactory(share))).intValue();
    }

    // todo combination recursive
    public long solution2(int balls, int share) {
        share = Math.min(balls - share, share);

        if (share == 0)
            return 1;

        long result = solution(balls - 1, share - 1);
        result *= balls;
        result /= share;

        return result;
    }

    private static BigInteger calculateFactory(int num) {
        BigInteger answer = BigInteger.valueOf(1);
        for (int index = 1; index <= num; index++) {
            answer = answer.multiply(BigInteger.valueOf(index));
        }

        return answer;
    }

    public static void main(String[] args) {
        int balls = 3;
        int share = 2;
        System.out.println(solution(balls, share));

        int balls2 = 5;
        int share2 = 3;
        System.out.println(solution(balls2, share2));
    }
}
