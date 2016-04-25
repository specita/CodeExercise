package leetcode.ordering;

/**
 * Created by p.chen on 2016/4/15.
 */
public class Insert {
    public void insert(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int j = i - 1;
            int tag = nums[i];
            while (j >= 0 && tag < nums[j]) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = tag;
        }
    }


}
