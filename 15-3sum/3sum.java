class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashSet<List<Integer>> hs = new HashSet<>();

        List<List<Integer>> ls = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0)break;
            twosum(nums, i , -nums[i], hs);
        }
        for (List<Integer> x : hs) {
            ls.add(x);
        }
        return ls;

    }

    void twosum(int[] nums, int i, int target, HashSet<List<Integer>> hs) {
      //  HashMap<Integer, Integer> hm = new HashMap<>();
        int end= nums.length-1;
        int st=i+1;

        while(st<end){
            if(nums[st]+nums[end]==target){
                        ArrayList<Integer> al=new ArrayList<>();
                al.add(nums[i]);
                al.add(nums[st]);
                al.add(nums[end]);
                hs.add(al);
               st++;
               end--;
               continue;
            }
            if(nums[st]+nums[end]>target){
                       end--;
            }else{
                st++;
            }
        }
        
        return;
    }
}