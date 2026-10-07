class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
         HashMap<Integer,Integer> hm=new HashMap<>();
         for(int x:nums){
            hm.put(x,hm.getOrDefault(x,0)+1);
         }
         int[] ans=new int[hm.size()];
         int i=0,z=0;
         for(int x:hm.values()){
           ans[i++]=x;
         }
           int[] rans=new int[k];
         solver(ans,0,ans.length-1,k);
         for(int x:hm.keySet()){
            for(int y=ans.length-k ; y<ans.length;y++){
                if(hm.get(x)==ans[y]){
                  rans[z++]=x;
                  ans[y]=-1;
                  break;
                  //hm.remove(x,hm.get(x));
                }
            }
         }
         return rans;
    }
    void solver(int[] nums,int low,int high,int k){
        int n=nums.length;
        while(low<high){
            int p=partition(nums,low,high);

            if(n-k==p){
                return;
            }else if(n-k>p){
                 solver(nums,p+1,high,k);
                return;
            }else{
                 solver(nums,low,p-1,k);
                 return;
            }
        }
    }
    int partition(int[] nums,int low,int high){
        int k=nums[high];
        int j=low;
        for(int i=low;i<high;i++){
            if(nums[i]<k){
                int s=nums[i];
                nums[i]=nums[j];
                nums[j]=s;
                j++;
            }
        }
        int s=nums[high];
                nums[high]=nums[j];
                nums[j]=s;
                return j;
    }

}