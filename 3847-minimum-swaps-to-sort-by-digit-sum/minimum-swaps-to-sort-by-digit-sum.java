class Solution {
    public int minSwaps(int[] nums) {
        Integer[] arr = new Integer[nums.length];
        HashMap<Integer ,Integer> hm=new HashMap<>();
        int i = 0, count = 0;
        for (int x : nums) {
            arr[i++] = x;
        }
        Arrays.sort(arr, (b, a) -> {
            if (sum(b) != sum(a)) {
                return (sum(b) - sum(a));
            } else {
                if (a > b) {
                    return -1;
                } else if (a < b) {
                    return +1;
                } else {
                    return 0;
                }
            }
        });
      for( i=0;i<nums.length;i++){
        hm.put(arr[i],i);
      }
      for( i=0;i<nums.length;i++){
         arr[i]=hm.get(nums[i]);
      }
      boolean[] bl=new boolean[nums.length];
      int k=0,r=0;
      while(k<arr.length){
        //   if(bl[k]){
        //     k++;
        //   }
        //int x=arr[k]
         while(arr[k]!=k){
            count++;
            int temp=arr[k];
              arr[k]=arr[arr[k]];
              arr[temp]=temp;
         }
         k++;
      }
      return count;
    }

    int sum(int a) {
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a = a / 10;
        }
        return sum;
    }
}