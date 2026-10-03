class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>  ans=new ArrayList<>();
     ArrayList<Integer> ls=new ArrayList<>();
     boolean[] bl=new boolean[nums.length];
        helper(nums,ls,ans,bl);
        return ans;
    }
   void helper(int nums[], ArrayList<Integer> ls,   List<List<Integer>> ans  ,boolean[] bl){
    if (ls.size()==nums.length){
      ans.add(new ArrayList<Integer>(ls));
      return;
    }
       for(int i=0;i<nums.length;i++){
        if(!bl[i]){
            ls.add(nums[i]);
            bl[i]=true;
        helper(nums,ls,ans,bl);
        ls.remove(ls.size()-1);
        bl[i]=false;
        }
       }

    }
}