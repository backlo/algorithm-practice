package programmers.a_1_level;

public class Solution340199 {

    public static void main(String[] args) {
        Solution340199 solution = new Solution340199();

        int[] wallet = {50, 50};
        int[] bill = {100, 241};

        System.out.println(solution.solution(wallet, bill));
    }

    public int solution(int[] wallet, int[] bill) {
        int answer = 0;

        int widthMax = Math.min(wallet[0],wallet[1]);
        int widthMin = Math.max(wallet[0],wallet[1]);
        int billMax = Math.max(bill[0],bill[1]);
        int billMin = Math.min(bill[0],bill[1]);

        while(true){
            if(widthMax < billMin || widthMin < billMax){
                billMax /= 2;
                answer++;
            }

            if(billMax < billMin){
                int temp = billMax;
                billMax = billMin;
                billMin = temp;
            }

            if(billMax <= widthMin && billMin <= widthMax){
                break;
            }
        }

        return answer;
    }

}
