package programmers.a_0_level;

public class Solution120894 {

    public static long solution(String numbers) {
        String[] alphabets = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        for (int index = 0; index < alphabets.length; index++) {
            numbers = numbers.replaceAll(alphabets[index], digits[index]);
        }

        return Long.parseLong(numbers);
    }

    public static void main(String[] args) {
        String numbers = "onetwothreefourfivesixseveneightnine";
        System.out.println(solution(numbers));

        String numbers2 = "onefourzerosixseven";
        System.out.println(solution(numbers2));
    }
}
