package programmers.a_1_level;

import java.util.ArrayList;
import java.util.List;

public class Solution140108 {

    public static int solution(String s) {
        List<String> results = new ArrayList<>();
        String[] alphabets = s.split("");

        for (int index = 0; index < alphabets.length; index++) {
            String firstAlphabet = alphabets[index];
            int firstAlphabetCount = 1;
            int anotherAlphabetCount = 0;

            for (int jIndex = index + 1; jIndex < alphabets.length; jIndex++) {
                String nextAlphabet = alphabets[jIndex];

                if (firstAlphabet.equals(nextAlphabet)) {
                    ++firstAlphabetCount;
                } else {
                    ++anotherAlphabetCount;
                }

                if (firstAlphabetCount == anotherAlphabetCount) {
                    results.add(s.substring(index, jIndex + 1));
                    index = jIndex;
                    break;
                }

                if (jIndex == alphabets.length - 1) {
                    index = jIndex;
                }
            }
        }

        if (String.join("", results).length() != s.length()) {
            results.add(s.substring(String.join("", results).length()));
        }

        return results.size();
    }

    public int solution2(String s) {
        int answer = 0;
        int count = 0;
        char initAlphabet = s.charAt(0);

        for (char alphabet : s.toCharArray()) {
            if (count == 0) initAlphabet = alphabet;
            if (initAlphabet == alphabet) {
                count++;
            } else {
                count--;
            }
            if (count == 0) answer++;
        }
        if (count > 0) answer++;

        return answer;
    }

    public static void main(String[] args) {
        String s = "aab";
        System.out.println(solution(s));

        String s2 = "abracadabra";
        System.out.println(solution(s2));

        String s3 = "aaabbaccccabba";
        System.out.println(solution(s3));
    }
}
