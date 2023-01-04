package programmers.a_0_level;

public class Solution120921 {

    public static int solution(String A, String B) {
        String changeA = A;

        for (int index = 0; index < A.length(); index++) {
            if(changeA.equals(B)) {
                return index;
            }
            String lastAlphabet = changeA.substring(A.length() - 1);
            changeA = lastAlphabet + changeA.substring(0, A.length() - 1);
        }

        return -1;
    }

    public static void main(String[] args) {
        String A = "hello";
        String B = "ohell";
        System.out.println(solution(A, B));

        String A2 = "apple";
        String B2 = "elppa";
        System.out.println(solution(A2, B2));
    }
}
