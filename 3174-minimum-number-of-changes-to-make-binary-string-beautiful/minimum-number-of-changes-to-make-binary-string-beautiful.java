class Solution {
    public int minChanges(String s) {
        int count=0;
        for(int i=0;i<s.length()-1;i+=2){
            int a=Integer.parseInt(""+s.charAt(i));
            if(i+1==s.length())break;
             int b=Integer.parseInt(""+s.charAt(i+1));
             if((a^b)==1){
                count++;
             }
        }
        return count;
    }
}