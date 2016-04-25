package leetcode;

/**
 * Created by p.chen on 2016/4/12.
 * Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of
 * all the elements of nums except nums[i].
 * <p>
 * Solve it without division and in O(n).
 * <p>
 * For example, given [1,2,3,4], return [24,12,8,6].
 * <p>
 * Follow up:
 * Could you solve it with constant space complexity? (Note: The output array does not count as extra space for the purpose of space complexity analysis.)
 */
public class ProductOfArrayExceptSelf {
    /**
     * 最开始想到的是，loop * nums 得出result，然后再loop一遍除以nums[i]得到结果
     * 这样需要处理数组中有0的情况，题目中明确表示不能用divison
     *
     * @param nums
     * @return
     */
    public int[] productExceptSelf(int[] nums) {

        //算法解释：输出数组中output[i] = left[i]*right[i],就是说，每个output[i]是由nums[i]左边和右边相乘得到的
        //这样我们可以遍历一遍数组得到left[i]，其中left[0]=1，left[i]=left[i-1]*nums[i-1]
        //现在我们需要知道right[i], right[i]可以理解成逆序的left[i]，即right[i] = right[i+1]*nums[i+1]
        //整个算法先从左到右遍历得到left[i]，然后从右至左得到right[i]即可
        int[] output = new int[nums.length];
        output[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }

        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] *= right;
            right *= nums[i];
        }

        return output;
    }
}
