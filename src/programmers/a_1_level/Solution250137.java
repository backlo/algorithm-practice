package programmers.a_1_level;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution250137 {

    public static void main(String[] args) {
        Solution250137 solution = new Solution250137();
        int[] bnadage = {5, 1, 5};
        int health = 30;
        int[][] attcks = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};

        System.out.println(solution.solution(bnadage, health, attcks));
    }

    public int solution(int[] bandage, int health, int[][] attacks) {
        int totalTime = attacks[attacks.length - 1][0];
        int recoveryTime = bandage[0];
        int recoveryAmount = bandage[1];
        int recoveryPlus = bandage[2];
        int currentHealth = health;
        int successRecovery = 0;

        Map<Integer, DamageInfo> damageInfos = Arrays.stream(attacks)
                .map(attack -> new DamageInfo(attack[0], attack[1]))
                .collect(Collectors.toMap(DamageInfo::getDamageTime, damageInfo -> damageInfo));

        for (int index = 0; index <= totalTime; index++) {
            if (currentHealth >= health) {
                currentHealth = health;
            }

            if (damageInfos.containsKey(index)) {
                DamageInfo damageInfo = damageInfos.get(index);
                successRecovery = 0;

                currentHealth = currentHealth - damageInfo.getDamage();
            } else {
                currentHealth += recoveryAmount;

                successRecovery++;

                if (successRecovery == recoveryTime) {
                    currentHealth += recoveryPlus;
                    successRecovery = 0;
                }
            }

            if (currentHealth <= 0) {
                return -1;
            }
        }

        return currentHealth;
    }

    private static class DamageInfo {
        private final int damageTime;
        private final int damage;

        public DamageInfo(int damageTime, int damage) {
            this.damageTime = damageTime;
            this.damage = damage;
        }

        public int getDamageTime() {
            return damageTime;
        }

        public int getDamage() {
            return damage;
        }
    }
}
