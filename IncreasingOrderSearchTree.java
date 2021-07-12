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
class IncreasingOrderSearchTree {
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        helper(root, list);
        TreeNode temp = new TreeNode(), answer = temp;
        for(int i : list) { 
            temp.right = new TreeNode(i);
            temp = temp.right;
        }
        return answer.right;
    }
    
    public void helper(TreeNode root, List<Integer> list) {
        if(root != null) {
            helper(root.left, list);
            list.add(root.val);
            helper(root.right, list);
        }
    }
}