class Solution {
    public int maxPower(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int i=0,j=0;
        int max=-1;
       while(i<s.length()){
        char a=s.charAt(i);
        j=i;
         while(j<s.length() && s.charAt(j)==s.charAt(i)){
            j++;
         }
       
         if(j==i && j==s.length()-1)j++;
           max=Math.max(max,j-i);
         i=j;
       }
       return max;
        
    }
}