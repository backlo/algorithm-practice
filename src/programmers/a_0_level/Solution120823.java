package programmers.a_0_level;

import java.util.Scanner;

public class Solution120823 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int index = 1; index <= n; index++) {
            System.out.println("*".repeat(Math.max(0, index)));
        }
    }
}
