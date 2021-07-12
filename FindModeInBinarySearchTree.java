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
class FindModeInBinarySearchTree {
    private Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    List<Integer> list = new ArrayList<Integer>();
    int mode = 1;
    
    public int[] findMode(TreeNode root) {
        helper(root);
        int[] answer = new int[list.size()];
        for(int x = 0; x < list.size(); x++)
            answer[x] = list.get(x);
        return answer;
    }
    
    public void helper(TreeNode root) {
        if(root != null) {
            if(root.left != null)
                helper(root.left);
            if(map.containsKey(root.val))
                map.put(root.val, map.get(root.val) + 1);
            else
                map.put(root.val, 1);
            if(map.get(root.val) > mode) {
                list.clear();
                list.add(root.val);
                mode = map.get(root.val);
            } else if(map.get(root.val) == mode) {
                list.add(root.val);
            }
            if(root.right != null)
                helper(root.right);
        }
    }
}