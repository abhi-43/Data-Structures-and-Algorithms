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
    public int maxDepth(TreeNode root) {
        int h = 0;
        if(root == null)
            return 0;
        
        if(root.left!=null)
            h = maxDepth(root.left);
        if(root.right!=null)
            h = Math.max(maxDepth(root.right), h);
        
        h+=1;
        
        return h;
    }
}