class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int size = nums.size(), min = Integer.MAX_VALUE, sum = 0, count = 0;

        for (int i = 0; i < size; i++) {
            sum = 0;
            count = 0;
            for (int j = i; j < size; j++) {
                count++;
                sum += nums.get(j);
                if (count >= l && count <= r) {

                    if (sum <= 0)
                        continue;
                    min = Math.min(min, sum);
                }
            }
        }
        if (min ==  Integer.MAX_VALUE)
            return -1;
        return min;

    }
}