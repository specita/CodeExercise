package leetcode.ordering;

import java.util.Arrays;

/**
 * Created by p.chen on 2016/4/18.
 */
public class Quick {
    public void quick(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        quickSort(nums, start, end);
    }

    private void quickSort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivot = nums[start];
        int storeIndex = start;
        int pivotIndex = start;
        for (int i = start + 1; i <= end; i++) {
            if (nums[i] < pivot) {
                int temp = nums[i];
                nums[i] = nums[storeIndex];
                nums[storeIndex++] = temp;
                pivotIndex = i;
            }
        }
        int temp = nums[storeIndex];
        nums[storeIndex] = pivot;
        nums[pivotIndex] = temp;

        quickSort(nums, start, storeIndex - 1);
        quickSort(nums, storeIndex + 1, end);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        new Quick().quick(nums);
        System.out.println(Arrays.toString(nums));
    }
}
