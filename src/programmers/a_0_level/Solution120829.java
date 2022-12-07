package programmers.a_0_level;

import java.util.Arrays;
import java.util.function.Function;

public class Solution120829 {

    public static int solution(int angle) {
        return Angle.findAngle(angle);
    }

    public static void main(String[] args) {
        int angle = 70;
        System.out.println(solution(angle));

        int angle2 = 91;
        System.out.println(solution(angle2));

        int angle3 = 180;
        System.out.println(solution(angle3));
    }

    enum Angle {
        ACUTE_ANGLE((angle) -> angle > 0 && angle < 90, 1),
        RIGHT_ANGLE((angle) -> angle == 90, 2),
        OBTUSE_ANGLE((angle) -> angle > 90 && angle < 180, 3),
        STRAIGHT_ANGLE((angle) -> angle == 180, 4);

        private final Function<Integer, Boolean> range;
        private final int result;

        Angle(Function<Integer, Boolean> range, int result) {
            this.range = range;
            this.result = result;
        }

        public static int findAngle(int angle) {
            return Arrays.stream(values())
                    .filter(i -> i.range.apply(angle))
                    .findFirst()
                    .map(i -> i.result)
                    .orElse(-1);
        }
    }
}
