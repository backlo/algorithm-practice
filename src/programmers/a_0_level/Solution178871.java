package programmers.a_0_level;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution178871 {

    public static void main(String[] args) {
        Solution178871 solution = new Solution178871();
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        System.out.println(Arrays.toString(solution.solution(players, callings)));
    }

    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> games = new HashMap<>();

        for (int index = 0; index < players.length; index++) {
            games.put(players[index], index);
        }

        for (String calling : callings) {
            int rank = games.get(calling);

            String passedPlayer = players[rank - 1];
            players[rank - 1] = calling;
            players[rank] = passedPlayer;

            games.put(calling, rank - 1);
            games.put(passedPlayer, rank);
        }

        return players;
    }
}
