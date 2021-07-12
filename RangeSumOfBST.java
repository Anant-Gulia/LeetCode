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
class RangeSumOfBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        return helper(root, low, high, 0);
    }
    
    public int helper(TreeNode root, int low, int high, int sum) {
        if(root != null) {
            if(root.val < low)
                sum = helper(root.right, low, high, sum);
            else if(root.val > high)
                sum = helper(root.left, low, high, sum);
            else if(low <= root.val && root.val <= high) {
                sum += root.val;
                sum = helper(root.left, low, high, sum);
                sum = helper(root.right, low, high, sum);
            }
        }
        return sum;
    }
}