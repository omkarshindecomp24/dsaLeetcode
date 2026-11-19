class Solution {
    public int reverseBits(int n) {
        

      cal(n);
        return Integer.parseInt(cal(n),2);
    }
    String cal(int p){
        StringBuilder str=new StringBuilder();
        while(p>=1){
          str.append(p%2);
          p=p/2;
        }
        while(str.length()!=32){
            str.append(0);
        }
       // str.reverse();
        return str.toString();
    }
}