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
class BinaryTreePostorderTraversal {
    public List postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List list = new ArrayList();
        TreeNode pre = null;
        TreeNode current = root;
        while(current != null || !stack.isEmpty()) {
            while(current != null) {
                stack.push(current);
                current = current.left;
            }
             current = stack.pop();
            if(current.right != null && pre != current.right) {
                stack.push(current);
                current = current.right;
                continue;
            } 
            list.add(current.val);
            pre = current;
            current = null;
          
        }
        return list;
    }
}