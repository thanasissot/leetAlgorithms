package NeedCode150.Easy;

import java.util.*;

public class _217 {
    // TIME Efficient
    public boolean containsDuplicateTime(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int a : nums) {
            if (set.contains(a)) return true;
            else set.add(a);
        }
        return false;
    }

    // VS Space Efficient
    public boolean containsDuplicateSpace(int[] nums) {
        // sort it first
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }

}
