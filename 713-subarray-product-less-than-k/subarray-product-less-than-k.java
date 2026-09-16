class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l=0;
        int n=nums.length,prod=1,count=0;
        if(k<=1)return 0;
        for(int r=0;r<n;r++){
           prod*=nums[r];
            while(prod>=k){
                prod/=nums[l++];
            }
            count+=r-l+1;
        }
        return count;
    }
}