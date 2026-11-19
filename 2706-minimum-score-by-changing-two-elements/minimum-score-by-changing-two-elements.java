class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int k=nums.length;
          int a=nums[k-1]-nums[2];
          int b=nums[k-2]-nums[1];
          int c=nums[k-3]-nums[0];
         int min=Math.min(a,b);
          min=Math.min(min,c);
          return min;

    }
}