class Solution {
    public int minBitFlips(int start, int goal) {
        int count=0;
        for(int i=0;i<32;i++){
           int k=(1<<i);
           if((k&start)!=(k&goal))count++;
        }
        return count;
    }
}