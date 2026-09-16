class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> hs = new HashSet<>();

        List<List<Integer>> ls = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            twosum(nums, i + 1, -nums[i], hs);
        }
        for (List<Integer> x : hs) {
            ls.add(x);
        }
        return ls;

    }
   //helper function
    void twosum(int[] nums, int i, int target, HashSet<List<Integer>> hs) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = nums.length;

        for (int k = i; k < n; k++) {

            List<Integer> list = new ArrayList<>();
            if (hm.containsKey(nums[k])) {
                int a = nums[k];
                int b = target - nums[k];
                int c = -target;
                if (a > b) {
                    int temp = a;
                    a = b;
                    b = temp;
                }
                if (b > c) {
                    int temp = b;
                    b = c;
                    c = temp;
                }
                if (a > b) {
                    int temp = a;
                    a = b;
                    b = temp;
                }
                list.add(a);
                list.add(b);
                list.add(c);
            }
            if (list.size()==3)
                hs.add(list);
            hm.put(target - nums[k], nums[k]);
        }
        return;
    }
}