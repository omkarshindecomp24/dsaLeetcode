class Solution {
    public int maximumCount(int[] nums) {
        
       int low=0;
       int high=nums.length-1;
       int n=nums.length,mid=-1,k=n;

       while(low<=high){
          mid=low+(high-low)/2;
          if(nums[mid]>0){
            k=mid;
            high=mid-1;
          }else if(nums[mid]<=0){
            low=mid+1;
          }

       }
       if(k>-1 && k<n){
       int t=n-k;
        while(k>-1 && k<n && nums[k]>=0){
            k--;
        }
        return Math.max(k+1,t);
       }else{
       int t=0;
        k=n-1;
        while(k>-1 && k<n && nums[k]>=0){
            k--;
        }
        return Math.max(k+1,t);
       }
       }
}