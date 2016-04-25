package leetcode;

/**
 * Created by p.chen on 2016/4/6.
 * Rotate an array of n elements to the right by k steps.
 * <p>
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 */
public class RotateArray {
    /**
     * 使用插入排序的方法Time Limit Exceeded
     *
     * @param nums
     * @param k
     */
    public void rotateV1(int[] nums, int k) {
        int n = nums.length;
        k %= n;

        for (int i = n - k; i < n; i++) {
            int temp = nums[i];
            for (int j = i - 1; j >= n - k; j--) {
                nums[j + 1] = nums[j];
            }
            nums[i - n + k] = temp;
        }
    }


    /**
     * 使用插入排序的方法Time Limit Exceeded
     *
     * @param nums
     * @param k
     */
    public void rotateV2(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        rotate(nums, 0 , n-1);
        rotate(nums, 0 , k-1);
        rotate(nums, k, n-1);
    }

    private void rotate(int[] nums, int begin, int end){
        while (begin < end){
            int temp = nums[end];
            nums[end] = nums[begin];
            nums[begin] = temp;
            begin++;
            end--;
        }
    }
}
