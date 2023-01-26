package programmers.a_2_level;

public class Solution12951 {

    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] words = s.split(" ", -1);

        for (String word : words) {
            if (word.isEmpty()) {
                answer.append(" ");
                continue;
            }

            answer.append(word.substring(0, 1).toUpperCase())
                    .append(word.substring(1).toLowerCase())
                    .append(" ");
        }

        return answer.substring(0, answer.toString().length() - 1);
    }

    public static void main(String[] args) {
        String s = "  3people  unFollowed  me  ";
        System.out.println(solution(s));

        String s2 = "for the last week";
        System.out.println(solution(s2));
    }
}
