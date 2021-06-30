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
class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return helper(root.left,root.right);
    }
    
    public boolean helper(TreeNode p, TreeNode q) {
         boolean flag = true;
        if(p != null && q != null) {
            if(p.val != q.val)
                return false;
            flag = helper(p.left,q.right);
            if(!flag)
                return false;
            flag = helper(p.right,q.left);
            if(!flag)
                return false;
        }
        if((p == null && q != null) || (p != null && q == null))
            return false;
        return flag;
    }
}