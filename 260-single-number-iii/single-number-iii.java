class Solution {
    public int[] singleNumber(int[] nums) {
        int k=0;
        for(int x:nums){
            k^=x;
        }
        int h=((k&(k-1))^k);
        int c=0;
        int d=0;
        for(int x:nums){
            if((x&h)==0){
                c^=x;
            }else{
                d^=x;
            }
        }
        return new int[]{c,d};
    }
}