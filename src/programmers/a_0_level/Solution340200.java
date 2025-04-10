package programmers.a_0_level;

public class Solution340200 {

    public static void main(String[] args) {
        Solution340200 solution340200 = new Solution340200();
        String result = solution340200.solution("GO");

        System.out.println(result);
    }

    public String solution(String nickname) {
        StringBuilder answer = new StringBuilder();

        for(int i=0; i<nickname.length(); i++){
            if(nickname.charAt(i) == 'l'){
                answer.append("I");
            }
            else if(nickname.charAt(i) == 'w'){
                answer.append("vv");
            }
            else if(nickname.charAt(i) == 'W'){
                answer.append("VV");
            }
            else if(nickname.charAt(i) == 'O'){
                answer.append("0");
            }
            else{
                answer.append(nickname.charAt(i));
            }
        }

        if(answer.length() < 3){
            answer.append("o");

        }

        if(answer.length() > 8){
            answer = new StringBuilder(answer.substring(0, 8));
        }

        return answer.toString();
    }

}
