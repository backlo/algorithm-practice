package programmers.a_0_level;

public class Solution120869 {

    public static int solution(String[] spell, String[] dic) {
        for (int index = 0; index < dic.length; index++) {
            for (String s : spell) {
                if (!dic[index].contains(s)) {
                    dic[index] = "";
                    break;
                }
            }
            if (!dic[index].equals("")) return 1;
        }

        return 2;
    }

    public static void main(String[] args) {
        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
        System.out.println(solution(spell, dic));

        String[] spell2 = {"z", "d", "x"};
        String[] dic2 = {"def", "dww", "dzx", "loveaw"};
        System.out.println(solution(spell2, dic2));

        String[] spell3 = {"s", "o", "m", "d"};
        String[] dic3 = {"moos", "dzx", "smm", "sunmmo", "som"};
        System.out.println(solution(spell3, dic3));
    }
}
