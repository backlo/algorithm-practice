package programmers.a_0_level;

public class Solution120887 {

    public static int solution(int i, int j, int k) {
        int result = 0;
        for (int index = i; index <= j; index++) {
            result = result + (int) String.valueOf(index).chars()
                    .filter(chr -> Character.getNumericValue(chr) == k)
                    .count();
        }

        return result;
    }

    public static void main(String[] args) {
        int i = 1;
        int j = 13;
        int k = 1;
        System.out.println(solution(i, j, k));

        int i2 = 10;
        int j2 = 50;
        int k2 = 5;
        System.out.println(solution(i2, j2, k2));

        int i3 = 3;
        int j3 = 10;
        int k3 = 2;
        System.out.println(solution(i3, j3, k3));
    }
}
