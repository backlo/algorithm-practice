package codingInterview.solution1;

public class Solution1_1 {

    public boolean solution(String text) {
        boolean[] charSet = new boolean[128];

        for (int i = 0; i < text.length(); i++) {
            int val = text.charAt(i);
            if(charSet[val]) {
                return false;
            }

            charSet[val] = true;
        }

        return true;
    }

    public static void main(String[] args) {
        Solution1_1 solution1_1 = new Solution1_1();
        System.out.println(solution1_1.solution("aabbc"));
        System.out.println(solution1_1.solution("abbc"));
        System.out.println(solution1_1.solution("abc"));
        System.out.println(solution1_1.solution("abcdefghiu"));
    }
}
