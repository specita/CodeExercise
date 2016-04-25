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
     * �ʼ�뵽���ǣ�loop * nums �ó�result��Ȼ����loopһ�����nums[i]�õ����
     * ������Ҫ������������0���������Ŀ����ȷ��ʾ������divison
     *
     * @param nums
     * @return
     */
    public int[] productExceptSelf(int[] nums) {

        //�㷨���ͣ����������output[i] = left[i]*right[i],����˵��ÿ��output[i]����nums[i]��ߺ��ұ���˵õ���
        //�������ǿ��Ա���һ������õ�left[i]������left[0]=1��left[i]=left[i-1]*nums[i-1]
        //����������Ҫ֪��right[i], right[i]�������������left[i]����right[i] = right[i+1]*nums[i+1]
        //�����㷨�ȴ����ұ����õ�left[i]��Ȼ���������õ�right[i]����
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
