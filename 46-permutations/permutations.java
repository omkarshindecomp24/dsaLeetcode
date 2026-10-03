class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> ls = new ArrayList<>();
        HashSet<Integer> hs=new HashSet<>();
        helper(nums, ls, ans,hs);
        return ans;
    }

    void helper(int nums[], ArrayList<Integer> ls, List<List<Integer>> ans,HashSet hs) {
        if (ls.size() == nums.length) {
            ans.add(ls);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!hs.contains(nums[i])) {
                ls.add(nums[i]);
                hs.add(nums[i]);
                helper(nums, new ArrayList<Integer>(ls), ans,new HashSet<Integer>(hs));
                ls.remove(ls.size() - 1);
                hs.remove(nums[i]);
            }
        }

    }
}