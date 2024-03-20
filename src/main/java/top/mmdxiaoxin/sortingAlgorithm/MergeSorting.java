package top.mmdxiaoxin.sortingAlgorithm;

public class MergeSorting {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4, 7, 6, 9, 8};
        mergeSorting(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void mergeSorting(int[] nums, int start, int end) {
        if (end - start <= 0) return;
        int mid = (start + end) / 2;
        mergeSorting(nums, start, mid);
        mergeSorting(nums, mid + 1, end);
        merge(nums, start, mid, mid + 1, end);
    }

    private static void merge(int[] nums, int ll, int lr, int rl, int rr) {
        int i = ll;
        int j = rl;
        int k = 0;
        int[] temp = new int[rr - ll + 1];
        while (i <= lr && j <= rr) {
            if (nums[i] < nums[j]) temp[k++] = nums[i++];
            else temp[k++] = nums[j++];
        }
        while (i <= lr) temp[k++] = nums[i++];
        while (j <= rr) temp[k++] = nums[j++];

        // 将临时数组中的元素复制回原始数组 nums
        for (int index = ll, t = 0; index <= rr; index++, t++) {
            nums[index] = temp[t];
        }
    }

}
