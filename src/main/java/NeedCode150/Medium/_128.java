package NeedCode150.Medium;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class _128 {
    // passed and works terrifice, now go for the refactor ?
    public static int longestConsecutive(int[] nums) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        List<Integer> nums2 = new ArrayList<>(set);

        int max = 0;
        int temp = 1;
        int index = 0;
        while (!set.isEmpty() && index < nums2.size()){ // check for list empty or set, dont get out of bounds
            int check = nums2.get(index);
            if (!set.contains(check)) { // checks if set contains element, maybe be removed below
                index++;
                continue;
            }

            set.remove(check);
            int left = check - 1;
            while (set.contains(left)) {
                set.remove(left);
                left--;
                temp++;
            }

            int right = check + 1;
            while (set.contains(right)) {
                set.remove(right);
                right++;
                temp++;
            }

            max = Math.max(temp, max);
            temp = 1;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{
                100,4,200,1,3,2}));
    }
}
