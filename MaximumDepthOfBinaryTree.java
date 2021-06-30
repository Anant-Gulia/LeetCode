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
class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        int depthLeft = 0;
        int depthRight = 0;
        if(root == null) 
            return 0;
        else {
            depthLeft = maxDepth(root.left);
            depthRight = maxDepth(root.right);
        return Math.max(++depthLeft,++depthRight);
        }
    }
}