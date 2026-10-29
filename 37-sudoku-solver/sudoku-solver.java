class Solution {
    public void solveSudoku(char[][] board) {
          int m=board.length,n=board[0].length;
          ArrayList<Character>[][] box=new ArrayList[3][3];

           for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                box[i][j]=new ArrayList<>();
            }
           }
            for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                box[i/3][j/3].add(board[i][j]);
            }
           }

         
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') {
                    for (int k = 1; k <= 9; k++) {
                        if (check(i, j, k,board,box)) {
                            board[i][j] = (char) ('0' + k);
                             box[i/3][j/3].add(board[i][j]);
                            solveSudoku(board);
                            if (full(board)) {
                                return;
                            } else {
                                
                                 box[i/3][j/3].remove(Character.valueOf(board[i][j]));
                                 board[i][j] = '.';
                            }
                        }
                    }
                    return;
                }
            }
        }
    }
        boolean check(int i,int j,int k,char[][] grid,ArrayList[][] box){
            char x=(char)('0'+k);
             int m=grid.length,n=grid[0].length;
            for(int p=0;p<m;p++){
              if(p!=i && grid[p][j]==x){
                return false;
              }
            }
            for(int q=0;q<n;q++){
                 if(q!=j && grid[i][q]==x){
                return false;
              }
            }

              int g=i/3;
              int h=j/3;
              if(checkBox(g,h,x,box)){
                return false;
              }
              return true;

            }
            boolean checkBox(int i,int j, char x,ArrayList<Character>[][] box){
              //    int m=grid.length,n=grid[0].length;
                for(int v:box[i][j]){
                    if(x==v){
                        return true;
                    }
                }
                return false;
            }
            boolean full(char[][] grid){
                 int m=grid.length,n=grid[0].length;
                for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                        if(grid[i][j]=='.'){
                            return false;
                        }
                    }
                }
                return true;
            }
        

    }