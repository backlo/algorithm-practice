package codingInterview.solution10;

public class Solution10_3 {

    private int solution(int[] arr, int x) {
        return search(arr, 0, arr.length - 1, x);
    }

    private int search(int[] arr, int left, int right, int x) {
        int mid = (left + right) / 2;
        if (x == arr[mid]) {
            return mid;
        }

        if (right < left) {
            return -1;
        }

        if (arr[left] < arr[mid]) {
            if (x >= arr[left] && x < arr[mid]) {
                return search(arr, left, mid - 1, x);
            } else {
                return search(arr, mid + 1, right, x);
            }
        } else if (arr[mid] < arr[left]) {
            if (x > arr[mid] && x <= arr[right]) {
                return search(arr, mid + 1, right, x);
            } else {
                return search(arr, left, mid - 1, x);
            }
        } else if (arr[left] == arr[mid]) {
            if (arr[mid] != arr[right]) {
                return search(arr, mid + 1, right, x);
            } else {
                int result = search(arr, left, mid - 1, x);
                if (result == -1) {
                    return search(arr, mid + 1, right, x);
                } else {
                    return result;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
        Solution10_3 solution10_3 = new Solution10_3();

        System.out.println(solution10_3.solution(arr, 5));
    }

}
