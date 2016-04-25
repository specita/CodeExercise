package leetcode.ordering;

import java.util.Queue;

/**
 * Created by p.chen on 2016/4/18.
 */
public class Radix {
    public void radix(int[] nums) {
        Queue[] radixQueue = new Queue[10];

        for (int i = 0; i < nums.length; i++) {
            int remainder = nums[i] % 10;
            radixQueue[remainder].add(nums[i]);
        }

        for (int i = 0; i < radixQueue.length; i++) {
            int poll = (int)radixQueue[i].poll();
        }

    }
}
