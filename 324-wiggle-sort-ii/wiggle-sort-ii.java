class Solution {
    public void wiggleSort(int[] nums) {
     int n=nums.length,j=0;
    
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=nums[i];
       }
      if(n%2==0) {j=(n/2) -1;}else{
        j=n/2;
      }
          
       int i=0,k=n-1;
 Arrays.sort(arr);
       while(i<n){
        if(i%2==0){
            nums[i]=arr[j--];
        }else{
            nums[i]=arr[k--];
        }
        i++;
       }
    }
}