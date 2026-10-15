class Solution {
    public int sumCounts(List<Integer> nums) {
        List<Integer> ls=new ArrayList<>();
     return recurse(ls,nums,0,0);
    }
      int recurse(List<Integer> ls,List<Integer> nums,int sum,int n){
       
       if(n==nums.size()){
            
          if(!nums.isEmpty()) { nums.remove(0);
            return sum+recurse(new ArrayList<>(),nums,0,0);
          }else{
            return sum;
          }
        }
      ls.add(nums.get(n));
      int t=sum;
     if(ls.size()>0) {
        HashSet<Integer> hs=new HashSet<>(ls);
            int k=hs.size();
            sum+=k*k;
     }
     return recurse(ls,nums,sum,n+1);
    
      }
}