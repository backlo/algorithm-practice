package codingInterview.solution1;

public class Solution1_3 {

    private String solution(String input) {
        return input.replaceAll(" ", "%20");
    }

    public static void main(String[] args) {
        Solution1_3 solution1_3 = new Solution1_3();
        String input = "Mr John Smith";

        System.out.println(solution1_3.solution(input));
    }
}
