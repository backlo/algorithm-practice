package codingInterview.solution10;

import java.util.*;

public class Solution10_2 {

    private String[] solution(String[] array) {
        Map<String, List<String>> maps = new HashMap<>();

        for (String s : array) {
            String key = sortChars(s);
            if (!maps.containsKey(key)) {
                List<String> list = new ArrayList<>();
                list.add(s);
                maps.put(key, list);
                continue;
            }
            List<String> list = maps.get(key);
            list.add(s);
            maps.put(key, list);
        }

        int index = 0;
        for (String key : maps.keySet()) {
            List<String> list = maps.get(key);
            for (String s : list) {
                array[index++] = s;
            }
        }

        return array;
    }

    private String sortChars(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public static void main(String[] args) {
        String[] array = {"acre", "race", "care", "abcd", "dbca", "vvcd", "cdvv", "rcae", "bcad", "vdcv"};

        Solution10_2 solution10_2 = new Solution10_2();
        System.out.println(Arrays.toString(solution10_2.solution(array)));
    }

}
