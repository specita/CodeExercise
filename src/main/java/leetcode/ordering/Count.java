package leetcode.ordering;

import java.util.Arrays;

/**
 * Created by p.chen on 2016/4/18.
 */
public class Count {
    public void count(int[] nums) {
        int[] counter = new int[10];
        for (int i = 0; i < nums.length; i++) {
            counter[nums[i]]++;
        }

        int index = 0;
        int i = 0;
        while (i < counter.length) {
            while (counter[i]-- > 0){
                nums[index++] = i;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 8, 7, 1, 2, 2, 2, 7, 3, 9, 8, 2, 1, 4, 2, 4, 6, 9, 2};
        new Count().count(nums);
        System.out.println(Arrays.toString(nums));
    }
}
