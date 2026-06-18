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
    public int deepestLeavesSum(TreeNode root) {
        Deque<TreeNode> q = new ArrayDeque<>();
        int sum = 0;
        q.offerLast(root);
        while(!q.isEmpty()){
            sum=0;
            int s = q.size();
            for(int i=0;i<s;i++){
                TreeNode temp = q.pollFirst();
                sum+=temp.val;
                if(temp.right!=null){
                    q.offerLast(temp.right);
                }
                if(temp.left!=null){
                    q.offerLast(temp.left);
                }
            }
        }
        return sum;
    }
}