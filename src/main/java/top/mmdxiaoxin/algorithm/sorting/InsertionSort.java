package top.mmdxiaoxin.algorithm.sorting;
/*
* 插入排序
* 稳定
* O(n2)
* */
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4, 7, 6, 9, 8};
        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void insertionSort(int[] nums) {
        for (int i = 2; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j > 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            for (int l : nums) {
                System.out.print(l + " ");
            }
            System.out.println("key:" + key);
            nums[j + 1] = key;
        }
    }

}
