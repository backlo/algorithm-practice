package programmers.a_1_level;

import java.time.LocalDate;

public class Solution12901 {

    public static String solution2(int a, int b) {
        return LocalDate.of(2016, a, b)
                .getDayOfWeek()
                .name()
                .substring(0,3);
    }

    public static String solution(int a, int b) {
        String[] dayOfWeeks = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] dayOfMonths = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDay = 0;

        for (int index = 0; index < a - 1; index++) {
            totalDay += dayOfMonths[index];
        }
        totalDay += (b - 1);

        return dayOfWeeks[totalDay % dayOfWeeks.length];
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        System.out.println(solution(a, b));
    }

}
