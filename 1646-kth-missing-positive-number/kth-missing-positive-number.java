class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        int p=0;
        for (int i = 1; i <= (k + arr.length); i++) {
            if (p<arr.length && arr[p] == i) {
                p++;
                continue;

            } 
            al.add(i);
        }
        return al.get(k - 1);
    }
}