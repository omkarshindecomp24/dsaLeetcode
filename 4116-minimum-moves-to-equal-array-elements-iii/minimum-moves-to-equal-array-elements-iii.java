class Solution {
    public int minMoves(int[] nums) {
        int max=-1,sum=0;
        for(int x:nums){
            max=Math.max(max,x);
        }
        for(int x:nums){
            sum+=Math.abs(max-x);
        }
        return sum;
    }
}