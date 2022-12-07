package programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution42577 {

    public boolean solution(String[] phone_book) {
        List<String> phoneBooks = Arrays.asList(phone_book);
        phoneBooks.sort(Comparator.comparingInt(String::length));

        for (int i = 0; i < phoneBooks.size() - 1; i++) {
            for (int j = i + 1; j < phoneBooks.size(); j++) {
                if (phoneBooks.get(j).startsWith(phoneBooks.get(i))) return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution42577 solution = new Solution42577();
        String[] phone_book = {"119", "97674223", "1195524421"};

        System.out.println(solution.solution(phone_book));
    }
}
