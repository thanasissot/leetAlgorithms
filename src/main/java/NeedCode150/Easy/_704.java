package NeedCode150.Easy;

public class _704 {
    // binary search implementation
    public int search(int[] nums, int target) {
        int left = 0,
            right = nums.length,
            mid;

        while (left <= right) {
            mid = (left + right) / 2;
            if (mid >= nums.length) return -1;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return -1;
    }

    // has same number of calculations but clear code
    public int search2(int[] nums, int target) {
        int beg=0, end=(nums.length -1);
        int mid = (int)(beg+end)/2;

        while(beg<=end && nums[mid]!=target) {
            if(target < nums[mid])
                end = mid-1;
            else
                beg = mid+1;

            mid = (int)((beg+end)/2);
        }

        if(nums[mid] == target)
            return mid;
        else
            return -1;
    }
}
