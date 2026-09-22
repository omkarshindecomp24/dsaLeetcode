class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ls = new ArrayList<>();
        helper(ls, n, n, "");
        return ls;
    }

    void helper(List<String> ls, int l, int r, String s) {
        if (l == 0 && r == 0) {
            ls.add(s);
            return;
        }
        if (l == 0) {
            helper(ls, l, r-1, s + ")");

        } else {
            helper(ls, l - 1, r, s + "(");
            if (l != r && s != "")
                helper(ls, l, r - 1, s + ")");
        }
    }
}