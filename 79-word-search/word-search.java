class Solution {
    public boolean exist(char[][] board, String word) {
        if(word.length()==0){
            return true;
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    char m=board[i][j];
                    board[i][j]='+';
                    if(check(board,i,j,1,word)){
                        return true;
                    }else{
                    board[i][j]=m;
                    }
                }
            }
        }
        return false;
    }
    // boolean check(char[][] b ,int i,int j,char c){
       
    //         if(j+1<b[0].length && b[i][j+1]==c)return true;
    //          if(j-1>-1 && b[i][j-1]==c)return true;
    //         if(i+1<b.length && b[i+1][j]==c)return true;
    //          if(i-1>-1 && b[i-1][j]==c)return true;
        
    //     return false;
    // }
     boolean check(char[][] b ,int i,int j,int k,String w){
        if(k==w.length())return true;
         char c=w.charAt(k);
            if(j+1<b[0].length && b[i][j+1]==c) {
                char m=b[i][j+1];
                b[i][j+1]='+';
                 if(check(b,i,j+1,k+1,w)){
                    return true;
                 }else{
                    b[i][j+1]=m;
            
                 }

            }
             if(j-1>-1 && b[i][j-1]==c){
                   char m=b[i][j-1];
                b[i][j-1]='+';
                 if(check(b,i,j-1,k+1,w)){
                    return true;
                 }else{
                    b[i][j-1]=m;
                    
                 }
             }
            if(i+1<b.length && b[i+1][j]==c){
                
                    char m=b[i+1][j];
                b[i+1][j]='+';
                 if(check(b,i+1,j,k+1,w)){
                    return true;
                 }else{
                   b[i+1][j]=m;
                   
                 }
            }
             if(i-1>-1 && b[i-1][j]==c){
                  char m=b[i-1][j];
                b[i-1][j]='+';
                 if(check(b,i-1,j,k+1,w)){
                    return true;
                 }else{
                    b[i-1][j]=m;
                   
                 }
             }
             return false;
    }
}