class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int[] fre =new int[101];
        int[] ans=new int[nums.length-k+1];
        int t=0;
        // for(int z:nums){
        //     fre[z+50]++;
        // }
        int i=0,j=0;
        while(j!=k){
             fre[nums[j]+50]++;
             j++;
        }
        j--;
        while(j!=nums.length-1){
             ans[t++]=cal(fre,x);
             fre[nums[i++]+50]--;
             fre[nums[j+1]+50]++;
             j++;
        }
         ans[t++]=cal(fre,x);
        return ans;
    }
    int cal(int[] fre,int x){
        int cur=0;
        for(int i=-50;i<=-1;i++){
            if(fre[i+50]>0){
                cur+=fre[i+50];

            }
            if(cur>=x){
                return i;
            }
        }
        return 0;
    }
}