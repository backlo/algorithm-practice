package codingInterview.solution10;

public class Solution10_5 {

    public int solution(String[] strings, String x) {
        if (strings == null || x == null || x.equals("")) {
            return -1;
        }

        return search(strings, 0, strings.length - 1, x);
    }

    private int search(String[] strings, int first, int last, String x) {
        if (first > last) return -1;
        int mid = (first + last) / 2;

        if (strings[mid].isEmpty()) {
            int left = mid - 1;
            int right = mid + 1;

            while (true) {
                if (left < first && right > last) {
                    return -1;
                } else if (left >= first && !strings[left].isEmpty()) {
                    mid = left;
                    break;
                } else if (right <= last && !strings[right].isEmpty()) {
                    mid = right;
                    break;
                }
                right++;
                left--;
            }
        }

        if (strings[mid].equals(x)) {
            return mid;
        } else if (strings[mid].compareTo(x) > 0) {
            return search(strings, first, mid - 1, x);
        } else {
            return search(strings, mid + 1, last, x);
        }
    }

    public static void main(String[] args) {
        String[] str = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};

        Solution10_5 solution10_5 = new Solution10_5();
        System.out.println(solution10_5.solution(str, "dad"));
        System.out.println(solution10_5.solution(str, "dadd"));
    }
}
