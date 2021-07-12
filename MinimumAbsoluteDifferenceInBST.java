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
class MinimumAbsoluteDifferenceInBST {
    private Integer previous = null;
    int min = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        return helper(root);
    }
    
    public int helper(TreeNode root) {
        if(root != null) {
            min = helper(root.left);
            if(previous != null)
                min = Math.min(min, root.val - previous);
            previous = root.val;
            min = helper(root.right);
        }
        return min;
    }
}