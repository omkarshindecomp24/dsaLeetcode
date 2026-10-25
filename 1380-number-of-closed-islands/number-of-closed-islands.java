class Solution {
    public int closedIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] bl=new boolean[m][n];
      ArrayList<int[]> al =new ArrayList<>();
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!bl[i][j] && grid[i][j]==0  ){
                     bfs(bl,grid,al,i,j);
                 if(checkDfs(al,grid))   count++;
                    al.clear();
                }
            }
        }
        return count;
    }
     void bfs (boolean[][] bl,int[][] grid , ArrayList<int[]> al, int i,int j){
          int m=grid.length;
        int n=grid[0].length;
            bl[i][j]=true;
           int[] k= new int[2];
           k[0]=i;
           k[1]=j;
           al.add(k);

            if(j+1!=n && grid[i][j+1]==0 && !bl[i][j+1]){
                bfs(bl,grid,al,i,j+1);
            }
             if(j-1 !=-1 && grid[i][j-1]==0 && !bl[i][j-1]){
                bfs(bl,grid,al,i,j-1);
            }
             if(i+1 != m && grid[i+1][j]==0 && !bl[i+1][j]){
                bfs(bl,grid,al,i+1,j);
            }
             if(i-1 != -1 && grid[i-1][j]==0 && !bl[i-1][j]){
                bfs(bl,grid,al,i-1,j);
            }

          
     }
     boolean checkDfs(ArrayList<int[]> al,int[][] grid){
          int m=grid.length;
        int n=grid[0].length;
          for(int[] x:al){
              if(x[0]==0 || x[0]==m-1 ){
                return false;
              }
              if(x[1]==0 || x[1]==n-1){
                return false;
              }
            }
            return true;
     }
}