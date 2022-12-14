package programmers.a_1_level;

public class Solution12943 {

    public static int solution(int num) {
        long tempLong = num;
        if (tempLong == 1) {
            return 0;
        }

        for (int index = 0; index < 500; index++) {
            if (tempLong == 1) {
                return index;
            }
            tempLong = (tempLong % 2 == 0) ?
                tempLong / 2 : tempLong * 3 + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
//        int num = 6;
//        System.out.println(solution(num));
//
//        int num2 = 16;
//        System.out.println(solution(num2));

        int num3 = 626331;
        System.out.println(solution(num3));
    }
}
