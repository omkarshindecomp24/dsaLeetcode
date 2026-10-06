class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        int n=nums.length;
        return solver(nums,0,n-1,k);
    }
  String  solver(String[] nums,int low,int high,int k){
    int n=nums.length;
   // if(low==high){ return nums[low];}
        while(low<high){
            
            int t=partition(nums,low,high);
            if(n-k>t){
                low=t+1;
                   // solver(nums,t+1,high,k);
                }else{
                    high=t;
                   // solver(nums,low,t,k);
                }
        }
        return nums[low];
    }
   int partition(String[] nums,int low,int high){
      //  Long t=Long.parseLong(nums[high]);
      String pivot=nums[low+(high-low +1 )/2];
        int j=low;
        int k=high;
        while(j<=k){
          //  if(j==k)return k;
           while(j<=high && compar(pivot,nums[j])){
            j++;
           }
           while( k>=low && compar(nums[k],pivot)){
            k--;
           }
            if(j<=k){
            String s=nums[k];
            nums[k]=nums[j];
            nums[j]=s;
            k--;
            j++;
           }
          
        }
         return k;
        }
    boolean compar(String a,String b){
         if(a.equals(b)){
            return false;
        }
        if(a.length()>b.length()){
            return true;
        }else  if(a.length()==b.length()){
            int i=0;
            while(i<a.length())
                  if(a.charAt(i)>b.charAt(i)){
                    return true;
                  } else if(a.charAt(i)==b.charAt(i)){
                      i++;
                  } else {
                    return false;
                  }
        }else{
            return false;
        }
       
        return false;
    }
}