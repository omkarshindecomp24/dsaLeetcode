class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int i=0;
        int j=skill.length-1;
        int sum=0,prev=0;
        long prod=0;
        while(i<j){
            sum=skill[i]+skill[j];
            if(sum==prev|| i==0){
            prod+=skill[i]*skill[j];
            i++;
            j--;
            }else{
                return -1;
            }
            prev=sum;
        }
        return prod;
    }
}