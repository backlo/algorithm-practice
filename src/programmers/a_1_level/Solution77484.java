package programmers.a_1_level;

import java.util.Arrays;

public class Solution77484 {

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int correctingCount = (int) Arrays.stream(win_nums)
                .filter(winNum -> Arrays.stream(lottos)
                        .anyMatch(lotto -> lotto == winNum))
                .count();
        int unknownNumberCount = (int) Arrays.stream(lottos)
                .filter(lotto -> lotto == 0)
                .count();

        answer[0] = generateRank(correctingCount, unknownNumberCount);
        answer[1] = generateRank(correctingCount, 0);

        return answer;
    }

    private static int generateRank(int correctingCount, int unknownNumberCount) {
        if (correctingCount + unknownNumberCount == 6) {
            return 1;
        }
        if (correctingCount + unknownNumberCount == 5) {
            return 2;
        }
        if (correctingCount + unknownNumberCount == 4) {
            return 3;
        }
        if (correctingCount + unknownNumberCount == 3) {
            return 4;
        }
        if (correctingCount + unknownNumberCount == 2) {
            return 5;
        }

        return 6;
    }

    public int[] solution2(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int count = 0;
        int unknownCount = 0;

        for (int lotto : lottos) {
            if (lotto == 0) {
                ++unknownCount;
                continue;
            }
            for (int win_num : win_nums) {
                if (lotto == win_num) {
                    ++count;
                }
            }
        }

        answer[0] = Rank.findRank(count + unknownCount);
        answer[1] = Rank.findRank(count);

        return answer;
    }

    enum Rank {
        FIRST_RANK(1, 6),
        SECOND_RANK(2, 5),
        THIRD_RANK(3, 4),
        FOURTH_RANK(4, 3),
        FIFTH_RANK(5, 2);

        private final int rank;
        private final int checkNumber;

        Rank(int rank, int checkNumber) {
            this.rank = rank;
            this.checkNumber = checkNumber;
        }

        private static int findRank(int checkNumber) {
            for (Rank rank : values()) {
                if (checkNumber == rank.checkNumber) {
                    return rank.rank;
                }
            }
            return 6;
        }
    }

    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        System.out.println(Arrays.toString(solution(lottos, win_nums)));

        int[] lottos2 = {0, 0, 0, 0, 0, 0};
        int[] win_nums2 = {38, 19, 20, 40, 15, 25};
        System.out.println(Arrays.toString(solution(lottos2, win_nums2)));

        int[] lottos3 = {45, 4, 35, 20, 3, 9};
        int[] win_nums3 = {20, 9, 3, 45, 4, 35};
        System.out.println(Arrays.toString(solution(lottos3, win_nums3)));
    }
}
