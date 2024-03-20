package top.mmdxiaoxin.sortingAlgorithm;
/*
* 选择排序
* 不稳定
* O(n2)
* */
public class SelectSorting {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4, 7, 6, 9, 8};
        selectSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void selectSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int ith = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[ith] < nums[j]) ith = j;
            }
            int temp = nums[i];
            nums[i] = nums[ith];
            nums[ith] = temp;
        }
    }
}
