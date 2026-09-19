class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> al=new ArrayList<>();
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
       for(int i=1;i<=(k+arr.length);i++){
        if(!hs.contains(i))al.add(i);
       }
       return al.get(k-1);
    }
}