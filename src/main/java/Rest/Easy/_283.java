package Rest.Easy;

public class _283 {

    // a very slow approach compared to others in leet code
    public static void moveZeroes(int[] nums) {
        if (nums.length == 1) return;

        int current = 0,
            next = 0;

        while (current < nums.length - 1) {
            // find a zero value to replace
            while (current < nums.length - 1 && nums[current] != 0) current++;
            if (current >= nums.length - 1) break;

            next = current + 1;

            // find first non zero value to replace
            while (next < nums.length - 1 && nums[next] == 0) next++;
            if (next >= nums.length) break;

            // change next to current
            nums[current] = nums[next];
            nums[next] = 0;
            current++;
        }

    }

    // leetcode discussion -> https://leetcode.com/problems/move-zeroes/discuss/172432/THE-EASIEST-but-UNUSUAL-snowball-JAVA-solution-BEATS-100-(O(n))-%2B-clear-explanation
    // owner Olsh
    public void moveZeroesSnowballEdition(int[] nums) {
        int snowBallSize = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0){
                snowBallSize++;
            }
            else if (snowBallSize > 0) {
                int t = nums[i];
                nums[i]=0;
                nums[i-snowBallSize]=t;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 0, 3, 12};
        moveZeroes(arr);
        for (int a : arr){
            System.out.println(a);
        }
    }
}
