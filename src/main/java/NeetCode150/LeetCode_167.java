package NeetCode150;

public class LeetCode_167 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        int sum = numbers[left] + numbers[right];
        // increase second index
        while (sum != target) {
            if (sum < target) {
                left++;
            }
            else {
                right--;
            }
            sum = numbers[left] + numbers[right];
        }

        return new int[]{left + 1, right + 1};
    }
}
