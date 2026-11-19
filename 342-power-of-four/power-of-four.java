class Solution {
    public boolean isPowerOfFour(int n) {
        for(int i=0;i<32;i++){
            int k=(1<<i);
            if((k^n)==0 && i%2==0){
                return true;
            }
        }
        return false;
    }
}