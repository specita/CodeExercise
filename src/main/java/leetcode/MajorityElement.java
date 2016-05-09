package leetcode;

import java.util.HashMap;

/**
 * Created by p.chen on 2016/5/6.
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ? n/2 ? times.
 * <p>
 * You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        int majority = (int) Math.floor(n / 2);

        HashMap<Integer, Integer> map = new HashMap<>();

        for (Integer i : nums) {
            int times = map.getOrDefault(i, 0) + 1;
            if(times > majority){
                return i;
            }
            map.put(i, times);
        }

        return -1;
    }


    /**
     * leetcode version
     * Majority Vote Algorithm（只适用于一定会有主元素的情况）
     * 每次都找出一对不同的元素，从数组中删掉，直到数组为空或只有一种元素。
     * 不难证明，如果存在元素e出现频率超过半数，那么数组中最后剩下的就只有e
     * @param num
     * @return
     */
    public int majorityElementV2(int[] num){
        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;
        }
        return major;
    }
}
