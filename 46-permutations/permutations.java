class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>  ans=new ArrayList<>();
     ArrayList<Integer> ls=new ArrayList<>();
        helper(nums,ls,ans);
        return ans;
    }
   void helper(int nums[], ArrayList<Integer> ls,   List<List<Integer>>  ans){
    if (ls.size()==nums.length){
      ans.add(ls);
      return;
    }
       for(int i=0;i<nums.length;i++){
        if(!ls.contains(nums[i])){
            ls.add(nums[i]);
        helper(nums,new ArrayList<Integer>(ls),ans);
        ls.remove(ls.size()-1);
        }
       }

    }
}