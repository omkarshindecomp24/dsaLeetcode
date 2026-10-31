class Solution {
    public int uniquePaths(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int z = 1000000000 + 7;
       // int[][][] dp = new int[m][n][3];
       int[][] dp = new int[m][n];

for (int i = 0; i < m; i++) {
        Arrays.fill(dp[i], -1);
}
        return recurse(grid, 0, 0, 0, 0, dp) % z;
    }

    int recurse(int[][] grid, int i, int j, int x, int y, int[][] dp) {

        int m = grid.length;
        int n = grid[0].length;
        int z = 1000000000 + 7;
        if (i >= m || j >= n)
            return 0;

            if (grid[i][j] != 1 && dp[i][j]!=-1 ) {
                return dp[i][j];
            } else if (grid[i][j] == 1 && x == i - 1) {
                return  (recurse(grid, i, j + 1, i, j, dp)) % z;
            } else if (grid[i][j] == 1 && y == j - 1) {

                return  (recurse(grid, i+1, j , i, j, dp)) % z;
            }

        if (i == m - 1 && j == n - 1) {
            // count++;
            return 1;
        } else if (grid[i][j] == 1 && x == i - 1) {
            return (recurse(grid, i, j + 1, i, j, dp)) % z;
        } else if (grid[i][j] == 1 && y == j - 1) {
            return (recurse(grid, i + 1, j, i, j, dp)) % z;
        } else {
            int a = (recurse(grid, i + 1, j, i, j, dp)) % z;
            int b = (recurse(grid, i, j + 1, i, j, dp)) % z;
            dp[i][j] = (a + b) % z;
            return dp[i][j];
        }

    }
}