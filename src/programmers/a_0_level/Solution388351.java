package programmers.a_0_level;

public class Solution388351 {

    public static void main(String[] args) {
        Solution388351 solution = new Solution388351();
        int[] schedules = {700, 800, 1100};
        int[][] timelogs = {
                {710, 2359, 1050, 700, 650, 631, 659},
                {800, 801, 805, 800, 759, 810, 809},
                {1105, 1001, 1002, 600, 1059, 1001, 1100}
        };
        int startday = 5;

        System.out.println(solution.solution(schedules, timelogs, startday));
    }

    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;

        for (int index = 0; index < schedules.length; index++) {
            int hour = schedules[index] / 100;
            int minute = schedules[index] % 100;
            int newTime = (hour * 100 + minute + 10);
            if (newTime % 100 >= 60) {
                newTime += 40;
            }
            schedules[index] = newTime;
        }

        for (int index = 0; index < schedules.length; index++) {
            int schedule = schedules[index];
            int[] timelog = timelogs[index];
            int validDays = 0;
            int successDays = 0;

            for (int jIndex = 0; jIndex < timelog.length; jIndex++) {
                int currentDay = (startday + jIndex) % 7;

                if (currentDay == 6 || currentDay == 0) {
                    continue;
                }

                validDays++;
                int time = timelog[jIndex];

                if (schedule >= time ) {
                    successDays++;
                }
            }

            if (validDays == 5 && successDays == 5) {
                answer++;
            }
        }

        return answer;
    }
}
