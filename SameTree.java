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
class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean flag = true;
        if(p != null && q != null) {
            if(p.val != q.val)
                return false;
            flag = isSameTree(p.left,q.left);
            if(!flag)
                return false;
            flag = isSameTree(p.right,q.right);
            if(!flag)
                return false;
        }
        if((p == null && q != null) || (p != null && q == null))
            return false;
        return flag;
    }
}