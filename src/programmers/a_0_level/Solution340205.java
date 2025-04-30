package programmers.a_0_level;

import java.util.Scanner;

public class Solution340205 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;

        while(number != 0) {
            answer += number % 100;
            number /= 100;
        }

        System.out.println(answer);
    }
}
