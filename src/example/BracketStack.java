package example;

import java.util.Stack;

public class BracketStack {

    public boolean solution(String inputString) {
        Stack<Bracket> stack = new Stack<>();
        String[] brackets = inputString.split("");

        try {
            for (String bracket: brackets) {
                Bracket newBracket = new Bracket(bracket);
                if (stack.isEmpty()) {
                    stack.push(newBracket);
                } else {
                    Bracket beforeBracket = stack.peek();
                    beforeBracket.compareBracket(newBracket, stack);
                }
            }
            return stack.isEmpty();
        } catch (Exception e) {
            return false;
        }

    }

    public static void main(String[] args) {
        BracketStack bracketStack = new BracketStack();

        System.out.println(bracketStack.solution("[{()}]"));
        System.out.println(bracketStack.solution("[{{()}{]"));
        System.out.println(bracketStack.solution("[()]"));
        System.out.println(bracketStack.solution("{[()]}"));
        System.out.println(bracketStack.solution("{{)]"));
    }

    class Bracket {
        private String bracket;
        private int priority;

        public Bracket(String bracket) {
            this.bracket = bracket;
            if (bracket.equals("[") || bracket.equals("]")) {
                this.priority = 1;
            } else if(bracket.equals("{") || bracket.equals("}")) {
                this.priority = 2;
            } else if(bracket.equals("(") || bracket.equals(")")) {
                this.priority = 3;
            } else {
                throw new IllegalArgumentException("괄호만 입ㄹ력해주세요.");
            }
        }

        public void compareBracket(Bracket newBracket, Stack<Bracket> stack) {
            if(newBracket.priority == this.priority && !newBracket.bracket.equals(this.bracket)) {
                stack.pop();
                return;
            }
            if(newBracket.priority >= this.priority) {
                stack.push(newBracket);
                return;
            }

            throw new IllegalArgumentException("잘못된 형식");
        }
    }
}
