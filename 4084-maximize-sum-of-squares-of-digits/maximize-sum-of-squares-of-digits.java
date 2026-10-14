class Solution {
    public String maxSumOfSquares(int num, int sum) {
      
        StringBuilder sb=new StringBuilder();
          return recursive(0,num,sum,0,sb,9);
    }
   String  recursive(int n,int num,int sum,int currsum,StringBuilder s,int z){
          if(sum>9*num){
            return "";
          }
        if(n==num || currsum>sum){
            if(currsum<sum && n==num){
                return "";
            }
            if(currsum>sum && n<num){
                return "";
            }
            return s.toString();
        }
    n++;
   currsum+=z;
     while(currsum>sum ){
        currsum-=z;
        z--;
        currsum+=z;
        if(z<0)break;
       
     }
     s.append(z);
    // String p=s.toString();
      if(currsum==sum && n==num){
        return s.toString();
      }
      String k= recursive(n,num,sum,currsum,s,9);
    if(k.equals("")){
        s.deleteCharAt(s.length()-1);
        currsum-=z;
       recursive(n,num,sum,currsum,s,z-1);
    }
       return k;
    }
}