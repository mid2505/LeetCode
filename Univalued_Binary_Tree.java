// Problem: Univalued Binary Tree
// Language: java

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
    int n;
    public boolean isUnivalTree(TreeNode root) {
        if(root==null) return true;
        n = root.val;
        return traverse(root.left) && traverse(root.right);
    }
    public boolean traverse(TreeNode root){
        if(root==null) return true;
        if(root.val!=n) return false;
        else return traverse(root.left) && traverse(root.right);
    }
    
}