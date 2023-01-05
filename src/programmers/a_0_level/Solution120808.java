package programmers.a_0_level;

import java.util.Arrays;

public class Solution120808 {

    public static int[] solution(int denum1, int num1, int denum2, int num2) {
        int plusTimesDenum1 = num1 * denum2 + num2 * denum1;
        int commonNum = num1 * num2;
        int index = 2;

        while (index <= Math.min(plusTimesDenum1, commonNum)) {
            if (commonNum % index == 0 && plusTimesDenum1 % index == 0) {
                commonNum /= index;
                plusTimesDenum1 /= index;
                continue;
            }
            ++index;
        }

        return new int[]{plusTimesDenum1, commonNum};
    }

    public static int[] solution2(int denum1, int num1, int denum2, int num2) {
        int plusTimesDenum1 = num1 * denum2 + num2 * denum1;
        int commonNum = num1 * num2;
        int greatestCommonDivisor = GCD(plusTimesDenum1, commonNum);

        return new int[]{plusTimesDenum1 / greatestCommonDivisor, commonNum / greatestCommonDivisor};
    }

    public static int GCD(int num1, int num2) {
        if (num1 % num2 == 0)
            return num2;
        return GCD(num2, num1 % num2);
    }

    public static void main(String[] args) {
        int denum1 = 1;
        int num1 = 2;
        int denum2 = 3;
        int num2 = 4;
        System.out.println(Arrays.toString(solution(denum1, num1, denum2, num2)));

        int denum3 = 9;
        int num3 = 2;
        int denum4 = 1;
        int num4 = 3;
        System.out.println(Arrays.toString(solution(denum3, num3, denum4, num4)));
    }
}
