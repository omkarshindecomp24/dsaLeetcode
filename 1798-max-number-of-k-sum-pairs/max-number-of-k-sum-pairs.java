class Solution {
    public int maxOperations(int[] nums, int k) {
        int i=0;
        int n=nums.length;
        int j=n-1;
        int count=0;
        Arrays.sort(nums);
        while(i<j){
           int  sum=nums[i]+nums[j];
            if(sum==k){
                 i++;
                 j--;
                 count++;
            }else
            if(sum>k){
                j--;
            }else{
                i++;
            }
        }
        return count;
    }
}