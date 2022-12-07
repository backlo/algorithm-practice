package programmers;

import java.util.*;

public class Solution42583 {

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Truck> waitTruck = new LinkedList<>();
        Queue<Truck> bridgeTruck = new LinkedList<>();

        for (int truck_weight : truck_weights) {
            waitTruck.add(new Truck(truck_weight, 0));
        }

        int answer = 0;
        int totalWeight = 0;
        while(!waitTruck.isEmpty() || !bridgeTruck.isEmpty()) {
            ++answer;
            if (!bridgeTruck.isEmpty()) {
                Truck truck = bridgeTruck.peek();
                if (answer - truck.getLocation() >= bridge_length) {
                    totalWeight -= truck.getWeight();
                    bridgeTruck.poll();
                }
            }
            if (!waitTruck.isEmpty()) {
                if (totalWeight + waitTruck.peek().getWeight() <= weight) {
                    Truck truck = waitTruck.poll();
                    totalWeight += truck.getWeight();

                    bridgeTruck.offer(new Truck(truck.getWeight(), answer));
                }
            }
        }

        return answer;
    }

    class Truck {
        private int weight;
        private int location;

        public Truck(int weight, int location) {
            this.weight = weight;
            this.location = location;
        }

        public int getWeight() {
            return weight;
        }

        public int getLocation() {
            return location;
        }
    }

    public static void main(String[] args) {
        Solution42583 solution = new Solution42583();

        int[] truck_weights = {7, 4, 5, 6};
        System.out.println(solution.solution(2, 10, truck_weights));

        int[] truck_weights1 = {10};
        System.out.println(solution.solution(100, 100, truck_weights1));

        int[] truck_weights2 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        System.out.println(solution.solution(100, 100, truck_weights2));
    }

}
