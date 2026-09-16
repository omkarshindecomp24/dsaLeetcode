class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
       // Arrays.sort(nums);
        int prod=1,r=0,count=0,n=nums.length;
        for(int i=0;i<n;i++){
            r=i;
            prod=1;
            while( prod<=k && r<n){
                prod*=nums[r];
                if(prod<k)count++;
            r++;
            }
        }
        return count;
    }
}