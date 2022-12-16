package programmers.a_1_level;

public class Solution12903 {

    public static String solution(String s) {
        String[] splitStr = s.split("");

        int middleIndex = splitStr.length / 2;

        return (splitStr.length % 2 == 1) ?
                splitStr[middleIndex] :
                splitStr[middleIndex - 1] + splitStr[middleIndex];
    }

    public static String solution2(String s) {
        return s.substring((s.length() - 1) / 2, s.length() / 2 + 1);
    }

    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(solution2(s));

        String s2 = "qwer";
        System.out.println(solution2(s2));
    }
}
