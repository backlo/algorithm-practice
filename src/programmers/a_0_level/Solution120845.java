package programmers.a_0_level;

public class Solution120845 {

    public static int solution(int[] box, int n) {
        int horizontalCount = box[0] / n;
        int verticalCount = box[1] / n;
        int heightCount = box[2] / n;

        return horizontalCount * verticalCount * heightCount;
    }

    public static void main(String[] args) {
        int[] box = {1, 1, 1};
        int n = 1;
        System.out.println(solution(box, n));

        int[] box2 = {10, 8, 6};
        int n2 = 3;
        System.out.println(solution(box2, n2));
    }
}
