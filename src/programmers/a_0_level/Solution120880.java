package programmers.a_0_level;

import java.util.Arrays;

public class Solution120880 {

    public static int[] solution(int[] numlist, int n) {
        return Arrays.stream(numlist)
                .boxed()
                .sorted((o1, o2) -> {
                    if (Math.abs(n - o1) > Math.abs(n - o2)) return 1;
                    if (Math.abs(n - o1) < Math.abs(n - o2)) return -1;
                    return o2.compareTo(o1);
                })
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static void main(String[] args) {
        int[] numlist = {1, 2, 3, 4, 5, 6};
        int n = 4;
        System.out.println(Arrays.toString(solution(numlist, n)));

        int[] numlist2 = {10000,20,36,47,40,6,10,7000};
        int n2 = 30;
        System.out.println(Arrays.toString(solution(numlist2, n2)));
    }
}
