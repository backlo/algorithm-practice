package programmers;

import java.util.HashMap;
import java.util.Map;

public class Solution42578 {

    public int solution(String[][] clothes) {
        Map<String, Integer> spyClothes = new HashMap<>();
        for (String[] clothe : clothes) {
            String clothKind = clothe[1];
            spyClothes.put(clothKind, spyClothes.getOrDefault(clothKind, 0) + 1);
        }

        int answer = 1;

        for (String spyCloth : spyClothes.keySet()) {
            answer *= spyClothes.get(spyCloth) + 1;
        }

        return answer - 1;
    }

    public static void main(String[] args) {
        Solution42578 solution = new Solution42578();
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution.solution(clothes));

        String[][] clothes1 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        System.out.println(solution.solution(clothes1));
    }
}
