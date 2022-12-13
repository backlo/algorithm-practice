package programmers.a_0_level;

public class Solution120826 {

    public static String solution(String my_string, String letter) {
        return my_string.replace(letter, "");
    }

    public static void main(String[] args) {
        String my_string = "abcdef";
        String letter = "f";
        System.out.println(solution(my_string, letter));

        String my_string2 = "BCBdbe";
        String letter2 = "B";
        System.out.println(solution(my_string2, letter2));
    }
}
