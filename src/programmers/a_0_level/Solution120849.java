package programmers.a_0_level;

public class Solution120849 {

    public static String solution(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }

    public static void main(String[] args) {
        String my_string = "bus";
        System.out.println(solution(my_string));

        String my_string2 = "nice to meet you";
        System.out.println(solution(my_string2));
    }
}
