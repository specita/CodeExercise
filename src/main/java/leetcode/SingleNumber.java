package leetcode;

/**
 * Created by p.chen on 2016/4/6.
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * <p>
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
public class SingleNumber {
    /**
     * 考虑用一个map去做，类似ContainDuplicate那种，但这样用到了extra memory
     * 看了discuss，发现用xor操作去做，xor相同为0，不同为1
     * 假如是{5,3,4,2,3,4,5}，那5^3^4^2^3^4^5 = (5^5)^(3^3)^(4^4)^2 = 0^0^0^2 = 2
     *
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }

        return result;
    }
}
