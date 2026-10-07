class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        return solver(nums,0,nums.length-1,k);
    }
    String solver(String[] nums,int low,int high,int k){
         int n=nums.length;
         
          while(low<=high){
             int p=partition(nums,low,high);
             if(low==high)break;
          if(n-k<=p){
              high=p;
          }else{
            low=p+1;
          }
          }
          return nums[low];
    }
    int partition(String[] nums,int low,int high){
        String pivot=nums[low+(high-low+1)/2];
        int i=low;
        int j=high;
        while(i<=j){
            while(comp(pivot,nums[i])){
                i++;
            }
            while(comp(nums[j],pivot)){
                j--;
            }
            if(i<=j){
                String s=nums[i];
                nums[i]=nums[j];
                nums[j]=s;
                i++;
                j--;
            }
           
        }
 return j;

    }
    boolean comp(String a,String b){
        if(a.length()>b.length()){
            return true;
        }else if(a.length()==b.length()){
            int i=0;
            while(i<a.length()){
                if((a.charAt(i)-'0')>(b.charAt(i)-'0')){
                    return true;
                }else if((a.charAt(i)-'0')<(b.charAt(i)-'0')){
                    return false;
                }else{
                    i++;
                }
            }

        }else{
            return false;
        }
        return false;
    }
}