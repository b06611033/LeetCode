//Runtime: 0 ms, faster than 100.00% of Java online submissions for Invert Binary Tree.
//Memory Usage: 39.6 MB, less than 95.10% of Java online submissions for Invert Binary Tree.
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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode node = new TreeNode();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            node = q.poll();
            TreeNode temp = new TreeNode();
            temp = node.left;
            node.left = node.right;
            node.right = temp;
            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
        }
        return root;
    }
}
