class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        int l=0,j=0;
        for (int x : nums) {
            
            if (x != 0) {
                ls.add(x);
                nums[j]=0;
                nums[l++]=ls.get(ls.size()-1);
            }
            j++;
        }
        // Arrays.fill(nums, 0);
        // for (int i = 0; i < ls.size(); i++) {
        //     nums[i] = ls.get(i);
        // }
    }
}