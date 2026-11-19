class Solution {
    public int[] singleNumber(int[] nums) {
        int k=0;
        HashSet<Integer> hs=new HashSet<>();
        for( int x:nums){
            k=(k^x);
        }
        for(int x:nums){
            int z=x^k;
            if(!hs.contains(z)){ 
                    hs.add(z);
            }else{
                hs.remove(z);
            }
        }
        int count=0;
        int [] ans=new int[2];
        for(int x:hs){
           if(count==0){
            ans[0]=x^k;
            count++;

           }else{
            ans[1]=x^k;
           }
            
        }
        return ans;
    }
}