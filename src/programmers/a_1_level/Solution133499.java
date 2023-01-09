package programmers.a_1_level;

public class Solution133499 {

    public static int solution(String[] babbling) {
        int answer = 0;

        for (String babble : babbling) {
            babble = babble.replaceAll("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$", "");
            if (babble.isEmpty()) {
                ++answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] babbling = {"aya", "yee", "u", "maa"};
        System.out.println(solution(babbling));

        String[] babbling2 = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        System.out.println(solution(babbling2));
    }
}
