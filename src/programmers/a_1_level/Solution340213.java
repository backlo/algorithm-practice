package programmers.a_1_level;

public class Solution340213 {

    public static void main(String[] args) {
        Solution340213 solution = new Solution340213();

        String video_len = "10:55";
        String pos = "00:05";
        String op_start = "00:15";
        String op_end = "06:55";
        String[] commands = new String[]{"prev", "next", "next"};
        System.out.println(solution.solution(video_len, pos, op_start, op_end, commands));

        video_len = "34:33";
        pos = "13:00";
        op_start = "00:55";
        op_end = "02:55";
        commands = new String[]{"next", "prev"};
        System.out.println(solution.solution(video_len, pos, op_start, op_end, commands));

        video_len = "07:22";
        pos = "04:05";
        op_start = "00:15";
        op_end = "04:07";
        commands = new String[]{"next"};
        System.out.println(solution.solution(video_len, pos, op_start, op_end, commands));
    }

    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoLength = second(video_len);
        int position = second(pos);
        int openingStart = second(op_start);
        int openingEnd = second(op_end);

        if(position >= openingStart && position <= openingEnd) {
            position = openingEnd;
        }

        for (String command : commands) {
            if (command.equals("prev")) {
                position = Math.max(position - 10, 0);
            }

            if (command.equals("next")) {
                position = Math.min(position + 10, videoLength);
            }

            if (position >= openingStart && position <= openingEnd) {
                position = openingEnd;
            }
        }

        int minute = position / 60;
        int second = position % 60;

        return String.format("%02d:%02d", minute, second);

    }

    public static int second(String time) {
        String[] timeParts = time.split(":");
        int minutes = Integer.parseInt(timeParts[0]);
        int seconds = Integer.parseInt(timeParts[1]);

        return minutes * 60 + seconds;
    }

}
