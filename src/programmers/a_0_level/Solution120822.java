package programmers.a_0_level;

public class Solution120822 {

    public static String solution(String my_string) {
        return new StringBuilder(my_string)
                .reverse()
                .toString();
    }

    public static void main(String[] args) {
        String my_string = "jaron";
        System.out.println(solution(my_string));

        String my_string2 = "bread";
        System.out.println(solution(my_string2));
    }
}
