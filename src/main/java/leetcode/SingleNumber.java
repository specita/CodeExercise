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
     * ������һ��mapȥ��������ContainDuplicate���֣��������õ���extra memory
     * ����discuss��������xor����ȥ����xor��ͬΪ0����ͬΪ1
     * ������{5,3,4,2,3,4,5}����5^3^4^2^3^4^5 = (5^5)^(3^3)^(4^4)^2 = 0^0^0^2 = 2
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
