package programmers.a_0_level;

public class Solution120815 {

    public static int solution(int n) {
        int count = 1;
        while ((6 * count) % n != 0) {
            ++count;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(solution(n));

        int n2 = 10;
        System.out.println(solution(n2));

        int n3 = 4;
        System.out.println(solution(n3));
    }
}
