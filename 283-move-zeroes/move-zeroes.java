class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> ls=new ArrayList<>();
        for(int x:nums){
            if(x!=0){
                ls.add(x);
            }
        }
        Arrays.fill(nums,0);
        for(int i=0;i<ls.size();i++){
            nums[i]=ls.get(i);
        }
    }
}