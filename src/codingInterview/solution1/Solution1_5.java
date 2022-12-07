package codingInterview.solution1;

public class Solution1_5 {

    public boolean solution(String before, String after) {
        if (before.length() == after.length()) {
            return onEditReplace(before, after);
        }
        if (before.length() - 1 == after.length()) {
            return onEditInsert(after, before);
        }
        if (before.length() + 1 == after.length()) {
            return onEditInsert(before, after);
        }
        return false;
    }

    private boolean onEditInsert(String s1, String s2) {
        int index1 = 0;
        int index2 = 0;

        while (index2 < s2.length() && index1 < s1.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    private boolean onEditReplace(String before, String after) {
        boolean foundDifference = false;

        for (int i = 0; i < before.length(); i++) {
            if (before.charAt(i) != after.charAt(i)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution1_5 solution1_5 = new Solution1_5();

        System.out.println(solution1_5.solution("pale", "ple"));
        System.out.println(solution1_5.solution("pales", "pale"));
        System.out.println(solution1_5.solution("pale", "bale"));
        System.out.println(solution1_5.solution("pale", "bae"));
    }
}
