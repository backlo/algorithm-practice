package programmers.a_0_level;

public class Solution120878 {

    public static int solution(int a, int b) {
        b = gcd(a, b);

        while (b != 1) {
            if (b % 2 == 0) {
                b /= 2;
            } else if (b % 5 == 0) {
                b /= 5;
            } else {
                return 2;
            }
        }

        return 1;
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static int solution2(int a, int b) {
        for (int index = 2; index <= Math.max(a, b); index++) {
            if (a % index == 0 && b % index == 0) {
                a = a / index;
                b = b / index;
            }
        }

        return isFiniteDecimal(b) ? 1: 2;
    }

    private static boolean isFiniteDecimal(int num) {
        while(num != 1) {
            if (num % 2 == 0) {
                num /= 2;
                continue;
            }
            if (num % 5 == 0) {
                num /= 5;
                continue;
            }

            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public static void main(String[] args) {
        int a = 7;
        int b = 20;
        System.out.println(solution(a, b));

        int a2 = 11;
        int b2 = 22;
        System.out.println(solution(a2, b2));

        int a3 = 12;
        int b3 = 21;
        System.out.println(solution(a3, b3));
    }
}
