package programmers.a_0_level;

public class Solution120924 {

    public static int solution(int[] common) {
        int firstIndexMinus = common[1] - common[0];
        int secondIndexMinus = common[2] - common[1];

        if (firstIndexMinus == secondIndexMinus) {
            return common[common.length - 1] + firstIndexMinus;
        }

        return common[common.length - 1] * (secondIndexMinus / firstIndexMinus);
    }

    public static void main(String[] args) {
        int[] common = {1, 2, 3, 4};
        System.out.println(solution(common));

        int[] common2 = {2, 4, 8};
        System.out.println(solution(common2));
    }
}
