package programmers.a_0_level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution120956 {

    private static final List<String> babblingList = Arrays.asList("aya", "ye", "woo", "ma" );

    public static int solution(String[] babbling) {
        int count = 0;

        for (String babble : babbling) {
            String tempBabble = babble;
            for (String babbleList : babblingList) {
                if (tempBabble.contains(babbleList)) {
                    tempBabble = tempBabble.replace(babbleList, " ");
                }
            }
            if (tempBabble.trim().length() == 0) {
                ++count;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
        System.out.println(solution(babbling));

        String[] babbling2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        System.out.println(solution(babbling2));
    }
}
