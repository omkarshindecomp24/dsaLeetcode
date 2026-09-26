class Solution {
    public int heightChecker(int[] heights) {
        
     int[] n=new int[heights.length];
     int i=0,count=0;;
     for(int x :heights){
        n[i++]=x;
     }
     i=0;
     Arrays.sort(heights);
     for(int x:heights){
        if(x!=n[i++]){
            count++;
        }
     }
return count;

    }
}