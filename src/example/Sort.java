package example;

import java.util.Arrays;

public class Sort {

    public int[] selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[temp] >= arr[j]) {
                    temp = j;
                }
            }
            swap(arr, i, temp);
        }
        return arr;
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                }
            }
        }
        return arr;
    }

    public void mergeSort(int[] arr) {
        int[] helper = new int[arr.length];
        mergeSort(arr, helper, 0, arr.length - 1);
    }

    public void mergeSort(int[] arr, int[] helper, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergeSort(arr, helper, low, middle);
            mergeSort(arr, helper, middle + 1, high);
            merge(arr, helper, low, middle, high);
        }
    }

    private void merge(int[] arr, int[] helper, int low, int middle, int high) {
        for (int i = low; i <= high; i++) {
            helper[i] = arr[i];
        }

        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;

        while (helperLeft <= middle && helperRight <= high) {
            if (helper[helperLeft] <= helper[helperRight]) {
                arr[current] = helper[helperLeft];
                helperLeft++;
            } else {
                arr[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }

        int remaining = middle - helperLeft;
        for (int i = 0; i <= remaining; i++) {
            arr[current + i] = helper[helperLeft + i];
        }
    }

    public void quickSort(int[] arr, int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1) {
            quickSort(arr, left, index - 1);
        }
        if (index < right) {
            quickSort(arr, index, right);
        }
    }

    private int partition(int[] arr, int left, int right) {
        int pivot = arr[(left + right) / 2];

        while (left <= right) {
            while (arr[left] < pivot) left++;
            while (arr[right] > pivot) right--;
            if (left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        Sort sort = new Sort();
        int[] arr1 = {6, 5, 1, 3, 2, 4, 8, 7};
        int[] arr2 = {6, 5, 1, 3, 2, 4, 8, 7};
        int[] arr3 = {6, 5, 1, 3, 2, 4, 8, 7};
        int[] arr4 = {6, 5, 1, 3, 2, 4, 8, 7};
        int[] arr5 = {6, 5, 1, 3, 2, 4, 8, 7};

        System.out.println(Arrays.toString(sort.selectSort(arr1)));
        System.out.println(Arrays.toString(sort.insertionSort(arr2)));
        System.out.println(Arrays.toString(sort.bubbleSort(arr3)));
        sort.mergeSort(arr4);
        System.out.println(Arrays.toString(arr4));

        sort.quickSort(arr5, 0, arr5.length - 1);
        System.out.println(Arrays.toString(arr5));
    }
}
