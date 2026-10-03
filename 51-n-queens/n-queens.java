class Solution {
    public List<List<String>> solveNQueens(int n) {
        int[][] mat = new int[n][n];
        List<List<String>> ans = new ArrayList<>();
        List<String> ls = new ArrayList();
        helper(mat, 0, 0, "", ans, ls);
        return ans;

    }

    void helper(int[][] mat, int i, int j, String str, List<List<String>> ans, List<String> ls) {
        //  List<String> ls = new ArrayList();
        int n = mat.length;
        if (mat[i][j] != 0) {
            str += ".";
            if (j == n - 1)
                return;
            helper(mat, i, j + 1, str, ans, ls);

        } else {
            mat[i][j] = -1;
            String pqr = str;
            str += "Q";

            match(mat, i, j);
            if (i == n - 1) {
                while (str.length()<n) {
                    str += ".";
                }
                ls.add(str);
                if (ls.size() == n)
                    ans.add(new ArrayList<String>(ls));
                //  return;
            } else if (i != n - 1) {
                 while (str.length()< n) {
                 str += ".";
                 }
                ls.add(str);
                helper(mat, i + 1, 0, "", ans, ls);
            }
            ls.remove(ls.size() - 1);

            unmatch(mat, i, j);
            mat[i][j] = 0;
            pqr += ".";
            if (j != n - 1)
                helper(mat, i, j + 1, pqr, ans, ls);
        }

    }

    void match(int[][] mat, int p, int q) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            if (i != p)
                mat[i][q]++;
            if (q != i)
                mat[p][i]++;
        }
        for (int i = 1; i < n; i++) {
            if (p + i < n && q + i < n)
                mat[p + i][q + i]++;
            if (p + i < n && q - i > -1)
                mat[p + i][q - i]++;
            if (p - i > -1 && q + i < n)
                mat[p - i][q + i]++;
            if (p - i > -1 && q - i > -1)
                mat[p - i][q - i]++;
        }
    }

    void unmatch(int[][] mat, int p, int q) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            if (i != p)
                mat[i][q]--;
            if (q != i)
                mat[p][i]--;
        }
        for (int i = 1; i < n; i++) {
            if (p + i < n && q + i < n)
                mat[p + i][q + i]--;
            if (p + i < n && q - i > -1)
                mat[p + i][q - i]--;
            if (p - i > -1 && q + i < n)
                mat[p - i][q + i]--;
            if (p - i > -1 && q - i > -1)
                mat[p - i][q - i]--;
        }
    }
}