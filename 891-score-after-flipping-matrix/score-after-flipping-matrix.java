class Solution {
    public int matrixScore(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][0] == 0)
                fliprow(i, grid);
        }
        for (int i = 1; i < grid[0].length; i++) {
            if (count(i, grid)*2 > grid.length)
                flipcol(i, grid);
        }
        for (int i = 0; i < grid.length; i++) {
            String c = "";
            for (int j = 0; j < grid[0].length; j++) {
                c += grid[i][j];
            }
            sum += Integer.parseInt(c, 2);
        }
        return sum;

    }

    void fliprow(int i, int[][] grid) {
        for (int j = 0; j < grid[0].length; j++) {
            if (grid[i][j] == 0) {
                grid[i][j] = 1;
            } else {
                grid[i][j] = 0;
            }
        }
    }

    void flipcol(int i, int[][] grid) {
        for (int j = 0; j < grid.length; j++) {
            if (grid[j][i] == 0) {
                grid[j][i] = 1;
            } else {
                grid[j][i] = 0;
            }
        }
    }

    int count(int i, int[][] grid) {
        int count = 0;
        for (int j = 0; j < grid.length; j++) {
            if (grid[j][i] == 0) {
                count++;
            }
        }
        return count;
    }

}