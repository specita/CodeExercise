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
     * �ҳ�����ֻ����һ�ε�Ԫ�أ�������ָ��ֻ�������Ρ�ֻ����һ�εĵ�һ��Ԫ�ص���Ŀ����
     * ������ֻ��һ��Ԫ�س�������-> ��hashmap�����ݽṹ�����ҳ�
     * ������ֻ��һ��Ԫ�س���һ��-> Ҳ������hashmap���������ǿ������������ԣ���ͬΪ0����ͬΪ1��ֱ�����һ�����ݼ���
     * ��������hashmap�϶�����ʵ�֣�����Ҫ�������Σ�O(n^n)
     * ���by discuss
     *
     * ˼·�����ֻ��һ��Ԫ�س��ִ���Ϊ1����ôֱ�������У��������������ǿɲ����԰����ݷ�Ϊ����ֻ��һ��Ԫ�س��ִ���Ϊ1�������أ����ǿ��ԣ���
     * ����һ�飬�費ͬ����Ϊa��b,����Ϊa^b����Ϊa!=b������a^b�б�Ȼ��һ��������λ��1���ҳ����λ�����Խ�����һ��Ϊ2,�û��ǰ�����
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

        //�ҳ�����������������Ϊ1��λ������һλ�ϣ��������ǲ�ͬ��
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
