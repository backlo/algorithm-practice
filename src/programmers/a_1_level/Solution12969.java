package programmers.a_1_level;

import java.util.Scanner;

public class Solution12969 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < b; i++) {
            System.out.println("*".repeat(Math.max(0, a)));
        }
    }
}
