package programmers.a_0_level;

public class Solution120843 {

    public static int solution(int[] numbers, int k) {
        int order = 1;

        for (int index = 1; index < k; index++) {
            order += 2;
            if (order == numbers.length + 1) {
                order = 1;
                continue;
            }
            if (order == numbers.length + 2) {
                order = 2;
            }
        }

        return numbers[order - 1];
    }

    private static int solution2(int[] numbers, int k) {
        return numbers[(k - 1) * 2 % numbers.length];
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        int k = 2;
        System.out.println(solution(numbers, k));

        int[] numbers2 = {1, 2, 3, 4, 5, 6};
        int k2 = 5;
        System.out.println(solution(numbers2, k2));

        int[] numbers3 = {1, 2, 3};
        int k3 = 3;
        System.out.println(solution(numbers3, k3));
    }
}
