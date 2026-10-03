class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ls=new ArrayList<>();
        return helper(nums,0,ans,ls);
    }
    List<List<Integer>> helper(int[] nums,int i,List<List<Integer>> ans,List<Integer> ls){
        if(i==nums.length){
            ans.add(ls);
            return ans;
        }
           helper(nums,i+1,ans,new  ArrayList<Integer>(ls));
        ls.add(nums[i]);
           helper(nums,i+1,ans,new ArrayList<Integer>(ls));
        return ans;
    }
}