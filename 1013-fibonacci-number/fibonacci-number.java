class Solution {
    public int fib(int n) {
        int a=0;
        int b=1;
        int c=1;
       int k=2;
       if(n==1 || n==2)return 1;
       if(n==0)return 0;
        while(k!=n){
          a=b;
          b=c;
          c=a+b;
          k++;

        }
        return c;
    }
}