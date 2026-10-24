/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
       return height(root)!=-1  ;
    }

    int height(TreeNode root) {
       
       if(root==null) return 0;
        int a = height(root.left);
        if(a==-1)return -1;
        int b = height(root.right);
        if(  b==-1 ||  Math.abs(a-b)>1 ) return -1;
        return 1 + Math.max(a, b);
    }
}