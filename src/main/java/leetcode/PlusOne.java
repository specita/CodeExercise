package leetcode;

/**
 * Created by pchen on 2016/4/5.
 * Given a non-negative number represented as an array of digits, plus one to the number.
 * The digits are stored such that the most significant digit is at the head of the list.
 * 一个数组代表一个非负整数，对这个数字加1
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            }else {
                digits[i] = digits[i]+1;
                return digits;
            }
        }

        int[] ints = new int[digits.length + 1];
        ints[0]=1;
        return ints;
    }
}
