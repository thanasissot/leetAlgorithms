package NeetCode150;

import java.util.Arrays;
import java.util.HashMap;

public class LeetCode_238 {
    /**
     * Given an integer array nums,
     * return an array answer such that answer[i] is equal to the product
     * of all the elements of nums except nums[i].
     * -
     * The product of any prefix or suffix of nums is
     * guaranteed to fit in a 32-bit integer.
     * -
     * You must write an algorithm that runs in O(n)
     * time and without using the division operation.
     * @param nums
     * @return
     */
    public static int[] productExceptSelf(int[] nums) {
        int zero = 0;
        for (int num : nums) {
            if (num == 0) {
                zero++;
            }
        }
        if (zero > 1) {
            return new int[nums.length];
        }

        int[] leftToRight = new int[nums.length];
        int[] rightToLeft = new int[nums.length];
        StringBuilder str = new StringBuilder();
        // map left to right
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            str.append(i);
            product *= nums[i];
            leftToRight[i] = product;
        }
        // map right to left

        product = 1;
        for (int i = nums.length - 1; i >= 0 ; i--) {
            str.insert(0, i);
            product *= nums[i];
            rightToLeft[i] = product;
        }

        int[] result = new int[nums.length];

        result[0] = rightToLeft[1];
        result[nums.length-1] = leftToRight[nums.length - 2];
        for (int i = 1; i < nums.length - 1; i++) {
            result[i] = leftToRight[i - 1] * rightToLeft[i + 1];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,1,0,-3,3};
        // expected = [24, 24, 16, 12]
//        int[] nums = new int[]{2,4,-2,1,2,-1,4,1,3,-3,-1,2,1,2,1,-3,1,-1,1,3,3,-2,-2,3,-3,-1,1,-2,-4,-2};

        System.out.println(Arrays.toString(productExceptSelf(nums)));

    }
}
