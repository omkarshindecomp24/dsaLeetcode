class Solution {
    public int search(int[] nums, int target) {
        return recurs(nums,target,0,nums.length-1);
    }
   int recurs(int[] nums,int t,int l,int h){
      int  mid=l+(h-l)/2;
      if(l<=h){
        if(nums[mid]==t)return mid;
        else if(nums[mid]<t)return recurs(nums,t,mid+1,h);
        else return recurs(nums,t,l,mid-1);
      }else{
        return -1;
      }
    }
}