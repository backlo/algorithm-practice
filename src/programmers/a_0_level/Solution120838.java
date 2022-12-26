package programmers.a_0_level;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution120838 {

    enum Morse {
        A(".-", "a"), B("-...", "b"), C("-.-.", "c"), D("-..", "d"),
        E(".", "e"), F("..-.", "f"), G("--.", "g"), H("....", "h"),
        I("..", "i"), J(".---", "j"), K("-.-", "k"), L(".-..", "l"),
        M("--", "m"), N("-.", "n"), O("---", "o"), P(".--.", "p"),
        Q("--.-", "q"), R(".-.", "r"), S("...", "s"), T("-", "t"),
        U("..-", "u"), V("...-", "v"), W(".--", "w"), X("-..-", "x"),
        Y("-.--", "y"), Z("--..", "z");

        private final String morse;
        private final String spell;

        Morse(String morse, String spell) {
            this.morse = morse;
            this.spell = spell;
        }

        public static String findSpell(String morse) {
            return Arrays.stream(values())
                    .filter(value -> value.morse.equals(morse))
                    .map(value -> value.spell)
                    .findFirst()
                    .orElse("");
        }
    }

    public static String solution(String letter) {
        return Arrays.stream(letter.split(" "))
                .map(Morse::findSpell)
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String letter = ".... . .-.. .-.. ---";
        System.out.println(solution(letter));

        String letter2 = ".--. -.-- - .... --- -.";
        System.out.println(solution(letter2));
    }
}
