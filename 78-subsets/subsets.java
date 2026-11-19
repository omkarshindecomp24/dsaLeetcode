class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n=nums.length;
        for (int i = 0; i < Math.pow(2, nums.length); i++) {
            ArrayList<Integer> al = give(i,n);
            System.out.println(give(i,n));
            List<Integer> l = new ArrayList<>();
            for (int x : al) {
                l.add(nums[x]);
            }
            ans.add(l);
        }
        //  System.out.println(give(0));
        return ans;
    }

    ArrayList<Integer> give(int p,int n) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            int k = (1 << i);
            if ((p & k) == (k)) {
                al.add(i);
            }
        }
        return al;
    }
}