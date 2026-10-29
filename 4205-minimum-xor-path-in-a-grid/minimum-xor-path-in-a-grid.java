class Solution {
    public int minCost(int[][] grid) {
        int n = grid.length, m = grid[0].length,min=Integer.MAX_VALUE;
        HashSet<Integer>[][] dp = new HashSet[n][m];
        for (int i = n - 1; i > -1; i--) {
            for (int j = m - 1; j > -1; j--) {
                dp[i][j] = new HashSet<Integer>();

                if (i == n - 1 && j == m - 1) {
                    dp[i][j].add(grid[i][j]);
                    continue;
                }
                if(i<n-1){
                for (int x : dp[i + 1][j]) {
                    dp[i][j].add(grid[i][j] ^ x);
                }
                }
                if(j<m-1){
                for (int x : dp[i][j + 1]) {
                    dp[i][j].add(grid[i][j] ^ x);
                }
                }

            }
        }
        for (int x : dp[0][0]) {
                    min=Math.min(min,x);
                }
                return min;
    }
}