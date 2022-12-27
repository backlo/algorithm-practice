package programmers.a_1_level;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution86491 {

    private static class Card {
        private final int width;
        private final int height;

        public Card(int width, int height) {
            this.width = Math.max(width, height);
            this.height = Math.min(width, height);
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }

    }

    public static int solution(int[][] sizes) {
        List<Card> cards = new ArrayList<>();

        for (int[] size : sizes) {
            cards.add(new Card(size[0], size[1]));
        }

        List<Card> sortWidthCards = cards.stream()
                .sorted(Comparator.comparing(Card::getWidth).reversed())
                .collect(Collectors.toList());

        List<Card> sortHeightCards =  cards.stream()
                .sorted(Comparator.comparing(Card::getHeight).reversed())
                .collect(Collectors.toList());

        return sortWidthCards.get(0).getWidth() * sortHeightCards.get(0).getHeight();
    }

    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(solution(sizes));

        int[][] sizes2 = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        System.out.println(solution(sizes2));

        int[][] sizes3 = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
        System.out.println(solution(sizes3));

    }
}


