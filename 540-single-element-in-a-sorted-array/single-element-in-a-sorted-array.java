class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0;
        int high=nums.length-1,mid=0,k=0;
        while(low<high){
            mid=(low+high)/2;
           if(nums[mid]==nums[mid+1] || nums[mid]==nums[mid-1]){
                 if(nums[mid]==nums[mid+1]){
                    if((high-mid-1)%2==1)low=mid+2;else{
                        high=mid-1;
                    }
                 }else{
                     if((high-mid)%2==1)low=mid+1;else{
                        high=mid-2;
                    }
                 }
           }else{
            return nums[mid];
           }
          
        }
        return nums[low];
    }
}