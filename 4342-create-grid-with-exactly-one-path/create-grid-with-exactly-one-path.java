class Solution {
    public String[] createGrid(int m, int n) {
        String[] str = new String[m];
        String[][] grid = new String[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == n - 1) {
                    grid[i][j] = ".";
                } else {
                    grid[i][j] = "#";
                }
            }
        }
        StringBuilder st = new StringBuilder();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                st.append(grid[i][j]);
            }
            str[i] = st.toString();
            st.setLength(0);
        }
        return str;


    }
}