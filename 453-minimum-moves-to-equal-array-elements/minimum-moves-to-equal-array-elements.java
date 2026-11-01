class Solution {
    public int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE,sum=0;
        for(int x:nums){
            min=Math.min(x,min);
        }
         for(int x:nums){
            sum+=x-min;
        }
        return sum;

    }
}