package programmers.a_2_level;

import java.util.HashMap;
import java.util.Map;

public class Solution42578 {

    public static int solution(String[][] clothes) {
        Map<String, Integer> spyClothes = new HashMap<>();
        int answer = 1;

        for (String[] clothe : clothes) {
            spyClothes.put(clothe[1], spyClothes.getOrDefault(clothe[1], 1) + 1);
        }

        for (Integer count : spyClothes.values()) {
            answer *= count;
        }

        return answer - 1;
    }

    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution(clothes));
        
        String[][] clothes2 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        System.out.println(solution(clothes2));
    }
}
