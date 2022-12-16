package programmers.a_0_level;

public class Solution120908 {

    public static int solution(String str1, String str2) {
        return str1.contains(str2) ? 1 : 2;
    }

    public static void main(String[] args) {
        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD";
        System.out.println(solution(str1, str2));

        String str3 = "ppprrrogrammers";
        String str4 = "pppp";
        System.out.println(solution(str3, str4));
    }
}
