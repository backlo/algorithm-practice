package programmers.a_1_level;

public class Solution81301 {

    enum Number {
        ZERO(0, "zero"),
        ONE(1, "one"),
        TWO(2, "two"),
        THREE(3, "three"),
        FOUR(4, "four"),
        FIVE(5, "five"),
        SIX(6, "six"),
        SEVEN(7, "seven"),
        EIGHT(8, "eight"),
        NINE(9, "nine");

        private final int num;
        private final String numString;

        Number(int num, String numString) {
            this.num = num;
            this.numString = numString;
        }

        public static String changeNumberString(String s) {
            for (Number number : values()) {
                s = s.replace(number.numString,  String.valueOf(number.num));
            }
            return s;
        }
    }

    public static int solution(String s) {
        return Integer.parseInt(Number.changeNumberString(s));
    }

    public static void main(String[] args) {
        String s = "one4seveneight";
        System.out.println(solution(s));

        String s2 = "23four5six7";
        System.out.println(solution(s2));

        String s3 = "2three45sixseven";
        System.out.println(solution(s3));

        String s4 = "123";
        System.out.println(solution(s4));
    }
}
