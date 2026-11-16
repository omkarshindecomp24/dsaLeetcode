class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int[] r = new int[nums.length];
        int[] ans = new int[nums.length - k + 1];
        for (int i = n - 1; i > -1; i--) {
            while (st.size() > 0 && nums[st.peek()] <= nums[i]) {
                st.pop();
            }
            r[i] = st.isEmpty() ? Integer.MAX_VALUE : st.peek();
            st.push(i);
        }
        for (int i = 0; i < nums.length - k + 1; i++) {
            int j = i, range = i + k-1;
            boolean bl = true;
            while (j <= range && j < n) {
                if (r[j] > range) {
                    ans[i] = nums[j];
                    break;
                } else {
                    j = r[j];
                }
            }
        }
        return ans;

    }
}