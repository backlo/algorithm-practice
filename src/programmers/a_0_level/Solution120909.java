package programmers.a_0_level;

public class Solution120909 {

    public static int solution(int n) {
        double sqrtNumber = Math.sqrt(n);
        return Math.ceil(sqrtNumber) == Math.floor(sqrtNumber) ? 1 : 2;
    }

    public static void main(String[] args) {
        int n = 144;
        System.out.println(solution(n));

        int n2 = 976;
        System.out.println(solution(n2));
    }
}
