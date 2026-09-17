class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        for(int k=0;k<n;k++){
            for(int i=1;i<n-k;i++){
              if(nums[i-1]==0 && nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[i-1];
                nums[i-1]=temp;
              }

            }
        }
    }
}