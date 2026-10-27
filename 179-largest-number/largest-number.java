class Solution {
    public String largestNumber(int[] nums) {
        StringBuilder str = new StringBuilder();
          StringBuilder str2= new StringBuilder();
        Integer[] arr = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        Arrays.sort(arr, (a, b) -> {
            int x = comp(a, b);
            return -x;
        });
        for (int i = 0; i < nums.length; i++) {
            str.append(arr[i]);
            str2.append(0);
        }
       
        if(str.toString().equals(str2.toString())){
            return "0";
        }
        return str.toString();
    }

    int comp(int a,int b){
     String str1=""+ a+ b;
      String str2="" +b +a;
      int i=0;
     while(i<str1.length() && str1.charAt(i)==str2.charAt(i)){
        i++;
     }
     if(i==str1.length()){
        return 0;
     }else {
      if(str1.charAt(i)>str2.charAt(i)){
        return 1;
      }else{
        return -1;
      }
     }
    

}
}