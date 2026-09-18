class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1, mid = 0, k = -1;
        while (low < high) {
            mid = low + (high - low) / 2;
            if (nums[low] <= nums[mid] && nums[mid] <= nums[high]) {
                k = low;
                break;
            } else {
                if (nums[low] <= nums[mid] && nums[mid] >= nums[high]) {
                    low = mid + 1;
                } else if (nums[low] >= nums[mid] && nums[mid] <= nums[high]) {
                    high = mid;
                }
            }
        }
       // low = low: k;
      int  t = low;
        k = -1;
        high = nums.length - 1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                k = mid;
                break;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            }
        }
        low = 0;
        int p = -1;
        high = t - 1;
        //  high = nums.length - 1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                p = mid;
                break;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            }
        }
        return p == -1 ? k : p;

    }

}