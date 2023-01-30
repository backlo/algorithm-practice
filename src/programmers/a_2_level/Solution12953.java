package programmers.a_2_level;

public class Solution12953 {

    public static int solution(int[] arr) {
        int answer = 1;

        for (int index : arr) {
            answer = getLCM(answer, index);
        }

        return answer;
    }

    private static int getLCM(int num1, int num2) {
        return num1 * num2 / getGCD(num1, num2);
    }

    private static int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }

        return getGCD(num2, num1 % num2);
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 14};
        System.out.println(solution(arr));

        int[] arr2 = {1, 2, 3};
        System.out.println(solution(arr2));
    }
}
