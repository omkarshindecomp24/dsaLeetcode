class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        Integer[] arr = new Integer[nums.length];
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        Arrays.sort(arr, (b, a) -> {
            int x = sum(nums[b]);
            int y = sum(nums[a]);
            if (x != y) {
                return (x - y);
            } else {
                if (nums[a] > nums[b]) {
                    return -1;
                } else if (nums[a] < nums[b]) {
                    return +1;
                } else {
                    return 0;
                }
            }
        });
        int[] ans = new int[n];
        for (int i = 0; i < nums.length; i++) {
            ans[arr[i]] = i;
        }
        int k = 0;
        while (k < arr.length) {

            while (ans[k] != k) {
                count++;
                int temp = ans[k];
                ans[k] = ans[ans[k]];
                ans[temp] = temp;
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