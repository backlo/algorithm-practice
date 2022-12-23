package programmers.a_1_level;

public class Solution12930 {

    public static String solution(String s) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        String[] sSplits = s.split("");

        for (String sSplit : sSplits) {
            count = sSplit.contains(" ") ? 0 : count + 1;
            result.append(
                    count % 2 == 0 ?
                            sSplit.toLowerCase() :
                            sSplit.toUpperCase()
            );
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = " try hello world";
        System.out.println(solution(s));
    }
}
