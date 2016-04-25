package leetcode.ordering;

/**
 * Created by p.chen on 2016/4/13.
 * bubble sort£¨√∞≈›≈≈–Ú
 */
public class Bubble {

    public void sort(int[] nums) {
        boolean swapped;
        do {
            int n = nums.length;
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }
}
