class Solution {
    public int maximumCount(int[] nums) {

        int low = 0;
        int high = nums.length - 1;
        int n = nums.length, mid = -1, k = n, p = -1;
        boolean b = false;

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] > 0) {
                k = mid;
                high = mid - 1;
            } else if (nums[mid] <= 0) {
                low=mid+1;
            }
        }
          low=0;
          high=n-1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] < 0) {
                p = mid;
                low = mid + 1;
            } else if (nums[mid] >= 0) {
                high=mid-1;
            }
        }

        return Math.max(p+1 ,n-k);
    }
}