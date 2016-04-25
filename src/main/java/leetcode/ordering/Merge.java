package leetcode.ordering;

import java.util.Arrays;

/**
 * Created by p.chen on 2016/4/15.
 */
public class Merge {
    public void merge(int[] nums, int left, int right) {
        //divide
        if (left < right) {
            int mid = (left + right) >>> 1;
            merge(nums, left, mid);
            merge(nums, mid + 1, right);
            mergeSort(nums, left, mid + 1, right);
        }
    }

    private void mergeSort(int[] nums, int left, int mid, int right) {
        int[] leftNums = arrayCopy(nums, left, mid);
        int[] rightNums = arrayCopy(nums, mid, right);
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < leftNums.length || j < rightNums.length) {
            if (leftNums[i] < rightNums[j]) {
                nums[k++] = leftNums[i++];
            } else {
                nums[k++] = rightNums[j++];
            }
        }

        while (i < leftNums.length) {
            nums[k++] = leftNums[i++];
        }
        while (j < rightNums.length) {
            nums[k++] = rightNums[j++];
        }
    }


    private int[] arrayCopy(int[] original, int start, int end) {
        int[] result = new int[end - start];
        int n = 0;
        for (int i = start; i < end; i++) {
            result[n++] = original[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        new Merge().merge(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
