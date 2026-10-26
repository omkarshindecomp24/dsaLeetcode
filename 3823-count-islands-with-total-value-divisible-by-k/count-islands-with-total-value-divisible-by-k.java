class Solution {
    public int countIslands(int[][] grid, int k) {
        int m=grid.length,sum=0;
        int n=grid[0].length;
        boolean[][] bl=new boolean[m][n];
        ArrayList<int[]> al=new ArrayList<>();
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if(!bl[i][j] &&  grid[i][j]!=0 ){
                    dfs(grid,bl,i,j,i,j,al);
                    
                       if(checkDfs(grid,al,k)){
                        sum++;
                       }
                    al.clear();
                }
            }
        }
       // System.out.println(sum);
        return sum;
    }
    void dfs(int[][] grid ,boolean[][] bl,int i,int j,int x,int y , ArrayList<int[]> al){
         int m=grid.length,sum=0;
        int n=grid[0].length;
        bl[i][j]=true;
        int[] a ={i,j};
         al.add(a);

         if(j+1<n && j+1!=y && grid[i][j+1]!=0 && !bl[i][j+1]){
            dfs(grid,bl,i,j+1,i,j,al);
         }
         if(j-1>-1 && j-1!=y && grid[i][j-1]!=0 && !bl[i][j-1]){
            dfs(grid,bl,i,j-1,i,j,al);
         }
         if(i+1<m && i+1!=x && grid[i+1][j]!=0 && !bl[i+1][j]){
            dfs(grid,bl,i+1,j,i,j,al);
         }
         if(i-1>-1 && i-1!=x && grid[i-1][j]!=0 && !bl[i-1][j]){
            dfs(grid,bl,i-1,j,i,j,al);
         }
        //  System.out.print(+" ");
    }
    boolean checkDfs(int[][] grid,ArrayList<int[]> al,int k){
        long sum=0;
         for(int[] x:al){
                            sum+=grid[x[0]][x[1]];
                        }
                           System.out.print(sum+" ");
                        if(sum%k==0){
                            return true;
                        }else{
                            return false;
                        }

    }
}