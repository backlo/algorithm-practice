package codingInterview.solution1;

public class Solution1_4 {

    public boolean solution(String phrase) {
        int[] table = buildCharacterFrequencyTable(phrase);
        return checkOdd(table);
    }

    private boolean checkOdd(int[] table) {
        boolean odd = false;
        for (int value : table) {
            if(value % 2 == 1) {
                if (odd) {
                   return false;
                }
                odd = true;
            }
        }
        return true;
    }

    private int[] buildCharacterFrequencyTable(String phrase) {
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];

        for (char c : phrase.toCharArray()) {
            int val = getCharacterNumber(c);
            if (val != -1) {
                table[val]++;
            }
        }
        return table;
    }

    private int getCharacterNumber(char c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);

        if (val >= a && val <= z) {
            return val - a;
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution1_4 solution1_4 = new Solution1_4();

        System.out.println(solution1_4.solution("ababaaba"));
        System.out.println(solution1_4.solution("taco cat"));
        System.out.println(solution1_4.solution("tact coa"));
        System.out.println(solution1_4.solution("atco cta"));
    }
}
