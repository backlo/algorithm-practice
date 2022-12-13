package programmers.a_0_level;

public class Solution120816 {

    public static int solution(int slice, int n) {
        int minPizza = n / slice;
        int plusPizza = n % slice == 0 ? 0 : 1;

        return minPizza + plusPizza;
    }

    public static void main(String[] args) {
        int slice = 7;
        int n = 10;
        System.out.println(solution(slice, n));

        int slice2 = 4;
        int n2 = 12;
        System.out.println(solution(slice2, n2));
    }
}
