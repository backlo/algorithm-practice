package programmers.a_1_level;

public class Solution12918 {

    public static boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }

        return s.chars()
                .allMatch(Character::isDigit);
    }

    public static void main(String[] args) {
        String s = "a234";
        System.out.println(solution(s));

        String s2 = "1234";
        System.out.println(solution(s2));
    }
}
