package programmers.a_1_level;

public class Solution132267 {

    public static int solution(int a, int b, int n) {
        int answer = 0;
        int totalCoke = n;

        while (totalCoke >= a) {
            answer += (totalCoke / a) * b;
            totalCoke = ((totalCoke / a) * b) + (totalCoke % a);
        }

        return answer;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int n = 20;
        System.out.println(solution(a, b, n));

        int a2 = 3;
        int b2 = 1;
        int n2 = 20;
        System.out.println(solution(a2, b2, n2));
    }
}
