package programmers.a_1_level;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution1845 {

    public static int solution(int[] nums) {
        return Math.min(
                (nums.length / 2),
                Arrays.stream(nums)
                        .boxed()
                        .collect(Collectors.toSet())
                        .size()
        );
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3};
        System.out.println(solution(nums));

        int[] nums2 = {3, 3, 3, 2, 2, 4};
        System.out.println(solution(nums2));

        int[] nums3 = {3, 3, 3, 2, 2, 2};
        System.out.println(solution(nums3));
    }
}
