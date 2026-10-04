class Solution {
    public int findKthLargest(int[] nums, int k) {
       return solve(nums,0,nums.length-1,k);
    }
    int solve(int[] nums,int l,int h,int k){
        int n=nums.length;
        if(l<h){
          //  System.out.println(Arrays.toString(nums));
            int t=partition(nums,l,h);
           // System.out.println(nums[t]);
            if(n-k==t){return nums[t];}else
            if(n-k<t){return solve(nums,l,t-1,k);}else 
            if(n-k>t)return solve(nums,t+1,h,k);

        }
        return nums[h];
    }
    int partition(int[] nums,int low,int high){


        int pivot=nums[high];
        int j=low;
        for(int i=low;i<high;i++){
            if(nums[i]<pivot){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
          int temp=nums[high];
                nums[high]=nums[j];
                nums[j]=temp;
               return j;
    }
}