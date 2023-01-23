package programmers.a_1_level;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution42576 {

    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int index = 0; index < completion.length; index++) {
            if (!participant[index].equals(completion[index])) {
                return participant[index];
            }
        }

        return participant[participant.length - 1];
    }

    public String solution2(String[] participant, String[] completion) {
        Map<String, Integer> players = new HashMap<>();

        for (String participantPlayer : participant) {
            players.put(participantPlayer, players.getOrDefault(participantPlayer, 0) + 1);
        }

        for (String completionPlayer : completion) {
            players.put(completionPlayer, players.get(completionPlayer) - 1);
        }

        return players.entrySet().stream()
                .filter(entry -> entry.getValue() != 0)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse("");
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
