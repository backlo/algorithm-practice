package programmers.a_0_level;

public class Solution120863 {

    public static String solution(String polynomial) {
        int xCount = 0;
        int constCount = 0;

        for (String s : polynomial.split(" ")) {
            if (s.equals("+")) continue;
            if (s.contains("x")) {
                xCount += s.equals("x") ? 1 : Integer.parseInt(s.replaceAll("x", ""));
                continue;
            }
            constCount += Integer.parseInt(s);
        }

        return (xCount != 0 ?
                (xCount > 1 ? xCount + "x" : "x") : "") +
                (constCount != 0 ?
                        (xCount != 0 ? " + " : "") +
                                constCount : xCount == 0 ? "0" : "");
    }

    public static void main(String[] args) {
        String polynomial = "3x + 7 + x";
        System.out.println(solution(polynomial));

        String polynomial2 = "x + x + x";
        System.out.println(solution(polynomial2));
    }
}
