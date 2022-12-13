package programmers.a_0_level;

public class Solution120841 {

    public static int solution(int[] dot) {
        if (dot[0] > 0 && dot[1] > 0) {
            return 1;
        }
        if (dot[0] < 0 && dot[1] > 0) {
            return 2;
        }
        if (dot[0] < 0 && dot[1] < 0) {
            return 3;
        }
        return 4;
    }

    public static void main(String[] args) {
        int[] dot = {2, 4};
        System.out.println(solution(dot));

        int[] dot2 = {-7, 9};
        System.out.println(solution(dot2));
    }
}
