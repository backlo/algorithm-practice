package programmers.a_0_level;

public class Solution120820 {

    public static int solution(int age) {
        return 2022 - age + 1;
    }

    public static void main(String[] args) {
        int age = 40;
        System.out.println(solution(age));

        int age2 = 23;
        System.out.println(solution(age2));
    }
}
