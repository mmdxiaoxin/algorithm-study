package top.mmdxiaoxin.sortingAlgorithm;

public class QuickSorting {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4, 7, 6, 9, 8};
        quickSorting(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void quickSorting(int[] nums, int start, int end) {
        if (start >= end) return;
        int midVal = nums[start];
        int low = start;
        int high = end;
        while (low < high) {
            while (low < high && nums[high] >= midVal) high--;
            nums[low] = nums[high];
            while (low < high && nums[low] < midVal) low++;
            nums[high] = nums[low];
        }
        nums[low] = midVal;
        quickSorting(nums, start, low - 1);
        quickSorting(nums, low + 1, end);
    }
}
