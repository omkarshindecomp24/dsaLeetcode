class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int a = 0, b = 0, count = 0;
        boolean bl = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (bl && nums[i] != nums[i + 1] && (i == 0 || nums[i] != nums[i - 1])) {
                a = nums[i];
                bl = false;
                count++;
                continue;
            }
            if (!bl && nums[i] != nums[i + 1] && (i == 0 || nums[i] != nums[i - 1])) {
                b = nums[i];
                count++;
            }
        }
        if (count == 1) {
            b = nums[nums.length - 1];
        }
        return new int[] { a, b };
    }
}