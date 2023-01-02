package programmers.a_0_level;

public class Solution120860 {

    public static int solution(int[][] dots) {
        int x = dots[0][0];
        int y = dots[0][1];
        int width = 0;
        int height = 0;

        for (int index = 1; index < dots.length; index++) {
            if (x != dots[index][0]) {
                width = Math.abs(x - dots[index][0]);
            }
            if (y != dots[index][1]) {
                height = Math.abs(y - dots[index][1]);
            }
        }


        return width * height;
    }

    public static void main(String[] args) {
        int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
        System.out.println(solution(dots));

        int[][] dots2 = {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};
        System.out.println(solution(dots2));
    }
}
