package leetcode;

/**
 * Created by p.chen on 2016/4/8.
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * <p>
 * For example, given nums = [0, 1, 0, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 * <p>
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
public class MoveZeroes {
    /**
     * ��ֱ�۵ķ�����ð�ݣ�
     * time exceed!!!
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int j = start;
            while (nums[j] == 0 && j < end) {
                nums[j] = nums[j + 1];
                nums[j+1] = 0;
                j++;
            }
            if(nums[end] == 0){
                end--;
            }
        }
    }

    /**
     * ��ʱ�󣬿�����ʾ��two pointers,���ǳ�ʱ����
     *
     * @param nums
     */
    public void moveZeroesByHit(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
           while (nums[end] == 0 && end > start){
               end--;
           }
            if(nums[start] == 0){
                nums[start] = nums[end];
                nums[end] = 0;
                end--;
            }
            start++;
        }
    }

    /**
     * ��discuss�����ķ���,��˼·�������ģ�����д������- -��code������Ҫ��ǿ
     * @param nums
     */
    public void moveZeroesByOther(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }

    public void moveZeroesByHot(int[] nums){
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                nums[j++] = nums[i];
            }
        }

        while ( j < nums.length){
            nums[j++] = 0;
        }
    }
}
