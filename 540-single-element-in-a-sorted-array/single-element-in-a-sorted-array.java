class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0;
        int high=nums.length-1,mid=0,k=0;
        while(low<high){
            mid=(low+high)/2;
            if(mid%2==1)mid--;
            if(mid%2==0 && nums[mid+1]==nums[mid]){
             low=mid+2;
            }else{
                 high=mid;
            }
          
        }
        return nums[low];
    }
}