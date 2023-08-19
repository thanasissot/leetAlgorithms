package NeetCode150;

public class LeetCode_11 {
    /**
     * You are given an integer array height of length n. There are n vertical lines
     * drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
     * Find two lines that together with the x-axis form a container, such that the
     * container contains the most water.Return the maximum amount of water a container can store.
     * Notice that you may not slant the container.
     * @param height
     * @return
     */

    // NOTES
    // volume = (rIndex - lIndex) * min(height[rIndex], height[lIndex])
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0; int right = height.length - 1;
        while (left < right) {
            max = Math.max(max, (right - left) * Math.min(height[left], height[right]));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        new LeetCode_11().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
    }
}
