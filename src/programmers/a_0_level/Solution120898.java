package programmers.a_0_level;

public class Solution120898 {

    public static int solution(String message) {
        return message.length() * 2;
    }

    public static void main(String[] args) {
        String message = "happy birthday!";
        System.out.println(solution(message));

        String message2 = "I love you~";
        System.out.println(solution(message2));
    }
}
