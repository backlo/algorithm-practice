package programmers;

public class Solution43165 {
    private int count;

    public int solution(int[] numbers, int target) {
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

    public static void main(String[] args) {
        Solution43165 solution = new Solution43165();
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;

        System.out.println(solution.solution(numbers, target));
    }
}
