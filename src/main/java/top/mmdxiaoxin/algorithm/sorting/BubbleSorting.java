package top.mmdxiaoxin.algorithm.sorting;

public class BubbleSorting {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4, 7, 6, 9, 8};
        bubbleSorting(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void bubbleSorting(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] > nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
    }
}
