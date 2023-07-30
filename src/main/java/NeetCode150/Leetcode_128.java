package NeetCode150;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Leetcode_128 {
    //  Given an unsorted array of integers nums,
    //  return the length of the longest consecutive elements sequence.
    //
    //  You must write an algorithm that runs in O(n) time.
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int MAX = Integer.MIN_VALUE;
        int MIN = Integer.MAX_VALUE;
        for (int num : set) {
            if (MAX < num) {
                MAX = num;
            }
            if (MIN > num) {
                MIN = num;
            }
        }

        int counter = 0;
        int max = 0;
        for (int i = MIN; i <= MAX; i++) {
            if (set.contains(i)) {
                counter++;
            }
            else {
                if (max < counter) {
                    max = counter;
                }
                counter = 0;
            }
        }

        return Math.max(max, counter);
    }
}
