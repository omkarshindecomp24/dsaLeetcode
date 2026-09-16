class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> hs = new HashSet<>();
        List<List<Integer>> ls = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length && nums[i]<=0; i++) {
          if( i!=0 && nums[i]==nums[i-1])continue;
            twosum(nums, i, -nums[i], ls,hs);
        }
        return ls;

    }

    void twosum(int[] nums, int i, int target, List<List<Integer>> ls, HashSet<List<Integer>> hs) {
        int end = nums.length - 1;
        int st = i + 1;

        while (st < end) {
             
            if (nums[st] + nums[end] == target) {
                ArrayList<Integer> al = new ArrayList<>();
                al.add(nums[i]);
                al.add(nums[st]);
                al.add(nums[end]);
              //  ls.add(al);
              if(!hs.contains(al)) {  ls.add(al);
              hs.add(al);
               }
                st++;
                end--;
                continue;
            }
            if (nums[st] + nums[end] > target) {
                end--;
            } else {
                st++;
            }
           
        }

        return;
    }
}