package codingInterview.solution1;

public class Solution1_9 {

    private boolean solution(String str1, String str2) {
        int length = str1.length();

        if (length == str2.length() && length > 0) {
            String s1s1 = str1 + str1;
            return isSubstring(s1s1, str2);
        }

        return false;
    }

    private boolean isSubstring(String newStr, String str2) {
        return newStr.contains(str2);
    }

    public static void main(String[] args) {
        Solution1_9 solution1_9 = new Solution1_9();
        System.out.println(solution1_9.solution("waterbottle", "erbottlewat"));
        System.out.println(solution1_9.solution("waterbottle", "erbottlewae"));
    }
}
