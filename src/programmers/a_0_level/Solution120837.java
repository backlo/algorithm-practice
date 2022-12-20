package programmers.a_0_level;

public class Solution120837 {

    public static int solution(int hp) {
        int generalAntCount = hp / 5;
        int soliderAntCount = (hp % 5) / 3;
        int workerAntCount = ((hp % 5) % 3);

        return generalAntCount + soliderAntCount + workerAntCount;
    }

    public static void main(String[] args) {
        int hp = 23;
        System.out.println(solution(hp));

        int hp2 =24;
        System.out.println(solution(hp2));

        int hp3 = 999;
        System.out.println(solution(hp3));
    }
}
