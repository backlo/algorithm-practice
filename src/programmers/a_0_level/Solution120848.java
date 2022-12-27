package programmers.a_0_level;

public class Solution120848 {

    public static int solution(int n) {
        int factorial = 1;
        int count = 1;

        while(n > factorial) {
            factorial *= ++count;
            if (factorial > n) {
                count = count -1;
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 3628800;
        System.out.println(solution(n));

        int n2 = 7;
        System.out.println(solution(n2));
    }
}
