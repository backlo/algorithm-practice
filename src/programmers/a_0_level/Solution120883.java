package programmers.a_0_level;

public class Solution120883 {

    public static String solution(String[] id_pw, String[][] db) {
        for (String[] loginInfo : db) {
            if (id_pw[0].equals(loginInfo[0])) {
                if (!id_pw[1].equals(loginInfo[1])) {
                    return "wrong pw";
                }
                return "login";
            }
        }
        return "fail";
    }

    public static void main(String[] args) {
        String[] id_pw = {"meosseugi", "1234"};
        String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
        System.out.println(solution(id_pw, db));

        String[] id_pw2 = {"programmer01", "15789"};
        String[][] db2 = {{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};
        System.out.println(solution(id_pw2, db2));

        String[] id_pw3 = {"rabbit04", "98761"};
        String[][] db3 = {{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}};
        System.out.println(solution(id_pw3, db3));
    }
}
