package programmers.a_1_level;

public class Solution12977 {

    public static int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    answer += isPrime(sum) ? 1: 0;
                }
            }
        }

        return answer;
    }

    private static boolean isPrime(int num) {
        for (int index = 2; index < num; index++) {
            if (num % index == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] num = {1,2,3,4};
        System.out.println(solution(num));

        int[] num2 = {1,2,7,6,4};
        System.out.println(solution(num2));
    }
}
