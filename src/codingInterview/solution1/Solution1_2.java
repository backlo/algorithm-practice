package codingInterview.solution1;

public class Solution1_2 {

    public boolean solution(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] letters = new int[128];
        char[] sArray = s.toCharArray();

        for (char c : sArray) {
            letters[c]++;
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            letters[c]--;
            if (letters[c] < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution1_2 solution1_2 = new Solution1_2();

        System.out.println(solution1_2.solution("abcd", "dcba"));
        System.out.println(solution1_2.solution("abcd", "dca"));
    }
}
