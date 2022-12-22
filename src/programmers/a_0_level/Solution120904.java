package programmers.a_0_level;

public class Solution120904 {

    public static int solution(int num, int k) {
        String numStr = String.valueOf(num);
        String kStr = String.valueOf(k);

        return numStr.contains(kStr) ? numStr.indexOf(kStr) + 1 : -1;
    }

    public static void main(String[] args) {
        int num = 29183;
        int k = 1;
        System.out.println(solution(num, k));

        int num2 = 232443;
        int k2 = 4;
        System.out.println(solution(num2, k2));

        int num3 = 123456;
        int k3 = 7;
        System.out.println(solution(num3, k3));
    }
}
