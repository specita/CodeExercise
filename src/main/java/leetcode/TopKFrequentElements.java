package leetcode;


import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by p.chen on 2016/5/3.
 * Given a non-empty array of integers, return the k most frequent elements.
 * Given [1,1,1,2,2,3] and k = 2, return [1,2].
 */
public class TopKFrequentElements {
    /**
     * java 8 solution
     * @param nums
     * @param k
     * @return
     */
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();

        Arrays.stream(nums).forEach(value -> {
            countMap.put(value, countMap.getOrDefault(value, 0) + 1);
        });

        return countMap.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()).limit(k).map(e->e.getKey()).collect(Collectors.toList());
    }

    /**
     * use priority queue
     * @param nums
     * @param k
     * @return
     */
    public List<Integer> topKFrequentV2(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();

        Arrays.stream(nums).forEach(value -> {
            countMap.put(value, countMap.getOrDefault(value, 0) + 1);
        });

        PriorityQueue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>((o1, o2) -> o1.getValue() - o2.getValue());
        queue.addAll(countMap.entrySet());
        List<Integer> result  = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(queue.peek().getKey());
        }

        return result;
    }

}
