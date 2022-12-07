package programmers;

import java.util.Arrays;

public class Solution42576 {

    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }

        return participant[participant.length - 1];
    }

    public static void main(String[] args) {
        Solution42576 solution = new Solution42576();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        System.out.println(solution.solution(participant, completion));

        String[] participant1 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion1 = {"josipa", "filipa", "marina", "nikola"};

        System.out.println(solution.solution(participant1, completion1));

        String[] participant2 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion2 = {"stanko", "ana", "mislav"};

        System.out.println(solution.solution(participant2, completion2));
    }
}
