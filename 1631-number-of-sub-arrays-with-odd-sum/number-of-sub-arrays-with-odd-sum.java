class Solution {
    public int numOfSubarrays(int[] arr) {
        int n=arr.length;
        long count=0;
        int[] pre=new int[arr.length];
          int[] even=new int[arr.length];
            int[] odd=new int[arr.length];
        pre[0]=arr[0];
        if(pre[0]%2==0){
            even[0]=1;
        }else{
            odd[0]=1;
            count++;
        }
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+arr[i];
            if(pre[i]%2!=0){
                count++;
            }
           
        }
         for(int i=1;i<n;i++){
           if(pre[i]%2==0){
             odd[i]=odd[i-1];
             even[i]=even[i-1]+1;
           }else{
             odd[i]=odd[i-1]+1;
             even[i]=even[i-1];
           }
        }
         for(int i=1;i<n;i++){
           if(pre[i]%2==0){
             count+=odd[i-1];
           }else{
              count+=even[i-1];
           }
        }

        // System.out.println(Arrays.toString(pre));
        // System.out.println(Arrays.toString(odd));
        // System.out.println(Arrays.toString(even));
      return (int)(count%1000000007);
    }
}