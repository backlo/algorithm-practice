package programmers.a_1_level;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Solution12916 {

    public static boolean solution(String s) {
        Map<String, Integer> results = new HashMap<>(
                Map.of("p", 0, "y", 0)
        );

        for (String str : s.toLowerCase(Locale.ROOT).split("")) {
            if (str.equals("p") || str.equals("y"))
                results.put(str, results.get(str) + 1);
        }

        return results.get("p").equals(results.get("y"));
    }

    public static void main(String[] args) {
        String s = "pPoooyY";
        System.out.println(solution(s));

        String s2 = "Pyy";
        System.out.println(solution(s2));
    }
}
