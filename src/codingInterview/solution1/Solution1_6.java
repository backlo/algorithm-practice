package codingInterview.solution1;

public class Solution1_6 {

    public String solution(String str) {
        int size = countSbSize(str);
        StringBuilder sb = new StringBuilder(size);

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                sb.append(str.charAt(i));
                sb.append(count);
                count = 0;
            }
        }

        return sb.toString();
    }

    public int countSbSize(String str) {
        int count = 0;
        int size = 0;

        for (int i = 0; i < str.length(); i++) {
            count++;
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                size += 1 + String.valueOf(count).length();
                count = 0;
            }
        }
        return size;
    }

    public static void main(String[] args) {
        Solution1_6 solution1_6 = new Solution1_6();
        System.out.println(solution1_6.solution("aabbcccccaaaaaa"));
        System.out.println(solution1_6.solution("aabkdienfjepalvmnck"));
    }
}
