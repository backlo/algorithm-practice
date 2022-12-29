package programmers.a_0_level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution120913 {

    public static String[] solution(String my_str, int n) {
        List<String> results = new ArrayList<>();

        for (int index = 0; index < my_str.length(); index += n) {
            String subStringMyStr = (my_str.length() - index < n) ?
                    my_str.substring(index) : my_str.substring(index, index + n);
            results.add(subStringMyStr);
        }

        return results.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String my_str = "abc1Addfggg4556b";
        int n = 6;
        System.out.println(Arrays.toString(solution(my_str, n)));

        String my_str2 = "abcdef123";
        int n2 = 3;
        System.out.println(Arrays.toString(solution(my_str2, n2)));
    }
}
