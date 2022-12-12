package programmers.a_1_level;

public class Solution12934 {

    public static long solution(long n) {
        double x = Math.sqrt(n);
        return (Math.ceil(x) == Math.floor(x)) && !Double.isInfinite(x) ? (long) Math.pow(x + 1, 2) : -1;
    }

    public static void main(String[] args) {
        long n = 121;
        System.out.println(solution(n));

        long n2 = 3;
        System.out.println(solution(n2));
    }
}
