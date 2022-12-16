package programmers.a_1_level;

import java.util.stream.IntStream;

public class Solution76501 {

    public static int solution(int[] absolutes, boolean[] signs) {
        return IntStream.range(0, absolutes.length)
                .map(index -> (signs[index]) ? absolutes[index] : -absolutes[index])
                .sum();
    }

    public static void main(String[] args) {
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};
        System.out.println(solution(absolutes, signs));

        int[] absolutes2 = {1,2,3};
        boolean[] signs2 = {false,false,true};
        System.out.println(solution(absolutes2, signs2));
    }
}
