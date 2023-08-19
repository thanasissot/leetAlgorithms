package NeetCode150;

import java.util.*;

public class LeetCode_15 {
    // 3Sum
    // Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
    // such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
    // Notice that the solution set must not contain duplicate triplets.
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Map<String, List<Integer>> map = new HashMap<>();

        for (int i = 0; i <= nums.length - 3; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left != right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> list = new ArrayList<>(List.of(nums[i], nums[left], nums[right]));
                    Collections.sort(list);
                    StringBuilder stringBuilder = new StringBuilder().append(list.get(0)).append(list.get(1)).append(list.get(2));
                    map.put(stringBuilder.toString(), list);
                }
                if (sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        return new ArrayList<>(map.values());
    }

    public List<List<Integer>> threeSum1(int[] nums) {
        Arrays.sort(nums);
        List< List<Integer>> result = new ArrayList<>();

        for (int i = 0; i <= nums.length - 2; i++) {
            // Skip duplicate elements for i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(List.of(nums[i], nums[left], nums[right]));
                    // Skip duplicate elements for left
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // Skip duplicate elements for right
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    // Move the pointers
                    left++;
                    right--;

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        new LeetCode_15().threeSum(new int[]{0,0,0});
    }
}
