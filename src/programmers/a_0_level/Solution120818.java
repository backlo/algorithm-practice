package programmers.a_0_level;

public class Solution120818 {

    public static int solution(int price) {
        if (price >= 100000 && price < 300000) {
            return price * 95 / 100;
        }
        if (price >= 300000 && price < 500000) {
            return price * 90 / 100;
        }
        if (price >= 500000) {
            return price * 80 / 100;
        }

        return price;
    }

    public static void main(String[] args) {
        int price = 150000;
        System.out.println(solution(price));

        int price2 = 580000;
        System.out.println(solution(price2));
    }
}
