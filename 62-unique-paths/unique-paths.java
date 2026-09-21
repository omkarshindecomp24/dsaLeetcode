class Solution {
    public int uniquePaths(int m, int n) {
        int[][] k=new int[m][n];
           if(m==1 && n==1)return 1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                recurse(i,j,k);
            }
        }
        return k[m-1][n-1];
    }
   void recurse(int i,int j,int[][] m){
        int sum=0;
        if(i-1>-1 )sum+=m[i-1][j]==0?1:m[i-1][j];
        if(j-1>-1)sum+=m[i][j-1]==0?1:m[i][j-1];
        m[i][j]=sum;
    }
}