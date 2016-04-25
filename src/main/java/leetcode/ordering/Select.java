package leetcode.ordering;

/**
 * Created by p.chen on 2016/4/15.
 */
public class Select {
    public void select(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int min = nums[i];
            int index = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (min > nums[j]) {
                    min = nums[j];
                    index = j;
                }
            }
            nums[index] = nums[i];
            nums[i] = min;
        }
    }
}
