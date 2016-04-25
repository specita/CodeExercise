package leetcode;

import java.util.HashSet;

/**
 * Created by p.chen on 2016/4/5.
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 */
public class ContainsDuplicate {
    /**
     * first edition, time exceed...
     * @param nums
     * @return
     */
    public boolean containsDuplicateV1(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int num = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (num == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * put value into a set, leetcode²âÊÔµÚÒ»´Îtime exceed...
     * @param nums
     * @return
     */
    public boolean containsDuplicateV2(int[] nums) {
        HashSet set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
