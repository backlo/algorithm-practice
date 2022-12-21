package programmers.a_0_level;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution120839 {

    public static String solution(String rsp) {
        return Arrays.stream(rsp.split(""))
                .map(value -> winRsp(value))
                .collect(Collectors.joining());
    }

    private static String winRsp(String rsp) {
        if (rsp.equals("0")) {
            return "5";
        }
        if (rsp.equals("2")) {
            return "0";
        }
        return "2";
    }

    public static void main(String[] args) {
        String rsp = "2";
        System.out.println(solution(rsp));

        String rsp2 = "205";
        System.out.println(solution(rsp2));
    }
}
