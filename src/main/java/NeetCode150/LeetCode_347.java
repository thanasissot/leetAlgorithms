package NeetCode150;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCode_347 {
    // 347. Top K Frequent Elements
    // Given an integer array nums and an integer k, return the k most frequent elements.
    // You may return the answer in any order.

    public int[] topKFrequent(int[] nums, int k) {
        // mapping frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i,0) + 1);
        }

        List<Tuple> tuples = map.entrySet().stream()
                .map(entry -> new Tuple(entry.getKey(), entry.getValue()))
                .sorted(Comparator.comparingInt(t -> t.appearances * (-1))).collect(Collectors.toList());

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = tuples.get(i).num;
        }

        return result;
    }

    static class Tuple {
        public int num;
        public int appearances;
        public Tuple(int i, int appearances) {
            this.num = i;
            this.appearances = appearances;
        }

    }
}
