class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
List<Integer> ls =new ArrayList<>();
//Arrays.sort(candidates);
     helper(candidates,target,ls,ans,0);
     return ans;
    }
    void helper(int[] candidates,int target,List<Integer> ls,List<List<Integer>> ans,int sum){
      if(sum==target){
       List<Integer> l= new ArrayList<Integer>(ls);
              Collections.sort(l);
             if(!ans.contains(l))   ans.add(l);
                return;
              }
        for(int x:candidates){
            if(sum+x<=target){
              ls.add(x);
              sum+=x;
              helper(candidates,target,ls,ans,sum);
                sum-=x;
              ls.remove(ls.size()-1);
            }
            // else{
            //    return;
            // }
        }
    }
}