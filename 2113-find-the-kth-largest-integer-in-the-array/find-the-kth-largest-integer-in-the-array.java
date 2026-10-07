class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums,(a,b)->{
             if(a.length()>b.length()){
                return 1;
             }else if(a.length()==b.length()){
                    int i=0;
                    while(i<a.length()){
                        if((a.charAt(i)-'0')==(b.charAt(i)-'0')){
                             i++;
                        }else  if((a.charAt(i)-'0')>(b.charAt(i)-'0')){
                             return 1;
                        }else{
                            return -1;
                        }
                    }
                    return 0;
             }else{
                return -1;
             }



        });
        return  nums[n-k];
    }
}