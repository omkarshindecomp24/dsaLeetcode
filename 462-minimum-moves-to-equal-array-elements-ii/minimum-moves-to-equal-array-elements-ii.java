class Solution {
    public int minMoves2(int[] nums) {
       Arrays.sort(nums);
     int k=nums[(nums.length)/2],sum=0;
     for(int x:nums){
        sum+=Math.abs(k-x);
     }
     return sum;
    }
}