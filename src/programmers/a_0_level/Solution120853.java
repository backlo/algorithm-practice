package programmers.a_0_level;

public class Solution120853 {

    public static int solution(String s) {
        String[] sSplits = s.split(" ");
        int answer = 0;
        int temp = 0;

        for (String sSplit : sSplits) {
            if (sSplit.equals("Z")) {
                answer -= temp;
                continue;
            }
            answer += Integer.parseInt(sSplit);
            temp = Integer.parseInt(sSplit);
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "1 2 Z 3";
        System.out.println(solution(s));

        String s2 = "10 20 30 40";
        System.out.println(solution(s2));

        String s3 = "10 Z 20 Z 1";
        System.out.println(solution(s3));

        String s4 = "10 Z 20 Z";
        System.out.println(solution(s4));

        String s5 = "-1 -2 -3 Z";
        System.out.println(solution(s5));
    }
}
