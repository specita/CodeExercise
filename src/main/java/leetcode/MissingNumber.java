package leetcode;

/**
 * Created by p.chen on 2016/5/11.
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 * <p>
 * For example,
 * Given nums = [0, 1, 3] return 2.
 * <p>
 * Note:
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 */
public class MissingNumber {

    /**
     * nums可能是乱序的
     *
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        int[] temp = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            temp[nums[i]]++;
        }

        for (int i = 0; i < temp.length - 1; i++) {
            if (temp[i] == 0) {
                return i;
            }
        }

        return temp.length-1;
    }
}
