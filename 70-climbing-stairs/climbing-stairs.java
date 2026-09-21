class Solution {
    public int climbStairs(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        int a = 1;
        int b = 2;
        int c = 3, k = 3;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        if (n == 3)
            return 3;
        while (k != n) {
            a = b;
            b = c;
            c = a + b;
            k++;
        }
        return c;
    }
}