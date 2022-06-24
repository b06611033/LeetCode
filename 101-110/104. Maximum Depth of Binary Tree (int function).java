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
    public int maxDepth(TreeNode root) {
         int largest = 0;
         return traverse(root, 1, largest);
    }
    public int traverse(TreeNode n, int level, int largest) {
        if (n == null) return largest;
        if (level > largest) largest = level;
        return Math.max(traverse(n.left, level + 1, largest), traverse(n.right, level + 1, largest));
    }
}
