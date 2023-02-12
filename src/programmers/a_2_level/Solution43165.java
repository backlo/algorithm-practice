package programmers.a_2_level;

public class Solution43165 {

    public static int solution(int[] numbers, int target) {
        return findTarget(numbers, 0, 0, target);
    }

    public static int findTarget(int[] numbers, int n, int sum, int target) {
        if (n == numbers.length) {
            if (sum == target) {
                return 1;
            }
            return 0;
        }
        return findTarget(numbers, n + 1, sum + numbers[n], target) + findTarget(numbers, n + 1, sum - numbers[n], target);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println(solution(numbers, target));

        int[] numbers2 = {4, 1, 2, 1};
        int target2 = 4;
        System.out.println(solution(numbers2, target2));
    }


    private int count;

    public int solution2(int[] numbers, int target) {
        count = 0;
        makeTarget(numbers, 0, target, 0);

        return count;
    }

    public void makeTarget(int[] numbers, int expect, int target, int presentIndex) {
        if (presentIndex == numbers.length) {
            if (target == expect) {
                ++count;
            }
            return;
        }

        makeTarget(numbers, expect + numbers[presentIndex], target, presentIndex + 1);
        makeTarget(numbers, expect - numbers[presentIndex], target, presentIndex + 1);
    }
}
