class Solution {
    public int arrangeCoins(int n) {
        long a = (long) n;
        return (sqrt(8 * a + 1) - 1) / 2;
    }

    int sqrt(long x) {
        long low = 1;
        long h = x, mid = 0;
        while (low <= h) {
            mid = low + (h - low) / 2;
            if (mid > x/mid) {
                h = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return (int) h;

    }

}