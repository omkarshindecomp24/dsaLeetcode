class Solution {
    public int dominantIndex(int[] nums) {
        int max=-1,t=-1,a=101;
        for(int i=0;i<nums.length;i++){
            if(max<=nums[i]){
                t=i;
                a=max;
            }else if(nums[i]>=a){
                a=nums[i];
            }
            max=Math.max(max,nums[i]);
            
        }

        if(max>=2*a){
            return t;
        }else{
            return -1;
        }
    }
}