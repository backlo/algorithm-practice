package programmers.a_1_level;

public class Solution136798 {

    public static int solution(int number, int limit, int power) {
        int answer = 0;

        for (int index = 1; index <= number; index++) {
            int count = getPrimesCount(index);
            if (count > limit)
                count = power;
            answer += count;
        }

        return answer;
    }

    private static int getPrimesCount(int number) {
        int count = 0;

        for (int index = 1; index <= Math.sqrt(number); index++) {
            if (index == Math.sqrt(number)) count++;
            else if (number % index == 0) count += 2;
        }

        return count;
    }


    public static void main(String[] args) {
        int number = 5;
        int limit = 3;
        int power = 2;
        System.out.println(solution(number, limit, power));

        int number2 = 10;
        int limit2 = 3;
        int power2 = 2;
        System.out.println(solution(number2, limit2, power2));
    }
}
