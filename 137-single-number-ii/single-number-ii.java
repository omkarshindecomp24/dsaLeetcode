class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        HashSet<Integer> hs2=new HashSet<>();
         for(int x:nums){
              if(hs2.contains(x)){
                continue;
            }
            if(hs.contains(x)  ){
                hs.remove(x);
                hs2.add(x);

            }else{
                hs.add(x);
            }

          
         }
         for(int x:hs){
            return x;
         }
         return 0;
    }
}