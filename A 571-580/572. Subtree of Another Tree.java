//Runtime: 4 ms, faster than 60.71% of Java online submissions for Subtree of Another Tree.
//Memory Usage: 46.7 MB, less than 41.22% of Java online submissions for Subtree of Another Tree.
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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        int value = subRoot.val;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node.val == value) {
                if (dfs(node, subRoot)) return true;
            }
            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
        }
        return false;
    }
    private boolean dfs(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 != null) return false;
        else if (n1 != null && n2 == null) return false;
        else if (n1 == null && n2 == null) return true;
        else if (n1.val != n2.val) return false;
        if (!dfs(n1.left, n2.left)) return false;
        if (!dfs(n1.right, n2.right)) return false;
        return true;
    }
}
