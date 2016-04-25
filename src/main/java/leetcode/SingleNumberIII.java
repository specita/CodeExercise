package leetcode;

/**
 * Created by p.chen on 2016/4/11.
 * Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice.
 * Find the two elements that appear only once.
 * <p>
 * For example:
 * <p>
 * Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].
 * <p>
 * Note:
 * The order of the result is not important. So in the above example, [5, 3] is also correct.
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
 */
public class SingleNumberIII {
    /**
     * 找出两个只出现一次的元素，这道题和指出只出现两次、只出现一次的的一个元素的题目很像
     * 数组中只有一个元素出现两次-> 用hashmap的数据结构可以找出
     * 数组中只有一个元素出现一次-> 也可以用hashmap来做，但是可以用异或的特性，相同为0，不同为1，直接异或一遍数据即得
     * 这首题用hashmap肯定可以实现，但需要遍历两次，O(n^n)
     * 异或，by discuss
     *
     * 思路：如果只有一个元素出现次数为1，那么直接异或就行，现在是两个，那可不可以把数据分为两个只有一个元素出现次数为1的数组呢，答案是可以！！
     * 遍历一遍，设不同的数为a和b,则结果为a^b，因为a!=b，所以a^b中必然有一个二进制位是1，找出这个位即可以将数组一分为2,好机智啊。。
     *
     * @param nums
     * @return
     */
    public int[] singleNumber(int[] nums) {
        int diff = 0;

        for (int i = 0; i < nums.length; i++) {
            diff ^= nums[i];
        }

        System.out.println(Integer.toBinaryString(diff));
        System.out.println(Integer.toBinaryString(-diff));

        //找出两个异或的数最后异或为1的位，即这一位上，两个数是不同的
        diff &= -diff;

        int[] rets = {0, 0}; // this array stores the two numbers we will return
        for (int num : nums) {
            if ((num & diff) == 0) // the bit is not set
            {
                rets[0] ^= num;
            } else // the bit is set
            {
                rets[1] ^= num;
            }
        }
        return rets;
    }
}
