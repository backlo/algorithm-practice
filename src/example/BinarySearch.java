package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    public int[] solution(int[] nums, int n) {
        List<Integer> answers = new ArrayList<>();

        search(nums, 0, nums.length - 1, n, answers);

        return answers.stream()
                .mapToInt(i -> i)
                .sorted().toArray();
    }

    private void search(int[] nums, int start, int end, int n, List<Integer> answers) {
        if (end < start) {
            return;
        }

        int middleIndex = (start + end) / 2;
        if (nums[middleIndex] == n) {
            int leftIndex = middleIndex;
            while (leftIndex >= 0 && nums[leftIndex] == n) {
                answers.add(leftIndex--);
            }
            int rightIndex = middleIndex + 1;
            while (rightIndex < nums.length && nums[rightIndex] == n) {
                answers.add(rightIndex++);
            }
        } else if (nums[middleIndex] > n) {
            search(nums, start, middleIndex, n, answers);
        } else {
            search(nums, middleIndex + 1, end, n, answers);
        }
    }

    public int binarySearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] < x) {
                low = mid + 1;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public int binarySearchReqursive(int[] a, int x, int low, int high) {
        if(low > high) return -1;
        int mid = (low + high) / 2;
        if (a[mid] < x) {
            return binarySearchReqursive(a, x, mid +1, high);
        } else if(a[mid] > x) {
            return binarySearchReqursive(a, x, low, mid);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 3, 4, 5, 7, 7, 7, 7, 7};
        BinarySearch bs = new BinarySearch();

        System.out.println(Arrays.toString(bs.solution(nums, 7)));
    }
}
